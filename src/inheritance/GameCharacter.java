package inheritance;

import java.util.ArrayList;


public class GameCharacter {
    private String name;
    private int health;
    private int power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", power=" + power +
                '}';
    }

    public GameCharacter(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public static void main(String[] args) {
     Monster x1 = new Monster("Aarrg", 90, 75);
        Monster x2 = new Monster("Aarrg", 50, 25);
        Monster x3 = new Monster("Aarrg", 30, 33);
        Wizard w1 = new Wizard("Gandalf",100,100,74);
        System.out.println("w1= "+w1);
        System.out.println("x1= "+x1);
    }
}

class Wizard extends GameCharacter {
    private float mana;
    private ArrayList<String> spells;

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    public ArrayList<String> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<String> spells) {
        this.spells = spells;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", spells=" + spells +
                "} " + super.toString();
    }

    public Wizard(String name, int health, int power, float mana) {
        super(name, health, power);
        this.mana = mana;
        spells = new ArrayList<>();
    }
}

class Monster extends GameCharacter {
    private ArrayList<String> curses;

    public ArrayList<String> getCurses() {
        return curses;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "curses=" + curses +
                "} " + super.toString();
    }

    public Monster(String name, int health, int power) {
        super(name, health, power);
        curses = new ArrayList<>();
    }
}
