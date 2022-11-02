public abstract class Driver<T extends Transport> {
    private String fio;
    private boolean driverLicense;
    private int experience;
    private T diagnostics;



    public Driver(String fio, boolean driverLicense, int experience, T diagnostics) {
        this.fio = fio;
        this.driverLicense = driverLicense;
        setExperience(experience);
        this.diagnostics = diagnostics;
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
        if (driverLicense = false ) {
            this.driverLicense = Boolean.parseBoolean("Тип прав не указан");
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
    public T getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(T diagnostics) {
        this.diagnostics = diagnostics;
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
