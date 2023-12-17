package com.sid;
import java.util.Scanner;

public class methodoverloading {

    static void foo(){
        System.out.println("Gm");
    }

    static void foo(int a){
        System.out.println("Gm no. -" + a);
    }

    static void foo(int a, int b){
        System.out.println("Gm days" + (a + b));
    }

    static void tell(){
        System.out.println("This is a joke\n" + "Like you");
    }

    static void change(int [] arr){
        arr[0] = 75;
    }
    public static void main(String[] args) {
        //tell();
        int [] marks = {45, 56, 8, 34, 34};
        change(marks);
        System.out.println(marks[0]);
        foo();
        foo(4);
        foo(5, 7);
    }
}
