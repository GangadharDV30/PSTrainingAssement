package com.rocky.program;

public class NumberOfObjects {
	
	static int noOfObjects;
	
	
	public NumberOfObjects() {
		noOfObjects+=1;
	}
	
	public static void main(String[] args) {
		NumberOfObjects ob1=new NumberOfObjects();
		NumberOfObjects ob2=new NumberOfObjects();
		System.out.println(" number of objects is :"+NumberOfObjects.noOfObjects);
	}
	

}
