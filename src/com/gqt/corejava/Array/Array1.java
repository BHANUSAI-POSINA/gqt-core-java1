package com.gqt.corejava.Array;

import java.util.Scanner;

public class Array1 {

	public static void main (String args[]) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student count:");
			int n = sc.nextInt();
			// creating the array to store n students marks
			int arr[] = new int[n];
		    // collecting & sharing marks of n students
			for(int i=0;i<arr.length;i++) {
				System.out.print("Enter the marks of student no: "+(i+1 ));
				arr[i] = sc.nextInt();
			}
			System.out.println("-------------");
			//Display marks stored inside the array
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("The marks of students no:"+(i+1) +" is +" + arr[i]);
			}
		}

	}