package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main m = new Main();

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
}
