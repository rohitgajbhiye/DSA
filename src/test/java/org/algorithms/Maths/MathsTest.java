package org.algorithms.Maths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathsTest {

    private Maths maths;

    @Before
    public void init(){
        this.maths = new Maths();
    }

    @Test
    public void GCD(){
        int result = maths.GCD(12,18);
        Assert.assertEquals(6,result);
    }

    @Test
    public void euclideanGCD(){
        int result = maths.EuclideanGCD(4,12);
        Assert.assertEquals(4,result);
    }

    @Test
    public void euclideanGCD_1(){
        int result = maths.EuclideanGCD(18,12);
        Assert.assertEquals(6,result);
    }

    @Test
    public void euclideanGCD_2(){
        int result = maths.EuclideanGCD(17,12);
        Assert.assertEquals(1,result);
    }

    @Test
    public void GCDOfSequence_1(){
        int result = maths.GCDOfSequence(new int[]{3,12,18});
        Assert.assertEquals(3,result);
    }

    @Test
    public void LCM_1(){
        int result = maths.leastCommonMultiple(12,18);
        Assert.assertEquals(36,result);
    }

    @Test
    public void LCM_2(){
        int result = maths.lowestCommonMultiple(12,18);
        Assert.assertEquals(36,result);
    }

    @Test
    public void divisibilityTillN(){
        int result = maths.divisibilityTillN(2,3,20);
        Assert.assertEquals(13,result);
    }

   @Test
    public void allFactor(){
        maths.findAllFactors(20);
    }

    @Test
    public void allFactor_1(){
        maths.findAllFactorOptimised(20);
    }

    @Test
    public void evenFactor_true(){
         boolean result = maths.haveEvenFactor(20);
         Assert.assertEquals(true,result);
    }

    @Test
    public void evenFactor_false(){
        boolean result = maths.haveEvenFactor(16);
        Assert.assertEquals(false,result);
    }

    @Test
    public void openCloseProblem(){
        int result = maths.openCloseProblem(5);
        Assert.assertEquals(2,result);
    }
}
