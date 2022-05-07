package org.algorithms.sorting;
;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

    private Sort sort;
    private CustomSorting customSorting;
    private List<Account> accountData;

    @Before
    public void init(){
        this.sort = new Sort();
        this.customSorting = new CustomSorting();
        initAccountData();
    }

    public void initAccountData(){
        this.accountData = new ArrayList<Account>();
        accountData.add(new Account(12,1260));
        accountData.add(new Account(7,1230));
        accountData.add(new Account(89,1220));
        accountData.add(new Account(3,1290));
    }

    @Test
    public void sortAccountByAccountId(){
        customSorting.sortAccountByAccountId(this.accountData);
        int min = Integer.MIN_VALUE;
        boolean isSorted = true;
        for(Account account : this.accountData){
            if(min > account.getAccountId()){
                isSorted = false;
                break;
            }
            min = account.getAccountId();
        }
        Assert.assertTrue(isSorted);
    }

    @Test
    public void sortAccountBySalary(){
        customSorting.sortAccountBySalary(this.accountData);
        double min = Integer.MIN_VALUE;
        boolean isSorted = true;
        for(Account account : this.accountData){
            if(min > account.getSalary()){
                isSorted = false;
                break;
            }
            min = account.getSalary();
        }
        Assert.assertTrue(isSorted);
    }
    @Test
    public void KClosestTest() {
        int [][] nums = new int[][]{
                {3,3},
                {5,-1},
                {-2,4},
        };
        int [][] result = sort.kClosest(nums,2);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    @Test
    public void test(){

    }

    @Test
    public void orderedSortingTest(){
        String s = sort.customSortString("cbafg","abcd");
        System.out.println(s);
    }

    @Test
    public void LargestNumber(){
        String s = sort.largestNumber(new int[]{432,43243});
        System.out.println(s);
    }

    @Test
    public void relativeSort(){
        int[] arr = sort.relativeSort(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6});
        for(int a:arr){
            System.out.print(a);
        }
    }
}
