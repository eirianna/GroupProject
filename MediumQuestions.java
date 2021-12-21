import java.util.Random;

public class MediumQuestions {
    private static String[] mediumQuestions = new String[20];
    public static String[] getMediumQuestions() {
        return mediumQuestions;
    }
    public static void setMediumQuestions() {
        mediumQuestions[0] = "Ο Αλέξανδρος Παπαδιαμάντης γεννήθηκε στην:\n" +
        "α. Σκόπελο\n" +
        "β. Σκιάθο \n" +
        "γ. Αλόννησο \n" +
        "δ. Σκύρο\n";
        mediumQuestions[1] = "Πότε άνοιξε για το κοινό το νέο κτήριο του Μουσείου της Ακρόπολης; " +
        "α. 2004\n" +
        "β. 2007\n" +
        "γ. 2009\n" +
        "δ. 2011\n";
        mediumQuestions[2] = "Ο Αύγουστος Κορτώ έχει γράψει το βιβλίο με τίτλο:\n" +
        "α. Δέσποινα\n" +
        "β. Δήμητρα\n" +
        "γ. Δανάη\n" +
        "δ. Δάφνη\n";
        mediumQuestions[3] = "Πόσες κωμωδίες του Αριστοφάνη σώζονται μέχρι και σήμερα;\n" +
        "α. 9\n" +
        "β. 11\n" +
        "γ. 15\n" +
        "δ. 19\n";
        mediumQuestions[4] = "Ποιου ρεύματος εκπρόσωπος ήταν ο Νίκος Εγγονόπουλος;\n" +
        "α. του σουρεαλισμού\n" +
        "β. του ιμπρεσιονισμού\n" +
        "γ. του κυβισμού\n" +
        "δ. του κονστρουκτιβισμού\n";
        mediumQuestions[5] = "Έξω από ποια εκκλησία του Ναυπλίου δολοφονήθηκε ο Ιωάννης Καποδίστριας και πότε;\n" +
        "α. στον Άγιο Σπυρίδωνα τον Οκτώβριο του 1831\n" +
        "β. στην Ευαγγελίστρια τον Οκτώβριο του 1831\n" +
        "γ. στον Άγιο Γεώργιο τον Νοέμβριο του 1831\n" +
        "δ. στην Αγία Ειρήνη τον Νοέμβριο του 1831\n";
        mediumQuestions[6] = "Ποιος έχει πει την περίφημη φράση “δυστυχώς επτωχεύσαμεν”;\n" +
        "α. ο Ιωάννης Κωλέττης\n" +
        "β. ο Ελευθέριος Βενιζέλος\n" +
        "γ. ο Χαρίλαος Τρικούπης\n" +
        "δ. ο Βασιλιάς Κωνσταντίνος\n";
        mediumQuestions[7] = "Πότε ψηφίστηκε το πρώτο Σύνταγμα της Ελλάδας;\n" +
        "α. το 1828\n" +
        "β. το 1844\n" +
        "γ. το 1822\n" +
        "δ. το 1830\n";
        mediumQuestions[8] = "Ποια χρονιά η Ελλάδα απέκτησε και επίσημα την ανεξαρτησία της από την Οθωμανική Αυτοκρατορία;\n" +
        "α. το 1830\n" +
        "β. το 1829\n" +
        "γ. το 1831\n" +
        "δ. το 1844\n";
        mediumQuestions[9] = "Ποιο ήταν το τελευταίο γεωγραφικό τμήμα που προσαρτήθηκε στο ελληνικό κράτος;\n" +
        "α. Δωδεκάνησα\n" +
        "β. Δυτική Θράκη\n" +
        "γ. Κρήτη\n" +
        "δ. Επτάνησα\n";
        mediumQuestions[10] = "Ποιος ήταν καταδικασμένος να παραμείνει αλυσοδεμένος σε έναν βράχο για την αιωνιότητα ενώ" +
        " ένας αετός έτρωγε το συκώτι του κάθε μέρα;\n" +
        "α. Προμηθέας\n" +
        "β. Άτλας\n" +
        "γ. Σίσυφος\n" +
        "δ. Ορφέας\n";
        mediumQuestions[11] = "Ποιος ΔΕΝ ήταν παιδί του Δία;\n" +
        "α. Ηρακλής\n" +
        "β. Περσέας\n" +
        "γ. Ελένη της Τροίας\n" +
        "δ. Ασκληπιός\n";
        mediumQuestions[12] = "Ποιος ήταν ο Πολύφημος;\n" +
        "α. Ο βασιλιάς των κενταύρων\n" +
        "β. Ένας στρατηγός για τους Έλληνες στο Τρωικό Πόλεμο\n" +
        "γ. Ο Κύκλωπας που τύφλωσε ο Οδυσσέας\n" +
        "δ. Ο πατέρας του Τιτάνα Κρόνου\n";
        mediumQuestions[13] = "Ποιος ήταν ο πατέρας του Δία;\n" +
        "α. Εστία\n" +
        "β. Δήμητρα\n" +
        "γ. Κρόνος\n" +
        "δ. Άτλας\n";
        mediumQuestions[14] = "Ποιος ΔΕΝ ήταν άθλος του Ηρακλή;\n" +
        "α. Η ανάκτηση της ζώνης της Ιππολύτης\n" +
        "β. Σκοτωμός του Ερυμάνθιου Κάπρου\n" +
        "γ. Κλοπή των αλόγων του Διομήδη\n" +
        "δ. Απελευθέρωση της Ησιόνης, κόρη του Λαομέδοντα\n";
        mediumQuestions[15] = "Σε ποιον νομό ανήκει η Αράχωβα;\n" +
        "α. Φθιώτιδας\n" +
        "β. Βοιωτίας\n" +
        "γ. Φωκίδας\n" +
        "δ. Ευρυτανίας\n";
        mediumQuestions[16] = "Ποια είναι η πρωτεύουσα του νομού Ημαθίας;\n" +
        "α. Αλεξάνδρεια\n" +
        "β. Νάουσα\n" +
        "γ. Βέροια\n" +
        "δ. Σφηκιά\n";
        mediumQuestions[17] = "Πόσα είναι τα κύρια νησιά των Δωδεκανήσων;\n" +
        "α. 12\n" +
        "β. 15\n" +
        "γ. 27\n" +
        "δ. 16\n";
        mediumQuestions[18] = "Σε ποιον νομό βρίσκεται το φαράγγι της Σαμαριάς;\n" +
        "α. Χανίων\n" +
        "β. Λασιθίου\n" +
        "γ. Ρεθύμνου\n" +
        "δ. Ηρακλείου\n";
        mediumQuestions[19] = "Σε πόσους νομούς χωρίζεται η Θράκη;\n" +
        "α. 4\n" +
        "β. 2\n" +
        "γ. 6\n" +
        "δ. 3\n";
    }
    private static String[] mediumAnswers = new String[20];
    public static String[] getMediumAnswers() {
        return mediumAnswers;
    }
    public static void setMediumAnswers() {
        mediumAnswers[0] = "β";
        mediumAnswers[1] = "γ";
        mediumAnswers[2] = "α";
        mediumAnswers[3] = "β";
        mediumAnswers[4] = "α";
        mediumAnswers[5] = "α";
        mediumAnswers[6] = "γ";
        mediumAnswers[7] = "β";
        mediumAnswers[8] = "α";
        mediumAnswers[9] = "α";
        mediumAnswers[10] = "α";
        mediumAnswers[11] = "δ";
        mediumAnswers[12] = "γ";
        mediumAnswers[13] = "γ";
        mediumAnswers[14] = "δ";
        mediumAnswers[15] = "β";
        mediumAnswers[16] = "γ";
        mediumAnswers[17] = "β";
        mediumAnswers[18] = "α";
        mediumAnswers[19] = "δ";
    }
    
    public static String[][] randomQuestions() {
        Random randomNumber = new Random();
        int cn;
        String[][] MediumArray = new String[10][2];
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
