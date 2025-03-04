package com.example;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static Object lock1  = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
    private static class Thread1 extends Thread{
        public void run (){
            synchronized (lock1){
                System.out.println("Thread 1: Has lock1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
                System.out.println("Thread 1: Witing for Lock2");
                synchronized (lock2){
                    System.out.println("Thread1: Has lock1 and Lock2");
                }
                System.out.println("Thread 1: Released lock2");
            }
            System.out.println("Thread 1: Released lock1. Exiting... ");
        }
    }

    private static class Thread2 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread 2 Has lock1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
                System.out.println("Thread 2 waiting for lock2");
                synchronized (lock2){
                    System.out.printf("Thread 2: Has lock2 and Lock2");
                }
                System.out.println("Thread 2: Thread1 is released lock 2");
            }
            System.out.printf("Thread 2: Released lock1. Exiting...");
        }

    }
}

