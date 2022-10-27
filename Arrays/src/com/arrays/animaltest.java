package com.arrays;

public class animaltest {
	public static void main(String[] args) {
		animal a = new animal();
		dog d = new dog();
		puppy pn = new puppy();
		animal an []= new animal[5];
		an[0]=a;
		an[1]=d;
		an[2]=pn;
		for (animal animal : an) {
			System.out.println(animal);
			
		}
	}

}
