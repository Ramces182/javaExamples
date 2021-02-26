package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> groceryList = new ArrayList<String>();
    public static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {

        int option;
        boolean done = false;
        while (done == false){

            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print the list of grocery items.");
            System.out.println("\t 2 - To add an item to the list.");
            System.out.println("\t 3 - To modify an item in the list.");
            System.out.println("\t 4 - To remove an item from the list.");
            System.out.println("\t 5 - To search for an item in the list.");
            System.out.println("\t 6 - To quit the application.");
            switch (option) {
                case 0:
                    printOptions();
                    break;

                case 1:
                    printGroceryList();

            }


        }



    }

    public static void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }


    public static void printOptions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
        option = scan.nextInt();

    }
}
