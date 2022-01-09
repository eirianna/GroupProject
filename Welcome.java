import java.util.Scanner;

public class Welcome {
    
    public static void message() {
        System.out.println("Welcome to the game!");
    }
    
    static Scanner input = new Scanner(System.in);
    
    public static void players() {
        
        
        System.out.println("Enter number of players (up to 4), or press 'q' to quit: ");
       do {
           System.out.println("Enter number of players (up to 4), or press 'q' to quit: ");
            numb1 = input.nextChar();     /* The player inputs the number of players */
           if (numb1 != '1' AND numb1 != '2' AND numb1 != '3' AND numb1 != 4 AND numb1 != 'q') {
               System.out.println("Please try again!");
           }
        } while (numb1 != '1' AND numb1 != '2' AND numb1 != '3' AND numb1 != 4 AND numb1 != 'q');
                
        
        if (numb1 == 'q') {
            System.exit(0);
        } else if (numb==1) {      /* If the input is 1, then the SinglePlayer class is called */
            SinglePlayer.questions();
        } else {
            MultiPlayer.questions(); /* If the input isn't 1, then the MultiPlayer class is called */
        }
    }
    
    public static void level() {
        do {
            System.out.print("Choose difficulty level, or press 'q' to quit: ");
            System.out.print("1. Easy, 2. Medium, 3. Hard, 4. Mixed");
            dif1 = input.nextChar();      /* The player inputs the difficulty level */
            if (dif1 != '1' AND dif1 != '2' AND dif1 != '3' AND dif1 != 4 AND dif1 != 'q') {
                System.out.println("Please try again!");
            }
        } while (dif1 != '1' AND dif1 != '2' AND dif1 != '3' AND dif1 != 4 AND dif1 != 'q');
   }
}
