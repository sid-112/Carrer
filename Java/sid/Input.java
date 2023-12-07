package com.sid;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("num 1");
        int a = sc.nextInt();
        System.out.println("Num 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum = ");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.next();
        System.out.println(str);
    }
}
