
package com.mycompany.q8;


public class Q8 {

    public static void main(String[] args) {
           SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        // Set annualInterestRate to 4%
        SavingAccount.ModifyInterestRate(0.04);

        // Calculate monthly interest and print new balances for both savers
        System.out.println("Month 1:");
        System.out.println("Saver 1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 Balance: $" + saver2.getSavingsBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Month 2:");
        System.out.println("Saver 1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 Balance: $" + saver2.getSavingsBalance());

        // Set annualInterestRate to 5%
        SavingAccount.ModifyInterestRate(0.05);

        // Calculate next month's interest 
        System.out.println("Month 3:");
        System.out.println("Saver 1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 Balance: $" + saver2.getSavingsBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Month 4:");
        System.out.println("Saver 1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 Balance: $" + saver2.getSavingsBalance());
    }
}
    

