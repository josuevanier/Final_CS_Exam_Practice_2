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
    public Type pop(){
        if(!isEmpty()){
            Type elementRetrieved = this.arrays[top];
            System.out.println("value "  + elementRetrieved + " has been retrieved");
            top--;
            return elementRetrieved;
        }else System.out.println("Stack is empty");
        return null;
    }

    public Type peek(){
        return this.arrays[top];
    }

    public void display(){
        System.out.println("Elements of the stack are: ");
        for(int i = top; i >= 0; i-- ){
            System.out.println("["+arrays[i] + "]");
        }
    }

    public static void main(String[] args) {
        StacksADT<String> stacksADT = new StacksADT<>(7);

        stacksADT.push("Josue");
        stacksADT.push("Jo");
        stacksADT.push("sue");
        stacksADT.push("ue");

        stacksADT.display();
        System.out.println();
        stacksADT.pop();
        System.out.println();

        stacksADT.display();

    }
}
