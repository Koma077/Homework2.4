import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Transport implements Competing{
    private String brand ;
    private String model;
    private double engineCapacity;
    private final Set<Driver> drivers = new HashSet<>();
    private final Set<Mechanic> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public Transport() {
        this.brand = brand;
        this.model = model;
        setEngineCapacity(engineCapacity);
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }
    public void addMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Transport transport = (Transport) o;
//        return Objects.equals(drivers, transport.drivers) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(sponsors, transport.sponsors);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(drivers, mechanics, sponsors);
//    }
}
