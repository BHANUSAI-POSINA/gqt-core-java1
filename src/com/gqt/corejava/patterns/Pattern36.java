package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count:");
		int n=sc.nextInt();
	  
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print((char) ('A' +j));
			
			}
			for(int j=0;j<i-1;j++) {
				System.out.print((char) ('A' +j));
			
			}
			
			System.out.println();
		}

	}

}