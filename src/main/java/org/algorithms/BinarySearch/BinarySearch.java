package org.algorithms.BinarySearch;

import java.util.stream.StreamSupport;

public class BinarySearch {
    /**
     * Binary search - Binary search reduces the search space by 2
     * NOTES -
     *  1. Binary search can be used to solve optimization problems , So does dynamic programming and greedy algorithms
     *  2. complexity O(log n)
     *
     */

    public void test(){
        System.out.println("testing ");
    }

    /**
     *
     * @param nums
     */
    public int [] binarySearchObservation(int []nums,int key){
        int [] arr = new int[2];
        int low =0;
        int high = nums.length-1;
        int mid =0;
        while(low<=high){
            mid = (low+high)/2;
            if(key == nums[mid]){
                break;
            }
            if(key < nums[mid]){
                high = mid-1;
            }
            if(key > nums[mid]){
                low = mid+1;
            }
        }
        arr[0] = nums[low];
        arr[1] = nums[high];
        return arr;
    }


    /**
     *
     * @param nums
     * @param max
     * @return
     */
    public int maximizeK(int nums[],int max){
        int low =0;
        int high = nums.length-1;
        int mid = 0;
        boolean isPossible = false;
        while(low <= high){
            mid = (low+high)/2;
            isPossible  = slidingWindow(nums,mid,max);
            // mid +1 is the last element or for mid+1 condition does not hold then return mid
            if(isPossible && (!(mid+1 < nums.length) || !slidingWindow(nums,mid+1,max))){
                return mid;
            }
            // if condition does not hold for mid
            if(!isPossible){
                high =  mid-1;
            }
            if(isPossible){
                low = mid +1;
            }
        }
        return -1;
    }

    /** Find the sum of all sub array of size k
     *  return true if no sub array sum is > max , return false otherwise
     * Complexity O(n)
     * @param k
     * @param max
     */
    public boolean slidingWindow(int [] nums, int k , int max){
        int sum =0;
        for(int i=0;i<k;i++){
            // Sliding sum
            sum = sum + nums[i];
        }
        if(sum > max){
            return false;
        }
        for(int i=1;i<=(nums.length-k);i++){
           sum = sum - nums[i-1];
           sum = sum + nums[i+(k-1)];
           if(sum > max){
               return false;
           }
        }
        return true;
    }

}
