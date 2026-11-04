package ClassDesign;

public class main {
    public static void main(String[] args){
        car car1 = new car("Chevorlet", "Equinox", 2018, "Gray");

        car1.vroomVroom();

        System.out.println(car1.speed);
    }
}
