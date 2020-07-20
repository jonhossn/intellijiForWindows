package oops.Abstruction;

public class GeneralMotors implements Car {
    // concrete class

String gmCarModel="2021M";
double gmCarPrice=50000;

public void gmcarInfo(){
    System.out.println(" general motor car infov"+ gmCarModel);
}

        // can not create an object bcoz its abstruction .
    public void startCar() {
        System.out.println(" general motors car has start feature");
    }

    public void stopCar() {
        System.out.println(" general motors car has stop feature");

    }

    public void wheelCar() {
        System.out.println(" general motors car has wheel feature");

    }

    public void engineCar() {
        System.out.println(" general motors car has engine feature");

    }

    public void accelerateCar() {
        System.out.println(" general motors car has acceleration feature");

    }

    public void steeringCar() {
        System.out.println(" general motors car has steering feature");

    }

    public void breakCar() {
        System.out.println(" general motors car has break feature");

    }




}
