package Calculator;

import javax.swing.*;

public class CalculatorUi {

        private static final int WIDTH = 49;
        private static final int HEIGHT = 49;
        private static JTextField jTextField;
        private static String firstNumber;
        private static String lastOperator;

    public static void main (String ... args) {

        JFrame calculatorUi = new JFrame("Calculator");


        jTextField = new JTextField();
        jTextField.setBounds(0,0,150,HEIGHT);
        jTextField.setEditable(false);

        JButton cancel = new JButton ("C");
        cancel.setBounds(150,0,WIDTH,HEIGHT);
        cancel.addActionListener(event -> jTextField.setText(""));

        JButton one = getButton("1", 0, 50);
        JButton two = getButton("2", 50, 50);
        JButton three = getButton("3", 100, 50);
        JButton four = getButton("4", 0, 100);
        JButton five = getButton("5", 50, 100);
        JButton six = getButton("6", 100, 100);
        JButton seven = getButton("7", 0, 150);
        JButton eight = getButton("8", 50, 150);
        JButton nine = getButton("9", 100, 150);
        JButton zero = getButton("0", 50, 200);
        JButton point = getButton(".", 0, 200);

        JButton plus = new JButton("+");
        plus.setBounds(150,50,WIDTH,HEIGHT);
        plus.addActionListener(e -> {
            firstNumber= jTextField.getText();
            jTextField.setText("");
            lastOperator = plus.getText();
        });

        JButton minus = new JButton("-");
        minus.setBounds(150,100,WIDTH,HEIGHT);
        minus.addActionListener(e -> {
            firstNumber = jTextField.getText();
            jTextField.setText("");
            lastOperator = minus.getText();
        });

        JButton multiply = new JButton("x");
        multiply.setBounds(150,150,WIDTH,HEIGHT);
        multiply.addActionListener(e -> {
            firstNumber = jTextField.getText();
            jTextField.setText("");
            lastOperator = multiply.getText();
        });

        JButton divide = new JButton("/");
        divide.setBounds(150,200,WIDTH,HEIGHT);
        divide.addActionListener(e -> {
            firstNumber = jTextField.getText();
            jTextField.setText("");
            lastOperator = divide.getText();
        });

        JButton equal = new JButton("=");
        equal.setBounds(100,200,WIDTH,HEIGHT);
        equal.addActionListener(e -> {
            final Calculator calculator = new Calculator();
            String syntax = lastOperator;
            switch (syntax) {
                case "+": {
                    String result = calculator.add(firstNumber, jTextField.getText());
                    jTextField.setText(result);
                    break;
                }
                case "-": {
                    String result = calculator.sub(firstNumber, jTextField.getText());
                    jTextField.setText(result);
                    break;
                }
                case "x": {
                    String result = calculator.multi(firstNumber, jTextField.getText());
                    jTextField.setText(result);
                    break;
                }
                case "/": {
                    String result = calculator.div(firstNumber, jTextField.getText());
                    jTextField.setText(result);
                    break;
                }
            }
        });

        calculatorUi.add(jTextField);
        calculatorUi.add(cancel);
        calculatorUi.add(one);
        calculatorUi.add(two);
        calculatorUi.add(three);
        calculatorUi.add(plus);
        calculatorUi.add(four);
        calculatorUi.add(five);
        calculatorUi.add(six);
        calculatorUi.add(minus);
        calculatorUi.add(seven);
        calculatorUi.add(eight);
        calculatorUi.add(nine);
        calculatorUi.add(multiply);
        calculatorUi.add(point);
        calculatorUi.add(zero);
        calculatorUi.add(equal);
        calculatorUi.add(divide);

        calculatorUi.setSize(216, 289);
        calculatorUi.setLayout(null);
        calculatorUi.setVisible(true);
    }

    private static JButton getButton(String label, int xPosition, int yPosition) {
        JButton button = new JButton(label);
        button.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
        button.addActionListener(event -> jTextField.setText(jTextField.getText() + button.getText()));
        return button;
    }
}
