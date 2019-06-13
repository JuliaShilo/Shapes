package org.itstep.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SquareTest {

    @Test
    void getArea () {

        Square square = new Square ();
        square.setSide(6);
        Assertions.assertEquals(36, square.getArea());
    }
}
