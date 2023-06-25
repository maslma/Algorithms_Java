public class SavingsAccount {
    public static void main(String[] args) {
        double initialAmount = 1000;
        double interestRate = 0.04; // 4% interest rate per year
        double currentBalance = initialAmount;
        int years = 0;
        while (currentBalance < (2 * initialAmount)) {
            currentBalance += currentBalance * interestRate;
            years++;
        }

        System.out.println("It takes " + years + " years to double your money.");
    }
}