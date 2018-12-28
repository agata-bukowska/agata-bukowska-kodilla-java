package com.kodilla.testing.collection;

import org.junit.*;

import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case begin.");
    }
    @After
    public void after() {
        System.out.println("Test case end.");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite start.");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite end.");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = new ArrayList<Integer>();
        OddNumberExterminator oddExterminator = new OddNumberExterminator();

        //When
        oddExterminator.exterminate(list);
        System.out.println("Testing empty list.");

        //Then
        Assert.assertTrue(oddExterminator.exterminate(list).isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> randomList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for (int n = 0; n <50; n++){
            randomList.add(theGenerator.nextInt(20));
        }
        OddNumberExterminator oddExterminator = new OddNumberExterminator();

        //When
        oddExterminator.exterminate(randomList);
        System.out.println("Testing normal list.");

        //Then
        int tempValue = 0;
        for (int n = 0; n < oddExterminator.exterminate(randomList).size(); n++ ) {
            tempValue = oddExterminator.exterminate(randomList).get(n);
            Assert.assertTrue(tempValue % 2 == 0);
        }
    }
}