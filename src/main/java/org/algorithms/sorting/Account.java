package org.algorithms.sorting;

/**
 *  Account class that stores account information of a user
 */
public class Account implements Comparable<Account>{

    private int accountId;
    private double salary;

    public int getAccountId() {
        return accountId;
    }

    public double getSalary() {
        return salary;
    }

    /**
     *
     * @param accountId
     * @param salary
     */
    public Account(int accountId, double salary) {
        this.accountId = accountId;
        this.salary = salary;
    }

    // We are implementing sorting logic based on account id in ascending order
    @Override
    public int compareTo(Account o) {
        return this.accountId < o.accountId ? -1 : 1;
    }
}
