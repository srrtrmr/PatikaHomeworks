package week4.technicalContent3.AdventureGame;

import java.util.Scanner;

public class Game {
	private Player player;
	private Scanner scan = new Scanner(System.in);

	public Game() {
		player = new Player("player");
	}

	public void login() {
		System.out.println("Oyunumuza hoş geldiniz.");
		System.out.print("Lütfen bir isim giriniz: ");
		String name = scan.nextLine();
		player.setName(name);
		System.out.println("Sayın " + player.getName() + ", Hoş Geldiniz...");
		player.selectCha();
		start();
	}

	public void start() {
		while (true) {
			playerStats();
			getLocation();
		}
	}

	public void playerStats() {
		System.out.println("Oyuncu Bilgileri: ");
		System.out.println("İsim: " + player.getName());
		System.out.println("Silah: " + player.getInv().getwName());
		System.out.println("Zırh: " + player.getInv().getaName());
		System.out.println("Hasar: " + player.getTotalDamage());
		System.out.println("Sağlık: " + player.getHealthy());
		System.out.println("Para: " + player.getMoney());
	}

	public void getLocation() {
		while (true) {
			System.out.println("Şu an buradasınız: ");
			System.out.println("1. Güvenli Ev");
			System.out.println("2. Mağaza");
			System.out.println("3. Orman");
			System.out.println("4. Nehir");
			System.out.println("5. Maden");
			System.out.print("Lütfen gitmek istediğiniz yeri seçiniz: ");
			int loc = scan.nextInt();
			if (loc == 1) {
				SafeHouse sh = new SafeHouse(player);
				sh.getLocation();
			} else if (loc == 2) {
				ToolStore ts = new ToolStore(player);
				ts.getLocation();
			} else if (loc == 3) {
				Forest fr = new Forest(player);
				fr.getLocation();
			} else if (loc == 4) {
				River r = new River(player);
				r.getLocation();
			} else if (loc == 5) {
				Maden m = new Maden(player);
				m.getLocation();
			} else {
				System.out.println("Geçersiz yer seçimi!");
			}
		}
	}
}
