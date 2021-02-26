package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        boolean reverse = false;
        String tempElement;

        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("Milk");
        groceryList.add("Cheese");
        groceryList.add("Bread");
        groceryList.add("Eggs");
        groceryList.add("OJ");

        while (reverse == false){
            reverse = true;
            for (int i=groceryList.size() -1; i>=0; i--){
                System.out.println(groceryList.get(i) );
            }
        }

    }
}
