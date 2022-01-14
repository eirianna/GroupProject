import java.util.Scanner;

public class SinglePlayer {

    public static void questions() {

        int dif = Character.getNumericValue(DeTrivial.dif1);
        if (dif != 4) {
            String[][] QnA = new String[10][2];
            if (dif == 1) {               /* If the input is 1, the EasyQuestions class is called */
                EasyQuestions.setEasyQuestions();
                QnA = EasyQuestions.randomQuestions();
            } else if (dif == 2) {       /* If the input is 2, the EasyQuestions class is called */
                MediumQuestions.setMediumQuestions();
                QnA = MediumQuestions.randomQuestions();
            } else if (dif == 3) {       /* If the input is 3, the EasyQuestions class is called */
                HardQuestions.setHardQuestions();
                QnA = HardQuestions.randomQuestions();
            }
        } else {                    /* If the input is 4 , the MixedQuestions class is called */
            String[][] QnA = new String[20][2];
            QnA = MixedQuestions.randomQuestions();
        }
        int points = 0;
        String answer;
        for (int i = 0; i < QnA.length; i++) {
            System.out.println(QnA[i, 0]);
            do {
                answer = sc.nextString();
                if (answer != "1" && answer != "2" && answer != "3" && answer != "4" && answer != "q") {       /* If answer is not one of these options, the game asks the player asks the player to answer again */
                    System.out.println("Λάθος επιλογή. Παρακαλώ προσπαθείστε ξανά.")
                }
            } while (answer != "1" && answer != "2" && answer != "3" && answer != "4" && answer != "q")

            if (answer == "q") {
                System.exit(0);     /* This is the case where the player has chosen q, so the game exits */
            } else if (answer == QnA[i][1]) {
                System.out.println("ΣΩΣΤΉ ΑΠΆΝΤΗΣΗ!");
                points = points + 100;
            } else {
                System.out.println("ΛΆΘΟΣ ΑΠΆΝΤΗΣΗ...");
            }
        }
        int realPoints = points / QnA.length;     /* realPoints = the real value of total points based on the number of the questions the player has been asked*/
        System.out.printf("Το παιχνίδι τελείωσε, συγκέντρωσες %d πόντους!", points);
        if (realPoints < 50) {
            System.out.println("Μπορείς να τα πας καλύτερα!");
        } else if (realPoints < 80) {
            System.out.println("Έχεις κάνει την έρευνα σου!!!");
        } else {
            System.out.println("Μήπως είσαι από την Ελλάδα;");
        }
        System.out.println("Η ομάδα προγραμματιστών σε ευχαριστεί που ήσουν μαζί μασ σε αυτό το εκπαιδευτικό ταξίδι.");
        System.out.println("Ελπίζουμε να το απόλαυσες όσο και εμείς!");
    }
}
