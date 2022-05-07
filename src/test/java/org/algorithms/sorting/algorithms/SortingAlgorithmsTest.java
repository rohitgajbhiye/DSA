package org.algorithms.sorting.algorithms;

import org.algorithms.sorting.algorithms.SortingAlgorithms;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingAlgorithmsTest {

    private SortingAlgorithms algorithms;


    @Before
    public void init(){
        algorithms = new SortingAlgorithms();
    }

    @Test
    public void insertionSort_case_1(){
        int[] nums = new int[]{2,1,4,3,9,6};
        int [] result = new int[]{1,2,3,4,6,9};
        algorithms.insertionSort(nums);
        Assert.assertArrayEquals(result,nums);
    }

    @Test
    public void insertionSort_case_2(){
        int[] nums = new int[]{1,2,3,4,5,6};
        int [] result = new int[]{1,2,3,4,5,6};
        algorithms.insertionSort(nums);
        Assert.assertArrayEquals(result,nums);
    }

    @Test
    public void insertionSort_case_3(){
        int[] nums = new int[]{6,5,4,3,2,1};
        int [] result = new int[]{1,2,3,4,5,6};
        algorithms.insertionSort(nums);
        Assert.assertArrayEquals(result,nums);
    }

    @Test
    public void bubbleSort_case_1(){
        int[] nums = new int[]{6,5,4,3,2,1};
        int [] result = new int[]{1,2,3,4,5,6};
        algorithms.insertionSort(nums);
        Assert.assertArrayEquals(result,nums);
    }
}
