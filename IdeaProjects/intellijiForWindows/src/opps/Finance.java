package opps;

public abstract class Finance implements UsBank,CBCBank {


public abstract void tradingAccount();

public void commerceAccount(){
    System.out.println(" HSBC do commerce Account");
}

}
