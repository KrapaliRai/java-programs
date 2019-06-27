package com.adt;

public class App {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 1;

        Node nodeB = new Node();
        nodeB.data = 2;

        Node nodeC = new Node();
        nodeC.data = 3;

        Node nodeD = new Node();
        nodeD.data = 4;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = null;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));

    }

    public static int listLength(Node aNode){
        int length = 0;
        Node currentNode = aNode;

        while(currentNode != null){
            length++;
            currentNode = currentNode.next;

        }
        return length;
    }
}
