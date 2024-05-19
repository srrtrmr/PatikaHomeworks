package week4.technicalContent3.AdventureGame;

import java.util.Random;

public class Inventory {
	private boolean water, food, firewood;
	private String wName, aName;
	private int damage, armor;

	Inventory() {
		this.water = false;
		this.food = false;
		this.firewood = false;
		this.damage = 0;
		this.armor = 0;
		this.wName = null;
		this.aName = null;
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isFirewood() {
		return firewood;
	}

	public void setFirewood(boolean firewood) {
		this.firewood = firewood;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void addRandomWeapon() {
		int randWeapon = new Random().nextInt(3);
		switch (randWeapon) {
			case 0:
				setDamage(getDamage() + 3);
				setwName("Kılıç");
				break;
			case 1:
				setDamage(getDamage() + 5);
				setwName("Bıçak");
				break;
			case 2:
				setDamage(getDamage() + 7);
				setwName("Mızrak");
				break;
		}
		System.out.println("Rastgele bir silah buldunuz: " + getwName() + ", Hasar artışı: " + (randWeapon + 1));
	}

	public void addRandomArmor() {
		int randArmor = new Random().nextInt(3);
		switch (randArmor) {
			case 0:
				setArmor(getArmor() + 3);
				setaName("Hafif Zırh");
				break;
			case 1:
				setArmor(getArmor() + 5);
				setaName("Orta Zırh");
				break;
			case 2:
				setArmor(getArmor() + 7);
				setaName("Ağır Zırh");
				break;
		}
		System.out.println("Rastgele bir zırh buldunuz: " + getaName() + ", Zırh artışı: " + (randArmor + 1));
	}
}
