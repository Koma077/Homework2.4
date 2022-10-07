
public class DriverB<Car> extends Driver {

    public DriverB(String fio, boolean driverLicense, int experience, Transport category) {
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


