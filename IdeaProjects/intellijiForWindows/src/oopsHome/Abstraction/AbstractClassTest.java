package oopsHome.Abstraction;

public class AbstractClassTest {

    public static void main(String[] args) {
        Test t = new Test();
        t.printInfo();

    }
}

     abstract class MySuperClass {

            abstract public void printInfo();
    }

     abstract class MySubClass extends MySuperClass {

            abstract public void sayHi();

    }
    class Baby extends Test{
    public void show(){
        System.out.println(" i am the baby");
    }
    }
    class Test extends MySubClass{


        @Override
        public void sayHi() {
            System.out.println(" Hello");
        }

        @Override
        public void printInfo() {
            System.out.println(" new york");
        }
    }




