package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System. in );

        System.out.println("Enter the word to limit the Pattern (In Capitals) : ");
        char c = sc.next().charAt(0);

        int var = 1;

        for (char i = 'A'; i <= c; i++) {

            char word = 'A';

            for (int j = c; j > i; j--) {
                System.out.print("  ");
            }

            for (int k = (2*var - 1); k> 0; k--) {
                System.out.print((char)(word + k - 1) + " ");
            }

            var++;
            System.out.println();
        }
    }
}