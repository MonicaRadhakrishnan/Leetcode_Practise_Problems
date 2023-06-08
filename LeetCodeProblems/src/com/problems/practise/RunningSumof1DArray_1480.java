package com.problems.practise;

import java.util.Arrays;

public class RunningSumof1DArray_1480 {

	public static void main(String[] args) {
		RunningSumof1DArray_1480 rs = new RunningSumof1DArray_1480();
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(rs.runningSum(nums)));

	}
	  public int[] runningSum(int[] nums) {
	        int[] resultSum = new int[nums.length];
	        resultSum[0] = nums[0];
	        for(int i =1 ; i < nums.length; i++){
	            resultSum[i] = nums[i] + resultSum[i-1];
	        }
	        return resultSum;
	    }
}
