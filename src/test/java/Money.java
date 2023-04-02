import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Money {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    class Dollar {
        int amount;

        Dollar(int amount) {
            this.amount = amount;
        }

        Dollar times(int multiplier) {
            return new Dollar(amount * multiplier);
        }
    }
}
