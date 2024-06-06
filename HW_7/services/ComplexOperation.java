package HW_7.services;

public interface ComplexOperation {
    /**
     * Метод операций над комплексными числами.
     *
     * @param num1 комплексное число 1.
     * @param num2 комплексное число 2.
     * @return результат операций с комплексными числами.
     */
    ComplexNumber operate(ComplexNumber num1, ComplexNumber num2);
}
