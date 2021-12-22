package org.animals;

public class Lion {
	String color;
	 double weight;
	 int age;
	 public Lion(String color,double weight,int age){
			this.color=color;
			this.weight=weight;
			this.age=age;
			System.out.println("Lion color is : "+color);
			System.out.println("Lion weight is : "+weight);
			System.out.println("Lion age is : "+age);
		}
	public void isVegetarian() {
		System.out.println("Lion is non vegetarian");
	}
	public void canClimb() {
		System.out.println("Lion cannot climb");
	}
	public void sound() {
		System.out.println("Lion makes sound");
	}
}
