package oops.Abstruction;

public  abstract class FlyingCar extends ModernCar {

    public boolean isEmergencyExit=true;


    public abstract void autoStart();
    public abstract void flyingFeature();
    public abstract void boostEngine();
    public abstract void airBag();


    public  void takeOffLanding(){
        System.out.println("flying car has taken off ");
    }



}
