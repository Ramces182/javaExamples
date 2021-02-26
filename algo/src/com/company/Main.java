package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sortAlgorithm();


    }

    public static void sortAlgorithm(){
        Scanner sc = new Scanner(System.in);
        int arrayLenght;
        int tempNumber;
        int lookFor;
        int mid;
        int sortAlgorithmran = 0;
        boolean sorted = false;
        System.out.println("Enter array lenght");
        arrayLenght = sc.nextInt();
        int [] toSortArray = new int[arrayLenght];
        System.out.println("Enter the values");
        for (int i=0; i<toSortArray.length; i++){
            toSortArray [i] = sc.nextInt();
        }

        while (sorted != true){
            sorted = true;
            for (int x=0; x<toSortArray.length -1; x++){
                if (toSortArray [x] > toSortArray[x+1] ){
                    tempNumber = toSortArray [x];
                    toSortArray [x] = toSortArray[x+1];
                    toSortArray[x+1] = tempNumber;
                    sorted = false;
                    sortAlgorithmran ++;
                }
            }
        }
        for (int y = 0; y<arrayLenght; y++){
            System.out.println(toSortArray[y]);
        }
        System.out.println("Algorithm ran " + sortAlgorithmran + " times");
        System.out.println("Enter the number you are looking for");
        lookFor = sc.nextInt();
        int fisrt = 0;
        int last = arrayLenght -1;
        mid = (fisrt + last)/2;
        while (fisrt<=last){
            if (toSortArray[mid]<lookFor){
                fisrt = mid + 1;
            }else if (toSortArray[mid] == lookFor){
                System.out.println("Found it in position: " + mid);
            }else   {
                last = mid - 1;

                mid = (fisrt + last)/2;
            }
            if (fisrt > last)
                System.out.println(lookFor + " isn't present in the list.\n");
            }
        }
    }

