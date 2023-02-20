package com.collections;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * example1
 * 
 
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

example2
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

*/

class Solutions {
	static int[]nums = {1,2,0,11,15,8,87}; 
    static int target = 3;
    int [] result=new int[2];
    static int[] nums1 = {1,3};
    static int[] nums2 = {2};

    public static void main(String[] args) {
    	Solutions solutions=new Solutions();
    	solutions.twoSum(nums, target);
    	solutions.findMedianSortedArrays(nums1, nums2);
	}
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	Object[] addationalArray=Stream.of(nums1,nums2).flatMap(Stream::of).toArray();
		return 0;
        
    }
    
    public int[] twoSum(int[] nums, int target) {
 
    	for(int i=0;i<nums.length;i++) {
    		
    		for(int j=1;j<nums.length-1;j++) {
    			if(nums[i]+nums[j]==target) {
    				//System.out.println("i:"+i +"  "+"j:"+j);
    				 result[0]=i;
    				 result[1]=j;
    				 
    				
    				    				
    			}
    		}
    	   
       }
       
        for (int i : result) {
        	System.out.println(i);
			
		}
        return result;
    }
	
    
    
}