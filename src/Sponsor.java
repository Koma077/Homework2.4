public class Sponsor {

    private String name;
    private int amountSupport;

    public Sponsor(String name, int amountSupport) {
        this.name = name;
        this.amountSupport = amountSupport;
    }
    public void toSponsor(){
        System.out.printf("Спонсор %s спонсирует заезд %d%n", name, amountSupport);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountSupport() {
        return amountSupport;
    }

    public void setAmountSupport(int amountSupport) {
        this.amountSupport = amountSupport;
    }

    @Override
    public String toString() {
        return "Cпонсор: " +
                ", Название компании - " + name +
                ", Бюджет - " + amountSupport;
    }
}
