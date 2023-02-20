package com.code;

class Solutions {
	static int[]nums = {1,2,7,11,15}; 
    static int target = 9;
	 int[] outputs;
    
    
    public static void main(String[] args) {
    	Solutions solutions=new Solutions();
    	solutions.twoSum(nums, target);
	}
    public void twoSum(int[] nums, int target) {
 
    	for(int i=0;i<nums.length;i++) {
    		
    		for(int j=1;j<nums.length-1;j++) {
    			if(nums[i]+nums[j]==target) {
    				System.out.println("the Numbers are " + nums[i] +" and "+ nums[j]);
    				
    				
    				    				
    			}
    		}
    	   
       }
       
       // System.out.println(outputs);
       // return outputs;
    }
	
    
    
}