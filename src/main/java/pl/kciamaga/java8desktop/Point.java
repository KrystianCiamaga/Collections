package pl.kciamaga.java8desktop;

import java.util.Objects;

public class Point {


     static final double EARTH_RADIUS = 6371.0;

    private double longitude;
    private double latitude;

    public Point(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double distanceTo(Point B) {
        double x = (B.longitude - longitude) * Math.cos((latitude + B.latitude) / 2);
        double y = B.latitude - latitude;
        double d = Math.sqrt(x * x + y * y) * EARTH_RADIUS;
        return d;
    }


    public double getEARTH_RADIUS() {
        return EARTH_RADIUS;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


    @Override
    public boolean equals(Object o) {

        if(o instanceof Point){

            Point point=(Point)o;
            return latitude==point.latitude && longitude==point.longitude;


        }else
            return false;


    }

    @Override
    public int hashCode() {

        return Objects.hash(longitude, latitude);
    }
}
