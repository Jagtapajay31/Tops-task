package com.basic;
/*
 * loop- Write a program to find the factorial value of any number 
entered through the keyboard
 */
public class FactorialNumber {
	public static void main(String[] args) {
		int i,fact=1;  
		  int no=5;    
		  for(i=1;i<=no;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+no+" is: "+fact);    
		 }  
	}