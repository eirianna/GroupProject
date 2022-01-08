import java.util.Random;

public class EasyQuestions {
    private static String[] easyQuestions = new String[20];
    private static String[] easyAnswers = new String[20];
    public static String[] getEasyQuestions() {
        return easyQuestions;
    }
    public static void setEasyQuestions() {
        easyQuestions[0] = "Το ποίημα με τίτλο “Ύμνος εις την Ελευθερίαν” που αποτελεί τον εθνικό ύμνο της Ελλάδας" +
        " μελοποιήθηκε από τον:\n" +
        "1. Διονύσιο Σολωμό\n" +
        "2. Μάνο Χατζιδάκι\n" +
        "3. Νικόλαο Μάντζαρο\n" +
        "4. Μίκη Θεοδωράκη\n";
        easyQuestions[1] = "Ο Νίκος Καζαντζάκης φοίτησε στη(ν):\n" +
        "1. Ιατρική σχολή\n" +
        "2. Φιλοσοφική σχολή\n" +
        "3. Σχολή καλών τεχνών\n" +
        "4. Νομική σχολή\n";
        easyQuestions[2] = "Το βιβλίο “Τα μυστικά του βάλτου” έχει γράψει η:\n" +
        "1. Άλκη Ζέη\n" +
        "2. Πηνελόπη Δέλτα\n" +
        "3. Ζωρζ Σαρή\n" +
        "4. Διδώ Σωτηρίου\n";
        easyQuestions[3] = "Πόσα παιδιά έχει ο Καραγκιόζης;\n" +
        "1. 2\n" +
        "2. 3\n" +
        "3. 4\n" +
        "4. 5\n";
        easyQuestions[4] = "Ποιά ταινία χάρισε στη Μελίνα Μερκούρη το βραβείο" +
        " α’ γυναικείου ρόλου στο φεστιβάλ των Καννών το 1960;\n" +
        "1. Στέλλα\n" +
        "2. Ο Χριστός ξανασταυρώνεται\n" +
        "3. Ποτέ την Κυριακή\n" +
        "4. Φαίδρα\n";
        easyQuestions[5] = "Η εξέγερση του Πολυτεχνείου έλαβε χώρα τον:\n" +
        "1. Νοέμβριο του 1975\n" +
        "2. Νοέμβριο του 1972\n" +
        "3. Νοέμβριο του 1974\n" +
        "4. Νοέμβριο του 1973\n";
        easyQuestions[6]=" Ο εμφύλιος πόλεμος ξεκίνησε αμέσως μετά τον:\n" +
        "1. Α’ Βαλκανικό πόλεμο\n" +
        "2. Β’ Βαλκανικό πόλεμο\n" +
        "3. Α’ Παγκόσμιο πόλεμο\n" +
        "4. Β’ Παγκόσμιο πόλεμο\n";
        easyQuestions[7]="Ποιος ήταν ο πρώτος βασιλιάς της Ελλάδας;\n" +
        "1. Ο Όθωνας \n" +
        "2. Ο Γεώργιος \n" +
        "3. Ο Κωνσταντίνος\n" +
        "4. Ο Αλέξανδρος\n";
        easyQuestions[8]="Ποιοι νίκησαν στον Πελοποννησιακό πόλεμο;\n" +
        "1. Οι Σπαρτιάτες\n" +
        "2. Οι Αθηναίοι\n" +
        "3. Οι Θηβαίοι\n" +
        "4. Οι Μακεδόνες\n";
        easyQuestions[9]="Ποιος πήγε την πρωτεύουσα από την Ρώμη στην Κωνσταντινούπολη;\n" +
        "1. Ο Κωνσταντίνος\n" +
        "2. Ο Θεοδόσιος \n" +
        "3. Ο Ιουστινιανός\n" +
        "4. Ο Λικίνιος\n";
        easyQuestions[10]="Ποιος σκότωσε τον Μινωταυρο;\n" +
        "1. Ο Περσέας \n" +
        "2. Ο Ηρακλής\n" +
        "3. Ο Μίνωας\n" +
        "4. Ο Θησέας\n";
        easyQuestions[11]="Ποιος/α γεννήθηκε αναδυόμενος/η από το κεφάλι του Δία;\n" +
        "1. Η Αθηνά\n" +
        "2. Ο Άρης\n" +
        "3. Ο Ήφαιστος\n" +
        "4. Ο Ερμής\n";
        easyQuestions[12]="Ποιος πέταξε υπερβολικά κοντά στον ήλιο με φτερά φτιαγμένα από πούπουλα και κερί;\n" +
        "1. Ο Περικλής\n" +
        "2. Ο Αιγέας\n" +
        "3. Ο Δαίδαλος\n" +
        "4. Ο Ίκαρος\n";
        easyQuestions[13]="Ποιον βάπτισε η μητέρα του στα ύδατα της Στύγος" +
        " όταν ήταν βρέφος και τον κρατούσε από τη φτέρνα;\n" +
        "1. Τον Διομήδη\n" +
        "2. Τον Αία\n" +
        "3. Τον Οδυσσέα\n" +
        "4. Τον Αχιλλέα\n";
        easyQuestions[14]="Ποια θεά ήταν υποχρεωμένη να περνάει τον μισό χρόνο στον υπόκοσμο" +
        " διότι ο Άδης την ξεγέλασε να φάει σπόρια ροδιού;\n" +
        "1. Η Καλλιόπη\n" +
        "2. Η Δήμητρα\n" +
        "3. Η Περσεφόνη\n" +
        "4. Η Αφροδίτη\n";
        easyQuestions[15]=" Ποια είναι η μεγαλύτερη φυσική λίμνη της Ελλάδας;\n" +
        "1. H Τριχωνίδα\n" +
        "2. H Βιστωνίδα\n" +
        "3. H Μεγάλη Πρέσπα\n" +
        "4. H Κρεμαστών\n";
        easyQuestions[16]="Πόσους νομούς έχει η Κρήτη;\n" +
        "1. 2\n" +
        "2. 5\n" +
        "3. 4\n" +
        "4. 3\n";
        easyQuestions[17]="Ποιο είναι το υψηλότερο βουνό της Ελλάδας;\n" +
        "1. Ο Σμόλικας\n" +
        "2. Ο Όλυμπος\n" +
        "3. Ο Βόρας\n" +
        "4. Ο Γράμμος\n";
        easyQuestions[18]="Πώς λέγεται η λίμνη των Ιωαννίνων;\n" +
        "1. Αμβρακία\n" +
        "2. Πετρών\n" +
        "3. Ορεστιάδα\n" +
        "4. Παμβώτιδα\n";
        easyQuestions[19]="Ποιος είναι ο μεγαλύτερος σε μήκος ποταμός της Ελλάδας;\n" +
        "1. Ο Αχελώος\n" +
        "2. Ο Αλιάκμονας\n" +
        "3. Ο Πηνειός\n" +
        "4. Ο Έβρος\n";
    }
    public static String[] getEasyAnswers() {
        return easyAnswers;
    }
    public static void setEasyAnswers() {
        easyAnswers[0]="3";
        easyAnswers[1]="4";
        easyAnswers[2]="2";
        easyAnswers[3]="2";
        easyAnswers[4]="3";
        easyAnswers[5]="4";
        easyAnswers[6]="4";
        easyAnswers[7]="1";
        easyAnswers[8]="1";
        easyAnswers[9]="1";
        easyAnswers[10]="4";
        easyAnswers[11]="1";
        easyAnswers[12]="4";
        easyAnswers[13]="4";
        easyAnswers[14]="3";
        easyAnswers[15]="1";
        easyAnswers[16]="3";
        easyAnswers[17]="2";
        easyAnswers[18]="4";
        easyAnswers[19]="2";
    }
  public static String[][] randomQuestions() {
        Random randomNumber = new Random();
        int cn;
        String[][] easyArray = new String[10][2];
        int[] controlArray = new int[20];
        for (int i = 0; i < 20; i++) {
            controlArray[i] = -1;
        }
        //η μέθοδος αυτή θα καλείται στην SinglePlayer με την εντολή EasyQuestions.randomQuestions();
        for (int i = 0; i < 10; i++) {
            do {
                cn = randomNumber.nextInt(20); //cn = chosen number [ο αριθμός που έγινε random generated (0-19)]
            } while (controlArray[cn] == cn);

            controlArray[cn] = cn;
            String cq = easyQuestions[cn]; //cq = chosen question
            String ra = easyAnswers[cn]; //ra = right answer
            easyArray[i][0] = cq;
            easyArray[i][1] = ra;
        }
        return easyArray;
    }
}
