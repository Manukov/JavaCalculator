package com.company;

public class CalcException extends Exception {

    private String msg;

    CalcException(){}
    CalcException(String msg){
        this.msg=msg;
    }

    public String ErrorMsg() {
        return msg;
    }
}

