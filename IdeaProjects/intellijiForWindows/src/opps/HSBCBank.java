package opps;

public class HSBCBank implements UsBank,CBCBank{
    public void mortgageLoans(){

        System.out.println("HSBC provide Mortgage Loan");
    }
    static int accounts=300;// instance variable

    public void studentLoan() {
        System.out.println(" HSBC bank provide student loan");
    }

    @Override
    public void carLoan() {
        System.out.println("  bank provide car loan");
    }

    public void debit() {
        System.out.println("  bank provide debit service");
    }

    public void credit() {
        System.out.println("  bank provide credit service");
    }

    @Override
    public void socialDistance() {
        System.out.println("Practice SocialDistance");
    }
}
