package org.algorithms.sorting;

import java.util.Comparator;

public class OrderComparator implements Comparator<Character> {

    private int[] map;

    public OrderComparator(String order){
        map = new int[26];
        for(int i=0;i<order.length();i++){
            int b = (order.charAt(i) - 97);
            map[b] = i;
        }
    }

    @Override
    public int compare(Character o1, Character o2) {
        return Integer.compare(map[(o1-97)], map[(o2-97)]);
    }
}
