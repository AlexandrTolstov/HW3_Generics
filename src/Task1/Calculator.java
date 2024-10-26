package Task1;

/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
 */

public class Calculator {

    public static <T extends Number> float sum(T  num1, T num2){
        return num1.floatValue() + num2.floatValue();
    }

    public static <T extends Number> float multiply(T  num1, T num2){
        return num1.floatValue() * num2.floatValue();
    }

    public static <T extends Number> float divide(T  num1, T num2){
        return num1.floatValue() / num2.floatValue();
    }

    public static <T extends Number> float subtract(T  num1, T num2){
        return num1.floatValue() - num2.floatValue();
    }
}
