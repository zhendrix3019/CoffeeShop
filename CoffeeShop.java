import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
    private static CoffeeShop instance = null;
    private final List<Command> commands;

    private CoffeeShop() {
        commands = new ArrayList<>();
    }

    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void takeOrder(String coffeeType) {
        CoffeeDrink coffeeDrink = CoffeeFactory.createCoffee(coffeeType);
        Command command = new Command(coffeeDrink);
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = CoffeeShop.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter coffee type (espresso/latte/cappuccino) or Q to quit: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            coffeeShop.takeOrder(input);
        }

        coffeeShop.executeCommands();
    }
}