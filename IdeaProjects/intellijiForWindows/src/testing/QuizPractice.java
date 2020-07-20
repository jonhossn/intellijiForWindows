package testing;
import java.util.Scanner;

public class QuizPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter your age: ");
        int age=input.nextInt();
        if (age<=18){
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible for vote");
        }

    }
}
