package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {
    Urinals m = new Urinals();

    @Test
    void main() {
    }

    @Test
    void countUrinals() {
        assertEquals(1,m.countUrinals("10001"));
        assertEquals(0,m.countUrinals("1001"));
        assertEquals(3,m.countUrinals("00000"));
        assertEquals(2,m.countUrinals("0000"));
        assertEquals(1,m.countUrinals("01000"));
        assertEquals(-1,m.countUrinals("011"));
    }

    @Test
    void goodString() {
        assertEquals(true,m.goodString("0101"));
        assertEquals(false,m.goodString("0171"));
        assertEquals(true,m.goodString("00000"));

    }
}