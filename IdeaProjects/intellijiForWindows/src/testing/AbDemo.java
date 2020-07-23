package testing;

public class AbDemo {

    public static void main(String[] args) {
      // Tony obj = new Sony();
     // obj.call();// tony
        //Jony obj2= new Sony();
       // obj2.call();// jony
        Jony obj3 = new Sony();
        obj3.dance();// sony//jony(ZAK//SONY(mijan//Sony( mama/SOny(mujahid// JONY-JONY
    }
}
abstract class Jony{// gfather
    public void call(){
        System.out.println(" JONY// calling....");
    }
    public  void dance(){
        System.out.println("Jony//Dancing...");
    }
    public abstract void move();
    public abstract void cook();
}
abstract class Tony extends Jony{// father
    public void dance(){
        System.out.println("TONY dancing...");
    }

    public void call(){
        System.out.println(" TONY is calling....");
    }

}
class Sony extends Tony{// son
    public void move(){
        System.out.println("moving....");
    }
    public void cook(){
        System.out.println("cooking...");
    }
    public void dance(){
        System.out.println(" SONY is dancing...");
    }
}