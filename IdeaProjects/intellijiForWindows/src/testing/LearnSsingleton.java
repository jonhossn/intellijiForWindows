package testing;

public class LearnSsingleton {

    public String pizzaName;
    public int pizzaPrice;
    public String pizzaQty;
    public String pizzaDeliveryCharge;
    private char size='L';
    private boolean isAvailable;

    private LearnSsingleton(){

        // private constructor
    }

   // create instance variable/object
    private static LearnSsingleton instance = new LearnSsingleton();
    // create a public method.
    public static LearnSsingleton getInstance(){
        return instance;
    }
    // Getter and Setter get/set method

    //size is my private method- size get()    size set()


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
