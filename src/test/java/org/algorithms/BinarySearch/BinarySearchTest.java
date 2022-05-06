package org.algorithms.BinarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

    private BinarySearch search;

    @Before
    public void init(){
        this.search = new BinarySearch();
    }

    @Test
    public void test(){
        search.test();
    }

    @Test
    public void binarySearchObservation(){
        int [] arr = search.binarySearchObservation(new int[]{1,3,5,6,8,11,23},7);
        Assert.assertEquals(8,arr[0]);
        Assert.assertEquals(6,arr[1]);
    }

    @Test
    public void slidingWindow_1(){
        boolean flag = search.slidingWindow(new int[]{1,2,3,4},2,8);
        Assert.assertEquals(true,flag);
    }
}
