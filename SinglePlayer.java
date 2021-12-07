import java.util.Scanner;

public class SinglePlayer {
    
    public static void Questions {
        
        
        if (dif == 1){
            Easy.setEasy();
            Easy.randomQuestions();
        } else if (dif == 2){
            Medium.setMedium();
            Medium.randomQuestions();
        } else if (dif == 3){
            Hard.setHard();
            Hard.randomQuestions();
        } else {
            Mixed.randomQuestions();
        }
        
        for (i=0 ; i<10 ; i++) {
            System.out.println(A[i,0]);
            String answer;
            do {
                answer = sc.nextString();
                if (answer<>"1" && answer<>"2" && answer<>"3" && answer<>"4" && answer<>"q"){
                    System.out.println("Invalid option. Please try again.")
                }
            } while (answer<>"1" && answer<>"2" && answer<>"3" && answer<>"4" && answer<>"q")
            
            if (answer == A[i,1]) {
                System.out.println("CORRECT ANSWER!");
                //Points
            } else if (answer <> A[i,1]) {
                System.out.println("WRONG ANSWER...");
            } else {
                System.exit(0);
            }
        }
        
        
}
