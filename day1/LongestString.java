package com.demo.day1;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array of strings
        String[] str = {"Nikita", "Priyanka", "Aruna", "neha"};
       for(int i=0; i<str.length;i++) {
    	   System.out.print(str[i] +" ");
       }
        

        // Find and print the length of the longest string
        int maxLength = longestStr(str);
        System.out.println("\nLength of the longest string: " + maxLength);
    }

    // Function to find the length of the longest string
    public static int longestStr(String[] arr) {
        int max = 0;
        for (String str1 : arr) {
            if (str1.length() > max) {
                max = str1.length();
            }
        }
        return max;
	}

}
