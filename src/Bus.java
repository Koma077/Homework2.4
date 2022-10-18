public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
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
        System.out.println("Автобус" + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return false;
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
