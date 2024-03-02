package com.DSa;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String>  stack = new Stack<String>();
//        System.out.println(stack.empty());
        stack.push("SId");
        stack.push("Ashu");
        stack.push("Dua");
        stack.push("Dj");
        stack.push("Rupa");

        System.out.println(stack.peek());
        System.out.println(stack.search("Dj"));
        System.out.println(stack);

        for (int i = 0; i < 10; i++){
            System.out.println(stack.push("Ravi"));
        }
    }
}
