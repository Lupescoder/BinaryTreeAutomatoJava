package br.com;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Tree tree = new Tree();


        for (int i = 0; i < 10; i++){
            tree.insert(rand.nextInt(100), tree.root );
        }

        Node startingIsland = tree.getRandomNode(tree.root);
        Automaton automaton = new Automaton(startingIsland);
        Node treasureIsland = tree.getRandomNode(tree.root);
        treasureIsland.setHasTreasure();
        exploreIslands(automaton);


    }
    private static void exploreIslands(Automaton automaton){
        while (!automaton.getCurrentIsland().hasTreasure()){
            System.out.println("Explorando a ilha " + automaton.getCurrentIsland().info);
            automaton.move();
        }
        System.out.println("Tesouro encontrado na ilha " + automaton.getCurrentIsland().info + " ! Parabéns");
    }
}