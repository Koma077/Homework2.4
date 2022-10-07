
public abstract class Driver<T extends Transport> {
    private String fio;
    private boolean driverLicense;
    private int experience;



    public Driver(String fio, boolean driverLicense, int experience) {
        this.fio = fio;
        this.driverLicense = driverLicense;
        this.experience = experience;

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


    public abstract void startMovement();

    public abstract void stop();

    public abstract void refuelTheCar();

    @Override
    public String toString() {
        return "Driver{" +
                "fio='" + fio + '\'' +
                ", driverLicense=" + driverLicense +
                ", experience=" + experience +
                '}';
    }

}
