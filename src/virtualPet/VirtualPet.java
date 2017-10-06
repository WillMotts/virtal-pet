package virtualPet;

public class VirtualPet {

	private int petHunger;
	private int petBoredom;
	private int petThirst;
	private String petStatus;

	public VirtualPet(int petHunger, int petBoredom, int petThirst, String petStatus) {
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBoredom = petBoredom;
		this.petStatus = petStatus;

	}

	public void feedPet(int feedAmount) {
		petHunger += feedAmount;
	}

	public void playPet(int playAmount) {
		petBoredom += playAmount;
	}

	public void drinkPet(int drinkAmount) {
		petThirst += drinkAmount;
	}

	public int getHunger() {
		return petHunger;
	}

	public int getThirst() {
		return petThirst;
	}
	
	public int getBoredom() {
		return petBoredom;
	}


	

}
