package pl.kciamaga.java8desktop;


import lombok.Data;

@Data
public class User {


   private Point location;

    public User(Point location) {
        this.location = location;
    }



}
