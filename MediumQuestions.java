import java.util.Random;

public class MediumQuestions {
    protected static String[] mediumQuestions = new String[20];
    protected static String[] mediumAnswers = new String[20];
    public static String[] getMediumQuestions() {
        return mediumQuestions;
    }
    public static void setMediumQuestions() {
        mediumQuestions[0] = "Ο Αλέξανδρος Παπαδιαμάντης γεννήθηκε στην:\n" +
                "1. Σκόπελο\n" +
                "2. Σκιάθο \n" +
                "3. Αλόννησο \n" +
                "4. Σκύρο\n";
        mediumQuestions[1] = "Πότε άνοιξε για το κοινό το νέο κτήριο του Μουσείου της Ακρόπολης; " +
                "1. 2004\n" +
                "2. 2007\n" +
                "3. 2009\n" +
                "4. 2011\n";
        mediumQuestions[2] = "Ο Αύγουστος Κορτώ έχει γράψει το βιβλίο με τίτλο:\n" +
                "1. Δέσποινα\n" +
                "2. Δήμητρα\n" +
                "3. Δανάη\n" +
                "4. Δάφνη\n";
        mediumQuestions[3] = "Πόσες κωμωδίες του Αριστοφάνη σώζονται μέχρι και σήμερα;\n" +
                "1. 9\n" +
                "2. 11\n" +
                "3. 15\n" +
                "4. 19\n";
        mediumQuestions[4] = "Ποιου ρεύματος εκπρόσωπος ήταν ο Νίκος Εγγονόπουλος;\n" +
                "1. του σουρεαλισμού\n" +
                "2. του ιμπρεσιονισμού\n" +
                "3. του κυβισμού\n" +
                "4. του κονστρουκτιβισμού\n";
        mediumQuestions[5] = "Έξω από ποια εκκλησία του Ναυπλίου δολοφονήθηκε ο Ιωάννης Καποδίστριας και πότε;\n" +
                "1. στον Άγιο Σπυρίδωνα τον Οκτώβριο του 1831\n" +
                "2. στην Ευαγγελίστρια τον Οκτώβριο του 1831\n" +
                "3. στον Άγιο Γεώργιο τον Νοέμβριο του 1831\n" +
                "4. στην Αγία Ειρήνη τον Νοέμβριο του 1831\n";
        mediumQuestions[6] = "Ποιος έχει πει την περίφημη φράση “δυστυχώς επτωχεύσαμεν”;\n" +
                "1. ο Ιωάννης Κωλέττης\n" +
                "2. ο Ελευθέριος Βενιζέλος\n" +
                "3. ο Χαρίλαος Τρικούπης\n" +
                "4. ο Βασιλιάς Κωνσταντίνος\n";
        mediumQuestions[7] = "Πότε ψηφίστηκε το πρώτο Σύνταγμα της Ελλάδας;\n" +
                "1. το 1828\n" +
                "2. το 1844\n" +
                "3. το 1822\n" +
                "4. το 1830\n";
        mediumQuestions[8] = "Ποια χρονιά η Ελλάδα απέκτησε και επίσημα την ανεξαρτησία της από την Οθωμανική Αυτοκρατορία;\n" +
                "1. το 1830\n" +
                "2. το 1829\n" +
                "3. το 1831\n" +
                "4. το 1844\n";
        mediumQuestions[9] = "Ποιο ήταν το τελευταίο γεωγραφικό τμήμα που προσαρτήθηκε στο ελληνικό κράτος;\n" +
                "1. Δωδεκάνησα\n" +
                "2. Δυτική Θράκη\n" +
                "3. Κρήτη\n" +
                "4. Επτάνησα\n";
        mediumQuestions[10] = "Ποιος ήταν καταδικασμένος να παραμείνει αλυσοδεμένος σε έναν βράχο για την αιωνιότητα ενώ" +
                " ένας αετός έτρωγε το συκώτι του κάθε μέρα;\n" +
                "1. Προμηθέας\n" +
                "2. Άτλας\n" +
                "3. Σίσυφος\n" +
                "4. Ορφέας\n";
        mediumQuestions[11] = "Ποιος ΔΕΝ ήταν παιδί του Δία;\n" +
                "1. Ηρακλής\n" +
                "2. Περσέας\n" +
                "3. Ελένη της Τροίας\n" +
                "4. Ασκληπιός\n";
        mediumQuestions[12] = "Ποιος ήταν ο Πολύφημος;\n" +
                "1. Ο βασιλιάς των κενταύρων\n" +
                "2. Ένας στρατηγός για τους Έλληνες στο Τρωικό Πόλεμο\n" +
                "3. Ο Κύκλωπας που τύφλωσε ο Οδυσσέας\n" +
                "4. Ο πατέρας του Τιτάνα Κρόνου\n";
        mediumQuestions[13] = "Ποιος ήταν ο πατέρας του Δία;\n" +
                "1. Εστία\n" +
                "2. Δήμητρα\n" +
                "3. Κρόνος\n" +
                "4. Άτλας\n";
        mediumQuestions[14] = "Ποιος ΔΕΝ ήταν άθλος του Ηρακλή;\n" +
                "1. Η ανάκτηση της ζώνης της Ιππολύτης\n" +
                "2. Σκοτωμός του Ερυμάνθιου Κάπρου\n" +
                "3. Κλοπή των αλόγων του Διομήδη\n" +
                "4. Απελευθέρωση της Ησιόνης, κόρη του Λαομέδοντα\n";
        mediumQuestions[15] = "Σε ποιον νομό ανήκει η Αράχωβα;\n" +
                "1. Φθιώτιδας\n" +
                "2. Βοιωτίας\n" +
                "3. Φωκίδας\n" +
                "4. Ευρυτανίας\n";
        mediumQuestions[16] = "Ποια είναι η πρωτεύουσα του νομού Ημαθίας;\n" +
                "1. Αλεξάνδρεια\n" +
                "2. Νάουσα\n" +
                "3. Βέροια\n" +
                "4. Σφηκιά\n";
        mediumQuestions[17] = "Πόσα είναι τα κύρια νησιά των Δωδεκανήσων;\n" +
                "1. 12\n" +
                "2. 15\n" +
                "3. 27\n" +
                "4. 16\n";
        mediumQuestions[18] = "Σε ποιον νομό βρίσκεται το φαράγγι της Σαμαριάς;\n" +
                "1. Χανίων\n" +
                "2. Λασιθίου\n" +
                "3. Ρεθύμνου\n" +
                "4. Ηρακλείου\n";
        mediumQuestions[19] = "Σε πόσους νομούς χωρίζεται η Θράκη;\n" +
                "1. 4\n" +
                "2. 2\n" +
                "3. 6\n" +
                "4. 3\n";
    }
    
    public static String[] getMediumAnswers() {
        return mediumAnswers;
    }
    public static void setMediumAnswers() {
        mediumAnswers[0] = "2";
        mediumAnswers[1] = "3";
        mediumAnswers[2] = "1";
        mediumAnswers[3] = "2";
        mediumAnswers[4] = "1";
        mediumAnswers[5] = "1";
        mediumAnswers[6] = "3";
        mediumAnswers[7] = "2";
        mediumAnswers[8] = "1";
        mediumAnswers[9] = "1";
        mediumAnswers[10] = "1";
        mediumAnswers[11] = "4";
        mediumAnswers[12] = "3";
        mediumAnswers[13] = "3";
        mediumAnswers[14] = "4";
        mediumAnswers[15] = "2";
        mediumAnswers[16] = "3";
        mediumAnswers[17] = "2";
        mediumAnswers[18] = "1";
        mediumAnswers[19] = "4";
    }
    protected static String[][] MediumArray = new String[10][2];
    public static String[][] randomQuestions() {
        
        setMediumQuestions();
        setMediumAnswers();
        Random randomNumber = new Random();
        int cn;

        int[] controlArray = new int[20];
        for (int i = 0; i < 20; i++) {
            controlArray[i] = -1;
        }
        //η μέθοδος αυτή θα καλείται στην SinglePlayer με την εντολή MediumQuestions.randomQuestions();
        for (int i = 0; i < 10; i++) {
            do {
                cn = randomNumber.nextInt(20); //cn = chosen number [ο αριθμός που έγινε random generated (0-19)]
            } while (controlArray[cn] == cn);

            controlArray[cn] = cn;
            String cq = mediumQuestions[cn]; //cq = chosen question
            String ra = mediumAnswers[cn]; //ra = right answer
            MediumArray[i][0] = cq;
            MediumArray[i][1] = ra;
        }
        return MediumArray;
    }
}
