import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Money {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    class Dollar {
        private int amount;

        Dollar(int amount) {
            this.amount = amount;
        }

        Dollar times(int multiplier) {
            return new Dollar(amount * multiplier);
        }

        @Override
        public boolean equals(Object obj) {
            Dollar dollar = (Dollar) obj;
            return amount == dollar.amount;
        }
    }
}

