package com.sid;

public class breakandcontinue {
    public static void main(String[] args) {
        for (int i = 5; i < 10; i++) {
            System.out.println(i);
            System.out.println("Hehe");

            if (i == 8) {
                System.out.println("Choot gaya 9");
                continue;
            }

            // Code here will be executed after continue for i == 8
        }
    }
}
