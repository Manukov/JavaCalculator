package com.company;

public class Calculator {

    int num1;
    int num2;
    String op;

    Calculator(int num1, int num2, String op)
    {
        this.num1=num1;
        this.num2=num2;
        this.op=op;
    }

    public int GetResult() {
        int result = 0;
        if (op.equals("+")) {
            result = num1 + num2;
        } else if(op.equals("-")){
            result = num1 - num2;
        }else if (op.equals("*")) {
            result = num1 * num2;
        }else if(op.equals("/")){
            result = num1 / num2;
        }
        return result;
    }
}
