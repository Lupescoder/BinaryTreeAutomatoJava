package br.com;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(1,"Baia do Naufrágio",false,false);
        tree.insert(2,"Ilha dos Piratas",false,false);
        tree.insert(3,"Ilha do Dragão",false,false);
        tree.insert(4,"Ilha dos Peixes",false,false);
        tree.insert(5,"Ilha dos Contrabandistas",false,false);
        tree.insert(6,"Ilha da Caveira",false,false);
        tree.insert(7,"Ilha da Cobra",false,false);

        tree.move();

    }
}