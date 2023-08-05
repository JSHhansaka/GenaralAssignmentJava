
package com.mycompany.q8;


public class SavingAccount {
    private static double anuaulInterestRate;
    private double savingsBalnce;
    
    public SavingAccount(double savingBalance)
    {
        this.savingsBalnce=savingBalance;
    }
    public void calculateMonthlyInterest( )
    {
        double monthlyInterest=this.savingsBalnce*(anuaulInterestRate /12);
        this.savingsBalnce+=monthlyInterest;
    }
    public static void ModifyInterestRate(double anualInterestRate)
    {
        anuaulInterestRate= anualInterestRate;
    }
    public double getSavingsBalance() {
        return savingsBalnce;
    }
}
