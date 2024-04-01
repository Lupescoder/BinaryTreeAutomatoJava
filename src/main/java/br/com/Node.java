package br.com;
public class Node {
    int index;
    String info;
    Node left, right;
    boolean hasTreasure;
    boolean isDeathIsland;

    Node(int index, String info,boolean hasTreasure, boolean isDeathIsland){
        this.index = index;
        this.info = info;
        this.left = null;
        this.right = null;
        this.hasTreasure = hasTreasure;
        this.isDeathIsland = isDeathIsland;
    }

    @Override
    public String toString() {
        return "Node{" +
                "index=" + index +
                ", info=" + info +
                ", left=" + left +
                ", right=" + right +
                ", hasTreasure=" + hasTreasure +
                ", isDeathIsland=" + isDeathIsland +
                '}';
    }
}