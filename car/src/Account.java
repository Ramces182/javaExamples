

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;

    public Account(String customerName, String customerEmailAdress, String customerPhoneNumber) {

        this.customerName = customerName;
        this.customerEmailAdress = customerEmailAdress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("A deposit for the ammout of: " + depositAmount + "has been made to your account");


    }

    public void withdrawal(double withdrawalAmmount){

        if (balance - withdrawalAmmount <0){
            System.out.println("Only " + balance + " available on your account to withdrawal");
        }else{
            this.balance -= withdrawalAmmount;
            System.out.println("withdrawal ammount: " + withdrawalAmmount + "\naccount balance is: " + balance);

        }


    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }






    }


