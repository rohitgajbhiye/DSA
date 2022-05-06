package org.algorithms.sorting;
;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
}
