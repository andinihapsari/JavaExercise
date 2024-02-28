package org.example;

import java.util.Scanner;

public class SessionTwoAssesment {

    Scanner scanner = new Scanner(System.in);
    public void drawshape(int choice){
        //Conditional pilih menu
        switch (choice){
            case 1:
                System.out.println("Masukkan berapa tinggi segitiga");
                int triangleHeight = scanner.nextInt();
                drawTriangle(triangleHeight);
                break;
            case 2:
                System.out.println("Masukkan berapa sisi persegi");
                int squareSide = scanner.nextInt();
                drawSquare(squareSide);
                break;
            case 3:
                System.out.println("Masukkan berapa panjang persegi");
                int persegiPanjang = scanner.nextInt();
                drawPersegiPanjang(persegiPanjang);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Input"); //segitiga
        }
    }

    public void drawTriangle(int triangleHeight) {
        //Nested Loop
        //Outer Loop (Take care the rows)
        for (int i = 1; i <= triangleHeight; i++) {
            //Inner Loop (Take care the columns)
            for (int j = 1; j <= triangleHeight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawSquare(int squareSide) {
            for (int p = 2; p <= squareSide; p++) {
                for (int s = 1; s <= squareSide; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void drawPersegiPanjang(int persegiPanjang){
        for (int p = 5; p <= persegiPanjang; p++) {
            for (int s = 0; s <= persegiPanjang; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void displayMenu(){
        System.out.println("Welcome to ASCII shape drawer!");
        System.out.println("Choose a shape to draw:");
        System.out.println("1. Triangle"); //nested loop
        System.out.println("2. Square"); //nested loop, inner loop ada 2
        System.out.println("3. Rectangle");
        System.out.println("4. Exit");
    }

    public void run(){
        //loop while untuk aplikasi terus running sampai ada exit
        while (true){
            displayMenu();
            System.out.println("enter your choice: ");
            int choice = scanner.nextInt();
            drawshape(choice); //Dimana ada conditional
            System.out.println();
        }
    }

    public static void main(String[] args){
        //Inheritance (OOP)
        //Untuk running
        SessionTwoAssesment drawer = new SessionTwoAssesment();
        drawer.run();
    }
}
