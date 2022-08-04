package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void Must_Sum_Numbers() {

        Calculator calculator = new Calculator();
        String sumOfTwoNumber = calculator.add("22", "-5.5");
        assertEquals("16.5" , sumOfTwoNumber);
    }

    @Test
    void Must_Sub_Numbers() {
        Calculator calculator = new Calculator();
        String divideTwoNumber = calculator.sub("21", "7");
        assertEquals("14.0", divideTwoNumber);
    }

    @Test
    void Must_Divide_Numbers() {
        Calculator calculator = new Calculator();
        String divideTwoNumber = calculator.div("15", "5");
        assertEquals("3.0", divideTwoNumber);
    }

    @Test
    void Must_Multi_Numbers() {
        Calculator calculator = new Calculator();
        String divideTwoNumber = calculator.multi("3", "5");
        assertEquals("15.0", divideTwoNumber);
    }
}
