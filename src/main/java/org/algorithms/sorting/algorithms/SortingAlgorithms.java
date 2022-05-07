package org.algorithms.sorting.algorithms;

public class SortingAlgorithms {


    /**
     * Insertion sort is comparison based O(n2) Algorithm , below are the properties
     * 1. Stable
     * 2. Adaptive
     * @param nums
     */
    public void insertionSort(int []nums){
        int index=0;
        // In case of single element
        if(nums.length <1 ){
            return;
        }
        for(int i=1;i<nums.length;i++){
            index =i;
            while(index>0){
                if(nums[index] < nums[index-1]){
                    swap(nums,index,index-1);
                }else {
                    break;
                }
                index--;
            }
        }
    }

    /**
     * Bubble sort is comparison based O(n2) Algorithm , below are the properties
     * 1. stable
     * 2 . not adaptive
     * @param nums
     */
    public void bubbleSort(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }

    public void swap(int []nums, int start,int end){
        int temp = nums[start];
        nums[start]= nums[end];
        nums[end]=temp;
    }
}
