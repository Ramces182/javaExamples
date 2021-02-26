package com.example;

import static com.example.ThreadColor.ANSI_BLUE;
import static com.example.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "hELLO FROM MyRunnable's implementation of run");
    }
}
