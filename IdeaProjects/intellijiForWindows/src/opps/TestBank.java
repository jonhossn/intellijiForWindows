package opps;

public class TestBank {
    public static void main(String[] args) {


        HSBCBank hs = new HSBCBank();
            hs.carLoan();
            hs.credit();
            hs.debit();
            hs.studentLoan();
            hs.socialDistance();
        System.out.println(UsBank.minBalance);
        System.out.println(hs.accounts);
        System.out.println("++++++======++++++=======++++");

        UsBank us = new HSBCBank();
        us.socialDistance();
        System.out.println("=====================");

        CBCBank cb= new HSBCBank();
        cb.carLoan();
        cb.studentLoan();



    }
}