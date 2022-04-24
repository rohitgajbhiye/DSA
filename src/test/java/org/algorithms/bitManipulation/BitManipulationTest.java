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
}
