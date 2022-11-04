public class Truck extends Transport implements Competing {


    public Truck(String brand, String model, double engineCapacity) {
        super();
    }


    @Override
    public void startMovement() {
        System.out.println("Начать движение");

    }
    @Override
    public void endMovement() {
        System.out.println("Закончить движение");

    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public void fixTransport() {

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");

    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");

    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");

    }

}
