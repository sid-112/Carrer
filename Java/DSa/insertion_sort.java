package com.DSa;

public class insertion_sort {
    public static void main(String[] args) {
        int array[] = {5, 6, 6, 4, 2, 1, 3, 5, 7};
        for (int l: array){
            System.out.println(l);
        }

        System.out.println("----------------------------------");

        insertionSort(array);

        System.out.println("Sorted Array:");
        for (int l: array){
            System.out.println(l);
        }
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >=0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
