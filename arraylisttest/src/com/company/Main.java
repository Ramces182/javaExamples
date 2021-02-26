package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static TodoList todoList = new TodoList();
    public static void main(String[] args) {
        int optionChosen;
        printOptions();
        optionChosen = sc.nextInt();
        switch (optionChosen){
            case 0:
                printOptions();
                break;
            case 1:
                System.out.println("Enter the item");
                String itemToAdd = addItem(sc.nextLine());
                break;
            case 2:
                removeItem();
                break;
            case 3:
                modifyItem(sc.nextInt(),sc.nextLine());
                break;
        }


    }

    public static void printOptions(){
        System.out.println("Press 0 to print this menu again");
        System.out.println("Press 1 to add an intem to your list");
        System.out.println("Press 2 to remove an item");
        System.out.println("Press 3 to modify an item");
        System.out.println("Press 4 to print the list");
    }
    public static String addItem(String itemToAdd){
        todoList.addItem(itemToAdd);
        return itemToAdd;
    }
    public static void removeItem(int itemToBeRemoved){
        todoList.erraseItem(itemToBeRemoved);
    }
    public static void modifyItem(int itemToModify, String itemToAdd){
        todoList.modifyList(itemToModify,itemToAdd);
    }
}
