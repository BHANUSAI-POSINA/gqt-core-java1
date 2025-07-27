package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count: ");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(ch +" ");
			}
			ch++;
			System.out.println();
		}

	}

}