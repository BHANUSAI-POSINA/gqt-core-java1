package com.gqt.corejava.patterns;

public class Pattern21 {

	public static void main(String[] args) {
		 int a = 5;
		 int b = 6;
	        for(int i = 1; i <= a; i++) {
	            for(int j = 1; j <= b - i; j++) {
	                    System.out.print("-");
	                }
	            for(int j = 1; j <= i; j++) {
	                    System.out.print("#");
	            }
	            System.out.println();
	        }
	    }
	}