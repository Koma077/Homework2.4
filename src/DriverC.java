
public class DriverC extends Driver<Truck> {

    public DriverC(String fio, boolean driverLicense, int experience, Truck transport) {
        super(fio, driverLicense, experience, transport);
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
