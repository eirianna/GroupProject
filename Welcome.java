import java.util.Scanner;

public class Welcome {

    public static void message() {
        System.out.println("Καλώς ήρθατε στο παιχνίδι!");
    }

    static Scanner input = new Scanner(System.in);

    public static void players() {


        System.out.println("Εισάγετε αριθμό παικτών (μέχρι 4), ή πατήστε 'q' για να βγείτε: ");
        do {
            System.out.println("Εισάγετε αριθμό παικτών (μέχρι 4), ή πατήστε 'q' για να βγείτε: ");
            numb1 = input.next().charAt(0);     /* The player inputs the number of players */
            if (numb1 != '1' && numb1 != '2' && numb1 != '3' && numb1 != 4 && numb1 != 'q') {
                System.out.println("Παρακαλώ προσπαθείστε ξανά!");
            }
        } while (numb1 != '1' && numb1 != '2' && numb1 != '3' && numb1 != 4 && numb1 != 'q');


        if (numb1 == 'q') {
            System.exit(0);
        } else if (numb1 == 1) {      /* If the input is 1, then the SinglePlayer class is called */
            SinglePlayer.questions();
        } else {
            MultiPlayer.questions(); /* If the input isn't 1, then the MultiPlayer class is called */
        }
    }

    public static void level() {
        do {
            System.out.print("Επιλέξτε επίπεδο δυσκολίας, ή πατήστε 'q' για να βγείτε: ");
            System.out.print("1. Εύκολο, 2. Μέτριο, 3. Δύσκολο, 4. Μίξη");
            dif1 = input.next().charAt(0);      /* The player inputs the difficulty level */
            if (dif1 != '1' && dif1 != '2' && dif1 != '3' && dif1 != 4 && dif1 != 'q') {
                System.out.println("Παρακαλώ προσπαθείστε ξανά!");
            }
        } while (dif1 != '1' && dif1 != '2' && dif1 != '3' && dif1 != 4 && dif1 != 'q');
    }
}
