package com.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController{

    private final ServiceInterface serviceInterface;

    public CalculatorController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @RequestMapping("/calculator")
    public String helloCalculator() {
        return serviceInterface.helloCalculator();
    }


    @RequestMapping("/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return serviceInterface.plus(num1, num2);
    }

    @RequestMapping("/minus")
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return serviceInterface.minus(num1, num2);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return serviceInterface.multiply(num1, num2);
    }

     @RequestMapping("/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return serviceInterface.divide(num1, num2);
    }

}
