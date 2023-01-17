package com.java.model;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithStatistics {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = args.length;
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		int sum1 = sum(arr);
		double average1 = average(arr);
		int min1 = min(arr);
		int max1 = max(arr);
		double median1 = median(arr);
		System.out.println("sum of given array is       " +sum1);
		System.out.println("Average of given array is   "+average1);
		System.out.println("Minimun element of array is "+min1);
		System.out.println("Maximum element of array is "+max1);
		System.out.println("Median element of array is  "+median1);
		System.out.println("Frequency of each element in given array");
		frequency(arr);
	}
	private static double median(int[] arr2) {
		
		double md=0;
		Arrays.sort(arr2);
		int hfLength = arr2.length/2;
		if(arr2.length%2==0) {
			md =(arr2[hfLength-1]+arr2[hfLength])/2.0;
		}
		else md=arr2[hfLength];
		return md;
	}
	private static int max(int[] arr2) {
		Arrays.sort(arr2);
		return arr2[arr2.length-1];
	}
	private static int min(int[] arr2) {
		Arrays.sort(arr2);
		return arr2[0];
	}
	private static double average(int[] arr2) {
		int sum1 = sum(arr2);
		double length = arr2.length;
		return (sum1/length);
	}
	private static int sum(int[] arr2) {
		int sum=0;
		for(int i=0;i<arr2.length;i++)
			sum += arr2[i];
		return sum;
	}
	private static void frequency(int[] arr2) {
		Arrays.sort(arr2);
		int count=1;
		for(int i=0;i<arr2.length-1;i++)
		{
			if(arr2[i]==arr2[i+1])
				count++;
			else 
			{
				System.out.println("elemt "+arr2[i]+"         frequency "+count);
				count=1;
			}
		}
		System.out.println("elemt "+arr2[arr2.length-1]+"         frequency "+count);
	}
}
