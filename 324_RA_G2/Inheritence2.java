class Ride{
    String name;
    int age;
    int distance;

    Ride(String name, int age, int distance){
        this.name = name;
        this.age = age;
        this.distance = distance;
    }

    void display_info(){
        System.out.println("Name: "+ name + "Age: " + age + " Distance "+ distance);
    }
}

class BikeRent extends Ride{
    int bikerent = 5; // 5rs/km
    BikeRent(String name, int age, int distance){
        super(name, age, distance);
    }

    void total_fare(){
        System.out.println("Total fare: " + (bikerent*super.distance));
    }
}

class CarRent extends Ride{
    int carrent = 20; // 20 rs/km
    CarRent(String name, int age, int distance){
        super(name, age, distance);
    }

    void total_fare(){
        System.out.println("Total fare: " + (carrent*super.distance));
    }
}

public class Inheritence2 {
    public static void main(String[] args) {
        BikeRent cust1 = new BikeRent("ABCDE", 24, 40);
        CarRent cust2 = new CarRent("XYZ", 30, 20);
        cust1.display_info();
        cust1.total_fare();
        cust2.display_info();
        cust2.total_fare();
    }
}
