package oops.Abstruction;

public abstract class ModernCar {



    public String modernCarName="Tesla";
    public String modernCarNameSuggestedPrice;
    // abstract class is not fully abstract
// declare methods
    public abstract void autoStart();
    public abstract void blindSpot();
    public abstract void preCollision();
    public abstract void heatingCooling();
    public abstract void gps();
 //   public abstract void display();
    public abstract void backCamera();
    public abstract void autoGear();

// non abstract method
    public void display(){
        System.out.println(" Modern car has Display");
    }

}
