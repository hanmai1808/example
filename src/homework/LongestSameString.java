package homework;

import java.util.Arrays;

public class LongestSameString {
	public static void main(String[] args) {
		String[] strs = { "2flower", "1flow", "3flight" };
		System.out.println(solution(strs));
	}

	public static String solution(String[] strs) {
		int count;
		String result="";
		for (int i = 0; i < findShortestLength(strs); i++) {
			count =1;
			for (int j=1; j< strs.length;j++) {
				
				if (strs[0].charAt(i)== strs[j].charAt(i)) {
					count +=1;
				}
				if(count==strs.length) {
					result+= strs[0].charAt (i);
				
				}
			}
			
		}return result;
	}
//	public static String findLongestCommonPrefix(String[] strs) {
//		
//		 if (strs.length == 0) return "";
//		    String commonprefix = strs[0];
//		    for (int i = 1; i < strs.length; i++)
//		        while (strs[i].indexOf(commonprefix) != 0) {
//		        	commonprefix = commonprefix.substring(0, commonprefix.length() - 1);
//		            if (commonprefix.isEmpty()) return "";
//		        }        
//		    return commonprefix;
//	}
//
	
//	public static void main(String[] args) {
//		String[] input = { "1floamento flou", "1flourist flo", "1flouwer" };
//		System.out.println("The longest same prefix is: " + longestSamePrefix(input));
//	}
//	
//	public static String longestSamePrefix (String[] strings) {
//		  Arrays.sort(strings);
//		  for(int i = 0; i < Math.min(strings[0].length(), strings[strings.length-1].length()); i++) {
//		      if(strings[0].charAt(i) != strings[strings.length-1].charAt(i))
//		          return strings[0].substring(0, i);
//		  }
//		  return strings[0];
//	}
	public static int findShortestLength(String[] strs) {
		int shortestLength = strs[0].length();
		int result = 0;
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < shortestLength) {
				result = strs[i].length();
				shortestLength = strs[i].length();
			} else {
				result = shortestLength;
			}

		}
		return result;
		

	}

}
