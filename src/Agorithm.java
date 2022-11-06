
public class Agorithm {
	static int COUNSTEP = 0;
	
	
	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 4, 1,7,8,2,3 };
		int[] arr2= bubbleSort(arr);
		for (int i : arr2) {
			System.out.println(i);
		}
		

		
		
	}

	private static int[] bubbleSort(int[] arr) {
		boolean nothingToSwap= true; 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				int num=0;
				if (arr[j]<arr[j-1]) {
					num=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=num;
					nothingToSwap= false;
				}
			}if(nothingToSwap) {
			break;
		} 
		}
		return arr;
	}
	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
	
				int num=0;
				if (arr[i]>arr[j]) {
					num=arr[i];
					arr[i]=arr[j];
					arr[j]=num;
				}

			}
		}
		return arr;
	}
	
}
