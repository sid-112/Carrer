package com.sid;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Marks of sub 1 - : ");
        Scanner sc = new Scanner(System.in); // Pass System.in as an argument
        float a = sc.nextFloat();
        float per1 = (a / 500) * 100;
        System.out.println(per1);

        System.out.println("Marks of sub 2 - : ");
        float b = sc.nextFloat();
        float per2 = (b / 500) * 100;
        System.out.println(per2);

        System.out.println("Marks of sub 3 - : ");
        float c = sc.nextFloat();
        float per3 = (c / 500) * 100;
        System.out.println(per3);

        System.out.println("Marks of sub 4 - : ");
        float d = sc.nextFloat();
        float per4 = (d / 500) * 100;
        System.out.println(per4);

        System.out.println("Marks of sub 5 - : ");
        float e = sc.nextFloat();
        float per5 = (e / 500) * 100;
        System.out.println(per5);

        String tot = (a + b + c + d + e)/5 + "%";
        System.out.println(tot);
    }
}
