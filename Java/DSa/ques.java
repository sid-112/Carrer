package com.DSa;
import java.util.LinkedList;
import java.util.Queue;

public class ques {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.offer("Sid");
        q.offer("Ashu");
        q.offer("Dua");
        q.offer("Dj");
        q.offer("Rupa");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.contains("Ashu"));
        System.out.println(q.contains("Ravi"));

    }
}
