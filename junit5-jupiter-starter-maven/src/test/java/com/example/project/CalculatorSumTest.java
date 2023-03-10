package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.smartbear.zephyrscale.junit.annotation.TestCase;

public class CalculatorSumTest {
    @Test
    @TestCase(key = "JQA-T1")
    public void sumTwoNumbersAndPass() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(3, 2));
    }

    @Test
    @TestCase(key = "JQA-T2")
    public void sumTwoNumbersAndFail() {
        Calculator calculator = new Calculator();
        assertNotEquals(2, calculator.add(1, 2));
    }

    @Test
    public void notMappedToTestCaseAndPass() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    @TestCase(name = "Mapped to a Test Case Name and Pass")
    public void mappedToATestCaseNameAndPass() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }
}
