package operator;

public class ConditionalOperator {
    //&& conditional and operator- ALL TRUE
    // || or operator
    public static void main(String[] args) {
        int num1=55;
        int num2=40;
        if( num1==num2){
            System.out.println("num1 and num 2 are equal");
        }
        if( num1==55 && num2==40){// both condition has to be true
            System.out.println(" rice");
        }
        if( num1==55 || num2==40){// one condition has to be true
            System.out.println(" pizza");
        }
    }

}
