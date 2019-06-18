
package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circe = new Circle(4);
        Shape triangle = new Triangle(4,3,5);
        Shape square = new Square(4);
        //When
        collector.addFigure(circe);
        collector.addFigure(square);
        collector.addFigure(triangle);
        //Then
        Assert.assertEquals(3,collector.figures.size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circe = new Circle(4);
        Shape triangle = new Triangle(4,3,5);
        Shape square = new Square(4);
        //When
        collector.addFigure(circe);
        collector.removeFromList(square);
        collector.addFigure(triangle);
        //Then
        Assert.assertEquals(2,collector.figures.size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circe = new Circle(4);
        Shape triangle = new Triangle(4,3,5);
        Shape square = new Square(4);
        //When
        collector.addFigure(circe);
        collector.removeFromList(square);
        collector.addFigure(triangle);
        collector.getFigure(1);
        //Then
        Assert.assertEquals(triangle,collector.figures.get(1));
    }
}
