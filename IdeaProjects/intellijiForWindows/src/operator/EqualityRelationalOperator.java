package operator;

public class EqualityRelationalOperator {
    //== Equal to
    // != not equal
    //> greater then
    //< less than
    //<== less than equal
    public static void main(String[] args) {
        int num1=30;
        int num2= 40;

        if( num1==num2){
            System.out.println(" num1 is == to num2");
        }
        if( num1!=num2){
            System.out.println(" num1 & num2 are not equall");
        }
        if( num1>num2){
            System.out.println(" num1 is greater than num2");
        }
        if( num1<num2){
            System.out.println(" num1 is less than num2");
        }
    }


}
