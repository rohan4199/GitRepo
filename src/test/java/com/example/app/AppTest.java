
package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void addsNumbers() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }
}
