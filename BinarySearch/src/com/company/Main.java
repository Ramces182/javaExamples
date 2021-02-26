package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sort();
        BinarySearch bs = new BinarySearch();

    }

    public static void sort(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How big do you want this Array to be?");
        int size;
        size = sc.nextInt();
        int position;
        int numberOfTimesRun = 0;
        int tempNumber;
        boolean sorted = false;
        int[] sortingArray = new int[size];
        for (int i = 0; i < sortingArray.length; i++) {
            System.out.println("Enter the value " + i);
            sortingArray[i] = sc.nextInt();
        }


        while (sorted == false) {
            sorted = true;
            for (int i = 0; i < sortingArray.length-1; i++) {
                if (sortingArray[i] > sortingArray[i + 1]) {
                    tempNumber = sortingArray[i];
                    sortingArray[i] = sortingArray[i+1];
                    sortingArray[i+1] = tempNumber;
                    sorted = false;
                    numberOfTimesRun++;
                }

            }
        }
        for (int x=0; x<sortingArray.length; x++){
            System.out.println(sortingArray[x]);
        }
        System.out.println("algorithm ran: " + numberOfTimesRun + " of times\n");
    }

}

