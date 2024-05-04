package org.example;

class Node<Type>{

    Node next;
    Type element;

    public Node() {
        this(null, null);
    }

    public Node(Node next, Type element) {
        this.next = next;
        this.element = element;
    }
}
public class LinkedListADT <Type>{
}
