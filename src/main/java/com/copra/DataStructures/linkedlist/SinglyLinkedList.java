package com.copra.DataStructures.linkedlist;

public class SinglyLinkedList {

    Node head;

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    //20 add , 50 add, 60 add


    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.head = new Node(20);
        Node secondNode = new Node(50);
        Node thirdNode = new Node(60);

        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;

        linkedList.display();

    }

}
