package com.example;

public class ThreadEjemplo extends Thread {

    public ThreadEjemplo(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10 ; i++){
            System.out.println(i + " " + getName());
        }
        System.out.println("Termina thread " + getName());
    }

    public static void main (String [] args) {
        ThreadEjemplo t1 = new ThreadEjemplo("Pepe");
        ThreadEjemplo t2 = new ThreadEjemplo("Juan");
        t1.start();
        t2.start();
        System.out.println("Termina thread main");
    }
}
