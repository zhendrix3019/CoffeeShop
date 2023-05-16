public class Espresso extends CoffeeDrink implements CoffeeStrategy {
    public Espresso() {
        setName("Espresso");
        setCost(1.99);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making an espresso");
    }
}