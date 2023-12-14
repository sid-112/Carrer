package com.sid;

public class Two2dArray {
    public static void main(String[] args) {
        int marks [];
        int [][] flats;
        flats = new int [2][3];
        flats [0][0] = 000;
        flats [0][1] = 001;
        flats [0][2] = 002;
        flats [1][0] = 003;
        flats [1][1] = 100;
        flats [1][2] = 101;

        for (int i = 0; i>flats.length; i++){
            for (int j = 0; j<flats[i].length; j++){
                System.out.println(flats[i][j]);
            }
        }
    }
}
