package com.huidos22.algoritmos;
/**
 * 
 * Given an array A of 0s and 1s, 
 * we are to find the maximum number of consecutive 1s 
 * in the array A after flipping at most one 0
 */
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int longestOnes(int[] nums, int k) {
	    int ans = 0;

	    for (int l = 0, r = 0; r < nums.length; ++r) {
	      if (nums[r] == 0)
	        --k;
	      while (k < 0)
	        if (nums[l++] == 0)
	          ++k;
	      ans = Math.max(ans, r - l + 1);
	    }

	    return ans;
	  }
}
