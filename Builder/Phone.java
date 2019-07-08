package Builder;

public final class Phone {

    private double price;
    private String pName;
    private String company;

    public Phone(double price, String pName, String company) {
        this.price = price;
        this.pName = pName;
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public String getpName() {
        return pName;
    }

    public String getCompany() {
        return company;
    }

}
