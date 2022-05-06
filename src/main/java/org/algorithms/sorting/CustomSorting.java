package org.algorithms.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class contains code to demonstrate comparable and comparator implementation
 */
public class CustomSorting {

    /**
     * Sort custom Account class , We have implemented Comparable interface to account class which makes sorting
     * by account id natural
     * @param list
     */
    public void sortAccountByAccountId(List<Account> list){
       Collections.sort(list);
    }

    /**
     * As we have already overridden cmopare to method in account class for reflect account id sorting
     * We might need to create another comparator which has method compare to support sorting logic
     * @param list
     */
    public void sortAccountBySalary(List<Account> list){
       Collections.sort(list,CustomComparator.SALARY_COMPARATOR);
    }


}
