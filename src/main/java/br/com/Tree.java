package br.com;

import java.util.Random;

public class Tree {
    Node root = null;

    void insert(int info, Node place){

        if(place == null){
            root = new Node(info);
        } else  if(info < place.info){
            if(place.left == null){
                place.left = new Node(info);
            } else {
                insert(info, place.left);
            }
        } else if (info > place.info){
            if (place.right == null){
                place.right = new Node(info);
            } else {
                insert(info, place.right);
            }
        }
    }


    Node getRandomNode(Node place) {
        Random rand = new Random();
        int chosenIndex = rand.nextInt(countNodes(place)) + 1;
        return getNodeByIndex(place, chosenIndex);
    }

    private int countNodes(Node place){
        if(place == null) return 0;
        return 1 + countNodes(place.left) + countNodes(place.right);
    }

    private Node getNodeByIndex(Node place, int index){
        if (place == null) return null;

        int leftCount = countNodes(place.left);
        if (index == leftCount + 1){
            return place;
        } else if (index <= leftCount) {
            return getNodeByIndex(place.left, index);
        } else {
            return getNodeByIndex(place.right, index);
        }

    }



}