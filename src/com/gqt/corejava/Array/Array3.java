package com.gqt.corejava.Array;


import java.util.Scanner;

class ArrayCode {
	String arr[][];
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter class count : ");
		int cls = sc.nextInt();
		System.out.println("Enter student count in each class : ");
		int stu = sc.nextInt();
		
		arr = new String[cls][stu];
		System.out.println("Array is created ");
		System.out.println("------------");
	}
	
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no: "+(i+1 ));
			for(int j=0;j<arr.length;j++) {
				System.out.println("Enter the name of student no: "+(j+1 ));
			    arr[i][j] = sc.next();
			}
		}
		System.out.println("Data Collected");
		System.out.println("------------");
	}
		void displayData() {
			for(int i=0;i<arr.length;i++) {
				System.out.print("Inside class no: "+(i+1 ));
				for(int j=0;j<arr.length;j++) {
					System.out.println("The name of student no: "+(j+1)+"is = "+arr[i][j]);
				}
			}
			System.out.println("-------------");
	}
}

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCode ao = new ArrayCode();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

	}