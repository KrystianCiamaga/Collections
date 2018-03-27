package pl.kciamaga.java8desktop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pl.kciamaga.java8desktop.StringUtils.toDouble;

public class Solution {



    public static void main(String args[]) {
        //System.err.println(toDouble("1,2345"));
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();

        Point userLocation = new Point(toDouble(LON), toDouble(LAT));
        User user = new User(userLocation);

        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        List<Defibrillator> defibrillators=new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            Defibrillator defibrillator = Defibrillator.createDefibrillator(DEFIB);
            defibrillators.add(defibrillator);
        }

        Defibrillator nearest=findNearest(user,defibrillators);


        System.out.println(nearest.name);
    }

    private static Defibrillator findNearest(User user, List<Defibrillator> defibrillators) {

        double min=user.location.distanceTo(defibrillators.get(0).location);

        Defibrillator def = defibrillators.get(0);

        for(int i=1;i<defibrillators.size();i++){

            if(user.location.distanceTo(defibrillators.get(i).location) < min){

                min=user.location.distanceTo(defibrillators.get(i).location);
                def=defibrillators.get(i);
            }

        }

        return def;

    }



}
