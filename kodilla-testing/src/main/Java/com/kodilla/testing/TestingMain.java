package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test jednostkowy:");

        //CALCULATOR
        Calculator calculate = new Calculator();

        int sum = calculate.add(2,4);

        if (sum == 6) {
            System.out.println("TEST ADD OK");
        } else {
            System.out.println("TEST ADD FAILED");
        }

        int difference = calculate.subtract(5,3);

        if (difference == 2) {
            System.out.println("TEST SUBTRACT OK");
        } else {
            System.out.println("TEST SUBTRACT FAILED");
        }
    }
}
