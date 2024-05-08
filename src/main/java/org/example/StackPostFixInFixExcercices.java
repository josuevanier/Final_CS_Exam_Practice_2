package org.example;

import java.util.Stack;

public class StackPostFixInFixExcercices {
    public static void main(String[] args) {

        String postfixExpression = "ab+c*d-";

        String answer = postfixToInfix(postfixExpression);

        System.out.println(answer);

    }

    public  static boolean isOperator(char c){
        return c == '+' || c == '*' || c =='-' || c == '%'|| c == '/';
     }

     public  static String postfixToInfix(String postFix) {
         Stack<String> stack = new Stack<>();

         for(int i = 0; i < postFix.length(); i++){
             char c = postFix.charAt(i);
             if(!isOperator(c)){
                 stack.push(c + "");
             }else{
                 String operand2 = stack.pop();
                 String operand1 = stack.pop();
                 String temp = "(" + operand1 + c + operand2 + ")";
                 stack.push(temp);
             }
         }
         return stack.pop();
     }
}
