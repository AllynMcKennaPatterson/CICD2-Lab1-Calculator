package atu.cicd2.lab1calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate/{num1}/{num2}/{operator}")
    public Calculator calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operator){
        Calculator result = new Calculator(operator, 0);
        result.setOperator(operator);

        return result.CalculateResult(num1, num2);
    }
}
