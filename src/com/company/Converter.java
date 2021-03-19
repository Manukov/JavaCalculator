package com.company;

public class Converter {

    public String ConvertToRomanNumTen(int num)
    {
        String result = new String();

        if (num ==1)
            result="X";
        if (num ==2)
            result="XX";
        if (num ==3)
            result="XXX";
        if (num ==4)
            result="XL";
        if (num ==5)
            result="L";
        if (num ==6)
            result="LX";
        if (num ==7)
            result="LXX";
        if (num ==8)
            result="LXXX";
        if (num ==9)
            result="XC";
        return result;
    }



    public String ConvertToRomanNum(int num){

        String result="";

        switch (num)
        {
            case 1:
                result="I";
                break;
            case 2:
                result="II";
                break;
            case 3:
                result="III";
                break;
            case 4:
                result="IV";
                break;
            case 5:
                result="V";
                break;
            case 6:
                result="VI";
                break;
            case 7:
                result="VII";
                break;
            case 8:
                result="VIII";
                break;
            case 9:
                result="IX";
                break;
            case 10:
                result="X";
                break;
        }
        return result;
    }


    public int ConvertToArabNum(String num)
    {
        int result = 0;

        switch (num) {
            case "I":
                result= 1;
                break;
            case "II":
                result= 2;
                break;
            case "III":
                result=  3;
                break;
            case "IV":
                result=  4;
                break;
            case "V":
                result=  5;
                break;
            case "VI":
                result=  6;
                break;
            case "VII":
                result=  7;
                break;
            case "VIII":
                result=  8;
                break;
            case "IX":
                result=  9;
                break;
            case "X":
                result=  10;
                break;
        }
        return result;
    }
}

