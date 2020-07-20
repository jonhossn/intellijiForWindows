package controlFlow;

public class LearnDebugging {
    //Debug=
    // to find logical error in our code

    public int doMultiply(int number1,int number2){
        int multiply= number1+number2;
        System.out.println(" multiply value is "+ multiply);
        return multiply;
    }

    public static void main(String[] args) {
        LearnDebugging debug= new LearnDebugging();
       // debug.doMultiply();


         int expectedResult=200;
         int actualResult= debug.doMultiply(20,10);

         // unit testing= checking my method is working fine or not.
         if( expectedResult==actualResult)
         {
             System.out.println("test pass");
         }else{
             System.out.println(" test fail");
                     // to fix our logical error.
         }
    }
}
