package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle1 = new Circle(5.5);


        //When
        collector.addFigure(circle1);

        //Then
        Assert.assertFalse(shapeCollection.isEmpty());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle1 = new Circle(5.5);
        collector.addFigure(circle1);

       //When
        collector.removeFigure(circle1);

        //Then
        Assert.assertTrue(shapeCollection.isEmpty());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle1 = new Circle(5.5);
        collector.addFigure(circle1);

        //When
        Shape retrievedShape = collector.getFigure(0);

        //Then
        Assert.assertEquals(circle1, retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle1 = new Circle(5.5);
        Shape square1 = new Square(3);
        collector.addFigure(circle1);
        collector.addFigure(square1);

        //When
        collector.showFigures();

        //Then

    }
}
