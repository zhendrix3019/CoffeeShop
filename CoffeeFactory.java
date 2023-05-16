public class CoffeeFactory {
    public static CoffeeDrink createCoffee(String type) {
        switch (type) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Latte();
            case "cappuccino":
                return new Cappuccino();
            default:
                throw new IllegalArgumentException("Invalid coffee type");
        }
    }
}