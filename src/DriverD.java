

public class DriverD extends Driver<Bus> {

    public DriverD(String fio, boolean driverLicense, int experience, Bus transport) {
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

