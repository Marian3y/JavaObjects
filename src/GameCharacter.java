public class GameCharacter {
    private int health;
    private int height;
    private String personality;
    private String gender;
    private String name;

    public GameCharacter(String name,String personality,String gender, int health, int height) {
        this.health = health;
        this.height = height;
        this.personality = personality;
        this.gender = gender;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    @Override
    public String toString() {
        return "GameCharacters{" +
                "name='" + name +'\'' +
                ",health='" + health+ '\'' +
                ", personality='" + personality + '\'' +
                '}';
    }

    public static void main(String[] args) {
        GameCharacter char1 = new GameCharacter("Terrible Toad","Ornery","N/A",100,25);
        char1.setHealth(33);
        int health = char1.getHealth();
        System.out.println("health = " + health);
        char1.setPersonality("Ambidextrous");
        System.out.println(char1);
        GameCharacter char2 = new GameCharacter("Arianne","Loud","Female",100,25);
        char2.setHealth(60);
        char2.setPersonality("Exquisite");
        System.out.println(char2);

    }
}
