package and;

public class SavingAccounts {
    static double anualInterestRate;
    private double savingsBalance;

    public SavingAccounts(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    double calculateMonthlyInterest() {
        return savingsBalance * (anualInterestRate / 100) / 12;
    }

    void updateSavingsBalance(double monthlyInterestRate) {
        savingsBalance += monthlyInterestRate;
    }

}
