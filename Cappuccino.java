public class Cappuccino extends CoffeeDrink implements CoffeeStrategy {
    public Cappuccino() {
        setName("Cappuccino");
        setCost(3.49);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making a cappuccino");
    }
}