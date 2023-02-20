package org.awslambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void multiply() {
        assertEquals(4, MathUtils.multiply(2,2));
        assertEquals(81, MathUtils.multiply(9,9));
    }
}