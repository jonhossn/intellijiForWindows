package controlFlow;

public class NestedIfElse {

    public static void main(String[] args) {
        int age=17;
        if(age>18)
        {
            System.out.println("U care adult");
            if (age>24) {
                System.out.println(" u r Youth");
                if (age > 22){
                    System.out.println(" u r 22");
            }
            }else{
                System.out.println(" u r not YOUTH");
            }
        }

        else {
            System.out.println(" u r not youth");
            if (age > 18) {
                System.out.println("  u r teenager");
            } else if (age > 1){
                System.out.println(" ur  a baby");
            }

        }
    }
}
