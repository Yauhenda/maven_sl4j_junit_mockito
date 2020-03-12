package com.epam.untitled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class SecondTest {

    @Test
    void check() {
        First first = Mockito.mock(First.class);
        Second second = new Second();
        second.setFirst(first);
        second.check();
        verify(first, times(2))
                .concatenateStrings(eq("one"), eq("two"));
    }
    @Test
    void check2() {
        First first = Mockito.mock(First.class);
        when(first.concatenateStrings(anyString(),anyString()))
                .thenReturn("onetwo");
        Second second = new Second();
        second.setFirst(first);
        second.check();
        verify(first, times(1))
                .concatenateStrings(eq("one"), eq("two"));
        verify(first, times(1))
                .concatenateStrings(eq("two"), eq("three"));

    }
}