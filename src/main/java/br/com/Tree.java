package br.com;

import java.util.Random;

public class Tree {
    Node root = null;

    void insert(int index, String info , boolean hasTreasure, boolean isDeathIsland ){
      root = insertRecursive(root, index, info, hasTreasure, isDeathIsland);
    }

    Node insertRecursive(Node node, int index, String info, boolean hasTreasure, boolean isDeathIsland){
        if(node == null){
           return node = new Node(index, info, hasTreasure, isDeathIsland);
        }
        Random random = new Random();

        if(random.nextBoolean()) hasTreasure = true;
        if(random.nextBoolean()) isDeathIsland = true;

        if(random.nextBoolean()){
            node.left = insertRecursive(node.left, index, info, hasTreasure, isDeathIsland);
        }else {
            node.right = insertRecursive(node.right, index, info, hasTreasure, isDeathIsland);
        }

        return node;

    }

    void move(){
        moveRecursive(root);
    }

    void moveRecursive(Node node){
        if(node != null){
            System.out.println("Visitando a ilha :" + node.info);
            if(node.hasTreasure){
                System.out.println("Tesouro enconrado na ilha: " + node.info);
                return;
            }else if(node.isDeathIsland){
                System.out.println("Parou na ilha da morte, você morreu !" + node.info);
                moveRestart();
            }

            moveRecursive(node.left);
            moveRecursive(node.right);
        }
    }

    void moveRestart() {

        root = null;

        insert(1,"Baia do Naufrágio",false,false);
        insert(2,"Ilha dos Piratas",false,false);
        insert(3,"Ilha do Dragão",false,false);
        insert(4,"Ilha dos Peixes",false,false);
        insert(5,"Ilha dos Contrabandistas",false,false);
        insert(6,"Ilha da Caveira",false,false);
        insert(7,"Ilha da Cobra",false,false);

        move();
    }




}