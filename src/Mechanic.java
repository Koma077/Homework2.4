public class Mechanic<T extends Transport> {
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
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
    public String toString() {
        return "Механик: " +
                "Имя - " + name +
                ", Фамилия - " + surname +
                ", Компания - " + company;
    }
}
