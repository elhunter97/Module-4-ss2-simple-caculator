package com.javaweb.simplecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String viewCalculator() {
        return "calculator";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam("num1")double num1, @RequestParam("num2")double num2,
                             @RequestParam("operator")String operator, Model model) {
        double result = 0;
        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result", result);
        return "calculator";
    }
}
