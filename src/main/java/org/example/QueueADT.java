package org.example;

import java.util.Queue;

public class QueueADT <Type>{
int front, size, back;
Type[] arrays;
//
    public QueueADT(int size) {
        this.size = size;
        this.front = 0;
        this.back = 0;
        arrays = (Type[]) new Object[size];
    }
    public boolean isEmpty(){
        return front == back;
    }
    public boolean isFull(){
        return back == size;
}

public void enqueue(Type value){
        if(!isFull()){
            arrays[back] = value;
            back++;
        }else System.out.println("Queue is full");
}

public Type dequeue(){
        if(!isEmpty()){
            Type elementRetrieved = arrays[front];
            System.out.println(elementRetrieved + " has been retrieved");
            front++;
        }else System.out.println("Queue is empty cannot dequeue");
        return null;
}
public void display(){
    System.out.print("Elements are: ");
        for(int i = front; i < back; i++){
            if(i < back -1) {
                System.out.print(arrays[i] + ", ");
            }else System.out.print(arrays[i]);
        }
}

    public static void main(String[] args) {
        QueueADT<Integer> integerQueueADT = new QueueADT<>(6);

        integerQueueADT.enqueue(1);
        integerQueueADT.enqueue(2);
        integerQueueADT.enqueue(3);
        integerQueueADT.enqueue(78);
        integerQueueADT.enqueue(48);
        integerQueueADT.enqueue(58);

        System.out.println(integerQueueADT.back);
        integerQueueADT.display();
        System.out.println();

        integerQueueADT.dequeue();

        integerQueueADT.display();


    }
}
