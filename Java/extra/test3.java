package com.extra;
import java.util.Stack;


public class test3 {
    public static void main(String[] args) {
        String s = "{}";
        for (int i = 0; i < s.length(); i++){
            System.out.println(s);
        }
        Stack<String> stack = new Stack<String>();
        stack.add(s);
        System.out.println(stack);
    }
}
