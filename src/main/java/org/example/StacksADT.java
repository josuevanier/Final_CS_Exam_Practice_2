package org.example;

public class StacksADT<Type>{
    int size;
    Type[] arrays;
    int top;

    public StacksADT(int size) {
        this.size = size;
        this.arrays = (Type[]) new Object[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public void push(Type value){
        top++;
        arrays[top] = value;
    }
}
