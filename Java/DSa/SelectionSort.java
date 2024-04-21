package com.DSa;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5, 6, 4, 3, 2, 4 ,6, 7};
        
        selectionSort(a);
        for (int k : a){
            System.out.println(a[k]);
        }
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) { // Change here: j < a.length
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
