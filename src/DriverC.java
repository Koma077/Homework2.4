
public class DriverC<Truck> extends Driver {

    public DriverC(String fio, boolean driverLicense, int experience, Transport category) {
        super(fio, driverLicense, experience, category);
    }

    @Override
    public void startMovement() {
        System.out.println("Начать движение");
    }

    @Override
    public void stop() {
        System.out.println("Остановиться");

    }

    @Override
    public void refuelTheCar() {
        System.out.println("Заправить авто");

    }
}
