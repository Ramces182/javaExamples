package com.company;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action takes, this phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the deskphone");
            isRinging = false;
        }
    }

    @Override
    public boolean callphone(int phonenUmber) {
        if (phonenUmber == myNumber){
            isRinging = true;
        }else
            isRinging = false;
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
