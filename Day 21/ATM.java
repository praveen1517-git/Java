class ATM
{
    public static void main(String[] args)
    {
        double balance = 10500.75;
        float withdraw = 2500.50f;

        System.out.println("ORIGINAL VALUES");
        System.out.println("Balance = " + balance);
        System.out.println("Withdraw Amount = " + withdraw);
        System.out.println("\nWRONG TYPE CASTING");

        int wAmountWrong = (int) withdraw;  

        System.out.println("After wrong cast withdraw = " + wAmountWrong);

        double wrongBalance = balance - wAmountWrong;

        System.out.println("Final Balance (Wrong) = " + wrongBalance);
        System.out.println("\nPROPER TYPE CASTING");

        int wAmountCorrect = (int) withdraw;  
        double withdrawDouble = (double) wAmountCorrect;

        System.out.println("After proper cast withdraw = " + withdrawDouble);

        double correctBalance = balance - withdrawDouble;

        System.out.println("Final Balance (Correct) = " + correctBalance);
    }
}