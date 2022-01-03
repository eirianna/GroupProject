import java.util.Scanner;
import java.util.ArrayList;

public class MultiPlayer {

    ArrayList<ArrayList<String>> QnA = new ArrayList<>();

    public static void questions() {


        if (dif == 1) {
            EasyQuestions.setEasyQuestions();
            QnA = EasyQuestions.randomQuestions();
        } else if (dif == 2) {
            MediumQuestions.setMediumQuestions();
            QnA = MediumQuestions.randomQuestions();
        } else if (dif == 3) {
            HardQuestions.setHardQuestions();
            QnA = HardQuestions.randomQuestions();
        } else {
            QnA = MixedQuestions.randomQuestions();
        }
        String answer[] = new String[numb];
        int points[] = new int[numb];
        for (int k = 0; k < numb; k++) {
            points[k] = 0;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(QnA[i, 0]);
            for (int j = 0; j < numb; j++) {
                do {
                    answer[j] = sc.nextString();
                    if (answer[j] <>"1" && answer[j] <>"2" && answer[j] <>"3" && answer[j] <>"4" && answer[j] <>"q"){
                        System.out.println("Invalid option. Please try again.")
                    }
                } while (answer[j] <>"1" && answer[j] <>"2" && answer[j] <>"3" && answer[j] <>"4" && answer[j] <>"q")

                if (answer[j] == QnA[i,1]){
                    System.out.println("CORRECT ANSWER!");
                    //points
                    if (j < numb - 1) {
                        System.out.println("Next player");
                    }
                } else if (answer[j] <>QnA[i, 1]){
                    System.out.println("WRONG ANSWER...");
                    if (j < numb - 1) {
                        System.out.println("Next player");
                    }
                } else{
                    System.exit(0);
                }
            }

        }

    }
