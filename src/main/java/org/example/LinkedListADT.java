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

    public Node getNext() {
        return next;
    }

    public Type getElement() {
        return element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setElement(Type element) {
        this.element = element;
    }
}
public class LinkedListADT <Type>{
private Node head;
private int size;
    public LinkedListADT() {
        this.head = null;
        this.size = 0;
    }
    private boolean isEmpty(){
        return this.head == null;
    }

    public void insertFirst(Type element){
        Node<Type> typeNode = new Node<>();
        typeNode.setElement(element);
        typeNode.setNext(head);
        this.head = typeNode;
        size++;
    }
    public void insertLast(Type element){
      Node t,n;

      n = new Node<>();
      n.setElement(element);

      if(!isEmpty()){
          head = n;
      }else {
          t = this.head;

          while(t.getNext() != null){
               t = t.getNext();
          }
          t.setNext(n);
          size++;
      }
    }

    public void insertMiddleAtIndex(int position, Type element){
        if (position == 1){
            insertFirst(element);
        }
        if (position == size + 1){
            insertFirst(element);
        }
        if(position <= size && position  > 1){
            Node n,t;

            t = this.head;
            n = new Node<>();

            for(int i = 1; i < position - 1; i++){
                t = t.getNext();
            }
           n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
    }
}
