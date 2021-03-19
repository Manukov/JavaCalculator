package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CalcException {

        System.out.println("Enter expresion: ");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();                                  //считываем все строку

        String [] arr = str.split(" ");                         //парсим строку

        Validator validator = new Validator();                        //объек хранит методы валидации ввода пользователя

        if(validator.IsRomanNum(arr[0]) && validator.IsRomanNum(arr[2]) && validator.IsOppValid(arr[1]))
        {
            Converter converter = new Converter();
            Calculator calc = new Calculator(converter.ConvertToArabNum(arr[0]), converter.ConvertToArabNum(arr[2]), arr[1]);
            int result = calc.GetResult();                      //результат вычисления

            System.out.println(ShowRomanResult(result));
        }
        else if (validator.IsArabNum(arr[0]) && validator.IsArabNum(arr[2]) && validator.IsOppValid(arr[1]))
        {
            Converter converter = new Converter();
            Calculator calc = new Calculator(Integer.parseInt(arr[0]), Integer.parseInt(arr[2]), arr[1]);
            System.out.println(calc.GetResult());
        }
        else
        {
            throw new CalcException("Error: Your expression is incorrect");
        }
    }

    public static String ShowRomanResult(int result)
    {
        String s = Integer.toString(result);                  //преобразовываем число в строку
        String[] strArr=s.split("");                    //получаем число-строку в виде массива
        Converter converter = new Converter();
        String str = new String();

        if(result<0)
        {
            str = "-" + converter.ConvertToRomanNum(Integer.parseInt(strArr[1]));
        }
        else if (result > 0)
        {
            if(s.length() == 1)
            {
                str = converter.ConvertToRomanNum(result);
            }else if (s.length() == 2)
            {
                String num2 = converter.ConvertToRomanNum(Integer.parseInt(strArr[1]));       //получаем 2 римскую цифру
                String num1 = converter.ConvertToRomanNumTen(Integer.parseInt(strArr[0]));    //получаем 1 римскую цифру
                str=num1+num2;
            } else
            {
                str="С";
            }
        }
        else
        {
            str="0";
        }
        return str;
    }
}



