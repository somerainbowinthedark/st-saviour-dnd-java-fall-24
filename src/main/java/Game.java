import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {

        // Create Scanner for collecting user input.
        Scanner scanner = new Scanner(System.in);
        
        printDramaticText("Come to the moon. Hunt a vault. Be a hero.");

        System.out.println("-----------------------------");
        // Collect character name from user.
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println("Role: ");
        String role = scanner.nextLine();

        Tav player = new Tav(name, role);
        player.printCharacterSheet();

        printDramaticText(player.name + " the " + player.role + " steps foot on Helios and gets greeted by a claptrap.");
    
        int requirement = generateMonster();

        // TODO Implement generateMonster()
        // TODO Collect buffs from user.
        // TODO Implement roll() method for Tav.
        // TODO Print Critical Success & Critical Failure.
        // TODO Check for 3 successful monster encounters.
        // TODO Print GAME OVER or winning message. 
        
    }

    public static int generateMonster() {
        String legion = Character.toString(0x0001F6A8);
        System.out.println(legion + " a Lost Legion Marine appears! " + legion);
        System.out.println("Roll required to beat: 8");
        return(8)
        int m = 8;
        while(m > randomNum);
        System.out.println("Success");
        m++;
        }
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
