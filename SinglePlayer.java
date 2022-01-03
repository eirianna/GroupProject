import java.util.Scanner;
import java.util.ArrayList;

public class SinglePlayer {
    
    ArrayList<ArrayList<String>> QnA = new ArrayList<>();
    
    public static void questions() {
        
        
        if (dif == 1){
            EasyQuestions.setEasyQuestions();
            QnA = EasyQuestions.randomQuestions();
        } else if (dif == 2){
            MediumQuestions.setMediumQuestions();
            QnA = MediumQuestions.randomQuestions();
        } else if (dif == 3){
            HardQuestions.setHardQuestions();
            QnA = HardQuestions.randomQuestions();
        } else {
            QnA = MixedQuestions.randomQuestions();
        }
        
        for (int i=0 ; i<10 ; i++) {
            System.out.println(QnA[i,0]);
            String answer;
            do {
                answer = sc.nextString();
                if (answer<>"1" && answer<>"2" && answer<>"3" && answer<>"4" && answer<>"q"){
                    System.out.println("Invalid option. Please try again.")
                }
            } while (answer<>"1" && answer<>"2" && answer<>"3" && answer<>"4" && answer<>"q")
            
            if (answer == QnA[i,1]) {
                System.out.println("CORRECT ANSWER!");
                //Points
            } else if (answer <> QnA[i,1]) {
                System.out.println("WRONG ANSWER...");
            } else {
                System.exit(0);
            }
        }
        
        
}
