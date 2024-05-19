package week4.technicalContent3.AdventureGame;

import java.util.Random;

public class Snake extends Obstacle {

    public Snake() {
        super("Yılan", 3 + new Random().nextInt(4), 12, 0, 5);
    }

    @Override
    public int getAward() {
        Random random = new Random();
        int chance = random.nextInt(100);
        if (chance < 15)
            return 10;
        else if (chance < 35)
            return 5;
        else if (chance < 60)
            return 1;
        else
            return 0;
    }
}