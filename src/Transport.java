import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements Competing{
    private final String brand;
    private final String model;
    private double engineCapacity;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        setEngineCapacity(engineCapacity);
    }

    public void addDriver(Driver<?> driver){
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity){
        if(engineCapacity <= 0){
            this.engineCapacity = 1.6;
        }else{
            this.engineCapacity = engineCapacity;
        }
    }
    public abstract void startMovement();

    public abstract void endMovement();
    public abstract boolean diagnostics();
    public abstract void fixTransport();

    @Override
    public String toString() {
        return "Транспорт:" +
                " Марка - " + brand +
                ", Модель - " + model +
                ", Объем двигателя - " + engineCapacity +
                '}';
    }
}
