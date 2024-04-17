package com.javaArrays;

import java.util.Arrays;

public class JavaCopyArrays {

	public static void main(String[] args) {
		
		int[] nums= {1,2,1};
		
		int[] ans=nums;
		
		ans[0]=-1;
//		System.out.println(ans);
		for (int i : ans) {
//			System.out.print(i+ " ");
			
		}
		System.out.println(Arrays.toString(ans));
	}
	

}
