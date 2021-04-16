package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("If the class behaves correctly when the list is empty then I get the information that list size = 0")
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        List<Integer> input = new ArrayList<>();

        //When
        List<Integer> result = numbersExterminator.exterminate(input);

        //Then
        Assertions.assertTrue(result.isEmpty());

    }


    @DisplayName("if the class behaves correctly when the list contains even and odd numbers then after creating an " +
            "object with a list of even and odd numbers I should get only the even ones")
    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);

        //When
        List<Integer> result = numbersExterminator.exterminate(input);

        //Then
        Assertions.assertTrue(result.isEmpty());

    }
}
