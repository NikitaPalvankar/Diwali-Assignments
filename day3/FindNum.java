package com.demo.day3;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4,2,7,1,5,6 };
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		
		int missingNum = findMissingNum(arr);
		System.out.println("\nMissing number is: " + missingNum);
	}

	public static int findMissingNum(int[] arr) {
	    int max = 0;
	    int total = 0;

	    for (int num : arr) {
	        total += num;         
	        if (num > max) {    
	            max = num;
	        }
	    }

	    //formula for addition of n natural no.
	    int Sum = (max * (max + 1)) / 2;

	    // The missing number is the difference between total sum and actual sum
	    return Sum - total;
	}

}
