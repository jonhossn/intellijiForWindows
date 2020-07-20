package opps.inheritance;

public class GrandFather {

    public String favDish=" Steak";
    public String favTam=" Brazil";
    public String favCar=" Ford";

    private long gfSSN= 23456788;

    public long getGfSSN() {
        return gfSSN;
    }

    public void setGfSSN(long gfSSN) {
        this.gfSSN = gfSSN;
    }

    public GrandFather(){

    }
    public GrandFather(String favDish) {
        this.favDish = favDish;
        System.out.println(" fav dish is");
    }

    public GrandFather(String favDish, String favTam) {
        this.favDish = favDish;
        this.favTam = favTam;
        System.out.println(" Fav dish & fav team");
    }


}
