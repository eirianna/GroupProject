import java.util.Scanner;

public class Welcome {
    
    public static void message() {
        System.out.println("Welcome to the game!");
    }
    
    static Scanner input = new Scanner(System.in);
    
    public static void players() {
        
        
        System.out.println("Enter number of players (up to 4), or press 'q' to quit: ");
        numb1 = input.nextChar();     /* The player inputs the number of players */
        if (numb1 == 'q') {
            System.exit(0);
        } else {
            int numb = Character.getNumericValue(numb1);        /*We turn the char variable numb1 into an int*/
            while (numb < 1 || numb > 4) {
                System.out.println("Please try again: ");       /* If the player doesn't input a number between 1 and 4, the game asks for the number of players again */
                numb = input.nextInt();
            }
            numb1 = (char)numb;
        }
        
        if (numb==1) {      /* If the input is 1, then the SinglePlayer class is called */
            SinglePlayer.questions();
        } else {
            MultiPlayer.questions(); /* If the input isn't 1, then the MultiPlayer class is called */
        }
    }
    
    public static void level() {
        System.out.print("Choose difficulty level, or press 'q' to quit: ");
        System.out.print("1. Easy, 2. Medium, 3. Hard, 4. Mixed");
        dif1 = input.nextChar();      /* The player inputs the difficulty level */
        if (dif1 == 'q') {
            System.exit(0);
        } else {
            int dif = Character.getNumericValue(dif1);        /*We turn the char variable dif1 into an int*/
            while (dif != 1 && dif != 2 && dif != 3 && dif != 4) {
                System.out.print("Please try again: ");     /* If the player doesn't input a number between 1 and 4, the game asks for the difficulty level again */
                dif = input.nextInt();
            }
            dif1 = (char)dif;
        }
    }
}
