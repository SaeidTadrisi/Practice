package Calculator;

public class Calculator {
    public String add (final String firstNumber, final String secondNumber) {
        final double n1 = Double.parseDouble(firstNumber);
        final double n2 = Double.parseDouble(secondNumber);
        final double result = n1 + n2;
        return String.valueOf(result);
    }

    public String sub (String firstNumber, String secondNumber){
        final double n1 = Double.parseDouble(firstNumber);
        final double n2 = Double.parseDouble(secondNumber);
        final double result = n1 - n2;
        return String.valueOf(result);
    }

    public String div (String firstNumber, String secondNumber) {
        final double n1 = Double.parseDouble(firstNumber);
        final double n2 = Double.parseDouble(secondNumber);
        final double result = n1 / n2;
        return String.valueOf(result);
    }

    public String multi (String firstNumber, String secondNumber){
        final double n1 = Double.parseDouble(firstNumber);
        final double n2 = Double.parseDouble(secondNumber);
        final double result = n1 * n2;
        return String.valueOf(result);
    }
}
