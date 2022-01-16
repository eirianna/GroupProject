import java.util.Scanner;;

public class MultiPlayer {

    public static void questions() {
        String [][] QnA;
        int dif = Character.getNumericValue(DeTrivial.dif1);
        if (dif != 4) {
            QnA = new String[10][2];
            if (dif == 1) {               /* If the input is 1, the EasyQuestions class is called */
                EasyQuestions.setEasyQuestions();
                QnA = EasyQuestions.randomQuestions();
            } else if (dif == 2) {       /* If the input is 2, the MediumQuestions class is called */
                MediumQuestions.setMediumQuestions();
                QnA = MediumQuestions.randomQuestions();
            } else if (dif == 3) {       /* If the input is 3, the HardQuestions class is called */
                HardQuestions.setHardQuestions();
                QnA = HardQuestions.randomQuestions();
            }
        } else {                    /* If the input is 4 , the MixedQuestions class is called */
            QnA = new String[20][2];
            QnA = MixedQuestions.randomQuestions();
        }

        int numb = Character.getNumericValue(DeTrivial.numb1);
        String answer[] = new String[numb];

        //array for the sum of the points of each player
        int points[][] = new int[numb][2];
        for (int k = 0; k < numb; k++) {
            points[k][0] = k;
            points[k][1] = 0;
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < QnA.length; i++) {
            System.out.println(QnA[i][0]);
            for (int j = 0; j < numb; j++) {
                do {
                    answer[j] = sc.nextLine();
                    if (!answer[j].equals( "1") && !answer[j].equals( "2") && !answer[j].equals( "3") && !answer[j].equals( "4") && !answer[j].equals( "q")) {
                        System.out.println("Λάθος επιλογή, παρακαλώ προσπαθείστε ξανά.");
                    }
                } while (!answer[j].equals( "1") && !answer[j].equals( "2") && !answer[j].equals( "3") && !answer[j].equals( "4") && !answer[j].equals( "q"));

                if (!answer[j].equals( "q")) {
                    if (answer[j].equals( QnA[i][1])) {
                        points[j][1] += 100; //for each correct answer the player earns 1 point
                    }
                    if (j < numb - 1) {
                        System.out.println("Επόμενος παίκτης");
                    }
                } else {
                    System.exit(0);
                }
            }
            System.out.println("Η σωστή απάντηση είναι " + QnA[i][1]);
        }
        // sorting array points in descending order
        for (int i = 0; i < ( numb - 1 ); i++) {
            for (int j = 0; j < (numb - i - 1); j++) {
                if (points[0][j] < points[0][j+1]) {
                    for (int k = 0; k<2; k++) {
                        int temp = points[k][j];
                        points[k][j] = points[k][j+1];
                        points[k][j+1] = temp;
                    }
                }
            }
        }

        if (points[0][1] == points[1][1]) {
            FireRound.round(points);
        }
        //o πινακας points ειναι ταξινομημενος εκ νεου με τα καινουρια αποτελεσματα μετα τον γυρο φωτια. 1η στηλη οι παικτες, 2η τα σκορ τους.

        double realPoints[][] = new double[numb][2];
        int place = 1;
        for (int i = 0; i < points.length; i++) {
            realPoints[i][0] = points[i][0];
            realPoints[i][1] = points[i][1] / QnA.length;     /* realPoints = the real value of total points based on the number of the questions the player has been asked*/
            System.out.printf("Παίκτη ", points[i][0], " συγκέντρωσες ", realPoints[i][1], " πόντους και ήρθες στην ",place, " θέση!" );
            if (realPoints[i][1] < 50) {
                System.out.println("Μπορείς να τα πας καλύτερα!");
            } else if (realPoints[i][1] <80) {
                System.out.println("Έχεις κάνει την έρευνα σου!!!");
            } else {
                System.out.println("Μήπως είσαι από την Ελλάδα;");
            }
            if (i<points.length - 1 && realPoints[i][1] != realPoints[i+1][1]) {
                place += 1;
            }
        }
        System.out.println("Η ομάδα προγραμματιστών σε ευχαριστεί που ήσουν μαζί μασ σε αυτό το εκπαιδευτικό ταξίδι.");
        System.out.println("Ελπίζουμε να το απόλαυσες όσο και εμείς!");


    }
}
