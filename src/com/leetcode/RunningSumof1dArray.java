package com.leetcode;

import java.util.Arrays;

//package com.leetcode;

import java.util.Arrays;
//
//public class RunningSumof1dArray {
//	
//	public static void main(String args) {
////		System.out.println("enter an nos: ");
//		
////		System.out.println(Arrays.toString(nums));
//		System.out.println(runningSum());
//		
//	}
//	private static int[] runningSum() {
//		int[] nums= {1,2,3,4}; 
//		System.out.println(Arrays.toString(nums));
//		//given: [1,2,3,4]
//		//o/p needed: [1,3,5, 10]
//		// TODO Auto-generated method stub
//		int[] ans=new int[nums.length];
//		ans[0]=nums[0];
//		for (int i = 1; i < nums.length; i++) {
//			ans[i]=ans[i-1]+nums[i];
//		}
//		return ans;
//	} 
//	
//}
//
 
public class RunningSumof1dArray {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4} ;
		System.out.println("provided array: "+Arrays.toString(nums));
		int[]ans= runningSum(nums);
		System.out.println("output is : "+ Arrays.toString(ans));
	}
	
	private static int[] runningSum(int[] nums) {
		// TODO Auto-generated method stub
//		int[] nums= {1,2,3,4}; 
	
		//given: [1,2,3,4]
		//o/p needed: [1,3,5, 10]
		// TODO Auto-generated method stub
		int[] ans=new int[nums.length];
		ans[0]=nums[0];
		for (int i = 1; i < nums.length; i++) {
			ans[i]=ans[i-1]+nums[i];
		}
//		System.out.println(ans);
		return ans;
	}
	
}

