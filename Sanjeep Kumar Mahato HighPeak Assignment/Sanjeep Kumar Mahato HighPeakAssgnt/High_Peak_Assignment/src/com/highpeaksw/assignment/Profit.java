package com.highpeaksw.assignment;

import java.util.Scanner;

public class Profit 
{
	
	public static int[]  earningsOfOtherEmployees(int[][] jobs) 
	{
		int max=jobs[0][2];
		int sum =0;
		for (int i =0;i<jobs.length;i++) {
			sum+=jobs[i][2];
			if(max<jobs[i][2])
				max=jobs[i][2];
		}
		
		int[] array = new int[2];
		array[0] = jobs.length-1;
		array[1] = sum-max;
		
		return array;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number of Jobs : ");
		int size = sc.nextInt();
		
		int[][] jobs = new int[size][3];
		
		for(int i = 0; i <jobs.length; i++)
		{
			System.out.println("Enter the  " + (i+1) + "  Jobs  start_time, end-time and  Profit :");
			for(int j = 0 ; j <jobs[0].length; j++)
			{
				jobs[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("OutPut :");
		System.out.println();
		int[] result =earningsOfOtherEmployees(jobs);
		
		System.out.println("Number of jobs left are     :   " + result[0]);
		System.out.println("Earnings of other employees :   " + result[1]);
	
	}
}







