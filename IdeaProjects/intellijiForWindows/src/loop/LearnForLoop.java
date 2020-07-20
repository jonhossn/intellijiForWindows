package loop;

import controlFlow.SwitchCase;

import java.util.Scanner;

public class LearnForLoop {
    // loop is allowing us to execute a statement or group of statements multiple times
    //for loop
    //while loop
    //do while loop
    //for each loop

    public static void main(String[] args) {
       // System.out.println("Hello World");
        // for loop
        // for(initialization=; condition(<,>,<=,=>,&&,||);Iteration(i++){
        //   }
         for ( int i=0;i<5;i++)
         {
             System.out.println("Hello World");
         }
         for(int i=0;i<4;i++)
         {
             Scanner input = new Scanner(System.in);
             System.out.println("Enter Food Serial Number");
             int fs=input.nextInt();
             SwitchCase obj = new SwitchCase();
             obj.foodMenu(fs);
         }
         //nested for loop
        for(int i=0;i<5;i++){
            // Parent food Loop
            System.out.println("Parent for Loop");
            for(int j=1;j<2;j++){
                System.out.println("nested for loop");
            }

        }

    }
}
