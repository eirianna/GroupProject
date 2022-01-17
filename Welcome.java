import java.util.Scanner;

public class Welcome {

    public static void message() {
        System.out.println("Καλώς ήρθατε στο παιχνίδι!");
    }

    static Scanner input = new Scanner(System.in);

    public static void players() {


        do {
            System.out.println("Εισάγετε αριθμό παικτών (μέχρι 4), ή πατήστε 'q' για να βγείτε: ");
            DeTrivial.numb1 = input.next().charAt(0);     /* The player inputs the number of players */
            if (DeTrivial.numb1 != '1' && DeTrivial.numb1 != '2' && DeTrivial.numb1 != '3'
                    && DeTrivial.numb1 != 4 && DeTrivial.numb1 != 'q') {
                System.out.println("Παρακαλώ προσπαθείστε ξανά!");
            }
        } while (DeTrivial.numb1 != '1' && DeTrivial.numb1 != '2' && DeTrivial.numb1 != '3'
                && DeTrivial.numb1 != '4' && DeTrivial.numb1 != 'q');


        if (DeTrivial.numb1 == 'q') {
            System.exit(0);
        } else if (DeTrivial.numb1 == '1') {      /* If the input is 1, then the SinglePlayer class is called */
            SinglePlayer.questions();
        } else {
            MultiPlayer.questions(); /* If the input isn't 1, then the MultiPlayer class is called */
        }
    }

    public static void level() {
        do {
            System.out.print("Επιλέξτε επίπεδο δυσκολίας, ή πατήστε 'q' για να βγείτε: ");
            System.out.println("1. Εύκολο, 2. Μέτριο, 3. Δύσκολο, 4. Μίξη");
            DeTrivial.dif1 = input.next().charAt(0);      /* The player inputs the difficulty level */
            if (DeTrivial.dif1 != '1' && DeTrivial.dif1 != '2' && DeTrivial.dif1 != '3'
                    && DeTrivial.dif1 != '4' && DeTrivial.dif1 != 'q') {
                System.out.println("Παρακαλώ προσπαθείστε ξανά!");
            }
        } while (DeTrivial.dif1 != '1' && DeTrivial.dif1 != '2' && DeTrivial.dif1 != '3'
                && DeTrivial.dif1 != '4' && DeTrivial.dif1 != 'q');
    }
}
