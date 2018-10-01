/* 
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

import java.util.ArrayList;
import java.util.HashMap;

public class FindingOccurence {
	
	public static void main(String[] args) {
		
		int [] nums = new int[5];
		nums = [1,3,2,2,2];
		majorityElement(nums);
		
	}

	 public int majorityElement(int[] nums) {
        
        HashMap <Integer, Integer> hmap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int index = -1;
        int current = 0;
        
        if(nums.length==1){
            return nums[0];
        }
        
        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(nums[i])){
                current = hmap.get(nums[i]);
                if(current>max){
                    max = current;
                    index = nums[i];
                }
                current++;
                hmap.put(nums[i], current);
            }
            else
                hmap.put(nums[i],0);
        }
        return index;
    }   
}
