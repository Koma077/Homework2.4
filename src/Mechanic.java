public class Mechanic<T extends Transport> extends Transport {
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        super();
        this.name = name;
        this.surname = surname;
        this.company = company;
    }
    public boolean diagnostics(T t){
        return t.diagnostics();
    }
    public void fixTransports(T t){
        t.fixTransport();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void startMovement() {

    }

    @Override
    public void endMovement() {

    }

    @Override
    public boolean diagnostics() {
        return false;
    }

    @Override
    public void fixTransport() {

    }

    @Override
    public String toString() {
        return "Механик: " +
                "Имя - " + name +
                ", Фамилия - " + surname +
                ", Компания - " + company;
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void bestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }
}
