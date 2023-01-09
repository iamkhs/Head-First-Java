package chapter_16;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    private final int power;
    private final String type;
    private final String[] weapons;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String[] getWeapons() {
        return weapons;
    }


}
