package net.gvincze.javatomcatsample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JavaTomcatSampleApplicationTests {

    @Test
    void trueTest() {
        assertTrue(true);
    }

    @Test
    void falseTest()
    {
        assertFalse(false);
    }

}
