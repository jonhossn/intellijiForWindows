package method;

public class LearningMethod {
    // method is block of code which runs when it is called
    // method used to perform certain action known as function

    // return type// non return type
    // wit parameter
    // witout parameter.
    // return type- data type/class type/object type

    public int doSum() {// return type- no parameter.
        int number1 = 2;
        int number2 = 5;
        int sum = number1 + number2;
        System.out.println(" Subtotal is " + sum);
        return sum;
    }

    public int doSubtract(int num1, int num2) { // return type with parameter.
        int number1 = num1;
        int number2 = num2;
        int sub = number2 - number1;
        System.out.println("subtraction is " + sub);
        return sub;

    }

    public String stInfo(String fName, String lName) {
        String fullName = fName + " " + lName;
        System.out.println("Full name " + fullName);
        return fullName;
    }

    public String stInfo(String fName, String lName, int age) {
        String fullName = fName + " " + lName;
        //int a= age;
        System.out.println("Full name " + fullName + " age" + age);
        return fullName;
    }


    public static void stInfo() {
        System.out.println("Student information");
    }

    public void doMultiply() {// no return type- no parameter.
        int number1 = 2;
        int number2 = 5;
        int multiplication = number1 * number2;
        System.out.println(" Multiplication is " + multiplication);


    }

    public void doMultiply(int number1, int number2) {// no return type- no parameter.

        int multiplication = number1 * number2;
        System.out.println(" Multiplication is " + multiplication);
    }


    public static void main(String[] args) {
       // LearningMethod.stInfo();
        LearningMethod obj= new LearningMethod();
        obj.doSum();
        obj.doSubtract(10,22);
        obj.stInfo("jony","hossain");
        obj.stInfo("tony","den","22");
        obj.doMultiply();
       // obj.doMultiply("12","2");

    }
}
