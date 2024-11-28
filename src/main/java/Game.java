import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
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
            System.out.println("You're not funny just enter a friggin' character type already: ");
           role = scanner.nextLine();
           while(!Arrays.asList(roles).contains(role.toLowerCase())) {
            System.out.println("Are you stupid? Cut it out already ");
           role = scanner.nextLine();
           while(!Arrays.asList(roles).contains(role.toLowerCase())) {
            System.out.println("Remind me why I hired you again? ");
           role = scanner.nextLine();
       }
       }
       }
        
        Tav player = new Tav(name, role);
        player.printCharacterSheet();

        printDramaticText(player.name + " the " + player.role + " steps foot on Helios and gets greeted by a claptrap.");
        System.out.println(generateMonster());        
        public static int generateMonster() {
                    String alarm = Character.toString(0x0001F6A8);
                    int legion =(int)(Math.random() * 11);
                    if (legion <= 5){ 
                        System.out.println(alarm + " a Lost Legion Marine appears! " + alarm);
                        System.out.println("Roll required to beat: 6");
                    }
                    if (legion == 5){ 
                        System.out.println(alarm + " a Lost Legion Sergent appears! " + alarm);
                        System.out.println("Roll required to beat: 12");
                    }
                    if (legion >= 5){ 
                        System.out.println(alarm + " zarpy " + alarm);
                        System.out.println("Roll required to beat: 12");
                    }
                    return legion;
                }
                // TODO Collect buffs from user.
                // TODO Check for 3 successful monster encounters.
                // TODO Print GAME OVER or winning message. 
        
        
                //public static int rolld20() {
        //int roll = (int)(Math.random() * 20) + 1;
        //Ascii.drawD20(roll);
        //if (roll == 1){
            //System.out.println("critical fail");
        //}
        //if (roll == 20){
            //System.out.println("critical success");
        //}
        //Ascii.drawD20(roll);
       //}
       // System.out.println(legion + " a Lost Legion Sergent appears! " + legion);
        //System.out.println("Roll required to beat: 14");
        //return 12;



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
