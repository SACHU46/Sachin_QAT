package com.ntt.Collections;
import java.util.*;
public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String>arr = new ArrayList<>();
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		System.out.println("please enter " + n + " elements");
		for(int i=0;i<n;i++) {
			String el = sc.nextLine();   //next() for reversing a string
			arr.add(el);
		}
      System.out.println("reversing is: ");
      
      for(int i=arr.size()-1;i>=0;i--) {
    	  
    	  System.out.println(arr.get(i));
      }
      
	}

}

OUTPUT:
enter the size of array
3
please enter 3 elements
my name is sachin
im from blore
provide suitable details
reversing is: 
provide suitable details
im from blore
my name is sachin