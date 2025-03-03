
package com.mycompany.account;

import java.util.*;
 public class usser
 {
     public static void main(String args[])
	{		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your Account type: ");
		System.out.println("1. Current");
		System.out.println("2. Saving");
		System.out.println("3. R.D");
		int option=sc.nextInt();		
		switch (option)
		{
			case 1: 
				current cu=new current();
				cu.cur();
				break;

			case 2:
				saving sa=new saving();
				sa.save();
				break;

			case 3: 
				rd op=new rd();
				op.rdj();
			default:
				System.out.println("Wrong Choice!");

		}
		sc.close();		
	}
 }
