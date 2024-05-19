package week4.technicalContent3.AdventureGame;

public abstract class NormalLoc extends Location {
	NormalLoc(Player player, String name) {
		super(player);
		this.name = name;
	}

	public boolean getLocation() {
		return true;
	}
}