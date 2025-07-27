package com.gqt.corejava.patterns;

public class Pattern20 {

public static void main(String[] args) {
		        int rows = 5;     
		        int columns = 10; 
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= columns; j++) {
		                if (j <= 5) {
		                    System.out.print("-");
		                }
		                else {
		                    System.out.print("@");
		                }
		            }
		            System.out.println();
		        }
		    }
		}