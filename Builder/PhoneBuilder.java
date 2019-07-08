package Builder;

public class PhoneBuilder {

    private double price;
    private String pName;
    private String company;
    
    
    public PhoneBuilder setCompany(String company){
        this.company = company;
        return this;
    }

    public PhoneBuilder setPrice(double price) {
        this.price = price;
        return this;
    }
    
    public PhoneBuilder setpName(String pName) {
        this.pName = pName;
        return this;
    }
    
    public Phone getPhone(){
        return new Phone(price, pName, company);
    }
   
}
