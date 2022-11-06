package homework;

public class day9 {
	public static void main(String[] args) {
		int[] array = {1,5,8,11,22,50,78,180};
		int value =78;
		int indexOfValue = findIndexOf(value, array);
		System.out.println(indexOfValue);
				

	}

	public static int findIndexOf(int value, int[] arr) {
		int leftPos = 0;
		int rightPos =0;
		int midPos =0;
		while (leftPos <= rightPos) {
			midPos = (leftPos +rightPos)/2;
			if(value>arr[midPos]) {
				leftPos=midPos+1;
			} else if (value<arr[midPos]) {
				rightPos=midPos-1;
			}  else
				return midPos -1;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]==value) {
//				return i;
//			}
		}
		return 0;

	}
}
