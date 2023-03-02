import controller.AutomotiveEngineer;
import model.Car;
import model.SportsCarBuilder;

public class Main {

    public static void main(String[] args) {
        SportsCarBuilder builder = new SportsCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        if (car != null) {
            System.out.println("Below car delievered: ");
            System.out.println("======================================================================");
            System.out.println(car);
            System.out.println("======================================================================");
        }
    }
}