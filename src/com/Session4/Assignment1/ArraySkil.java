package com.Session4.Assignment1;

import java.util.Arrays;
import java.util.Scanner;


public class ArraySkil {

	/*
	 * Print reverse of an array
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a lenght of array");
		Scanner scan = new  Scanner(System.in);
		int length = scan.nextInt();
		
		if(length>0)
		{
			ArrayClass array = new ArrayClass(length);
			
			for(int i=1; i<=length; i++)
			{
				array.addElementForIndex(i);
			}
			System.out.println("------ Print array actual order --- ");
			array.print();
			
			System.out.println("------ Print array in reverse order without sorting --- ");
			array.reverseWithoutSorting();
			
			System.out.println("------ Print array in reverse order with sorting --- ");
			array.reverseWithSorting();
			
		}
		else
		{
			System.out.println("The length of array should be grater than Zero");
		}
		
		
	}
}

class ArrayClass
{
	private int[] arr = null;
	private Scanner scan;
	
	public ArrayClass(int length)
	{
		arr = new int [length];
	}
	
	
	public void addElementForIndex (int index)
	{
		scan = new  Scanner(System.in);
		System.out.println("Enater for array element No "+index+": ");
		arr[index-1] = scan.nextInt();
	}
	public void print() 
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	public void reverseWithoutSorting() 
	{
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
	public void reverseWithSorting() 
	{
		Arrays.sort(arr);
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	
}
