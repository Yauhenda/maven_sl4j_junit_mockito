package com.epam.untitled;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTest {

    First first;

    @BeforeEach
    void setUp() {
        first = new First();
    }

    @Test
    void concatenateStrings() {
        String result = first.concatenateStrings("one", "two");
        assertEquals("onetwo", result, "wrong string");
    }

    @Test
    void concateToLowerCase() {
        String result = first.concatenateStrings("ONE", "two");
        assertEquals("onetwo", result);
    }

    @Test
    void throwsNPE() {
        assertThrows(NullPointerException.class,
                () -> first.concatenateStrings("string", null));
    }
}