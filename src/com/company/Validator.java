package com.company;

public class Validator {

    boolean IsOppValid(String op) {
        switch (op)
        {
            case "+":
                return true;
            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;
            default:
                return false;
        }
    }

    boolean IsRomanNum(String arg) {
        switch (arg) {
            case "I":
                return true;
            case "II":
                return true;
            case "III":
                return true;
            case "IV":
                return true;
            case "V":
                return true;
            case "VI":
                return true;
            case "VII":
                return true;
            case "VIII":
                return true;
            case "IX":
                return true;
            case "X":
                return true;
            default:
                return false;
        }
    }

    boolean IsArabNum (String arg){
        try{
            return Integer.parseInt(arg) > 0 && Integer.parseInt(arg) <= 10;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }

}

