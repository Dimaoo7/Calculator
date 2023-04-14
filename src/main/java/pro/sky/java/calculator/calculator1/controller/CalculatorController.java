package pro.sky.java.calculator.calculator1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.calculator.calculator1.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    CalculatorService cs;

    public CalculatorController(CalculatorService cs) {
        this.cs = cs;
    }

    @GetMapping
    public String printHi() {
        return "<h1 style=\"\n" +
                "    text-align: center;\n" +
                "    margin-top: 15%;\n" +
                "text-align-top:15%;=\"\">Добро пожаловать в калькулятор</h1>";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
            return num1 + " + " + num2 + " = " + cs.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + cs.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + cs.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " + String.format("%.4f", cs.divide(num1, num2));
    }
}

