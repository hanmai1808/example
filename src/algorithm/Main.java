package algorithm;

public class Main {
	public static void main(String[] args) {
		int size = 10000;
		String[] arr=new String [size];
		for (int i =0; i<arr.length; i++) {
			arr[i]="TEST";
			
		}
		arr[10]="RESULT";
		int index=findIndexResult(arr);
		System.out.println(index);
	}
	public static int findIndexResult(String[] arr) {
		int index=0;
		for(int i  =0; i<arr.length;i++) {
		
			if (arr[i].equals("RESULT")) {
				index =i;
				break;
				
			}
		}
		return index;
	}
}
