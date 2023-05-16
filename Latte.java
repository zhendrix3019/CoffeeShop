public class Latte extends CoffeeDrink implements CoffeeStrategy {
    public Latte() {
        setName("Latte");
        setCost(2.99);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making a latte");
    }
}