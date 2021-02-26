package com.example;

public class Main {


    public static void main(String[] args) {

        String[] continentes = {"America", "Africa", "Europa", "Asia", "Oceania"};
        int valorLeido = 20;

        try {
            System.out.println("Primer continente solicitado: " + continentes[valorLeido]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Hubo un error en el numero ingresado. Continuando con el programa");
        }

    }
}
