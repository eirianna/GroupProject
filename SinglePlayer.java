import java.util.Scanner;
import java.util.ArrayList;

public class SinglePlayer {
    
    ArrayList<ArrayList<String>> QnA = new ArrayList<>();
    
    public static void questions() {
        
        
        if (dif == 1){               /* If the input is 1, the EasyQuestions class is called */
            EasyQuestions.setEasyQuestions();
            QnA = EasyQuestions.randomQuestions();
        } else if (dif == 2){       /* If the input is 2, the EasyQuestions class is called */
            MediumQuestions.setMediumQuestions();
            QnA = MediumQuestions.randomQuestions();
        } else if (dif == 3){       /* If the input is 3, the EasyQuestions class is called */
            HardQuestions.setHardQuestions();
            QnA = HardQuestions.randomQuestions();
        } else {                    /* If the input is 4 , the MixedQuestions class is called */
            QnA = MixedQuestions.randomQuestions();
        }
        int points = 0;
        String answer;
        for (int i=0 ; i<QnA.size ; i++) {
            System.out.println(QnA[i,0]);
            do {
                answer = sc.nextString();
                if (answer<>"1" && answer<>"2" && answer<>"3" && answer<>"4" && answer<>"q"){       /* If answer is not one of these options, the game asks the player asks the player to answer again */
                    System.out.println("Invalid option. Please try again.")
                }
            } while (answer<>"1" && answer<>"2" && answer<>"3" && answer<>"4" && answer<>"q")
            
            if (answer == QnA[i,1]) {
                System.out.println("CORRECT ANSWER!");
                points = points + 100;
            } else if (answer <> QnA[i,1]) {
                System.out.println("WRONG ANSWER...");
            } else {
                System.exit(0);     /* This is the case where the player has chosen q, so the game exits */
            }
        }
        int realPoints = points / QnA.size;     /* realPoints = the real value of total points based on the number of the questions the player has been asked*/
        System.out.println("The game has ended, you gathered %d points!", points);
            if (realPoints <50) {
                System.out.println("You can do better than that!");
            } else if (realPoints <80) {
                System.out.println("You 've done your research!!!");
            } else {    
                System.out.println("Have you ever considered getting a citizenship from Greece?");
            }
        System.out.println("The developers' team thanks you for joining us on this cultural journey.");
        System.out.println("We hope you enjoyed it as much as we did!");
    }
}
