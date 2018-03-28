package pl.kciamaga.java8desktop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {


    private Point zeroPoint;

    @BeforeEach
    void setup(){

        zeroPoint=new Point(0,0);
    }



    @Test
    void distanceTo() {

        //obliczymy odleglosc od punktu (0,0) do (100,100)

        double x=(100-0) * Math.cos((0+100)/2);
        double y=(100-0);
        double d=Math.sqrt(x*x+y*y) * 6371;

    Point point=new Point(100,100);


    assertEquals(d,zeroPoint.distanceTo(point));

    }



    @Test
    void testDistanceToItself(){

        Point a=new Point(0,0);

        assertEquals(0,a.distanceTo(a));

    }




}