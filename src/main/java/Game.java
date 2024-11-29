import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);
        
        printDramaticText("Come to the moon. Hunt a vault. Be a hero.");

        System.out.println("--------------------------------------------");
        // Collect character name from user.
        System.out.print("Name: ");
        String name = scanner.nextLine();

        String[] roles = new String[]{"gladiator", "enforcer", "lawbringer", "mistake", "baroness", "doppelganger"};
        System.out.println("Choose a Character: Gladiator  Enforcer  Lawbringer Mistake Baroness or Doppelganger");

        System.out.print("Character: ");
        String role = scanner.nextLine();
        while(!Arrays.asList(roles).contains(role.toLowerCase())) {
            System.out.println("'You're not funny just enter a friggin' character type already': ");
           role = scanner.nextLine();
           while(!Arrays.asList(roles).contains(role.toLowerCase())) {
            System.out.println("'Are you stupid? Cut it out already' ");
           role = scanner.nextLine();
           while(!Arrays.asList(roles).contains(role.toLowerCase())) {
            System.out.println("'Remind me why I hired you again?' ");
           role = scanner.nextLine();
       }
       }
       }
        
        Tav player = new Tav(name, role);
        player.printCharacterSheet();

        printDramaticText(player.name + " the " + player.role + " steps foot on Helios.");
        printDramaticText("'Hey, You the vault hunter I hired?...Lost legion?! Son of a ********'");
        System.out.println(generateMonster()); 
        int HP1 = (int)(Math.random() *18);
        printDramaticText("You need higher than a " + HP1);
        System.out.println("Press 's' to use a general skill point or if you're a doppelganger press 'j' for inspired: ");
        String buff = scanner.nextLine();
        int result = 0;

        if (buff.equals("s")) {
            result = skilltree() + rolld20();
            Ascii.drawD20(result);
            System.out.println(skilltree());
        } else if (buff.equals("j") && player.role.equals("doppelganger")) {
            result = inspired() + rolld20();
            System.out.println(inspired());
            Ascii.drawD20(result);
        } else {
            result = rolld20();
            Ascii.drawD20(result);
        }
        if(result < HP1){
            printDramaticText("'Frankly I thought you were better than this.' GAME OVER");
        } else {
        printDramaticText("'Look, the Lost Legion attacked Helios Station right after I sent for you guys. You gotta drive them off.'");
        System.out.println(generateMonster());
        int HP2 = (int)(Math.random() *18);
        printDramaticText("You need higher than a " + HP2);
        System.out.println("Press 's' to use a general skill point or if you're a doppelganger press 'j' for inspired: ");
        String buff2 = scanner.nextLine();
        int result2 = 0;

        if (buff2.equals("s")) {
            result2 = skilltree() + rolld20();
            Ascii.drawD20(result2);
            System.out.println(skilltree());
        } else if (buff2.equals("j") && player.role.equals("doppelganger")) {
            result2 = inspired() + rolld20();
            Ascii.drawD20(result2);
            System.out.println(inspired());
        } else {
            result2 = rolld20();
            Ascii.drawD20(result2);
        }
        if(result2 < HP2){
            printDramaticText("'Frankly I thought you were better than this.' GAME OVER");
        }
        if(result >= generateMonster())
        printDramaticText("'Hey! Head to the hub of heroism for me, Vault hunter, we can probably stop them there!'");
        }
        System.out.println(generateMonster());
        int HP3 = (int)(Math.random() *18);
        printDramaticText("You need higher than a " + HP3);
        System.out.println("Press 's' to use a general skill point or if you're a doppelganger press 'j' for inspired: ");
        String buff3 = scanner.nextLine();
        int result3 = 0;

        if (buff3.equals("s")) {
            result3 = skilltree() + rolld20();
            Ascii.drawD20(rolld20());
            System.out.println(skilltree());
        } else if (buff3.equals("j") && player.role.equals("doppelganger")) {
            result3 = inspired() + rolld20();
            Ascii.drawD20(result3);
            System.out.println(inspired());
        } else {
            result3 = rolld20();
            Ascii.drawD20(result3);
        }
        if(result3 < HP3){
            printDramaticText("'Frankly I thought you were better than this.' GAME OVER");
        } else {
            printDramaticText("Holy crap! You actually did it, vault hunter! Congratulations!");
    }
}


    public static int skilltree() {
        int skill = (int)(Math.random() * 4) + 1; 
        Ascii.drawD4(skill);
        return skill;
    }

    public static int inspired() {
    int inspire = (int)(Math.random() * 7);
    Ascii.drawD6(inspire);
    return inspire;
    }

    public static int generateMonster() {
        String alarm = Character.toString(0x0001F6A8);
        int legion = (int)(Math.random() * 11);
        if (legion < 5) {
            System.out.println(alarm + " a Lost Legion Marine appears! " + alarm);
        } else if (legion == 5) {
            System.out.println(alarm + " a Lost Legion Sergeant appears! " + alarm);
        } else {
            System.out.println(alarm + " 'son of a...Zarpedon already?!' " + alarm);
        }
        return legion;
    }

    public static int rolld20() {
        int roll = (int)(Math.random() * 20) + 1;
        if (roll == 1) {
            System.out.println("Critical fail");
        } else if (roll == 20) {
            System.out.println("Critical success");
        }
        return roll;
    }

    public static int rollD4() {
        int roll = (int)(Math.random() * 4) + 1;
        return roll;
    }


        
       
    public static void printDramaticText(String text) {
        // Delay in milliseconds
        int delay = 100;

        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}
    
