public abstract class Driver<T extends Transport> {
    private String fio;
    private boolean driverLicense;
    private int experience;
    private T transport;



    public Driver(String fio, boolean driverLicense, int experience, T category) {
        this.fio = fio;
        this.driverLicense = driverLicense;
        setExperience(experience);
        this.transport = transport;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        if(fio == null){
            this.fio = "Имя фамиля отчество не указаны";
        }else{
            this.fio = fio;
        }
    }

    public boolean getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        if(driverLicense = false){
            this.driverLicense = true;
        }else{
            this.driverLicense = driverLicense;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if(experience <= 0){
            this.experience = 5;
        }else{
            this.experience = experience;
        }
    }
    public T getCategory() {
        return transport;
    }

    public void setCategory(T category) {
        this.transport = category;
    }

    public abstract void startMovement();

    public abstract void stop();

    public abstract void refuelTheCar();

    public void printInfo(Transport transport){
        System.out.println("Водитель " + fio + " управляет автомобилем " +
                transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "Имя водителся - " + fio +
                ", Наличие водительских прав - " + driverLicense +
                ", Опыт вождения - " + experience;
    }
}
