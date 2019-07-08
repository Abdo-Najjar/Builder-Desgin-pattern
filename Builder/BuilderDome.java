package Builder;

public class BuilderDome {
    public static void main(String[] args) {
        PhoneBuilder pBuilder = new PhoneBuilder();
        Phone phone = pBuilder.setpName("C7").setPrice(10).setCompany("Samsung").getPhone();
        System.out.format("Company : %s \n",phone.getCompany());
        System.out.format("Price : %s \n" , phone.getPrice());
        System.out.format("Name :  %s\n" ,phone.getpName());
    }
}
