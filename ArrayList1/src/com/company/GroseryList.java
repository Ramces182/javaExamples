package com.company;

import java.util.ArrayList;


public class GroseryList {
    private ArrayList<String> groseryList = new ArrayList<String>();

    public void addGroseryItem(String item){
        groseryList.add(item);
    }

    public void pringGroceryList(){
        System.out.println("You have " + groseryList.size() + " items in your list");
        for (int i=0; i<groseryList.size(); i++){
            System.out.println((i+1)+". " + groseryList.get(i));
        }
    }
    public void modifyGroseryItem(int position,String newItem){
        groseryList.set(position, newItem);
        System.out.println("Grosery item " + (position+1) + "has been modified");
    }

    public void removeGroseryItem (int position){
        String theItem = groseryList.get(position);
        groseryList.remove(position);
    }

    public String findItem(String searchItem){
//        boolean exist = groseryList.contains(searchItem);
        int position = groseryList.indexOf(searchItem);
        if (position >=0){
            return groseryList.get(position);
        }
        return null;
    }
}
