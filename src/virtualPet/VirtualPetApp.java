package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet(50, 0, 50, 0, 0);

		System.out.println("Hello! Welcome to Virtual Pet simulator!");
		System.out.println("\nWhat will you name your pet?");
		String namePet = input.nextLine();
		if (namePet.equals("tim")) {
			System.out.println("That name sucks...");
		} else {
			System.out.println("That's a great name!");

		}

		String choice;
		System.out.println("\nWhat would you like to do?");
		System.out.println("1: To give food!");
		System.out.println("2: To give water!");
		System.out.println("3: Play with!");
		System.out.println("4: Check pet status!");
		System.out.println("5: To exit...");
		do {
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("You give " + namePet + " food!");
				System.out.println("How much food?");
				int feedAmount = input.nextInt();
				pet.feedPet(feedAmount);
				System.out.println("You gave " + feedAmount + " food!");
				System.out.println("Pet hunger is " + pet.getHunger());
				System.out.println("\nWhat would you like to do?");

			} else if (choice.equals("2")) {
				System.out.println("You give " + namePet + " water!");
				System.out.println("How much water?");
				int drinkAmount = input.nextInt();
				pet.drinkPet(drinkAmount);
				System.out.println("You gave " + drinkAmount + " water!");
				System.out.println("Pet thirst is " + pet.getThirst());
				System.out.println("\nWhat would you like to do?");

			} else if (choice.equals("3")) {
				System.out.println("You play with " + namePet + "!");
				System.out.println("How long do you play with " + namePet + "?");
				int playAmount = input.nextInt();
				pet.playPet(playAmount);
				System.out.println("You play with " + namePet + " for " + playAmount + " minutes!");
				System.out.println("Your pet boredom is " + pet.getBoredom());
				System.out.println("\nWhat would you like to do?");

			} else if (choice.equals("4")) {
				System.out.println("Pet boredom is "+pet.getBoredom());
				System.out.println("Pet thirst is "+pet.getThirst());
				System.out.println("Pet hunger is "+pet.getHunger());
				System.out.println("\nWhat would you like to do?");
				

			}

			pet.doTick(1);
			
		} while (!choice.equals("5"));
		System.out.println(namePet + " says: 'You're no fun!'");

	}
}
