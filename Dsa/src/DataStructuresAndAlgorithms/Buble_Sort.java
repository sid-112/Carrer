package DataStructuresAndAlgorithms;

class BubbleSort {

  public static void main(String[] args) {
    int[] ar = {1, 4, 6, 7, 8, 5, 9, 0, 2, 3};

    bubbleSort(ar);

    for (int i : ar) {
      System.out.print(i + " ");
    }
  }

  public static void bubbleSort(int ar[]) {
    for (int i = 0; i < ar.length - 1; i++) {
      for (int j = 0; j < ar.length - i - 1; j++) {
        if (ar[j] > ar[j + 1]) {
          int temp = ar[j];
          ar[j] = ar[j + 1];
          ar[j + 1] = temp;
        }
      }
    }
  }
}

class hellowo{
	public static void hello() {
		System.out.println("Hello World");
	}
}
