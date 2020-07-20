package opps.encapsulation;

public class TestPizza {
    public static void main(String[] args) {
        Pizza ramdanPizza = new Pizza();
        String rdP=ramdanPizza.Pizzaname=" italian";
        System.out.println(" ramdan love to eat"+rdP+" Pizza");

        Pizza resmaPizza = new Pizza(" Chk breast+ onion");
        resmaPizza.pizzaPrice=50.50;
        System.out.println(resmaPizza.pizzaPrice);

        Pizza lemPizza =new Pizza("Fat Pizza",4.56);
        lemPizza.setSauceType("hot");
        lemPizza.setSize('L');
        System.out.println("sauce type"+lemPizza.getSauceType()+ "size"+lemPizza.getSize());


    }
}
