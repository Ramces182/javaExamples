package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static GroseryList groseryList = new GroseryList();


    public static void main(String[] args) {
        int choice;
        boolean finished = false;
        String tempItem;
        printInstructions();

        while (!finished) {
            System.out.println("please enter your choise");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groseryList.pringGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchforItem();
                    break;
                case 6:
                    finished = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice");
        System.out.println("\t 1 - To print the list");
        System.out.println("\t 2 - To add a new item");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an intem in the list");
        System.out.println("\t 5 - To serarch for an item in the list");
        System.out.println("\t 6 - To quit the application");

    }

    public static void addItem(){
        System.out.print("Please enter the grosery item: ");
        groseryList.addGroseryItem(sc.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter replacement item ");
        String newItem = sc.nextLine();
        groseryList.modifyGroseryItem(itemNo-1,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        groseryList.removeGroseryItem(itemNo -1);
    }

    public static void searchforItem(){
        System.out.print("Item to search for ");
        String searchItem = sc.nextLine();
        if (groseryList.findItem(searchItem) !=null){
            System.out.println("Found search item in the grocery list");
        }else {
            System.out.println(searchItem + " is now in the grcsery list");
        }
    }

}
