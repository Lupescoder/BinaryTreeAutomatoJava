package br.com;
public class Node {
    int info;
    Node left;
    Node right;
    boolean hasTreasure;

    Node(int info){
        this.info = info;
        this.left = null;
        this.right = null;
        this.hasTreasure = false;
    }

    boolean hasTreasure(){
        return hasTreasure;
    }

    void setHasTreasure(){
        this.hasTreasure = true;
    }

    @Override
    public String toString() {
        return "Node{" +
                "info=" + info +
                ", left=" + left +
                ", right=" + right +
                ", hasTreasure=" + hasTreasure +
                '}';
    }
}