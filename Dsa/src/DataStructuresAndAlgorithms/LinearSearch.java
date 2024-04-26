package DataStructuresAndAlgorithms;
import java.util.*;

class Linear_Searvh {

	public static void main(String[] args) {
		int [] arr = { 4, 55, 6, 7, 7, 8,9 ,9, 45, 3};
		
		int index = lineaeSearch(arr, 45);
		
		if (index != -1) {
			System.out.println("Dekho Vo mil Gaya" + " " + " ---" + " " + index);
		}
		
		else {
			System.out.println("Are Yaar Nahi Milha");
		}
	}

	private static int lineaeSearch(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++ ) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}

}