package org.animals;

public class Tiger {
	String color;
	 double weight;
	 int age;
	 public Tiger(String color,double weight,int age){
			this.color=color;
			this.weight=weight;
			this.age=age;
			System.out.println("Tiger color is : "+color);
			System.out.println("Tiger weight is : "+weight);
			System.out.println("Tiger age is : "+age);
		}
	public void isVegetarian() {
		System.out.println("Tiger is non vegetarian");
	}
	public void canClimb() {
		System.out.println("Tiger cannot climb");
	}
	public void sound() {
		System.out.println("Tiger makes sound");
	}
}
