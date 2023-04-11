package pro.sky.java.calculator.calculator1.Service;

import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public static String printHi() {
        return "<h1 style=\"\n" +
                "    text-align: center;\n" +
                "    margin-top: 15%;\n" +
                "text-align-top:15%;=\"\">Добро пожаловать в калькулятор</h1>";
    }

    public static String printCalculatorPlus(int num1, int num2) {
        String str = num1 + " + " + num2 + " = ";
        return str + (num1 + num2);
    }

    public static String printCalculatorMinus(int num1, int num2) {
        String str = num1 + " - " + num2 + " = ";
        return str + (num1 - num2);
    }

    public static String printCalculatorMultiply(int num1, int num2) {
        String str = num1 + " * " + num2 + " = ";
        return str + (num1 * num2);
    }

    public static String printCalculatorDivide(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        }
        String str = num1 + " / " + num2 + " = ";
        return str + (num1 / num2);
    }
}