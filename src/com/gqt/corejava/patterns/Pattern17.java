package com.gqt.corejava.patterns;

import java.util.Scanner;
public class Pattern17 {
public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size");
			int n = sc.nextInt();
			int num=1;
			for(int i =1;i<=n;i++) {
				for(int j=1;j<=i;j++) { 
				System.out.print(num+" ");
					num++;
			}
					
			System.out.println();
			}
			sc.close();

}
}