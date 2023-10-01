package atu.cicd2.lab1calculator;

import org.springframework.expression.spel.ast.NullLiteral;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private float solution;

    public Calculator(String operator, float solution) {
        this.operator = operator;
        this.solution = solution;
    }

    public Calculator CalculationResult(int num1, int num2, String operator){
        switch(operator){
            case "add":
            case "Add":
                this.solution = num1 + num2;
                break;
            case "subtract":
            case "Subtract":
                this.solution = num1 - num2;
                break;
            case "multiply":
            case "Multiply":
                this.solution = num1 * num2;
                break;
            case "divide":
            case "Divide":
                if( num1 == 0 || num2 == 0){
                    this.operator = "Error: Divide by zero";
                    this.solution = 0;
                }
                else {
                    this.solution = (float) num1 / num2;
                }
                break;
            default:
                this.operator = "Error: Invalid operator entered";
                this.solution = 0;
        }
        return new Calculator(this.operator, this.solution);

    }
}
