package assign10_05_2024stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class PostFIxExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with Expressions : ");
        String str = sc.nextLine();
        System.out.println(postFix(str));
    }
    public static String postFix(String str){
        int n = str.length();
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<n;i++){
            char c = str.charAt(i);
            switch (c){
                case '+','-','*','/','=' : stack.push(c);
                break;
                default:stringBuilder.append(c);
            }
        }
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
