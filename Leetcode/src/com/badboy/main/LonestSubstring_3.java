package com.badboy.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonestSubstring_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LonestSubstring_3().lengthOfLongestSubstring("ddddab"));
	}

	public int lengthOfLongestSubstring(String s) {
		if(s.length() == 0 )return 0 ;
		
		int beginIndex = 0 ;
		int endIndex = 0 ;
		
		int length = 0 ;
		
		List<String> list = new ArrayList<>() ;
		Set<String> set = new HashSet<>() ;
		
        for(int i=0;i<s.length();i++) {
        	String c = s.charAt(i)+"" ;
        	list.add(c) ;
        	endIndex = i ;
        	
        	if(set.contains(c)) {
        		while(beginIndex<endIndex) {
        			String nc = list.get(beginIndex) ;
        			beginIndex++ ;
        			set.remove(nc) ;
        			if(nc.equals(c)) {
        				break ;
        			}
        		}
        		set.add(c) ;
        	}else {
        		set.add(c) ;
        	}
        	
        	length = length>(endIndex - beginIndex)?length:(endIndex - beginIndex) ;
        	
        }
		
		return length+1 ;
    }

}
