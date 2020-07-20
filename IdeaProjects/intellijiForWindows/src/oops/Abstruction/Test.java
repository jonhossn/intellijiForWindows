package oops.Abstruction;

public class Test {
    public static void main(String[] args) {
        GeneralMotors gm =new GeneralMotors();
        gm.startCar();
        gm.engineCar();
        gm.accelerateCar();
        gm.breakCar();
        gm.stopCar();
        System.out.println("number of seat "+gm.seat);
    }
}
