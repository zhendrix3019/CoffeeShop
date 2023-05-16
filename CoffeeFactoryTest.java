import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeFactoryTest {

    @Test
    public void testCreateCoffee() {
        CoffeeDrink espresso = CoffeeFactory.createCoffee("espresso");
        assertEquals("Espresso", espresso.getName());

        CoffeeDrink latte = CoffeeFactory.createCoffee("latte");
        assertEquals("Latte", latte.getName());

        CoffeeDrink cappuccino = CoffeeFactory.createCoffee("cappuccino");
        assertEquals("Cappuccino", cappuccino.getName());

        assertThrows(IllegalArgumentException.class, () -> CoffeeFactory.createCoffee("unknown"));
    }
}