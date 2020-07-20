package recursion;

public class LearningRecursion {
    // Recursion process in a which a method calls itself continuously.
    // must call itself
    // must have a base
    // must change its state and move towards the base case


    int count=0;

    public void stInfo() {
        count++;
        if (count <= 5) {
            System.out.println(" Student name is Jony");
            stInfo();
        }
    }
        public static void main(String[] args) {
        LearningRecursion obj = new LearningRecursion();
        obj.stInfo();

        }

    }