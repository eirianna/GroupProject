import java.util.Random;

public class HardQuestions {
    private static String[] hardQuestions = new String[20];
    private static String[] hardAnswers = new String[20];
    public static String[] getHardQuestions() {
        return hardQuestions;
    }
    public static void setHardQuestions() {
        hardQuestions[0] = "Η ποιητική συλλογή με τίτλο “Οι τρίλλιες που σβήνουν” είναι έργο της :\n" +
        "α. Μαρίας Πολυδούρη\n" +
        "β. Κικής Δημουλά\n" +
        "γ. Κατερίνας Γώγου\n" +
        "δ. Τζένης Μαστοράκη\n";
        hardQuestions[1] = "Από πόσους στίχους αποτελείται ο Ερωτόκριτος;\n" +
        "α. 5.012\n" +
        "β. 8.012\n" +
        "γ. 10.012\n" +
        "δ. 12.012\n";
        hardQuestions[2] = "Ο Γιώργος Σεφέρης ήταν ο πρώτος Έλληνας που τιμήθηκε με Νόμπελ Λογοτεχνίας το 1963." +
        "Πόσες φορές ακόμη είχε προταθεί πριν τη χρονιά της τελικής του βράβευσης;\n" +
        "α. καμία\n" +
        "β. μία\n" +
        "γ. δύο\n" +
        "δ. τρεις\n";
        hardQuestions[3] = "Ποιος από τους παρακάτω ΔΕΝ έχει τιμηθεί με το Βραβείο Ειρήνης Λένιν;\n" +
        "α. Μίκης Θεοδωράκης\n" +
        "β. Γιώργος Σεφέρης\n" +
        "γ. Γιάννης Ρίτσος\n" +
        "δ. Κώστας Βάρναλης\n";
        hardQuestions[4] = "Στη Λυσιστράτη του Αριστοφάνη οι γυναίκες της Αθήνας και της Σπάρτης κηρύσσουν σεξουαλική" +
        " απεργία προσπαθώντας να πείσουν τους άντρες να σταματήσουν τον Πελοποννησιακό πόλεμο." +
        " Σε ποιά φάση του πολέμου γράφεται το έργο;\n" +
        "α. Στον Κορινθιακό πόλεμο\n" +
        "β. Στον Αρχιδάμειο πόλεμο\n" +
        "γ. Στη Σικελική εκστρατεία\n" +
        "δ. Στον Δεκελεικό πόλεμο\n";
        hardQuestions[5] = "Πότε υπογράφηκε η συνθήκη των Σεβρών, που αποτέλεσε μεγάλη διπλωματική επιτυχία της Ελλάδας;\n" +
        "α. 10 Αυγούστου 1820\n" +
        "β. 10 Ιουλίου 1820\n" +
        "γ. 10 Ιουλίου 1920\n" +
        "δ. 10 Αυγούστου 1920\n";
        hardQuestions[6] = "Ποιος ήταν ο πρώτος πρωθυπουργός κατά τη διάρκεια της γερμανικής κατοχής;\n" +
        "α. ο Κωνσταντίνος Λογοθετόπουλος\n" +
        "β. ο Ιωάννης Ράλλης\n" +
        "γ. ο Ιωάννης Μεταξάς\n" +
        "δ. ο Γεώργιος Τσολάκογλου\n";
        hardQuestions[7] = "Για πόσα χρόνια η Ελλάδα κατείχε την περιφέρεια της Σμύρνης;\n" +
        "α. 3\n"
        "β. 4\n"
        "γ. 5\n"
        "δ. 6\n";
        hardQuestions[8] = "Ποιος ήταν ο τελευταίος αυτοκράτορας του Βυζαντίου;\n" +
        "α. ο Μέγας Αλέξανδρος\n" +
        "β. ο Ανδρόνικος Γ’ Παλαιολόγος\n" + 
        "γ. ο Θεοδόσιος\n" +
        "δ. ο Κωνσταντίνος ΙΑ’ Παλαιολόγος\n";
        hardQuestions[9] = "Πού πέθανε ο Μέγας Αλέξανδρος;\n" +
        "α. Βαβυλώνα\n" +
        "β. Σούσα\n" +
        "γ. Γαυγάμηλα\n" +
        "δ. Αλεξάνδρεια\n";
        hardQuestions[10] = "Γιατί η Αράχνη, η ταπεινή κόρη του Ίδμονα, πήρε την μορφή του εντόμου αράχνη;\n" +
        "α. Αρνήθηκε τις ερωτικές επιδείξεις του Απόλλωνα\n" +
        "α. Προκάλεσε την Αθηνά σε διαγωνισμό ύφανσης\n" +
        "β. Η Ήρα θύμωσε γιατί το Δίας προσπάθησε να την σαγηνέψει\n" +
        "α. Έκλεψε την κλωστή των τριών Μοιρών\n";
        hardQuestions[11] = "Ποια αρνιόταν να παντρευτεί τον οποιονδήποτε εκτός αν την νικούσαν σε αγώνα δρόμου;\n" +
        "α. Ευρυδίκη\n" +
        "β. Πηνελόπη\n" +
        "γ. Ναυσικά\n" +
        "δ. Αταλάντη\n";
        hardQuestions[12] = "Ποια θεά ήταν παρθένα που ορκίστηκε να μην παντρευτεί ποτέ;\n" +
        "α. Άρτεμις\n" +
        "β. Δήμητρα\n" +
        "γ. Αφροδίτη\n" +
        "δ. Ρέα\n";
        hardQuestions[13] = "Ποια θεά ήταν η προσωποποίηση της διχόνοιας και της ζήλιας;\n" +
        "α. Έρις\n" +
        "β. Λήθη\n" +
        "γ. Ίρις\n" +
        "δ. Λύσσα\n"; 
        hardQuestions[14] = "Ποιος έδωσε το αποτελειωτικό «χτύπημα» στη ζωή του Ηρακλή;\n" +
        "α. Νέσσος, ο κένταυρος που χτυπήθηκε από τα δηλητηριασμένα βέλη του Ηρακλή\n" +
        "β. Διάνειρα, η σύζυγος του Ηρακλή\n" +
        "γ. Φιλοκτήτης, στον οποίο έδωσε τόξα και βέλη ο Ηρακλής για τον Τρωικό πόλεμο\n" +
        "δ. Ευρυσθέας, βασιλιάς των Μυκηνών που ανέθεσε τους 12 άθλους στον Ηρακλή\n";
        hardQuestions[15] = "Σε ποια από τις παρακάτω πόλεις βρίσκεται πιο κοντά η λίμνη Βεγορίτιδα;\n" +
        "α. Έδεσσα\n" +
        "β. Αριδαία\n" +
        "γ. Γιαννιτσά\n" +
        "δ. Βέροια\n";
        hardQuestions[16] = "Ποιος κόλπος βρέχει την Πρέβεζα;\n" +
        "α. Παγασητικός\n" +
        "β. Θερμαϊκός\n" +
        "γ. Αμβρακικός\n" +
        "δ. Στρυμονικός\n";
        hardQuestions[17] = "Ποια είναι η τέταρτη μεγαλύτερη τεχνητή λίμνη της Ελλάδας;\n" +
        "α. Πλαστήρα\n" +
        "β. Θησαυρού\n" +
        "γ. Κερκίνη\n" +
        "δ. Καστρακίου\n";
        hardQuestions[18] = "Πώς ονομάζεται η υψηλότερη κορυφή των όρων Τζουμέρκα;\n" +
        "α. Κακαρδίτσα\n" +
        "β. Καταφίδι\n" +
        "γ. Καραβόλα\n" +
        "δ. Πύργος\n";
        hardQuestions[19] = "Ποια πόλη χαρακτηρίζεται ως ενεργειακό κέντρο της Ελλάδος;\n" +
        "α. Κομοτηνή\n" +
        "β. Πτολεμαΐδα\n" +
        "γ. Καρδίτσα\n" +
        "δ. Δράμα\n";
    }
    public static String[] getHardAnswers() {
        return hardAnswers;
    }
    public static void setHardAnswers() {
        hardAnswers[0] = "α";
        hardAnswers[1] = "γ";
        hardAnswers[2] = "δ";
        hardAnswers[3] = "β";
        hardAnswers[4] = "δ";
        hardAnswers[5] = "δ";
        hardAnswers[6] = "δ";
        hardAnswers[7] = "α";
        hardAnswers[8] = "δ";
        hardAnswers[9] = "α";
        hardAnswers[10] = "β";
        hardAnswers[11] = "δ";
        hardAnswers[12] = "α";
        hardAnswers[13] = "α";
        hardAnswers[14] = "γ";
        hardAnswers[15] = "α";
        hardAnswers[16] = "γ";
        hardAnswers[17] = "δ";
        hardAnswers[18] = "α";
        hardAnswers[19] = "β";
    }

     public static String[][] randomQuestions() {
        Random randomNumber = new Random();
        int cn;
        String[][] easyArray = new String[10][2];
        int[] controlArray = new int[20];
        for (int i = 0; i < 20; i++) {
            controlArray[i] = -1;
        }
        //η μέθοδος αυτή θα καλείται στην SinglePlayer με την εντολή HardQuestions.randomQuestions();
        for (int i = 0; i < 10; i++) {
            do {
                cn = randomNumber.nextInt(20); //cn = chosen number [ο αριθμός που έγινε random generated (0-19)]
            } while (controlArray[cn] == cn);

            controlArray[cn] = cn;
            String cq = hardQuestions[cn]; //cq = chosen question
            String ra = hardAnswers[cn]; //ra = right answer
            hardArray[i][0] = cq;
            hardArray[i][1] = ra;
        }
        return hardArray;
    }
}
