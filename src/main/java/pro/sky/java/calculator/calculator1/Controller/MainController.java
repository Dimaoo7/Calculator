package pro.sky.java.calculator.calculator1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.calculator.calculator1.Service.FirstService;

@RestController
@RequestMapping("/calculator")
public class MainController {
    @GetMapping
    public String printHi() {
        return FirstService.printHi();
    }
    @GetMapping("/plus")
    public String printCalculatorPlus(@RequestParam int num1, @RequestParam int num2) {
        return FirstService.printCalculatorPlus(num1, num2);
    }
    @GetMapping("/minus")
    public String printCalculatorMinus(@RequestParam int num1, @RequestParam int num2) {
        return FirstService.printCalculatorMinus(num1, num2);
    }
    @GetMapping("/multiply")
    public String printCalculatorMultiply(@RequestParam int num1, @RequestParam int num2) {
        return FirstService.printCalculatorMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public String printCalculatorDivide(@RequestParam int num1, @RequestParam int num2) {
        return FirstService.printCalculatorDivide(num1, num2);
    }
}
