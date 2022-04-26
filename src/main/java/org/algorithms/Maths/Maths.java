package org.algorithms.Maths;

import java.util.ArrayList;

public class Maths {

    /**
     * Greatest common Divisor of 2 numbers
     * @param a
     * @param b
     * @return
     */
    public int GCD(int a , int b){
        int maxDivisor =1;
        int min= Math.min(a,b);
        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
                if(maxDivisor < i){
                    maxDivisor =i;
                }
            }
        }
        return maxDivisor;
    }

    public int EuclideanGCD(int a, int b){
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int temp = 0;
        while((max%min)>0){
            temp =min;
            min = max%min;
            max = temp;
        }
        return min;
    }

    /**
     * Given an array , return GCD of all the elements in that array
     * @param nums
     * @return
     */
    public int GCDOfSequence(int nums[]){
        // If array does not have 2 elements
        if(nums.length<1){
            return -1;
        }
        int common = EuclideanGCD(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            common = EuclideanGCD(common,nums[i]);
        }
        return common;
    }

    /**
     * Given an array return true if there is at least one sub-sequence in any array
     * which has GCD equals to 1 , then return true return false otherwise
     *
     * complexity 0(n log n)
     * Logic is if there is any sub-sequence which has GCD 1 whole array would have GCD 1
     * @return
     */
    public boolean GCDOfAllSubSequence(int nums[]){
        if(GCDOfSequence(nums)==1){
            return true;
        }
        return false;
    }

    /**
     * Given 2 Number find the LCM of the 2
     * LCM of the 2 number 12,18 and be provided as lowest number which is multiple of both 12 and 18
     *  multiple's of 12 are 12,24,36,48,60
     *  multiple's of 18 are 18,36 and so on
     *  we can say 26 is the smallest multiple of both 12 ans 18
     *
     *  now what will be maximum LCM for any number a,b , i.e a*b
     *  and what is smallest LCM max of a,b , below logic is based on this
     *  complexity O((a*b)-max(a,b))
     * @param a
     * @param b
     * @return
     */
    public int leastCommonMultiple(int a , int b){
        int max = Math.max(a,b);
        int i=max;
        for(;i<=(a*b);i++){
            if((i%a ==0) && (i%b)==0){
                break;
            }
        }
        return i;
    }

    /**
     * There is another way with which LCM can be computed faster
     * GCD * LCM = (A*B)
     * which means LCM = GCD/(A*B) , so after finding GCD , LCM is one computation away
     * @param a
     * @param b
     * @return
     */
    public int lowestCommonMultiple(int a , int b){
        if(a >0 &&b>0){
            return (a*b)/EuclideanGCD(a,b);
        }
        return -1;
    }

    /**
     *
     * @param nums
     * @return
     */
    public int LCMOfSequences(int []nums){
        return  -1;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int divisibilityTillN(int a, int b, int n){
        int byA = n/a;
        int byB = n/b;
        int byBoth = n/leastCommonMultiple(a,b);
        return ((byA + byB) - byBoth);
    }

    /**
     * Find all the factors of input number
     *
     * brute force approach is to run loop from 1 to the number itself and check divisibility
     * @param num
     * @return
     */
    public void findAllFactors(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }

    /**
     *
     * @param num
     */
    public void findAllFactorOptimised(int num){
        double root = Math.sqrt(num);
        for(int i=1;i<=root;i++){
            if(num%i==0){
                System.out.println(i);
                if(i!=root){
                    System.out.println(num/i);
                }
            }
        }
    }

    /**
     * Given a number , determine if the number has even or odd factor
     * if a number is perfect square then it will have odd number of factor
     * otherwise even
     * @param num
     * @return
     */
    public boolean haveEvenFactor(int num){
        double root = Math.sqrt(num);
        int temp = (int)root;
        if((root-temp)>0){
            return true;
        }
        return false;
    }

    /**
     * Given a number n , which is the count of doors which are closed
     * starting from 1 to n , we are allowed to toggle the state of door open/closed
     * only rule is at ith time only those doors will be toggled which are divisible by i
     * meaning a 1 - all the door will be toggled , at 2 only 2 and 4
     * We need to determine the count of doors that are open
     * @param num
     * @return
     */
    public int openCloseProblem(int num){
        int count =0;
        for(int i=1;i<=num;i++){
            if(!(haveEvenFactor(i))){
                count++;
            }
        }
        return count;
    }
}
