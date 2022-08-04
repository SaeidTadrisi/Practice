package Calculator;

public class Calculator {
    public String add (String firstNumber, String secondNumber) {
        double n1 = Double.parseDouble(firstNumber);
        double n2 = Double.parseDouble(secondNumber);
        double result = n1 + n2;
        return String.valueOf(result);
    }

    public String sub (String firstNumber, String secondNumber){
        double n1 = Double.parseDouble(firstNumber);
        double n2 = Double.parseDouble(secondNumber);
        double result = n1 - n2;
        return String.valueOf(result);
    }

    public String div (String firstNumber, String secondNumber) {
        double n1 = Double.parseDouble(firstNumber);
        double n2 = Double.parseDouble(secondNumber);
        double result = n1 / n2;
        return String.valueOf(result);
    }

    public String multi (String firstNumber, String secondNumber){
        double n1 = Double.parseDouble(firstNumber);
        double n2 = Double.parseDouble(secondNumber);
        double result = n1 * n2;
        return String.valueOf(result);
    }
}
