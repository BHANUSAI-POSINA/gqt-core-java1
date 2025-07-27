package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows :");
		int n=sc.nextInt();
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				System.out.print(i+" ");
				else 
					System.out.print("  ");
			}
			for(int j=1;j<=i-1;j++)
			{
				if(j==i-1)
					System.out.print(i+" ");
				else
					System.out.print("  ");
			}
			space--;
			System.out.println();
		}
		int num=n-1;
		for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print("  ");
            for(int j=1;j<=num;j++) {
            	if(j==1)
            System.out.print(num+" ");
            	else {
					System.out.print("  ");
				}
            }
            for(int j=1;j<=num-1;j++) {
            	if(j==num-1)
            System.out.print(num+" ");
            	else
            		System.out.print("  ");
            }
            num--;
            System.out.println();
        }
	}

}