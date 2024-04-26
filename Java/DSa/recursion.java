package com.DSa;

public class recursion {
    public static void main(String[] args) {
        walking(7);
        walk(7);
    }

    //Recursive
    private static void walk(int steps) {
        if (steps < 1){
            return;
        }
        System.out.println("u took an Step");
        walk(steps - 1);
    }

    //Iterable
    private static void walking(int step) {
        for (int i = 0; i < step; i++){
            System.out.println("You took an step");

        }
    }
}
