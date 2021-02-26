package com.company;

public class Main {

    public static void main(String[] args) {

        int number[] = {34,100,101,0,87,54,7};
        int temp;
        boolean fixed = false;
        while (fixed == false) {
            fixed = true;

            for (int i = 0; i < number.length -1; i++) {
                if (number[i] > number[i+1]){
                 temp = number [i+1];
                    number [i+1] = number[i];
                    number [i] = temp;
                    System.out.println("goes back");

                    fixed = false;
                    for (int x = 0; x<number.length; x++){
                        System.out.println(number [x]);

                    }
                }
            }


        }

    }
}
