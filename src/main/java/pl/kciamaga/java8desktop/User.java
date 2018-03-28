package pl.kciamaga.java8desktop;

public class User {


   private  Point location;

    public User(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
