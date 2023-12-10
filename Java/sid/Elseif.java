package com.sid;
import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("hehe");
                break;
            case 60:
                System.out.println("hoha");
                break;
            default:
                System.out.println("bye");
                break;
        }

//        if (age < 4) {
//            System.out.println("You are a toddler");
//        } else if (age < 13) {
//            System.out.println("You are a kid");
//        } else if (age < 18) {
//            System.out.println("You are a teen");
//        } else {
//            System.out.println("You are an adult");
//        }
    }
}

