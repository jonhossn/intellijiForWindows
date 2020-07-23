package oopsHome.Abstraction;

public class Abstraction2 {
    public static void main(String[] args) {
        Iphone obj = new Iphone();
        //show(obj);
        SamsungS4 obj1=new SamsungS4();
        show(obj1);
        show(obj);




    }
        public static void show(Phone obj){
           obj.showConfig();
        }


    }
    abstract class Phone{
    public abstract void showConfig();

    }

    class Iphone extends Phone{
        public void showConfig(){
            System.out.println(" 4 GB ram......IOS");
        }
    }
    class SamsungS4 extends Phone{
        public void showConfig(){
           // System.out.println(" 3GB,.... Lolipop");
        }
    }









