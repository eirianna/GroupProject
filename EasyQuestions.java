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
        "α. Διονύσιο Σολωμό\n" +
        "β. Μάνο Χατζιδάκι\n" +
        "γ. Νικόλαο Μάντζαρο\n" +
        "δ. Μίκη Θεοδωράκη\n";
        easyQuestions[1] = "Ο Νίκος Καζαντζάκης φοίτησε στη(ν):\n" +
        "α. Ιατρική σχολή\n" +
        "β. Φιλοσοφική σχολή\n" +
        "γ. Σχολή καλών τεχνών\n" +
        "δ. Νομική σχολή\n";
        easyQuestions[2] = "Το βιβλίο “Τα μυστικά του βάλτου” έχει γράψει η:\n" +
        "α. Άλκη Ζέη\n" +
        "β. Πηνελόπη Δέλτα\n" +
        "γ. Ζωρζ Σαρή\n" +
        "δ. Διδώ Σωτηρίου\n";
        easyQuestions[3] = "Πόσα παιδιά έχει ο Καραγκιόζης;\n" +
        "α. 2\n" +
        "β. 3\n" +
        "γ. 4\n" +
        "δ. 5\n";
        easyQuestions[4] = "Ποιά ταινία χάρισε στη Μελίνα Μερκούρη το βραβείο" +
        " α’ γυναικείου ρόλου στο φεστιβάλ των Καννών το 1960;\n" +
        "α. Στέλλα\n" +
        "β. Ο Χριστός ξανασταυρώνεται\n" +
        "γ. Ποτέ την Κυριακή\n" +
        "δ. Φαίδρα\n";
        easyQuestions[5] = "Η εξέγερση του Πολυτεχνείου έλαβε χώρα τον:\n" +
        "α. Νοέμβριο του 1975\n" +
        "β. Νοέμβριο του 1972\n" +
        "γ. Νοέμβριο του 1974\n" +
        "δ. Νοέμβριο του 1973\n";
        easyQuestions[6]=" Ο εμφύλιος πόλεμος ξεκίνησε αμέσως μετά τον:\n" +
        "α. Α’ Βαλκανικό πόλεμο\n" +
        "β. Β’ Βαλκανικό πόλεμο\n" +
        "γ. Α’ Παγκόσμιο πόλεμο\n" +
        "δ. Β’ Παγκόσμιο πόλεμο\n";
        easyQuestions[7]="Ποιος ήταν ο πρώτος βασιλιάς της Ελλάδας;\n" +
        "α. Ο Όθωνας \n" +
        "β. Ο Γεώργιος \n" +
        "γ. Ο Κωνσταντίνος\n" +
        "δ. Ο Αλέξανδρος\n";
        easyQuestions[8]="Ποιοι νίκησαν στον Πελοποννησιακό πόλεμο;\n" +
        "α. Οι Σπαρτιάτες\n" +
        "β. Οι Αθηναίοι\n" +
        "γ. Οι Θηβαίοι\n" +
        "δ. Οι Μακεδόνες\n";
        easyQuestions[9]="Ποιος πήγε την πρωτεύουσα από την Ρώμη στην Κωνσταντινούπολη;\n" +
        "α. Ο Κωνσταντίνος\n" +
        "β. Ο Θεοδόσιος \n" +
        "γ. Ο Ιουστινιανός\n" +
        "δ. Ο Λικίνιος\n";
        easyQuestions[10]="Ποιος σκότωσε τον Μινωταυρο;\n" +
        "α. Ο Περσέας \n" +
        "β. Ο Ηρακλής\n" +
        "γ. Ο Μίνωας\n" +
        "δ. Ο Θησέας\n";
        easyQuestions[11]="Ποιος/α γεννήθηκε αναδυόμενος/η από το κεφάλι του Δία;\n" +
        "α. Η Αθηνά\n" +
        "β. Ο Άρης\n" +
        "γ. Ο Ήφαιστος\n" +
        "δ. Ο Ερμής\n";
        easyQuestions[12]="Ποιος πέταξε υπερβολικά κοντά στον ήλιο με φτερά φτιαγμένα από πούπουλα και κερί;\n" +
        "α. Ο Περικλής\n" +
        "β. Ο Αιγέας\n" +
        "γ. Ο Δαίδαλος\n" +
        "δ. Ο Ίκαρος\n";
        easyQuestions[13]="Ποιον βάπτισε η μητέρα του στα ύδατα της Στύγος" +
        " όταν ήταν βρέφος και τον κρατούσε από τη φτέρνα;\n" +
        "α. Τον Διομήδη\n" +
        "β. Τον Αία\n" +
        "γ. Τον Οδυσσέα\n" +
        "δ. Τον Αχιλλέα\n";
        easyQuestions[14]="Ποια θεά ήταν υποχρεωμένη να περνάει τον μισό χρόνο στον υπόκοσμο" +
        " διότι ο Άδης την ξεγέλασε να φάει σπόρια ροδιού;\n" +
        "α. Η Καλλιόπη\n" +
        "β. Η Δήμητρα\n" +
        "γ. Η Περσεφόνη\n" +
        "δ. Η Αφροδίτη\n";
        easyQuestions[15]=" Ποια είναι η μεγαλύτερη φυσική λίμνη της Ελλάδας;\n" +
        "α. H Τριχωνίδα\n" +
        "β. H Βιστωνίδα\n" +
        "γ. H Μεγάλη Πρέσπα\n" +
        "δ. H Κρεμαστών\n";
        easyQuestions[16]="Πόσους νομούς έχει η Κρήτη;\n" +
        "α. 2\n" +
        "β. 5\n" +
        "γ. 4\n" +
        "δ. 3\n";
        easyQuestions[17]="Ποιο είναι το υψηλότερο βουνό της Ελλάδας;\n" +
        "α. Ο Σμόλικας\n" +
        "β. Ο Όλυμπος\n" +
        "γ. Ο Βόρας\n" +
        "δ. Ο Γράμμος\n";
        easyQuestions[18]="Πώς λέγεται η λίμνη των Ιωαννίνων;\n" +
        "α. Αμβρακία\n" +
        "β. Πετρών\n" +
        "γ. Ορεστιάδα\n" +
        "δ. Παμβώτιδα\n";
        easyQuestions[19]="Ποιος είναι ο μεγαλύτερος σε μήκος ποταμός της Ελλάδας;\n" +
        "α. Ο Αχελώος\n" +
        "β. Ο Αλιάκμονας\n" +
        "γ. Ο Πηνειός\n" +
        "δ. Ο Έβρος\n";
    }
    public static String[] getEasyAnswers() {
        return easyAnswers;
    }
    public static void setEasyAnswers() {
        easyAnswers[0]="γ";
        easyAnswers[1]="δ";
        easyAnswers[2]="β";
        easyAnswers[3]="β";
        easyAnswers[4]="γ";
        easyAnswers[5]="δ";
        easyAnswers[6]="δ";
        easyAnswers[7]="α";
        easyAnswers[8]="α";
        easyAnswers[9]="α";
        easyAnswers[10]="δ";
        easyAnswers[11]="α";
        easyAnswers[12]="δ";
        easyAnswers[13]="δ";
        easyAnswers[14]="γ";
        easyAnswers[15]="α";
        easyAnswers[16]="γ";
        easyAnswers[17]="β";
        easyAnswers[18]="δ";
        easyAnswers[19]="β";
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
