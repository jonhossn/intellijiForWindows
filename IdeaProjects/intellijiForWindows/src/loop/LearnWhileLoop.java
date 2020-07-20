package loop;

public class LearnWhileLoop {

    // while loop is used in situation where we do not know how many times loop needs to be executed beforehand.
    //for loop is used- where we already know about the number of times loop needs
    public static void main(String[] args) {
        // while loop-pre condition check

        int x = 45;
        int y = 30;
        while (x > 42) {
            System.out.println("learning while loop");
            x--;
        }
        while (x > 35) {
            System.out.println("learning while loop " + x);
            x--;
            while (y < 20) {
                System.out.println("learning while loop");
                y++;
            }
        }
    }
}