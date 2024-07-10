import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(5 ,2);
        assertEquals(7,result);
    }
    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5 ,2);
        assertEquals(3,result);
    }
    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5 ,2);
        assertEquals(10,result);
    }
    @Test
    public void testDevide(){
        Calculator calculator = new Calculator();
        int result = calculator.devide(10 ,2);
        assertEquals(5,result);
    }
    @Test
    public void testFactorial(){
        Calculator calculator = new Calculator();
        int result = calculator.factorial(5);
        assertEquals(120,result);

    }
}
