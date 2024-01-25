package com.extra;

public class pointerinjava {
    public static void main(String[] args) {
        int [] arra = {6, 6 ,7 ,7, 8, 8};
        int [] arrb = {5, 6, 7, 6, 6, 7, 7, 4 ,7};
        arra = arrb;

        for (int element: arra){
            System.out.println(element);
        }
    }
}
