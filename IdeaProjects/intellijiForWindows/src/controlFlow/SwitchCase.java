package controlFlow;

public class SwitchCase {

    public static void main(String[] args) {
        // switch(condition){ case number: statements break}
        //case number:
        // .....statements
        // break;
        int foodSerial = 7;

        SwitchCase myFood = new SwitchCase();
        myFood.foodMenu(6);
    }

        public void foodMenu( int foodSerial) {
            String foodName;
            switch (foodSerial) {
                case 1:
                    foodName = "pizza";
                    break;
                case 2:
                    foodName = "Burger";
                    break;
                case 3:
                    foodName = "Biryani";
                    break;
                case 4:
                    foodName = "Rice";
                    break;
                case 5:
                    foodName = "Pasta";
                    break;
                case 6:
                    foodName = " Soup";
                    break;
                case 7:
                    String drink = "coke";
                    System.out.println(drink);
                    foodName = "bbq";
                    int qty = 3;
                    if (qty == 3) {
                        System.out.println(" your order is 3");
                    }
                {
                    System.out.println(" your order is more then 3");
                }
                break;
                default:
                    foodName = "Invalid Food Name";
                    break;
            }

            System.out.println(" my food is " + foodName);
        }
    }




