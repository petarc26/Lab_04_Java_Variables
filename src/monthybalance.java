public class monthybalance {
    public static void main(String[] args) {

        double balance = 5000.00;
        double interestRate = 0.17;

        double monthOneInterest = balance * interestRate;
        balance = balance + monthOneInterest;

        double monthTwoInterest = balance * interestRate;

        System.out.println("Interest due after one month: $" + monthOneInterest);
        System.out.println("Interest due after two months: $" + monthTwoInterest);
    }
}
