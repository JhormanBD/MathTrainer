import javax.swing.*;


// @Autor: Jhorman Botello

public class MathTrainer {
    public static void main(String[] args) {

        int num1;
        int num2;
        int result;
        boolean validatorOp = true;
        boolean iterator = true;
        String operator;

        while (!(operator = JOptionPane.showInputDialog("Type Operation + - / *")).equalsIgnoreCase("exit")) {

            int complex = Integer.parseInt(JOptionPane.showInputDialog("Choose complexity 1-2-3"));
            int comp = (int) (Math.pow(10, complex));
            while (iterator) {
                switch (operator) {

                    case "+":
                        num1 = (int) (Math.random() * comp);
                        num2 = (int) (Math.random() * comp);
                        result = num1 + num2;
                        iterator = calculaResp(operator, num1, num2, result);
                        break;

                    case "-":
                        while (validatorOp) {
                            num1 = (int) (Math.random() * comp);
                            num2 = (int) (Math.random() * comp);
                            if (num2 < num1) {
                                validatorOp = false;
                                result = num1 - num2;
                                iterator = calculaResp(operator, num1, num2, result);
                            }
                        }
                        break;

                    case "*":
                        num1 = (int) (Math.random() * comp);
                        num2 = (int) (Math.random() * comp);
                        result = num1 * num2;
                        iterator = calculaResp(operator, num1, num2, result);
                        break;

                    case "/":
                        while (validatorOp) {
                            num1 = (int) (Math.random() * comp);
                            num2 = (int) (Math.random() * comp);
                            if ((num2 != 0) && (num1 >= num2)) {
                                validatorOp = false;
                                result = num1 / num2;
                                iterator = calculaResp(operator, num1, num2, result);
                            }
                        }
                        break;
                }
                validatorOp = true;
            }

        }

    }

    private static boolean calculaResp(String o, int x, int y, int z) {
        String msg = JOptionPane.showInputDialog("The result of " + x + " " + o + " " + y + " is:");

        if (!msg.equalsIgnoreCase("exit")) {
            int resp = Integer.parseInt(msg);

            if (z == resp) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect, the result is : " + z);
            }
            return true;
        }
        return false;
    }
}
