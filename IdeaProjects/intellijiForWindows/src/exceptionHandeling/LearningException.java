package exceptionHandeling;

public class LearningException {


    public static void doDivision(double num1, double num2) {
        double division = num1 / num2;
        System.out.println("division is " + division);
    }

    public static void main(String[] args) {
        //  doDivision(20,0);
        division();
    }

    public static void division() {
        try {// try these block of codes
            int num1 = 45;
            int num2 = 0;
            int div = num1 / num2;
            System.out.println(div);
        } catch (Exception exception) {// if anything wrong u get then show it there
            //exception.printStackTrace();
            System.out.println("this is Arithmatic exception");
        }


    }
}

