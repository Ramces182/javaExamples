package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone danielPhone;
	    danielPhone = new DeskPhone(345634);
        danielPhone.powerOn();
        danielPhone.callphone(345634);
        danielPhone.answer();

        danielPhone = new MobilePhone(345634);
        danielPhone.powerOn();
        danielPhone.callphone(345634);
        danielPhone.answer();


    }
}
