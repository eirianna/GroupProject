import java.util.Scanner;

public class Welcome {
    
    public static void message() {
        System.out.println("Welcome to the game!");
    }
    
    static Scanner input = new Scanner(System.in);
    
    public static void players() {
        
        System.out.println("Enter number of players (up to 4): ");
        int numb = input.nextInt();
        while (numb <= 0 || numb>4) {
            System.out.println("Please try again: ");
            numb = input.nextInt();
        }
        
        if (numb==1) {
            SinglePlayer.questions();
        } else {
            MultiPlayer.questions();
        }
    }
    
    public static void level() {
        System.out.print("Choose difficulty level: ");
        System.out.print("1. Easy, 2. Medium, 3. Hard, 4. Mixed");
        dif = input.nextInt();
        while (dif != 1 && dif != 2 && dif != 3 && dif != 4) {
            System.out.print("Please try again: ");
            dif = input.nextInt();
        }
    }
}