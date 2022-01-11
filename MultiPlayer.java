import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class MultiPlayer {

    public static void questions() {
        
        int dif = Character.getNumericValue(dif1);
        if (dif != 4) {
            String[][] QnA = new String[10][2];
            if (dif == 1){               /* If the input is 1, the EasyQuestions class is called */
                EasyQuestions.setEasyQuestions();
                QnA = EasyQuestions.randomQuestions();
            } else if (dif == 2){       /* If the input is 2, the EasyQuestions class is called */
                MediumQuestions.setMediumQuestions();
                QnA = MediumQuestions.randomQuestions();
            } else {       /* If the input is 3, the EasyQuestions class is called */
                HardQuestions.setHardQuestions();
                QnA = HardQuestions.randomQuestions();
        } else {                    /* If the input is 4 , the MixedQuestions class is called */
            String[][] QnA = new String[20][2];    
            QnA = MixedQuestions.randomQuestions();
        }
        
        int numb = Character.getNumericValue(numb1);
        String answer[] = new String[numb]; 
        
        //array for the sum of the points of each player
        Integer points[][] = new Int[numb][2]; 
        for (int k = 0; k < numb; k++) {
            points[k][0] = k;
            points[k][1] = 0;
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < QnA.size(); i++) {
            System.out.println(QnA.get(i).get(0));
            for (int j = 0; j < numb; j++) {
                do {
                    answer[j] = sc.nextLine();
                    if (answer[j] != "1" && answer[j] != "2" && answer[j] != "3" && answer[j] != "4" && answer[j] != "q") {
                        System.out.println("Invalid option. Please try again.");
                    }
                } while (answer[j] != "1" && answer[j] != "2" && answer[j] != "3" && answer[j] != "4" && answer[j] != "q");

                if (answer[j] != "q") { 
                    if (answer[j] == QnA.get(i).get(1)) {
                    points[j] += 1; //for each correct answer the player earns 1 point
                    }
                    if (j < numb - 1) {
                        System.out.println("Next player");
                    }
                } else {
                    System.exit(0);
                }
            }
            System.out.println("The correct answer is " + QnA.get(i).get(1));
        }
        //Sorting array points in descending order
        // mallon tha prepei na exoume k onomata h player#1 kapoia onomasia se pinaka oste na tin taksinomisoume k aftin kai na einai adistixi
        // me tous pontous oste na ine ksekatharo poios ine o nikitis
        Arrays.sort(points, Collections.reverseOrder());
    }
}
