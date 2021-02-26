package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    boolean duplexPrinter;

    public Printer(int tonerLeverl, int pagesPrinted, boolean duplexPrinter) {
        if (tonerLevel >=0 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }
        if (pagesPrinted >= 0) {
            this.pagesPrinted = pagesPrinted;
        }
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void rechargeToner(int ammount){
        this.tonerLevel += ammount;
        System.out.println("toner level is now: " + this.tonerLevel);
    }

    public void print(int pagesToPrint){
        if (this.duplexPrinter == true){
            pagesToPrint = pagesToPrint /2;
            this.pagesPrinted += pagesToPrint /2;
            for (int i=0; i<pagesToPrint; i++) {
                this.tonerLevel--;
                System.out.println("printing duplex " + pagesToPrint + " pages");
                System.out.println("Toner level is now: " + this.tonerLevel);
            }
        }else {

            System.out.println("printing...");
            this.pagesPrinted += pagesToPrint;
            for (int i=0; i<pagesToPrint; i++) {
                this.tonerLevel--;
                System.out.println("Toner level is now: " + this.tonerLevel);
            }
        }
    }
}
