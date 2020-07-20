package opps.inheritance;

public class Son extends Father {
    public String dish=" Hot dog";
    public String team=" Brazil";
    public String car=" Benz";
    public String school=" PNT";


    private long SSN= 23456788;

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public Son() {
    }

    public Son(String dish) {
        this.dish = dish;
    }

    public Son(String dish, String team) {
        this.dish = dish;
        this.team = team;
    }
     public void hunting(){
         System.out.println(" love to hunting");
     }
    public void travel(){
        System.out.println(" like to travel");
    }
    public void party(){
        System.out.println(" like to party");
    }





}
