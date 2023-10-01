package atu.cicd2.lab1calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public Calculator calculate(int num1, int num2, String operation){
        Calculator result = new Calculator(operation, 0);
        result.setNum1(num1);
        result.setNum2(num2);
        result.setOperator(operation);

        return result.CalculateResult();
    }
}
