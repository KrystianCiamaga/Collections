package pl.kciamaga.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void toDouble() {

    String input="1,5634";

    assertEquals(1.5634,StringUtils.toDouble(input));







    }
}