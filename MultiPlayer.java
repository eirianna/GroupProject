import java.util.Scanner;
import java.util.Arrays;

public class MultiPlayer {

    public static void questions() {

        int dif = Character.getNumericValue(DeTrivial.dif1);
        if (dif != 4) {
            String[][] QnA = new String[10][2];
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
            String[][] QnA = new String[20][2];
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
                    if (answer[j] != "1" && answer[j] != "2" && answer[j] != "3" && answer[j] != "4" && answer[j] != "q") {
                        System.out.println("Invalid option. Please try again.");
                    }
                } while (answer[j] != "1" && answer[j] != "2" && answer[j] != "3" && answer[j] != "4" && answer[j] != "q");

                if (answer[j] != "q") {
                    if (answer[j] == QnA[i][1]) {
                        points[j][1] += 100; //for each correct answer the player earns 1 point
                    }
                    if (j < numb - 1) {
                        System.out.println("Επόμενος παίκτης");
                    }
                } else {
                    System.exit(0);
                }
            }
            System.out.println("Η σωστή απάντηση είναι : " + QnA[i][1]);
        }
        Arrays.sort(points, new Comparator<int[]>() {      //Sorting array points in descending order
            public int compare(int[][] points) {
                if (players[col] > points[col] {
                    return 1;
                } else{
                    return -1
                }
            }
        });

        if (points[0][1] == points[1][1]) {
            FireRound.round(points);
        }
        //o πινακας points ειναι ταξινομημενος εκ νεου με τα καινουρια αποτελεσματα μετα τον γυρο φωτια. 1η στηλη οι παικτες, 2η τα σκορ τους.

        double realPoints[][] = new double[numb][2];
        int place = 1;
        for (int i = 0; i < points.length; i++) {
            realPoints[i][0] = points[i][0];
            realPoints[i][1] = points[i][1] / QnA.length;     /* realPoints = the real value of total points based on the number of the questions the player has been asked*/
            System.out.println("Παίκτη ", points[i][0], " συγκέντρωσες ", realPoints[i][1], " πόντους και ήρθες στην ",place, " θέση!" );
            if (realPoints < 50) {
                System.out.println("Μπορείς να τα πας καλύτερα!");
            } else if (realPoints < 80) {
                System.out.println("Έκανες την έρευνά σου!!!");
            } else {
                System.out.println("Μήπως έχεις μεγαλώσει στην Ελλάδα;");
            }
            if (i<points.length - 1 && realPoints[i][1] != realPoints[i+1][1]) {
                place += 1;
            }
        }
        System.out.println("Η ομάδα προγραμματιστών σας ευχαριστεί που συμμετείχατε σε αυτό το εκπαιδευτικό παιχνίδι.");
        System.out.println("Ελπίζουμε να το απολαύσατε όπως εμείς!");


    }
}
