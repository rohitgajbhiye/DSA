package org.algorithms.twoPointers;

import org.algorithms.bitManipulation.BitManipulation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TwoPointersTest {

    private TwoPointers pointer;

    @Before
    public void init(){
        this.pointer = new TwoPointers();
    }

    @Test
    public void test(){
        pointer.test();
    }


    @Test
    public void pairSum_1(){
        boolean result = pointer.pairSum(new int[]{2,-1,0,3,9},8);
        Assert.assertEquals(true,result);
    }

    @Test
    public void pairSumBinarySearch_1(){
        boolean result = pointer.pairSumBinarySearch(new int[]{2,-1,0,3,9},8);
        Assert.assertEquals(true,result);
    }
    @Test
    public void pairSum_pairSumTwoPointer(){
        int nums[] = new int[]{2,-1,0,3,9};
        Arrays.sort(nums);
        boolean result = pointer.pairSumTwoPointer(nums,5);
        Assert.assertEquals(true,result);
    }

}
