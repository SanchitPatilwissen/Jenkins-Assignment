import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest{

    @Test
    public void testAdd() {
        Calculator c1 = new Calculator();
        assertEquals(30, c1.add(10, 20));
    }

    @Test
    public void testSub() {
    	Calculator c1 = new Calculator();
        assertEquals(-10, c1.add(10, 20));
    }
    
    @Test
    public void testMul() {
    	Calculator c1 = new Calculator();
        assertEquals(200, c1.mul(10, 20));
    }
}
