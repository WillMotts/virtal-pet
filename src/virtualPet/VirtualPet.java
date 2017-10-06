package virtualPet;

public class VirtualPet {

	private int petHunger;
	private int petBoredom;
	private int petThirst;

	public VirtualPet(int petHunger, int petBoredom, int petThirst) {
		this.petHunger = petHunger;
		this.petThirst = petThirst;
		this.petBoredom = petBoredom;

	}

	public void feedPet(int feedAmount) {
		petHunger += feedAmount;
		petThirst -= feedAmount * .1;
	}

	public void playPet(int playAmount) {
		petBoredom += playAmount;
		petHunger -= playAmount * .1;
	}

	public void drinkPet(int drinkAmount) {
		petThirst += drinkAmount;
		petBoredom -= drinkAmount * .1;
	}

	public void doTick(int tickAmount) {
		petThirst -= 1;
		petHunger -= 1;
		petBoredom -= 1;
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
