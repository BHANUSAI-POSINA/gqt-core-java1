package com.gqt.corejava.Array;

import java.util.Scanner;

class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		Scanner sc=new Scanner(System.in);
		void createArray() {
			System.out.print("Enter the student count: ");
			int n = sc.nextInt();
			arr = new Int[n];
			System.out.println("Array created");
			System.out.println("----------);"
		}
		void collectData() {
			for(int i=0;i<arr.length;i++) {
				System.out.print("Enter the marks of student no: "+(i+1 ));
				arr[i] = sc.nextInt();
			}
			System.out.println("Data stored into the array");
		}
		void displayData() {
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("The marks of students no:"+(i+1) +" is +" + arr[i]);
			}
		
		}
		
			public class Array2 {
				public static void main(String args[]) {
					ArrayOperations ao = new ArrayOperations();
					ao.createArray();
					ao.collectData();
					ao.displayData();
				}
			}
		}