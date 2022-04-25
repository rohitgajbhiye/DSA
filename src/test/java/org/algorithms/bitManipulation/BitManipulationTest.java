package org.algorithms.bitManipulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BitManipulationTest {

    private BitManipulation bit;

    @Before
    public void init(){
        this.bit = new BitManipulation();
    }

    @Test
    public void findEvenOrOdd_ShouldBeOdd(){
        boolean result = bit.evenOrOdd(11);
        Assert.assertEquals(result,false);
    }

    @Test
    public void findEvenOrOdd_ShouldBeEven(){
        boolean result = bit.evenOrOdd(10);
        Assert.assertEquals(result,true);
    }

    @Test
    public void isbitSetAtNthPosition_3(){
       boolean result = bit.findSetBitAtPosition(4,3);
       System.out.println(result);
        Assert.assertEquals(result,Boolean.TRUE);
    }

    @Test
    public void isbitSetAtNthPosition_2(){
        boolean result = bit.findSetBitAtPosition(4,2);
        Assert.assertEquals(result,false);
    }

    @Test
    public void powerOf2_2(){
        boolean result = bit.isPowerOf2(2);
        Assert.assertEquals(result,true);
    }

    @Test
    public void powerOf2_3(){
        boolean result = bit.isPowerOf2(3);
        Assert.assertEquals(result,false);
    }
    @Test
    public void powerOf2_8(){
        boolean result = bit.isPowerOf2(8);
        Assert.assertEquals(result,true);
    }

    @Test
    public void powerOf2_negative(){
        boolean result = bit.isPowerOf2(-8);
        Assert.assertEquals(result,false);
    }

    @Test
    public void countSetBit_11(){
        int result = bit.countSetBit(11);
        Assert.assertEquals(3,result);
    }

    @Test
    public void countSetBit_4(){
        int result = bit.countSetBit(4);
        Assert.assertEquals(1,result);
    }

    @Test
    public void countSetBit_optimsed_4(){
        int result = bit.countBitSetOptimized(4);
        Assert.assertEquals(1,result);
    }

    @Test
    public void countSetBit_Optimized_10(){
        int result = bit.countBitSetOptimized(10);
        Assert.assertEquals(2,result);
    }

    @Test
    public void countSetBit_Optimized_11(){
        int result = bit.countBitSetOptimized(11);
        Assert.assertEquals(3,result);
    }

    @Test
    public void rangeBitwiseAnd(){
        int result = bit.cumulativeAnd(4,7);
        Assert.assertEquals(4,result);
    }

    @Test
    public void findOddOccurrences_5(){
        int result = bit.findOddOccurrences(new int[]{1,2,3,2,3,1,5});
        Assert.assertEquals(5,result);
    }

    @Test
    public void findOddOccurrences_8(){
        int result = bit.findOddOccurrences(new int[]{1,2,3,2,3,1,8,0,0,0});
        Assert.assertEquals(8,result);
    }

    @Test
    public void PowerOf2Subsequence(){
        int result = bit.PowerOf2Subsequence(new int[]{1, 6, 2});
        Assert.assertEquals(3,result);
    }
}
