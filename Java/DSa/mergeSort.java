package com.DSa;

public class mergeSort {
    public static void main(String[] args) {
        int array[] = {4, 5, 3, 2, 1, 6, 8, 9, 0};

        mergesort(array);

        for (int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }

    private static void mergesort(int[] array) {
        int length = array.length;
        if (length<=1){
            return;
        }

        int middle = length /2;
        int[] lefta  = new int[middle];
        int[] righta  = new int[length - middle];

        int i = 0;
        int j = 0;

        for(; i < length; i++){
            if(i < middle){
                lefta[i] = array[i];
            }

            else {
                righta[j] = array[i];
                j++;
            }
        }

        mergesort(lefta);
        mergesort(righta);
        merge(lefta, righta, array);

    }

    private static void merge(int[] lefta, int[] righta, int[] array){
        int lefts = array.length / 2;
        int rights = array.length - lefts;
        int i = 0, l = 0, r = 0;

        while (l < lefts && r < rights){
            if (lefta[l] < righta[r]){
                array[i] = lefta[l];
                i++;
                l++;
            }

            else {
                array[i] = righta[r];
                i++;
                r++;
            }
        }

        while (l <lefts){
            array[i] = lefta[l];
            i++;
            l++;
        }

        while (r < rights){
            array[i] = righta[r];
            i++;
            r++;
        }
    }
}
