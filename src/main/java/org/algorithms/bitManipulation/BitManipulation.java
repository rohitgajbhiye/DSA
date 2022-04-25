package org.algorithms.bitManipulation;

public class BitManipulation {

    /**
     *
     * @param n
     * @return
     */
    public boolean evenOrOdd(int n){
        return (1 & n) ==0;
    }

    /**
     * Find if a bit is set(1) at a given position , Assuming 32-bit integer
     * value of position will never be greater than 31
     * @param num
     * @param position
     * @return
     */
    public boolean findSetBitAtPosition(int num , int position){
        /**
         *  1L <<31 would result in integer overflow
         *  Binary value of 1L <<31 is 10000000000000000000000000000000
         *  Integer value of 1L <<31 is 2147483648 , integer max value is 2147483647
         */
        long mask = (1L << (position-1));
        if((mask & num) == 0){
            return false;
        }
        return true;
    }

    /**
     * Check if the number is power of 2 , meaning it can be 1,2,4,8,16,32
     * One property of power of 2 in binary format is (all bits are unset expects most significant)
     * example - 100 -4 ,1000 -8 , 10000 -16 ( so it can be easily deducible using ( N & (N-1) ==0)
     * meaning 1000 & 0111 should be zero
     *
     * Edge case - When n is negative return false
     * @param n
     * @return
     */
    public boolean isPowerOf2(int n){
        if(n<=0){
            return false;
        }
        return ((n &(n-1)) ==0);
    }

    /**
     * Given a number count the number of set bits in it
     * Below algorithms takes 31 iteration to count set bit for single integer , imagine if we need to find for an array
     * it would be 0(n * 31)
     * @param num
     * @return
     */
    public int countSetBit(int num){
        long mask = (1L <<31);
        int count =0;
        for(int i=31;i>=0;i--){
            if((mask & num) >0){
                count++;
            }
            mask = (mask >>1);
        }
        return count;
    }


    /**
     * There is any optimized way to find bit set
     * (N &(N-1) until is is zero , every and operation with N-1 reduce 1 bit count
     * complexity is O(number_of_bits)
     * @param num
     * @return
     */
    public int countBitSetOptimized(int num){
        int count =0;
        while(num >0){
            count++;
            num = (num & (num-1));
        }
        return count++;
    }

    /**
     * Given 2 integer left and right , find the AND of all the integer between them inclusive left and right
     * Brute force is to loop from left and right , save AND result in a variable ,but for 1 to 1L<31 would 1L<<31 iteration
     *
     * @param left
     * @param right
     * @return
     */
    public int cumulativeAnd(int left , int right){
        long mask = (1l <<31);
        long result = 0;
        for(int i=31;i>=0;i--){
            if((left & mask)>0 && (right & mask)>0){
                result = (result | mask);
            }
            if((left & mask) ==0 && (right & mask)>0){
                break;
            }
            mask = (mask >>1);
        }
        return (int)result;
    }

    /**
     * Given an array , elements of which occurs twice and only one element occurs once ,
     * we need to find the odd element
     * [1,2,3,2,3,1,5]
     * Xoring all the element of any array would cancel out duplicate elements as n^n =0
     * this algo would not work on negative element
     * @param nums
     * @return
     */
    public int findOddOccurrences(int nums[]){
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = (xor ^ nums[i]);
        }
        return xor;
    }

    /**
     * Given is an array A[] of size N,
     * find all the subsequence which when multiplied results in a number which is Power of 2.
     *
     * @param nums
     * @return
     */
    public int PowerOf2Subsequence(int [] nums){
        long count =0;
        for(long num : nums){
            if((num & (num-1))==0){
                count++;
            }
        }
        count = (2L << (count-1));
        return (int)(count- 1L);
    }
}
