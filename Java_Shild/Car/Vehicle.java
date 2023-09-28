package Car;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    int range() {
        return fuelcap / mpg * 100 ;
    }
    double fuelneeded(int km) {
    return (double)km / 100 * mpg;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "Колличество пассажиров = " + passengers +
                ", обьем бака = " + fuelcap +
                ", расход торлива = " + mpg + " л / на 100 км " +
                '}';
    }
}
