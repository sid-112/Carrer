package com.sid;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 43;
        int attempts = 0; // Counter variable

        do {
            int take = sc.nextInt();
            attempts++;

            if (take < 20) {
                System.out.println("too low");
            } else if (take < 30) {
                System.out.println("Not too far");
            } else if (take < 40) {
                System.out.println("too near");
            } else if (take == num) {
                System.out.println("You are done!");
                break; // Exit the loop if the condition is met
            } else if (take < 50) {
                System.out.println("You are too far");
            } else {
                System.out.println("Not accepted, way too far");
            }

        } while (true);

        System.out.println("Number of attempts: " + attempts);
    }
}
