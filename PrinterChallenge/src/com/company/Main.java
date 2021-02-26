package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50,0,false);
	    printer.print(50);
	    printer.rechargeToner(20);
	    printer.print(12);
    }
}
