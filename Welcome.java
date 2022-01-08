import java.util.Scanner;

public class Welcome {
    
    public static void message() {
        System.out.println("Welcome to the game!");
    }
    
    static Scanner input = new Scanner(System.in);
    
    public static void players() {
        
        int numb = Character.getNumericValue(numb1);        /*We turn the char variable numb1 into an int*/
        System.out.println("Enter number of players (up to 4): ");
        int numb = input.nextInt();     /* The player inputs the number of players */
        while (numb < 1 || numb > 4) {
            System.out.println("Please try again: ");       /* If the player doesn't input a number between 1 and 4, the game asks for the number of players again */
            numb = input.nextInt();
        }
        
        if (numb==1) {      /* If the input is 1, then the SinglePlayer class is called */
            SinglePlayer.questions();
        } else {
            MultiPlayer.questions(); /* If the input isn't 1, then the MultiPlayer class is called */
        }
    }
    
    public static void level() {
        System.out.print("Choose difficulty level: ");
        System.out.print("1. Easy, 2. Medium, 3. Hard, 4. Mixed");
        dif = input.nextInt();      /* The player inputs the difficulty level */ 
        while (dif != 1 && dif != 2 && dif != 3 && dif != 4) {
            System.out.print("Please try again: ");     /* If the player doesn't input a number between 1 and 4, the game asks for the difficulty level again */
            dif = input.nextInt();
        }
    }
}
