public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer() {
        this.name = "default";
        this.creditLimit = 0.0;
        this.email = "defaul@default.com";

        System.out.println(name);
        System.out.println(creditLimit);
        System.out.println(email);

    }
    public VipCustomer(String name, double creditLimit){

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "default";
        System.out.println(name);
        System.out.println(creditLimit);

    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name =  name;
        this.creditLimit = creditLimit;
        this.email = email;

        System.out.println(name);
        System.out.println(creditLimit);
        System.out.println(email);
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
