package testing;

public class testsy {
    public static void main(String[] args) {
        LearnSsingleton obj=  LearnSsingleton.getInstance();
        obj.pizzaName=" American-Pizza";
        obj.pizzaDeliveryCharge="5";

        obj.setSize('M');
        obj.getSize();
        System.out.println("Pizza size is "+obj.getSize());
    }
}
