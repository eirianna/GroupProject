import java.util.Scanner;

public class DeTrivial {
    public static char numb1;    /* numb = number of players who will play the game*/
    public static char dif1;    /*Variable dif indicates the difficulty of the game*/

    public static void main(String[] args) {
        Welcome.message(); /*Prints a welcoming message*/
        System.out.println("Έναρξη παιχνιδιού (πατήστε 1)\n" + "Οδηγίες (πατήστε 2)\n" + "Έξοδος παιχνιδιού (πατήστε 3)");
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            choice = sc.nextInt(); /* The choice of the player */
            if (choice < 1 || choice > 3) {
                System.out.println("Λάθος επιλογή. Παρακαλώ προσπαθείστε ξανά.");
            }
        } while (choice < 1 || choice > 3);


        if (choice == 1) {            /*if choice = 1, the game asks for the difficulty level and the number of players*/
            Welcome.level();
            Welcome.players();
        } else if (choice == 2) {        /*if choice = 2, the game shows its instructions*/
            instructions();
        } else {
            System.exit(0);            /*if choice = 3, the player(s) exits the game*/
        }



    }

    /* The instructions of the game */
    public static void instructions() {
        System.out.println("Το παιχνίδι αποτελείται από ένα σύνολο 60 ερωτήσεων που αφορούν την\n" +
                "ελληνική ιστορία, μυθολογία, γεωγραφία και πολιτισμό. Χωρίζεται σε 4\n" +
                "επίπεδα:εύκολο, μέτριο, δύσκολο και μεικτό στο οποίο υπάρχει διαβάθμιση\n" +
                "ερωτήσεων από εύκολες σε δύσκολες. Το κάθε επίπεδο αποτελείται απο 10 ερωτήσεις\n" +
                "εκτός του μεικτού που αποτελείται από 30. Δίνεται η δυνατότητα στον παίκτη να\n" +
                "να παίξει μόνος του (singleplayer) ή με άλλα άτομα (multiplayer). Σκοπός του\n" +
                "singleplayer είναι να απαντήσει σωστά σε όσες περισσότερες ερωτήσεις μπορεί\n" +
                "ενώ στο multiplayer οι παίκτες δέχονται τις ίδιες ερωτήσεις και όποιος απαντήσει\n" +
                "σωστά στις περισσότερες αναδεικνύεται νικητής. Στο multiplayer, σε περίπτωση\n" +
                "ισοβασθμίας 2 παικτών, θα υπάρξει ένας τελευταίος γύρος 'φωτιά' στον όποιο γίνεται\n" +
                "1 διαφορετική ερώτηση στον καθένα και αυτός που θα απαντήσει σωστά νικάει.");
    }
}
