package com.badboy.main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] rets = new int[2] ;
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i=0;i<nums.length;i++) {
        	int old = target-nums[i] ;
        	if(map.containsKey(old)) {
        		rets[0] = map.get(old) ;
        		rets[1] = i ;
        		break ;
        	}else {
        		map.put(nums[i],i) ;
        	}
        }
        
        return rets ;
    }

}
