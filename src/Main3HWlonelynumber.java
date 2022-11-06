
public class Main3HWlonelynumber {
	public static void main(String []args){
		int[] nums = {2,2,4,6,4,5,5};
		
		int result = findSinglenumber (nums);
		
		
		System.out.println("Single number is:" +result);

		
	}

	public static int findSinglenumber(int[] numbers) {
//		boolean isPairedFound = false;
//		for (int i=0;i<numbers.length;i++) {
//			isPairedFound=false;
//			for (int j=0;j<numbers.length;j++) {
//				if(numbers[i]==numbers[j]&& i!=j) {
//					isPairedFound = true;
//				}
//			}
//			if(isPairedFound=false) {
//				return numbers[i];
//			}
//		}
//		return -1;
		int[] countAppearance =new int[numbers.length];
		for (int i=0; i<numbers.length; i++) {
			countAppearance[numbers[i]]= countAppearance[numbers[i]]+1;
			System.out.println(i);
			System.out.println(numbers[i]);
			System.out.println(countAppearance[numbers[i]]);
		}
		for (int i=0; i<countAppearance.length; i++) {
			if (countAppearance [i]==1) {
				return i;
			}
		}
		return 0;
	}

}
