package org.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

    public void mergeSort(int [] nums,int low,int high){
        if(low <high){
            int mid = (low+high)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }

    public void merge(int [] nums, int low, int mid , int high) {
        int []a  = new int[(mid-low)+1];
        int []b = new int[(high-mid)];
        int index = low;
        for(int i=0;i<a.length;i++) {
            a[i] = nums[index];
            index++;
        }
        for(int j=0;j<b.length;j++){
            b[j] = nums[index];
            index++;
        }
        int min = Math.min(a.length,b.length);
        int aIndex=0;
        int bIndex=0;
        int k = low;
        for(int j=0;j<min;j++){
            if(a[aIndex] < b[bIndex]){
                nums[k] = a[aIndex];
                aIndex++;
            }else{
                nums[k] = b[bIndex];
                bIndex++;
            }
            k++;
        }
        if (aIndex < a.length){
            while(aIndex <a.length){
                nums[k] = a[aIndex];
                aIndex++;
                k++;
            }
        }
        if(bIndex < b.length){
            while(bIndex < b.length){
                nums[k] = b[bIndex];
                bIndex++;
                k++;
            }
        }
    }

    class Points implements Comparable<Points>{
        int x;
        int y;

        public Points(int x, int y){
            this.x = x;
            this.y =y;
        }

        public int compareTo(Points points){
            int first = (x*x) + (y*y);
            int second = (points.x*points.x) + (points.y*points.y);
            return Integer.compare(first,second);
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        ArrayList<Points> list = new ArrayList<Points>();
        for(int i=0;i<points.length;i++){
            list.add(new Points(points[i][0],points[i][1]));
        }
        Collections.sort(list);
        int result [][] = new int[k][];
        int index=0;
        for(Points p: list){
            if(index >=k){
                break;
            }
            result[index] = new int[]{p.x,p.y};
            index++;
        }
        return result;
    }

    /**
     *
     * @param order
     * @param s
     * @return
     */
    public String customSortString(String order, String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        OrderComparator orderComparator = new OrderComparator(order);
        Collections.sort(list,orderComparator);
        StringBuilder stringBuilder = new StringBuilder();
        for(Character ch:list){
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public String largestNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // Convert int [] to List<Integer>
        for(int i =0;i<nums.length;i++){
            list.add(nums[i]);
        }
        StringBuilder builder = new StringBuilder();
        for(Integer n :list){
            builder.append(n);
        }
        return builder.toString();
    }

    public int[] relativeSort(int [] arr1, int [] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
        Collections.sort(list,new NumberComparator(arr2));
        int [] result = new int[arr1.length];
        int index =0;
        for(Integer n :list){
            result[index] = n;
            index++;
        }
        return result;
    }
}
