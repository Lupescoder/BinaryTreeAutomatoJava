package br.com;

import java.util.Random;

public class Automaton {
    private Node currentIsland;

    public Automaton(Node startingIsland){
        this.currentIsland = startingIsland;
    }

    public Node getCurrentIsland(){
        return currentIsland;
    }


    public void move(){
        if (currentIsland.left != null && currentIsland.right != null){
            Random rand = new Random();
            if(rand.nextBoolean()){
                currentIsland = currentIsland.left;
            }else{
                currentIsland = currentIsland.right;
            }
        } else if(currentIsland.left != null){
            currentIsland = currentIsland.left;
        } else if (currentIsland.right != null) {
            currentIsland = currentIsland.right;
        } else {
            System.out.println("Não há mais ilhas para explorar");
        }
    }

    @Override
    public String toString() {
        return "Automaton{" +
                "currentIsland=" + currentIsland +
                '}';
    }
}
