package com.company;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone is now on. ");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");

        }else {
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callphone(int phonenUmber) {
        if (phonenUmber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody ring");
        }else
            isRinging = false;
        System.out.println("Mobile phone nor on or number different");
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

