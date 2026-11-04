package ClassDesign;

public class car {
    public String make;
    public String model;
    public int year;
    public String color;
    public double speed;
    public static int carsInGarage = 0;

    public car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        speed = 0;
        carsInGarage ++;
    }

    public void vroomVroom() {
        speed += 10;
    }

    

}
