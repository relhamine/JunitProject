package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
@DisplayName("Ma classe de test JUnit5")
public class AppTest {

    @BeforeEach
    public void initAll() {
        System.out.println("beforeAll");
    }

    @Test
    @DisplayName("Mon cas de test")
    public void shouldAnswerWithTrue() {
        System.out.println("simpleTest");
        assertTrue(true);
    }
}
