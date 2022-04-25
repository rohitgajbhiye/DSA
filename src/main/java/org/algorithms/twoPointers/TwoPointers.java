package org.algorithms.twoPointers;

import java.util.Arrays;

public class TwoPointers {
    public void test(){
        int a =6;
        int b = -1;
        int sum = (a-b);
        System.out.println("testing two pointer" + sum);
    }

    /**
     * Given an Array and a target element
     * Find if any two elements sum is equal to the target
     *
     * Brute force approach is to compare every element with every other element
     * [1,2,3] - {1->2 , 1->3} , {2->3}
     * Complexity O(n2)
     * @param nums
     * @param target
     * @return
     */
    public boolean pairSum(int [] nums, int target){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                sum = (nums[i] + nums[j]);
                if(sum == target){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Binary search version of pair sum problem takes O(nlogn) times
     * which involves sorting the array if it's not already sorted and running binary search for each element
     * @param nums
     * @param target
     * @return
     */
    public boolean pairSumBinarySearch(int [] nums, int target){
        int sum =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            sum = (target - nums[i]);
            if(find(nums,sum)){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param nums
     * @return
     */
    private boolean find(int nums[], int target){
        int low =0;
        int high = nums.length-1;
        int mid = 0;
        while(low<=high){
            mid =  (low+high)/2;
            if(nums[mid] == target){
               return true;
            }
            if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }

    /**
     * Pair sum problem can be solved in O(n) after sorting the array
     * using 2 pointer approach
     *
     * This Algorithm considers array should be sorted
     * @return
     */
    public boolean pairSumTwoPointer(int []nums, int target){
        int low = 0;
        int high = nums.length-1;
        int sum =0;
        while(low<=high){
            sum = (nums[low] + nums[high]);
            if(sum > target){
                high--;
                continue;
            }

            if(sum < target){
                low++;
                continue;
            }
            return true;
        }
        return false;
    }
}
