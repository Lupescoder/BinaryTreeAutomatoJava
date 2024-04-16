package br.com;

public class Node {
    private final Island island;
    Node left, right;

    public Node(Island island) {
        this.island = island;
        this.left = this.right = null;
    }

    public Island getIsland() {
        return island;
    }

}