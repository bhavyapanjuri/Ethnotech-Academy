abstract class Items {

    protected String foodItem;
    protected String drinkItem;
    protected int quantity;
    protected double price;
    protected double totalCost;

    public Items() {
        System.out.println("\n========== Welcome to PizzahUt ==========");
    }

    public Items(String foodItem, String drinkItem, int quantity) {
        this.foodItem = foodItem;
        this.drinkItem = drinkItem;
        this.quantity = quantity;
    }

    public abstract void orderFood();

    public void printBill() {
        System.out.println("\n----------- Order Details -----------");
        System.out.println("Food Item  : " + foodItem);
        System.out.println("Drink Item : " + drinkItem);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Unit Price : ₹" + price);
    }
}

class PizzahutFood extends Items {

    @Override
    public void orderFood() {

        System.out.println("\nFood Order Placed Successfully!");

        if (foodItem.equalsIgnoreCase("Pizza"))
        {
            price = 60.0;
        }
        else if (foodItem.equalsIgnoreCase("Burger"))
        {
            price = 50.0;
        }
        else if (foodItem.equalsIgnoreCase("sandwich"))
        {
            price = 40.0;
        }
        else
        {
            System.out.println("Invalid Food Item Selected!");
            return;
        }

        totalCost = price * quantity;
    }

    @Override
    public void printBill() {
        super.printBill();
        System.out.println("Total Cost : " + totalCost);
    }
}
class Pizzahut extends Items {
    @Override
    public void orderFood() {

        System.out.println("\nDrink Order Placed Successfully!");

        if (drinkItem.equalsIgnoreCase("thumsUp"))
        {
            price = 20.0;
        }
        else if (drinkItem.equalsIgnoreCase("coke"))
        {
            price = 18.0;
        }
        else if (drinkItem.equalsIgnoreCase("sting"))
        {
            price = 15.0;
        }
        else
        {
            System.out.println("Invalid Drink Selected!");
            return;
        }

        totalCost = price * quantity;
    }

    @Override
    public void printBill() {
        super.printBill();

        System.out.println("Total Cost : " + totalCost);

        System.out.println("\nThank You For Ordering From Pizzahut!");
        System.out.println("Visit Again!");
    }
}
public class PizzahutDominos {

    public static void main(String[] args) {
        Pizzahut order1 = new Pizzahut();
        order1.foodItem = "Pizza";
        order1.drinkItem = "thumsUp";
        order1.quantity = 2;
        order1.orderFood();
        order1.printBill();

        Pizzahut order2 = new Pizzahut();
        order2.foodItem = "Burger";
        order2.drinkItem = "coke";
        order2.quantity = 1;
        order2.orderFood();
        order2.printBill();

        Pizzahut order3 = new Pizzahut();
        order3.foodItem = "sandwich";
        order3.drinkItem = "sting";
        order3.quantity = 3;
        order3.orderFood();
        order3.printBill();
    }
}