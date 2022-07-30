package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	// write your code here
        int son = sc.nextInt(); // berilgan son

        if (son == 1) {
            System.out.println("Dushanba");
        } else if (son == 2) {
            System.out.println("Seshanba");
        } else if (son == 3) {
            System.out.println("Chorshanba");
        } else if (son == 4) {
            System.out.println("Payshanba");
        } else if (son == 5) {
            System.out.println("Juma");
        } else if (son == 6) {
            System.out.println("Shanba");
        } else if (son == 7) {
            System.out.println("Yakshanba");
        } else {
            System.out.println("none");
        }
    }
}
