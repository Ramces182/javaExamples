package com.company;

import org.w3c.dom.DOMStringList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo{

    public static void main(String[] args) {

        LinkedList<String> placesTovisit = new LinkedList<String>();
        addInOrder(placesTovisit, "Guadalajara");
        addInOrder(placesTovisit, "CDMX");
        addInOrder(placesTovisit, "Monterrey");
        addInOrder(placesTovisit, "Cancun");
        addInOrder(placesTovisit, "Acapulco");
        printList(placesTovisit);
        addInOrder(placesTovisit, "Acapulco");
        printList(placesTovisit);
        visit(placesTovisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("--------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                System.out.println(newCity + " is already included");
                return false;
            }else if (comparison>0){
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison <0){


            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()){
            System.out.println("No cities in the itenerary");
        }else {
            System.out.println("Now visiting "+ listIterator.next());
            printMenu();
        }
        while (!quit){
            int action=sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holliday (Vacation) over");
                    break;
                case 1:
                    if(!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("we are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }



    private static void printMenu(){
        System.out.println("Available actions: \nPress");
        System.out.println("0 - To quit\n" +
                "1 - Go to next city\n" +
                "2 - Go to previous city\n" +
                "3 - Print menu options");

    }





}
