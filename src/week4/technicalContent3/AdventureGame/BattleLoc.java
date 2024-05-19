package week4.technicalContent3.AdventureGame;

public abstract class BattleLoc extends Location {
	protected Obstacle obstacle;
	protected String award;

	BattleLoc(Player player, String name, Obstacle obstacle, String award) {
		super(player);
		this.obstacle = obstacle;
		this.name = name;
		this.award = award;
	}

	public boolean getLocation() {
		int obsCount = obstacle.count();
		System.out.println("Şu an buradasınız: " + this.getName());
		System.out.println("Dikkatli ol! Burada " + obsCount + " tane " + obstacle.getName() + " yaşıyor!");
		System.out.print("<S>avaş veya <K>aç: ");
		String selCase = scan.nextLine().toUpperCase();
		if (selCase.equals("S")) {
			if (combat(obsCount)) {
				System.out.println(this.getName() + " bölgesindeki tüm düşmanları temizlediniz!");
				if (this.award.equals("Food") && player.getInv().isFood() == false) {
					System.out.println(this.award + " Kazandınız!");
					player.getInv().setFood(true);
				} else if (this.award.equals("Water") && player.getInv().isWater() == false) {
					System.out.println(this.award + " Kazandınız!");
					player.getInv().setWater(true);
				} else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
					System.out.println(this.award + " Kazandınız!");
					player.getInv().setFirewood(true);
				}
				return true;
			}

			if (player.getHealthy() <= 0) {
				System.out.println("Öldünüz!");
				return false;
			}
		}
		return true;
	}

	public boolean combat(int obsCount) {
		for (int i = 0; i < obsCount; i++) {
			int defObsHealth = obstacle.getHealth();
			playerStats();
			enemyStats();
			while (player.getHealthy() > 0 && obstacle.getHealth() > 0) {
				System.out.print("<V>ur veya <K>aç: ");
				String selCase = scan.nextLine().toUpperCase();
				if (selCase.equals("V")) {
					System.out.println("Siz vurdunuz!");
					obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
					afterHit();
					if (obstacle.getHealth() > 0) {
						System.out.println();
						System.out.println("Canavar size vurdu!");
						player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInv().getArmor()));
						afterHit();
					}
				} else {
					return false;
				}
			}

			if (obstacle.getHealth() < 1) {
				player.setMoney(player.getMoney() + obstacle.getAward());
			} else if (player.getHealthy() < 1) {
				return false;
			}
		}

		return true;
	}

	public void playerStats() {
		System.out.println("Oyuncu Durumu");
		System.out.println("Sağlık: " + player.getHealthy());
		System.out.println("Hasar: " + player.getTotalDamage());
		System.out.println("Para: " + player.getMoney());
	}

	public void enemyStats() {
		System.out.println("Düşman Durumu");
		System.out.println("Sağlık: " + obstacle.getHealth());
		System.out.println("Hasar: " + obstacle.getDamage());
	}

	public void afterHit() {
		System.out.println("Oyuncu Sağlık: " + player.getHealthy() + " , Düşman Sağlık: " + obstacle.getHealth());
	}
}