package Car;

public class Main {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 50, 10);
        Vehicle bus = new Vehicle(36, 100, 24);
        int distance = 1158;
        double litr;

        System.out.println(minivan);
        System.out.println(bus);

        litr = minivan.fuelneeded(distance);
        System.out.println("для преодаления " + distance + " км минивэну понадобится " + litr + " литров топлива");
        litr = bus.fuelneeded(distance);
        System.out.println("для преодаления " + distance + " км автобусу понадобится " + litr + " литров топлива");

    }
}
