package atu.cicd2.lab1calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(int num1, int num2, String operation){

    }
}
