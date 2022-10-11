public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", "Granta", 1.6);
        Car car1 = new Car("Toyota", "Camry", 1.8);
        Car car2 = new Car("Kia", "K5", 2.0);

        Bus bus = new Bus("Газ", "ГАЗель", 2.0);
        Bus bus1 = new Bus("Hyundai", "Mighty", 2.5);
        Bus bus2 = new Bus("Mercedes", "Atego", 3.0);

        Truck truck = new Truck("Volvo", "9500", 7.7);
        Truck truck1 = new Truck("Hyundai", "H350", 2.5);
        Truck truck2 = new Truck("Mercedes", "Sprinter", 3.0);


        Driver driverC = new DriverC("Макаров Григорий Вечиславович", true, 12, truck);
        Driver driverB = new DriverB("Калашников Валерий Анатольевич", true, 10, car);
        Driver driverD = new DriverD("Иконников Никита Сергеевич", true, 10, bus);

        diagnostics(car1, car2, car, truck2, truck1, truck, bus2, bus1, bus);


        driverC.printInfo(car1);
        driverB.printInfo(truck1);
        driverD.printInfo(bus);

    }

    public static void diagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                throw new RuntimeException("Не прошел диагностику");
            } catch (RuntimeException e) {
                transport.diagnostics();
            }
        }
    }
}



