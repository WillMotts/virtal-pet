package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet account = new VirtualPet();

		System.out.println("Hello! Welcome to Virtual Pet simulator!");
		System.out.println("\nWhat will you name your pet?");
		String namePet = input.nextLine();
		if (namePet.equals("tim")) {
			System.out.println("That name sucks...");
		} else {
			System.out.println("That's a great name!");

		}
		
		String choice;
		do {
			System.out.println("\nWhat would you like to do?");
			System.out.println("1: To give food!");
			System.out.println("2: To give water!");
			System.out.println("3: Play with!");
			System.out.println("4: Check pet status!");
			System.out.println("5: To exit...");
			choice = input.nextLine();
			
			if(choice.equals("1")){
				System.out.println("You give "+namePet+" food!");
			}
					

	}while(!choice.equals("5"));
		System.out.println(namePet+" says: 'You're no fun!'");
}
}
