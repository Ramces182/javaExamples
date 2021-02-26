package com.company;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDoList = new ArrayList<>();

    public void addItem(String itemToAdd){

        toDoList.add(itemToAdd);

    }

    public void erraseItem(int erraseItem){
        toDoList.remove(erraseItem);
    }
    public void printList(){
        for (int i=0; i<toDoList.size(); i++){
            System.out.println((i+1)+". "+toDoList.get(i));
        }
    }

    public void modifyList(int position, String itemToModify){
        toDoList.set(position,itemToModify);
        System.out.println("Item " + toDoList.indexOf(position+1)+" has been modified. ");
    }

}
