package pl.kciamaga.java8desktop;

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class DefibrillatorTest {

    @Test
    void createDefibrillator() {

        String opis="1;a;b;c;1,1;2,2";

        Defibrillator defibrillator=Defibrillator.createDefibrillator(opis);

        assertEquals(1,defibrillator.getNumber());
        assertEquals("a",defibrillator.getName());
        assertEquals("b",defibrillator.getAddress());
        assertEquals("c",defibrillator.getPhoneNumber());

        assertEquals(new Point(1.1,2.2),defibrillator.getLocation());









    }
}