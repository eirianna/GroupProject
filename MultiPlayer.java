import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MultiPlayer {

    ArrayList<ArrayList<String>> QnA = new ArrayList<>();

    public static void questions() {

        int dif = Character.getNumericValue(dif1);
        if (dif == 1) { //if input is 1 then EasyQuestions class is called
            EasyQuestions.setEasyQuestions();
            QnA = EasyQuestions.randomQuestions();
        } else if (dif == 2) { //if input is 2 then MediumQuestions class is called
            MediumQuestions.setMediumQuestions();
            QnA = MediumQuestions.randomQuestions();
        } else if (dif == 3) { //if input is 3 then HardQuestions class is called
            HardQuestions.setHardQuestions();
            QnA = HardQuestions.randomQuestions();
        } else { // //if input is 4 then MixedQuestions class is called
            QnA = MixedQuestions.randomQuestions();
        }
        
        int numb = Character.getNumericValue(numb1);
        String answer[] = new String[numb]; 
        
        //array for the sum of the points of each player
        int points[] = new int[numb]; 
        for (int k = 0; k < numb; k++) {
            points[k] = 0;
        }
        
        for (int i = 0; i < QnA.size; i++) {
            System.out.println(QnA[i, 0]);
            for (int j = 0; j < numb; j++) {
                do {
                    answer[j] = sc.nextString();
                    if (answer[j] <>"1" && answer[j] <>"2" && answer[j] <>"3" && answer[j] <>"4" && answer[j] <>"q"){
                        System.out.println("Invalid option. Please try again.")
                    }
                } while (answer[j] <>"1" && answer[j] <>"2" && answer[j] <>"3" && answer[j] <>"4" && answer[j] <>"q")

                if (answer[j] != "q") { 
                    if (answer[j] == QnA[i,1]){
                    points[j] += 1; //for each correct answer the player earns 1 point
                    }
                    if (j < numb - 1) {
                        System.out.println("Next player");
                    }
                } else{
                    System.exit(0);
                }
            }
            System.out.println("The correct answer is " + QnA[i,1])
        }
        //Sorting array points in descending order
        // mallon tha prepei na exoume k onomata h player#1 kapoia onomasia se pinaka oste na tin taksinomisoume k aftin kai na einai adistixi
        // me tous pontous oste na ine ksekatharo poios ine o nikitis
        Arrays.sort(points, Collections.reverseOrder());
    }
