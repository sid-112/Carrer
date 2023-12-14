package com.sid;

public class Methods {
    static int math(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = x*y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int c = (a+b)* 2;
        System.out.println(c);
        int o = math(a, b);
        System.out.println(o);
    }
}
