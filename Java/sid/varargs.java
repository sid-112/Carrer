package com.sid;

import java.beans.PropertyEditorSupport;

public class varargs {

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int ...arr){
        int res = 0;
        for (int a: arr){
            res += a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("all sum" + sum(4, 6, 7));
        System.out.println("Sum" + sum(1, 3, 5));
    }
}
