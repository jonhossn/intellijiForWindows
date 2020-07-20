package constructorWithRaza;

public class LearningConstructorWithRaza {
    String name;
    String address;
    int age;
    double courseFee;

    public LearningConstructorWithRaza()
    {
        System.out.println("this is a Default constructor");
    }

    public LearningConstructorWithRaza(String name){
        this. name=name;
        System.out.println("Student name is "+ this.name);
        this.name="Raza";
        System.out.println("______======");
        System.out.println(" Student name is"+name);// jony
        System.out.println("______======");
        System.out.println("Student name is "+ this.name);// raza
        System.out.println(" this is single parameter constructor");

    }

    public LearningConstructorWithRaza(String name, int localAge){
        this.name=name;
        this.age=localAge;
        System.out.println(" Student name is "+this.name+"Student age is"+this.age);
        System.out.println(" This constructor has different signature");
    }

    public LearningConstructorWithRaza(String name, int age, double courseFee){
        this.name=name;
        this.age=age;
        this.courseFee=courseFee;
        System.out.println(" Student name is "+this.name+"Student age is"+this.age+" Course Fee is "+courseFee);
    }

    public static void main(String[] args) {
        LearningConstructorWithRaza obj= new LearningConstructorWithRaza();
        LearningConstructorWithRaza obj1= new LearningConstructorWithRaza("Jony");
        LearningConstructorWithRaza obj2= new LearningConstructorWithRaza("Jony",34);
        LearningConstructorWithRaza obj3= new LearningConstructorWithRaza("Jony",34,22.5);


    }

}
