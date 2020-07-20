package loop;

import java.util.Scanner;

public class NestedForLoop {
    //1
    //1 2
    //1 2 3
    //1 2 3 4

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      //  System.out.println("enter your number");
       // int numOfRow=input.nextInt(); // 4
        for( int i=1; i<=4;i++) { // loop
            //i=1
            //i=2
            //i=3

            for(int j=1;j<=2;j++){

                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
// i=1
//j=1