package com.leetcode;

//import java.util.Scanner;
/*
 * 
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 */

class Solution {
    public int[] buildArray(int[] nums) {
        	int[] ans=new int[nums.length];

			for (int j = 0; j < ans.length; j++) {
				ans[j]=nums[nums[j]];
			}
			return ans;		
	
    }
}

//public class BuildArrayFromPermutation {
//
//	public static void buildArray(String[] args) {
//		
//		Scanner inp =new Scanner(System.in);
//		System.out.println("enter numbers with space");
//		int[] nums = new int[10];
//		int[] ans=null;
//		for (int i = 0; i < nums.length; i++) {
//			nums[i]=inp.nextInt();
//			System.out.print(nums[i]);
//		}
//		
//		
//	}
//}
