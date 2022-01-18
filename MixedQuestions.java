package gr.aueb.dmst.dds.exercise;

import java.util.Random;

public class MixedQuestions {

    protected static String[][] mixedArray = new String[20][2];
    protected static String [] mixedQE = new String[60];             //includes all the questions of all levels
    protected static String [] mixedAN = new String[60];

    public static String[][] randomQuestions() {

        EasyQuestions.setEasyQuestions();                 //setting every level's questions
        MediumQuestions.setMediumQuestions();
        HardQuestions.setHardQuestions();
        System.arraycopy(EasyQuestions.getEasyQuestions(),0,mixedQE,0,20);
        System.arraycopy(MediumQuestions.getMediumQuestions(),0,mixedQE,20,20);
        System.arraycopy(HardQuestions.getHardQuestions(),0,mixedQE,20,20);


        EasyQuestions.setEasyAnswers();                //same for answers
        MediumQuestions.setMediumAnswers();
        HardQuestions.setHardAnswers();
        System.arraycopy(EasyQuestions.getEasyAnswers(),0,mixedAN,0,20);
        System.arraycopy(MediumQuestions.getMediumAnswers(),0,mixedAN,20,20);
        System.arraycopy(HardQuestions.getHardAnswers(),0,mixedAN,20,20);


        Random randomNumber = new Random();                 //creation of array with the 20 random questions and answers
        int cn;

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
        return mixedArray;
    }
}
