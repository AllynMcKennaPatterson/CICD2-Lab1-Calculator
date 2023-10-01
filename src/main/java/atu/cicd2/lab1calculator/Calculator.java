package atu.cicd2.lab1calculator;

import org.springframework.expression.spel.ast.NullLiteral;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private float solution;

    public Calculator() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public float getSolution() {
        return solution;
    }

    public void setSolution(float solution) {
        this.solution = solution;
    }

    public Calculator CalculateResult(){
        switch(operator){
            case "add":
            case "Add":
                this.solution = this.num1 + this.num2;
                break;
            case "subtract":
            case "Subtract":
                this.solution = this.num1 - this.num2;
                break;
            case "multiply":
            case "Multiply":
                this.solution = this.num1 * this.num2;
                break;
            case "divide":
            case "Divide":
                if( this.num1 == 0 || this.num2 == 0){
                    this.operator = "Error: Divide by zero";
                    this.solution = 0;
                }
                else {
                    this.solution = (float) this.num1 / this.num2;
                }
                break;
            default:
                this.operator = "Error: Invalid operator entered";
                this.solution = 0;
        }
        return new Calculator();

    }
}
