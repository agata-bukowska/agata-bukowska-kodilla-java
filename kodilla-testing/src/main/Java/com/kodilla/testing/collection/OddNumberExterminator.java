package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {

    public List <Integer> exterminate (List<Integer> listOfNumbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number: listOfNumbers) {
            if (number % 2 == 0 && number != 0) {
                evenNumbers.add(number);
                }
            }
            return evenNumbers;
    }
}
