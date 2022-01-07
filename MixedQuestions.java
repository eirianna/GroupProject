import java.util.Random;

public class MixedQuestions {
    
    
    
    public static String randomQuestions() {
        
        String [] mixedQE = new String[60];             //πινακας με ολες τις ερωτησεις
        String [] mixedAN = new String[60];             //πινακας με ολες τις απαντησεις
        
        EasyQuestions.setEasyQuestions;                 //setting ολες τις ερωτησεις
        MediumQuestions.setMediumQuestions;
        HardQuestions.setHardQuestions;
        mixedQE = EasyQuestions.getEasyQuestions;           //getting ολες τις ερωτησεις και βαζουμε στον πινακα 
        mixedQE = MediumQuestions.getMediumQuestions;
        mixedQE = HardQuestions.getHardQuestions;
        
        EasyQuestions.setEasyAnswers;                       //ομοια για απαντησεις
        MediumQuestions.setMediumAnswers;
        HardQuestions.setHardAnswers;
        mixedAN = EasyQuestions.getEasyAnswers;
        mixedAN = MediumQuestions.getMediumAnswers;
        mixedAN = HardQuestions.getHardAnswers;
        
        Random randomNumber = new Random();                 //δημιουργια πίνακα που καλείται από SinglePlayer και MultiPlayer
        int cn;
        String[][] mixedArray = new String[20][2];
        int[] controlArray = new int[60];
        
        for (int i = 0; i < 60; i++) {
            controlArray[i] = -1;
        }
        //η μέθοδος αυτή θα καλείται στην SinglePlayer με την εντολή MixedQuestions.randomQuestions();
        for (int i = 0; i < 20; i++) {
            do {
                cn = randomNumber.nextInt(60); //cn = chosen number [ο αριθμός που έγινε random generated (0-59)]
            } while (controlArray[cn] == cn);

            controlArray[cn] = cn;
            String cq = mixedQE[cn]; //cq = chosen question 
            String ra = mixedAN[cn]; //ra = right answer
            mixedArray[i][0] = cq;
            mixedArray[i][1] = ra;
        }
        return mixedArray[20][2];
    }
}
