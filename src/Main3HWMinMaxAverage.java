
public class Main3HWMinMaxAverage {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };
		int index;
		int maxNums = nums[0];
		int minNums = nums[0];
		int sumNums = 0;
		for (index = 0; index < nums.length; index++) {
			if (minNums > nums[index]) {
				minNums = nums[index];
			}
		}
		System.out.println("Minimum number la : " + minNums);

		for (index = 0; index < nums.length; index++) {
			if (maxNums < nums[index]) {
				maxNums = nums[index];
			}
		}
		System.out.println("Maximum number la : " + maxNums);

		for (index = 0; index < nums.length; index++) {
			sumNums = sumNums + nums[index];
		}
		double averageNums = Math.round(100.00 * sumNums / nums.length) / 100.00;
		System.out.println("Trung binh  la : " + averageNums);

	}
}
