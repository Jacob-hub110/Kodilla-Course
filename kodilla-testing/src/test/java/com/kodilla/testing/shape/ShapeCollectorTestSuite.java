package com.kodilla.testing.shape;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

@DisplayName("All tests")
public class ShapeCollectorTestSuite {

    @DisplayName("Test for adding figure")
    @Test
    public void addFigureTest() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 10);

        //When
        shapeCollector.addFigure(triangle);
        int result = shapeCollector.getFiguresList().size();
        int expectedResult = 1;

        //Then
        Assertions.assertEquals(expectedResult, result);

    }

    @DisplayName("Test for removing figure")
    @Test
    public void removeFigureTest() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("circle", 10);
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.removeFigure(circle);
        int result = shapeCollector.getFiguresList().size();
        int expectedResult = 0;

        //Then
        Assertions.assertEquals(expectedResult, result);

    }

    /*@DisplayName("Test for getting figure")
    @Test
    public void getFigureTest() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 10);
        shapeCollector.addFigure(square);

        //When
        String result = shapeCollector.getFigure(0);
        double preExpectedResult1 = square.getField();
        String preExpectedResult2 = square.getShapeName();
        String expectedResult = preExpectedResult1 + preExpectedResult2;

        //Then
        Assertions.assertEquals(expectedResult, result);

    }


    @DisplayName("Test for showing figure")
    @Test
    public void showFiguresTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 10);
        shapeCollector.addFigure(triangle);
        //When
        result = shapeCollector.showFigures();

        expectedResult = shapeCollector.getFiguresList().toString();


        //Then
        Assertions.assertEquals(expectedResult, result);

    }*/
}
