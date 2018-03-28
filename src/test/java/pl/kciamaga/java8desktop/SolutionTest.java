package pl.kciamaga.java8desktop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNearest() {

            User user=new User(new Point(0,0));

            Defibrillator defibrillator = Defibrillator.createDefibrillator("1;a;b;c;0;10");
            Defibrillator defibrillator2 = Defibrillator.createDefibrillator("2;d;e;f;0;20");
            Defibrillator defibrillato3 = Defibrillator.createDefibrillator("3;g;h;i;0;30");

            List<Defibrillator> lista=new ArrayList<>();
            lista.add(defibrillato3);
            lista.add(defibrillator2);
            lista.add(defibrillator);


            assertEquals(defibrillator,Solution.findNearest(user,lista));
            
    }
}