public class Main {
    public static void main(String[] args) throws ErrorBus {
        Car car = new Car("Lada", "Granta", 1.6);
        Car car1 = new Car("Toyota", "Camry", 1.8);
        Car car2 = new Car("Kia", "K5", 2.0);

        Bus bus = new Bus("Газ", "ГАЗель", 2.0);
        Bus bus1 = new Bus("Hyundai", "Mighty", 2.5);
        Bus bus2 = new Bus("Mercedes", "Atego", 3.0);

        Truck truck = new Truck("Volvo", "9500", 7.7);
        Truck truck1 = new Truck("Hyundai", "H350", 2.5);
        Truck truck2 = new Truck("Mercedes", "Sprinter", 3.0);

        diagnostics(car1, car2, car, truck2, truck1, truck, bus2, bus1, bus);


        Driver driverC = new DriverC("Макаров Григорий Вечиславович", true, 12, truck);
        Driver driverB = new DriverB("Калашников Валерий Анатольевич", true, 10, car);
        Driver driverD = new DriverD("Иконников Никита Сергеевич", true, 10, bus);


        Sponsor AZS = new Sponsor("AZS", 200000);
        Sponsor Monstr = new Sponsor("Monstr", 300000);
        Sponsor RedBull = new Sponsor("redBull", 400000);

        car.addSponsor(AZS);
        System.out.println(AZS);

        Mechanic<Car> Sasha = new Mechanic<>("Sasha", "Kulikov", "AZS");

        car.addMechanic(Sasha);
        System.out.println(Sasha);



        driverC.printInfo(car1);
        driverB.printInfo(truck1);
        driverD.printInfo(bus);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addtransportSerice(car2);
        serviceStation.diagnostics();

    }
    private static void diagnostics (Transport...transports){
        for( Transport transport:transports){
            diagnosticsTransport(transport);
        }
    }
    private static void diagnosticsTransport(Transport transport){
        try{
            if(!transport.diagnostics()){
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагнеостику");
            }
        }catch (RuntimeException e ) {
            System.out.println(e.getMessage());
        }
    }

}




