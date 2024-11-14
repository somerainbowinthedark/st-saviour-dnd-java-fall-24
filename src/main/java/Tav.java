import java.util.Random;

public class Tav {
    public String name;
    public String role;
    public int level;

    public int constitutiton;
    public int strength;
    public int charisma; 
    public int dexterity;
    public int wisdom;
    public int intelligence; 
    
    
    public Tav(String name, String role){
        this.name = name;
        this.role = role;

        this.level = 1;
        int[] stats = new int[]{15, 14, 13, 12, 10, 8};
        shuffle(stats);

        this.strength = stats[0];
        this.charisma = stats[1];
        this.dexterity = stats[2];
        this.constitutiton = stats[3];
        this.intelligence = stats[4];
        this.wisdom = stats[5];
    }

    public void printCharacterSheet(){
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
        System.out.println("Level: " + this.level);
        System.out.println("Strength: " + this.strength);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Constitution: " + this.constitutiton);
        System.out.println("Charisma: " + this.charisma);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("Wisdom: " + this.wisdom);



    }
    // https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
    private void shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            
            // Swap elements
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
