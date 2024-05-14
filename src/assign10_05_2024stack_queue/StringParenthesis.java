package assign10_05_2024stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class StringParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with parenthesis : ");
        String str = sc.nextLine();
        if(isValid(str)){
            System.out.println("Its a valid one");
        }else{
            System.out.println("Its not a valid one");
        }
    }
    public static boolean isValid(String str){
        int n = str.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<n;i++){
            char c = str.charAt(i);
            switch (c){
                case '{','(','[' : stack.push(c);
                break;
                case '}' : if(stack.pop() != '{') return false;
                break;
                case ']' : if(stack.pop() != '[') return false;
                break;
                case ')' : if(stack.pop() != '(') return false;
                break;
                default:return false;
            }
        }
        return true;
    }
}
