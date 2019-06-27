package com.singlyLinkedList;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return (first == null);

    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;

    }

    public Node deleteFisrt(){
        Node temp = first;
        first = first.next;
        return temp;

    }
    public void displayList(){
        System.out.println("List (first ----> last)");
        Node current = first;
        while(current!=null){
            current.displayNode();
            current = current.next;

        }
        System.out.println();
    }
}
