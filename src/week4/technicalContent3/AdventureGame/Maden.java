package week4.technicalContent3.AdventureGame;

import java.util.Random;

public class Maden extends BattleLoc {
    Maden(Player player) {
        super(player, "Maden", new Snake(), "Ganimet");
    }

    public boolean getLocation() {
        int obsCount = obstacle.count();
        System.out.println("Şu an buradasınız: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsCount + " tane " + obstacle.getName() + " yaşıyor!");
        System.out.print("<S>avaş veya <K>aç :");
        String selCase = scan.nextLine().toUpperCase();
        if (selCase.equals("S")) {
            if (combat(obsCount)) {
                System.out.println(this.getName() + " bölgesindeki tüm düşmanları temizlediniz!");
                int randomChance = new Random().nextInt(100);
                if (randomChance < 15) {
                    System.out.println("Silah Kazandınız!");
                    player.getInv().addRandomWeapon();
                } else if (randomChance < 35) {
                    System.out.println("Zırh Kazandınız!");
                    player.getInv().addRandomArmor();
                } else if (randomChance < 60) {
                    System.out.println("Para Kazandınız!");
                    player.setMoney(player.getMoney() + 10);
                } else if (randomChance < 80) {
                    System.out.println("Para Kazandınız!");
                    player.setMoney(player.getMoney() + 5);
                } else {
                    System.out.println("Hiçbir şey kazanamadınız.");
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
}
