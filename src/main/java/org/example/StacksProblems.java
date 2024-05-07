package org.example;

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
        String str = "kayak";
        StackADTS<Character> strings = new StackADTS<>(str.length());

        for(int i = 0; i < str.length(); i++){
            strings.push(str.charAt(i));
        }
        strings.display();

        boolean isFlase = true;
        try {
            for (int i = 0; i < str.length(); i++) {
                char c = strings.pop();
                if (str.charAt(i) != c) {
                    isFlase = false;
                }
            }

            System.out.println(isFlase);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

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
}
