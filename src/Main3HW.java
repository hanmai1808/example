
public class Main3HW {
	public static void main(String []args){
		int[] nums = {2,2,4,6,5,4,2,2};
		boolean result = isPalindrome (nums);
		
		System.out.println("is Palindrome :" +result);

		
	}

	public static boolean isPalindrome(int[] numbers) {
		int j = numbers.length;
		int i;
		boolean result = false;
		int numPair;
		if (numbers.length%2!=0) {
			numPair=(numbers.length-1)/2;
		} else {
			numPair=numbers.length/2;
		}
		for (i = 0; i < numPair && numbers[i] == numbers[j - 1]; i++) {
			j--;
			if (i == numPair-1) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}


	
		
		
		
		
		
	}

