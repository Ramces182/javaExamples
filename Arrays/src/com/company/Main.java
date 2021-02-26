package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
    int[] myIntegers = getIntegers(5);
    int[] sorted = sortIntegers(myIntegers);
    printArray(sorted);

    }


    public static int[] getIntegers(int capacity){
        //int lenght;
        //System.out.println("please imput how long you want the array to be");
        //lenght = scanner.nextInt();
        int [] array = new int[capacity];
        for (int i=0; i<array.length; i++){
            System.out.println("enter the values");
            array [i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int [] sortIntegers(int[] array){
        int [] sortedArray = Arrays.copyOf(array,array.length);
        boolean sort = false;
        int tempNumber;
        while (sort == false){
            sort = true;
            for (int i=0; i<sortedArray.length -1; i++){
                if (sortedArray [i] > sortedArray [i+1]){
                    tempNumber = sortedArray[i];
                    sortedArray [i] = sortedArray [i+1];
                    sortedArray [i+1] = tempNumber;
                    sort = false;
                }
            }
        }
        return sortedArray;
    }

}
