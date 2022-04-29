package com.devskiller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
    	
    	List<Integer> list = new ArrayList<>();
        
    	for(int i=0; i < integers.size(); i++){
    		
    		for(Integer numero : integers){
    				if(numero == integers.get(i)){
    					list.add(integers.get(i));
    					break;
    				}
    		}
    		
    	}
    	
    	
        return list;
    }

}
