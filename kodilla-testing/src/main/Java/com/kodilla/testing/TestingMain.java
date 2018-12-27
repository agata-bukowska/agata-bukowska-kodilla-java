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

        Calculator calculate = new Calculator();

        int sum = calculate.add(2, 5);
        int difference = calculate.subtract(5, 2);

        if (sum == 7) {
            System.out.println("Sum correct");
        } else {
            System.out.println("Sum incorrect");
        }

        if (difference == 3) {
            System.out.println("Difference correct");
        } else {
            System.out.println("Difference incorrect");
        }
    }
}


