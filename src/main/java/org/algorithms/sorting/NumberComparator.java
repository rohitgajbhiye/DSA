package org.algorithms.sorting;

import java.util.Comparator;
import java.util.HashMap;

public class NumberComparator implements Comparator<Integer> {

    HashMap<Integer,Integer> map;

    public NumberComparator(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if(!map.containsKey(o1) && !map.containsKey(o2)){
            return Integer.compare(o1,o2);
        }
        if(!map.containsKey(o1)){
            return 1;
        }
        if(!map.containsKey(o2)){
            return -1;
        }
        int indexA = map.get(o1);
        int indexB = map.get(o2);
        if(indexA < indexB){
            return -1;
        }else{
            return 1;
        }
    }
}
