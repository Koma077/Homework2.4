public abstract class Transport implements Competing{
    private final String brand;
    private final String model;
    private double engineCapacity;

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        setEngineCapacity(engineCapacity);
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

    @Override
    public String toString() {
        return "Транспорт:" +
                " Марка - " + brand +
                ", Модель - " + model +
                ", Объем двигателя - " + engineCapacity +
                '}';
    }
}
