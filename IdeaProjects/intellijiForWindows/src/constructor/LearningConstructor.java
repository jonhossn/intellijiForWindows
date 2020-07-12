package constructor;

public class LearningConstructor {
    // constructor name is same as class name.
    //has no return. no VOID.
    //used to initialize an object
    //before creating Parameterized constructor you MUST crete a default one.
    // default/ non Parameterized constructor
    // Parameterized constructor

    // Default constructor automatically created by JDK. ( because we may have parameterized constructor later on the code)


    String name;
    String address;
    int age;
    double courseFee;

    public LearningConstructor()// default constructor
    {
        System.out.println(" default constructor");
    }

    public LearningConstructor(String name)// single parameterized constructor
    {
        this.name=name;// this keyword is used to access the global variable/instance variable inside the constructor
        System.out.println(this.name);
    }

    public LearningConstructor(String name,String address)// multi parameterized constructor.
    {
    this.name=name;
    this.address=address;
        System.out.println(this.name+this.address);
    }


    public static void main(String[] args)
    {
        LearningConstructor learning = new LearningConstructor("James william");// passing Argument meaning passing value.
        LearningConstructor jony = new LearningConstructor("Jony Hossain","Jamaica");
        LearningConstructor j = new LearningConstructor();
    }
}
