package calculator;

import com.Calculator.JFrame.CalculatorFrame;

public class Calculator {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

}
