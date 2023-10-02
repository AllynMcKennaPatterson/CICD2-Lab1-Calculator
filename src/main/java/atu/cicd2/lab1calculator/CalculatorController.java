package atu.cicd2.lab1calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public Calculator calculate(int num1, int num2, String operator){
        Calculator result = new Calculator(operator, 0);
        result.setOperator(operator);

        return result.CalculateResult(num1, num2);
    }
}
