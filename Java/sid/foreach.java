package com.sid;

public class foreach {
    public static void main(String[] args) {
        int [] age = {13, 2 ,5, 18, 34};
        System.out.println(age.length);

        for (int i = 0; i<age.length; i++){
            System.out.println(age[i]);
        }
        System.out.println("*****************");

        for (int element: age){
            System.out.println(element);
        }
    }
}
