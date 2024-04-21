package com.leetcode;

import java.util.Arrays;

public class RunningSumof1dArray {

	
	public static int[] main(String[] args) {
//		System.out.println("enter an nos: ");
		int[] nums= {1,2,3,4}; 
		 
		System.out.println(Arrays.toString(nums));
		
		int[] ans=new int[nums.length];

		for (int i = 1; i < nums.length; i++) {
			ans[0]=nums[0];
			ans[i]=ans[i-1]+nums[i];
		}
			 
		return ans; 
		
		
		
		
	}
}
