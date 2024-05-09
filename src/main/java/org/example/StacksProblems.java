package org.example;
class QueueADTS<Type>{
    int front,size,back;
    Type[] arrays;

    public QueueADTS(int size) {
        this.size = size;
        front = 0;
        back = 0;
        this.arrays = (Type[]) new Object[size];
    }
    public boolean isEmpty(){
        return front == back;
    }
    public boolean isFull(){
        return back  == size;
    }

    public void enqueue(Type value){
        if(!isFull()){
            arrays[back] = value;
            back++;
        }else System.out.println("Queue is full");
    }

    public Type dequeue(){
        if(!isEmpty()){
            Type Todequeue = arrays[front];
            front++;
            return Todequeue;
        }else System.out.println("Queue is empty");
        return  null;
    }
}
class StackADTS<Type>{
    int size;
    Type[] arrays;
    int top;

    public StackADTS(int size) {
        this.size = size;
         top = -1;
        this.arrays = (Type[]) new Object[size];
    }
    public void push(Type value){
        if(!isFull()){
            top++;
            arrays[top] = value;
        }else System.out.println("Stack is full");
    }

    public Type pop(){
        if(!isEmtpy()) {

            Type numPoped =  arrays[top];
            top--;
            return numPoped;
        }else System.out.println("stack is empty");
        return arrays[top];
    }
    public boolean isEmtpy(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size;
    }
    public void display(){
        System.out.println("Elements are: ");
        for(int i = top; i >= 0; i--){
            System.out.println( "["+ arrays[i] +"]");
        }
    }
}
public class StacksProblems {

    public static void main(String[] args) {
        String str = "radar";


        QueueADTS<Character> charQ = new QueueADTS<>(str.length());

        for(int i = 0; i < str.length(); i++){
            charQ.enqueue(str.charAt(i));
        }

        boolean isFlased = true;
        try {
            for(int i = str.length() - 1; i >= 0; i--){
                char cs = charQ.dequeue();
                if(str.charAt(i) != cs){
                    isFlased = false;
                }
            }
            System.out.println(isFlased);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println(numbers(5));
    }

    public  static  boolean isPalyndrome(StackADTS<Character> characterStackADT, String str){
        if (characterStackADT.isEmtpy()){
            return false;
        }

        for(int i = 0;  i < str.length(); i++){
            char c = characterStackADT.pop();
            if(str.charAt(i) != c ){
                return false;
            }
        }
        return true;
    }

    public static int numbers(int n){
        if( n <= 1){
            return n;
        }else {
      return  n * numbers(n - 1);
        }
    }
}
