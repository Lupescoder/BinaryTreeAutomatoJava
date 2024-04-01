package br.com;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Tree tree = new Tree();

        tree.insert(new Island(7, "Baia do Naufrágio"));
        tree.insert(new Island(3, "Ilha dos Piratas"));
        tree.insert(new Island(1, "Ilha do Dragão"));
        tree.insert(new Island(6, "Ilha dos Peixes"));
        tree.insert(new Island(4, "Ilha dos Contrabandistas"));
        tree.insert(new Island(10, "Ilha da Caveira"));
        tree.insert(new Island(14, "Ilha da Cobra"));

        tree.move();
        //tree.printTree(tree.root);


    }
}