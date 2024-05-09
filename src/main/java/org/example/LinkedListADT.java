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
      Node<Type> t,n;

      n = new Node<>(null,element);


      if(isEmpty()){
          head = n;
      }else {
          t = this.head;

          while(t.getNext()!= null){
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
            Node<Type> n,t;

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

    public void deleteFirst(){
        if(!isEmpty()) {
            this.head = head.getNext();
            size--;
        }
    }
    public void deleteLast(){
        if(isEmpty()) System.out.println("Linked is emtpy");
        else if(size == 1) {
            head = null;
            size--;
        }else {
            Node<Type> t;

            t = head;
            for(int i = 1; i < size; i++){
                t =t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    public void deleteAtGivenPosition(int position){
        if(position == 1){
            deleteFirst();
        }else if(position == size){
            deleteLast();
        } else if (position > 1 && position < size) {

            Node<Type> t, t1;
            t = this.head;
            for(int i = 1; i < position - 1; i++ ){
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1);
            size--;
        }
    }

    public void display(){
        if(!isEmpty()) {
            System.out.print("Elements are: ");
            Node<Type> typo = this.head;
            while (typo != null) {
                System.out.print(typo.getElement() + "-->");
                typo = typo.getNext();
            }
        }else System.out.println("linked is empty ");
    }

    public static void main(String[] args) {
        LinkedListADT<Integer> integers = new LinkedListADT<>();
        integers.insertLast(1);
        integers.insertLast(2);
        integers.insertLast(3);
        integers.insertLast(6);
        integers.insertLast(7 );

        integers.display();

        System.out.println("\n");

        integers.deleteLast();

        integers.display();
    }
}
