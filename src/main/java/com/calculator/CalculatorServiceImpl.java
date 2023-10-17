package com.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ServiceInterface {
    @Override
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Пожалуйста дайте мне две цифры для работы";
        }

        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Пожалуйста дайте мне две цифры для работы";
        }

        int sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Пожалуйста дайте мне две цифры для работы";
        }

        int sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Пожалуйста дайте мне две цифры для работы";
        }

        if (num2 == 0) {
            return "вам нужно вернуться в школу";
        }

        int sum = num1 / num2;
        return num1 + " / " + num2 + " = " + sum;
    }
}
