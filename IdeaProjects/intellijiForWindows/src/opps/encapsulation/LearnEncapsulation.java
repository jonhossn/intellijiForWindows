package opps.encapsulation;

class Pizza {
    // data hiding
    public String Pizzaname =" American Pizza";
    public double pizzaPrice = 50.50;

    private String pizzaType= "Meat Lover";
    private String sauceType;
    private char size;
    private boolean isAvailable;


    public Pizza(){

    }
    public Pizza(String pizzaname) {
        Pizzaname = pizzaname;
    }

    public Pizza(String pizzaname, double pizzaPrice) {
        Pizzaname = pizzaname;
        this.pizzaPrice = pizzaPrice;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
