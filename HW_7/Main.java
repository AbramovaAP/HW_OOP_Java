package HW_7;

import java.util.Scanner;

import HW_7.services.Calculator;
import HW_7.services.ComplexNumber;
import HW_7.services.ComplexOperation;
import HW_7.services.Logger;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        ComplexNumber num1 = new ComplexNumber(2.0, 5.0); // число №1 для ввода, введите свое число.
        ComplexNumber num2 = new ComplexNumber(3.0, 4.0); // число №2 для ввода, введите свое число.

        Calculator calculator = new Calculator(); // создаем экземпляр калькулятора

        Logger.log("Выберите операцию:");
        Logger.log("1 - Сложение");
        Logger.log("2 - Вычитание");
        Logger.log("3 - Умножение");
        Logger.log("4 - Деление");

        int choice = input.nextInt(); // обработка ввода пользователя

        switch (choice) { // проверка введенных пользователем данных
            case 1 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.add(num2);
                }
            });
            case 2 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.subtract(num2);
                }
            });
            case 3 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.multiply(num2);
                }
            });
            case 4 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.divide(num2);
                }
            });
            default -> Logger.log("Неверный выбор операции.");
        }
        calculator.executeOperation(num1, num2);
    }

}
