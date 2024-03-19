package DataStructuresAndAlgorithms;

class InterPolation_Search {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 7 , 6666, 7,7 ,888, 999, 2};
		
		int index = interPolationSearch(arr1, 888);
		
		if (index != -1) {
			System.out.println("Found " + index);
		}
		else {
			System.out.println("Not  found");
		}
		

	}

	private static int interPolationSearch(int[] arr1, int value) {
		int high = arr1.length - 1;
		int low = 0;
		
		while(value >= arr1[low] && value <= arr1[high] && low <= high) {
			int probe = low + (high - low) * (value - arr1[low]) / (arr1[high] - arr1[low]);
			System.out.println("Probe" + " " + probe);
			
			if (arr1[probe] == value) {
			    return probe;
			}
			else if(arr1[probe] < value) {
				low = probe + 1;
			}
			else {
				high = probe - 1;
			}
		}
		
		
		return -1;
	}

}
