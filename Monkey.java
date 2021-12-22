package org.animals;

public class Monkey {
	String color;
	 double weight;
	 int age;
	 public Monkey(String color,double weight,int age){
			this.color=color;
			this.weight=weight;
			this.age=age;
			System.out.println("Monkey color is : "+color);
			System.out.println("Monkey weight is : "+weight);
			System.out.println("Monkey age is : "+age);
		}
	public void isVegetarian() {
		System.out.println("Monkey is  vegetarian");
	}
	public void canClimb() {
		System.out.println("Monkey can climb");
	}
	public void sound() {
		System.out.println("Monkey makes sound");
	}
}
