package org.algorithms.sorting;

import javax.print.DocFlavor;
import java.util.Comparator;

public class CustomComparator {

    public static Comparator<Account> SALARY_COMPARATOR;
    public static Comparator<String> LARGEST_NUMBER_COMPARATOR;

    static {
        SALARY_COMPARATOR = new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                // Wrapper class in-built method
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        };
    }
}
