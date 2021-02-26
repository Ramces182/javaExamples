package com.company;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



    }

    public int[] getIntegers (int []numbers){

        System.out.println("type the lenght of the array\n");
        int lenghtArray;
        lenghtArray = scanner.nextInt();
        int [] values = new int[lenghtArray];
        for (int i=0; i<values.length; i++){
            System.out.println("type the numbers\n");
            values [i] = scanner.nextInt();
        }
        return values;

    }

    public int sortIntegers(int [] sort){

    }

    public static void printArray(int [] values){
        for (int i=0; i<values.length; i++){

            System.out.println("position " + i + " is number " + values [i]);

        }
    }

}