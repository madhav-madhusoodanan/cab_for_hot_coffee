import java.util.math.*;

class Global {
    public static speed = 10;
    public static number_of_cabs = 5;
}
class Location {
    public int x;
    public int y;

    public int distance(int x2, int y2) {
        return mod(x2 - this.x) + mod(y2 - this.y);
    }
    public int distance(Location location) {
        return mod(location.x - this.x) + mod(location.y - this.y);
    }
}

class Cab extends Location {
    public int identity;
    public int rating_count;
    public float rating_average;
    public boolean is_booked;

    Cab() {
        this.rating_average = 0;
        this.rating_count = 0;
    }
}

class Cab_manager {
    public static Cab[];
    public static float fare() {
        // fare = distance * (total - free)cabs * a time based variable
    }
    public static void 
}

class Booking{
    Cab[] cabs = new Cab[5];
    
}

class Solution{
    public static void main(String[] args){

    }
}

/* Logic

1.  Location is an abstract class that will be inherited by all cabs, landmarks and the user */