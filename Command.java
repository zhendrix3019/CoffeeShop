public class Command {
    private CoffeeStrategy coffeeStrategy;

    public Command(CoffeeDrink coffeeDrink) {
        this.coffeeStrategy = (CoffeeStrategy) coffeeDrink;
    }

    public void execute() {
        coffeeStrategy.makeCoffee();
    }
}