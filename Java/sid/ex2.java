package com.sid;
import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("1 = Rock, 2 = papper, and 3 = Scissor");
        Random rd = new Random();
        int des = rd.nextInt(3) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int take = sc.nextInt();

        switch (take){
            case 1:
                System.out.println(rd.nextInt(3) + 1);
                break;
            case 2:
                System.out.println(rd.nextInt(3) + 1);
                break;
            case 3:
                System.out.println(rd.nextInt(3) +1);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
