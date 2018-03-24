package and;

public class TestSavingAccounts {

    public static void main(String[] args) {

        SavingAccounts saver1 = new SavingAccounts(2000);
        SavingAccounts saver2 = new SavingAccounts(3000);
        System.out.printf("Initial balance of saver1 : %.2f%s\n",saver1.getSavingsBalance(),"$");
        System.out.printf("Initial balance of saver2 : %.2f%s\n",saver2.getSavingsBalance(),"$");
        System.out.println("-----------------------------------------------------------------");
        SavingAccounts.anualInterestRate = 4;

        saver1.updateSavingsBalance(saver1.calculateMonthlyInterest());
        saver2.updateSavingsBalance(saver2.calculateMonthlyInterest());

        System.out.format("Ballance state + month interest rate of %.1f%s for SAVER1  %.2f%s\n"
                ,SavingAccounts.anualInterestRate
                ,"%"
                ,saver1.getSavingsBalance(), "$");
        System.out.format("Ballance state + month interest rate of %.1f%s for SAVER2  %.2f%s\n"
                ,SavingAccounts.anualInterestRate
                ,"%"
                ,saver2.getSavingsBalance(), "$");
        System.out.println("-----------------------------------------------------------------");

        SavingAccounts.anualInterestRate = 5;

        saver1.updateSavingsBalance(saver1.calculateMonthlyInterest());
        saver2.updateSavingsBalance(saver2.calculateMonthlyInterest());

        System.out.format("Ballance state + month interest rate of %.1f%s for SAVER1  %.2f%s\n"
                ,SavingAccounts.anualInterestRate
                ,"%"
                ,saver1.getSavingsBalance(), "$");
        System.out.format("Ballance state + month interest rate of %.1f%s for SAVER2  %.2f%s\n"
                ,SavingAccounts.anualInterestRate
                ,"%"
                ,saver2.getSavingsBalance(), "$");

    }
}

