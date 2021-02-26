package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        start();
    }


        public static void start(){
            Scanner sc = new Scanner(System.in);
            int pos1 = 0;
            int pos2 = 0;
            int pos3 = 0;
            int pos4 = 0;
            int pos5 = 0;
            int pos6 = 0;
            int pos7 = 0;
            int pos8 = 0;
            int pos9 = 0;
            int sumResult1;
            int sumResult2;
            int sumResult3;
            int sumResult4;
            int sumResult5;
            int sumResult6;
            int sumResult7;
            int sumResult8;
            int player1Input;
            int player2Input;

            String post1 = "";
            String post2 = "";
            String post3 = "";
            String post4 = "";
            String post5 = "";
            String post6 = "";
            String post7 = "";
            String post8 = "";
            String post9 = "";

            boolean finished = false;



            while (finished == false) {

                /////////////////////////////////////////////////////////////////////////////////////////////Player 1 is next/////////////////////////////////////////////////////
                System.out.println("Player one is next");
                player1Input = sc.nextInt();
                switch (player1Input) {
                    case 1:
                        pos1 = 1;
                        post1 = "x";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 2:
                        pos2 = 1;
                        post2 = "x";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 3:
                        pos3 = 1;
                        post3 = "x";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 4:
                        pos4 = 1;
                        post4 = "x";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 5:
                        pos5 = 1;
                        post5 = "x";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 6:
                        pos6 = 1;
                        post6 = "x";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 7:
                        pos7 = 1;
                        post7 = "x";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 8:
                        pos8 = 1;
                        post8 = "x";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 9:
                        pos9 = 1;
                        post9 = "x";
                        System.out.println("--" + post1 + "--+--" + post2 + "--+--" + post3 + "--");
                        System.out.println("--" + post4 + "--|--" + post5 + "--|--" + post6 + "--");
                        System.out.println("--" + post7 + "--+--" + post8 + "--+--" + post9 + "--");
                        break;


                }
                /////////////////////////////////////////////////////////////////////////////////////////////validation/////////////////////////////////////////////////////
                int[] arrayPosible1 = {pos1, pos2, pos3};
                int[] arrayPosible2 = {pos4, pos5, pos6};
                int[] arrayPosible3 = {pos7, pos8, pos9};
                int[] arrayPosible4 = {pos1, pos4, pos7};
                int[] arrayPosible5 = {pos2, pos5, pos8};
                int[] arrayPosible6 = {pos3, pos6, pos9};
                int[] arrayPosible7 = {pos1, pos5, pos9};
                int[] arrayPosible8 = {pos3, pos5, pos7};

                sumResult1 = IntStream.of(arrayPosible1).sum();
                sumResult2 = IntStream.of(arrayPosible2).sum();
                sumResult3 = IntStream.of(arrayPosible3).sum();
                sumResult4 = IntStream.of(arrayPosible4).sum();
                sumResult5 = IntStream.of(arrayPosible5).sum();
                sumResult6 = IntStream.of(arrayPosible6).sum();
                sumResult7 = IntStream.of(arrayPosible7).sum();
                sumResult8 = IntStream.of(arrayPosible8).sum();
                if (sumResult1 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                    break;
                } else if (sumResult1 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                    break;
                } else if (sumResult2 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                    break;
                } else if (sumResult2 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                    break;
                } else if (sumResult3 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                    break;
                } else if (sumResult3 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                    break;
                } else if (sumResult4 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                    break;
                } else if (sumResult4 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                    break;
                } else if (sumResult5 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                    break;
                } else if (sumResult5 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                    break;
                } else if (sumResult6 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                    break;
                } else if (sumResult6 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                    break;
                } else if (sumResult7 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                    break;
                } else if (sumResult7 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                    break;
                } else if (sumResult8 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                    break;
                } else if (sumResult8 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                    break;
                }
                /////////////////////////////////////////////////////////////////////////////////////////////Player 2 is next/////////////////////////////////////////////////////
                System.out.println("Player two is next");
                player2Input = sc.nextInt();
                switch (player2Input) {
                    case 1:
                        pos1 = 10;
                        post1 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 2:
                        pos2 = 10;
                        post2 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 3:
                        pos3 = 10;
                        post3 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 4:
                        pos4 = 10;
                        post4 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 5:
                        pos5 = 10;
                        post5 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 6:
                        pos6 = 10;
                        post6 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 7:
                        pos7 = 10;
                        post7 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 8:
                        pos8 = 10;
                        post8 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;
                    case 9:
                        pos9 = 10;
                        post9 = "o";
                        layOut(post1,post2,post3,post4,post5,post6,post7,post8,post9);
                        break;


                }
                /////////////////////////////////////////////////////////////////////////////////////////////validation/////////////////////////////////////////////////////

                int[] arrayPosible11 = {pos1, pos2, pos3};
                int[] arrayPosible22 = {pos4, pos5, pos6};
                int[] arrayPosible33 = {pos7, pos8, pos9};
                int[] arrayPosible44 = {pos1, pos4, pos7};
                int[] arrayPosible55 = {pos2, pos5, pos8};
                int[] arrayPosible66 = {pos3, pos6, pos9};
                int[] arrayPosible77 = {pos1, pos5, pos9};
                int[] arrayPosible88 = {pos3, pos5, pos7};

                sumResult1 = IntStream.of(arrayPosible11).sum();
                sumResult2 = IntStream.of(arrayPosible22).sum();
                sumResult3 = IntStream.of(arrayPosible33).sum();
                sumResult4 = IntStream.of(arrayPosible44).sum();
                sumResult5 = IntStream.of(arrayPosible55).sum();
                sumResult6 = IntStream.of(arrayPosible66).sum();
                sumResult7 = IntStream.of(arrayPosible77).sum();
                sumResult8 = IntStream.of(arrayPosible88).sum();
                if (sumResult1 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                } else if (sumResult1 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                } else if (sumResult2 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                } else if (sumResult2 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                } else if (sumResult3 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                } else if (sumResult3 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                } else if (sumResult4 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                } else if (sumResult4 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                } else if (sumResult5 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                } else if (sumResult5 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                } else if (sumResult6 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                } else if (sumResult6 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                } else if (sumResult7 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                } else if (sumResult7 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                } else if (sumResult8 == 3) {
                    System.out.println("player 1 won");
                    finished = true;
                } else if (sumResult8 == 30) {
                    System.out.println("player 2 won");
                    finished = true;
                }


            }


        }
        public static void layOut(String post1,String post2, String post3, String post4, String post5, String post6, String post7, String post8, String post9){
            System.out.println("--" + " " + post1 + " " +"--+--" + " " +post2 + " " +"--+--" + " " +post3 + " " +"-- ");
            System.out.println("--" + " " + post4 + " " +"--|--" + " " +post5 + " " +"--|--" + " " +post6 + " " +"-- ");
            System.out.println("--" + " " + post7 + " " +"--+--" + " " +post8 + " " +"--+--" + " " +post9 + " " +"-- ");

        }

    }

