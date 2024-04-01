package br.com;

import java.util.Random;

public class Tree {
    Node root = null;

    public void insert(Island island){
      root = insertRecursive(root, island);
    }

    public Node insertRecursive(Node node, Island island){
        if(node == null){
           return new Node(island);
        }

        if(island.getIndex() < node.getIsland().getIndex() ){
            node.left = insertRecursive(node.left, island);
        }else {
            node.right = insertRecursive(node.right, island);
        }

        return node;

    }

    public void move() throws InterruptedException {
        moveRecursive(root);
    }

    public boolean moveRecursive(Node node) throws InterruptedException {
        if(node == null){
            return false;
        }

        System.out.println("Visitando a ilha :" + node.getIsland().getName());
        Thread.sleep(4000);

        if(node.getIsland().hasTreasure()){
            System.out.println("Tesouro enconrado na ilha: " + node.getIsland().getName());
            return true;
        }else if(node.getIsland().isDeathIsland()){
            System.out.println("Parou na ilha da morte, você morreu !" + node.getIsland().getName());
            moveRestart();
            return false;
        }
        boolean foundTreasure = moveRecursive(node.left);
        if (!foundTreasure) foundTreasure = moveRecursive(node.right);

        return foundTreasure;
    }

    public void moveRestart() throws InterruptedException {
        System.out.println("\nReiniciando .....\n");
        root = null;
        insert(new Island(7, "Baia do Naufrágio"));
        insert(new Island(3, "Ilha dos Piratas"));
        insert(new Island(1, "Ilha do Dragão"));
        insert(new Island(6, "Ilha dos Peixes"));
        insert(new Island(4, "Ilha dos Contrabandistas"));
        insert(new Island(10, "Ilha da Caveira"));
        insert(new Island(14, "Ilha da Cobra"));

        move();
    }

    public void printTree(Node node){
        printTreeRecursive(node, 0);
    }

    public void printTreeRecursive(Node node, int level){
        if (node == null) {
            return;
        }

        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
        System.out.println(node.getIsland().getIndex() + " - " + node.getIsland().getName());
        printTreeRecursive(node.left, level + 1);
        printTreeRecursive(node.right, level + 1);
    }


}