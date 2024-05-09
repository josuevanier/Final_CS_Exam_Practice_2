package org.example;

import java.util.Stack;

public class StackPostFixInFixExcercices {
    public static void main(String[] args) {

        String postfixExpression = "ab+c*d-";

        String answer = postfixToInfix(postfixExpression);

        System.out.println(answer);

        // System.out.println(postPrefixCalculator("+ * 3 4 - 5 2"));

       // System.out.println(postPrefixCalculators("6 8 +"));

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

     public static int postPrefixCalculator(String expression){
       int result = 0;
        Stack<Integer> integers = new Stack<>() ;
        String[] tokens = expression.split("\\s+");
        for(int i = tokens.length - 1; i >= 0; i--) {
        String token = tokens[i];
            if (isNumeric(token)) {
                integers.push(Integer.parseInt(token));
            } else {
                int operand2 = integers.pop();
                int operand1 = integers.pop();
                switch (token) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                }
                integers.push(result);
            }
        }
            return integers.pop();

     }
     public static boolean isNumeric(String token){
        return token.matches("(-?\\d+)(\\.\\d+)?");
     }

    public static int postPrefixCalculators(String expression) {
        Stack<Integer> integers = new Stack<>();
        String[] tokens = expression.split("\\s+");
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (isNumeric(token)) {
                integers.push(Integer.parseInt(token));
            } else {
                int operand1 = integers.pop();
                int operand2 = integers.pop();
                switch (token) {
                    case "+":
                        integers.push(operand1 + operand2);
                        break;
                    case "-":
                        integers.push(operand1 - operand2);
                        break;
                    case "*":
                        integers.push(operand1 * operand2);
                        break;
                    case "/":
                        integers.push(operand1 / operand2);
                        break;
                }
            }
        }
        return integers.pop();
    }
}
