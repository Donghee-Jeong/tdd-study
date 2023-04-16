import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Money {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    class Dollar {
        // 3장에서의 동시성에 대한 코드 추가에서가 아닌, 이번 Dollar 간 비교로 테스트가 바뀐 후 변경했어야 한다.
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

