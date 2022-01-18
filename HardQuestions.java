package gr.aueb.dmst.dds.exercise;

import java.util.Random;

public class HardQuestions {
    protected static String[] hardQuestions = new String[20];
    protected static String[] hardAnswers = new String[20];

    public static String[] getHardQuestions() {
        return hardQuestions;
    }
    public static void setHardQuestions() {
        hardQuestions[0] = "Η ποιητική συλλογή με τίτλο “Οι τρίλλιες που σβήνουν” είναι έργο της :\n" +
                "1. Μαρίας Πολυδούρη\n" +
                "2. Κικής Δημουλά\n" +
                "3. Κατερίνας Γώγου\n" +
                "4. Τζένης Μαστοράκη\n";
        hardQuestions[1] = "Από πόσους στίχους αποτελείται ο Ερωτόκριτος;\n" +
                "1. 5.012\n" +
                "2. 8.012\n" +
                "3. 10.012\n" +
                "4. 12.012\n";
        hardQuestions[2] = "Ο Γιώργος Σεφέρης ήταν ο πρώτος Έλληνας που τιμήθηκε με Νόμπελ Λογοτεχνίας το 1963." +
                "Πόσες φορές ακόμη είχε προταθεί πριν τη χρονιά της τελικής του βράβευσης;\n" +
                "1. καμία\n" +
                "2. μία\n" +
                "3. δύο\n" +
                "4. τρεις\n";
        hardQuestions[3] = "Ποιος από τους παρακάτω ΔΕΝ έχει τιμηθεί με το Βραβείο Ειρήνης Λένιν;\n" +
                "1. Μίκης Θεοδωράκης\n" +
                "2. Γιώργος Σεφέρης\n" +
                "3. Γιάννης Ρίτσος\n" +
                "4. Κώστας Βάρναλης\n";
        hardQuestions[4] = "Στη Λυσιστράτη του Αριστοφάνη οι γυναίκες της Αθήνας και της Σπάρτης κηρύσσουν σεξουαλική" +
                " απεργία προσπαθώντας να πείσουν τους άντρες να σταματήσουν τον Πελοποννησιακό πόλεμο." +
                " Σε ποιά φάση του πολέμου γράφεται το έργο;\n" +
                "1. Στον Κορινθιακό πόλεμο\n" +
                "2. Στον Αρχιδάμειο πόλεμο\n" +
                "3. Στη Σικελική εκστρατεία\n" +
                "4. Στον Δεκελεικό πόλεμο\n";
        hardQuestions[5] = "Πότε υπογράφηκε η συνθήκη των Σεβρών, που αποτέλεσε μεγάλη διπλωματική επιτυχία της Ελλάδας;\n" +
                "1. 10 Αυγούστου 1820\n" +
                "2. 10 Ιουλίου 1820\n" +
                "3. 10 Ιουλίου 1920\n" +
                "4. 10 Αυγούστου 1920\n";
        hardQuestions[6] = "Ποιος ήταν ο πρώτος πρωθυπουργός κατά τη διάρκεια της γερμανικής κατοχής;\n" +
                "1. ο Κωνσταντίνος Λογοθετόπουλος\n" +
                "2. ο Ιωάννης Ράλλης\n" +
                "3. ο Ιωάννης Μεταξάς\n" +
                "4. ο Γεώργιος Τσολάκογλου\n";
        hardQuestions[7] = "Για πόσα χρόνια η Ελλάδα κατείχε την περιφέρεια της Σμύρνης;\n" +
                "1. 3\n" +
                "2. 4\n" +
                "3. 5\n" +
                "4. 6\n";
        hardQuestions[8] = "Ποιος ήταν ο τελευταίος αυτοκράτορας του Βυζαντίου;\n" +
                "1. ο Μέγας Αλέξανδρος\n" +
                "2. ο Ανδρόνικος Γ’ Παλαιολόγος\n" +
                "3. ο Θεοδόσιος\n" +
                "4. ο Κωνσταντίνος ΙΑ’ Παλαιολόγος\n";
        hardQuestions[9] = "Πού πέθανε ο Μέγας Αλέξανδρος;\n" +
                "1. Βαβυλώνα\n" +
                "2. Σούσα\n" +
                "3. Γαυγάμηλα\n" +
                "4. Αλεξάνδρεια\n";
        hardQuestions[10] = "Γιατί η Αράχνη, η ταπεινή κόρη του Ίδμονα, πήρε την μορφή του εντόμου αράχνη;\n" +
                "1. Αρνήθηκε τις ερωτικές επιδείξεις του Απόλλωνα\n" +
                "2. Προκάλεσε την Αθηνά σε διαγωνισμό ύφανσης\n" +
                "3. Η Ήρα θύμωσε γιατί το Δίας προσπάθησε να την σαγηνέψει\n" +
                "4. Έκλεψε την κλωστή των τριών Μοιρών\n";
        hardQuestions[11] = "Ποια αρνιόταν να παντρευτεί τον οποιονδήποτε εκτός αν την νικούσαν σε αγώνα δρόμου;\n" +
                "1. Ευρυδίκη\n" +
                "2. Πηνελόπη\n" +
                "3. Ναυσικά\n" +
                "4. Αταλάντη\n";
        hardQuestions[12] = "Ποια θεά ήταν παρθένα που ορκίστηκε να μην παντρευτεί ποτέ;\n" +
                "1. Άρτεμις\n" +
                "2. Δήμητρα\n" +
                "3. Αφροδίτη\n" +
                "4. Ρέα\n";
        hardQuestions[13] = "Ποια θεά ήταν η προσωποποίηση της διχόνοιας και της ζήλιας;\n" +
                "1. Έρις\n" +
                "2. Λήθη\n" +
                "3. Ίρις\n" +
                "4. Λύσσα\n";
        hardQuestions[14] = "Ποιος έδωσε το αποτελειωτικό «χτύπημα» στη ζωή του Ηρακλή;\n" +
                "1. Νέσσος, ο κένταυρος που χτυπήθηκε από τα δηλητηριασμένα βέλη του Ηρακλή\n" +
                "2. Διάνειρα, η σύζυγος του Ηρακλή\n" +
                "3. Φιλοκτήτης, στον οποίο έδωσε τόξα και βέλη ο Ηρακλής για τον Τρωικό πόλεμο\n" +
                "4. Ευρυσθέας, βασιλιάς των Μυκηνών που ανέθεσε τους 12 άθλους στον Ηρακλή\n";
        hardQuestions[15] = "Σε ποια από τις παρακάτω πόλεις βρίσκεται πιο κοντά η λίμνη Βεγορίτιδα;\n" +
                "1. Έδεσσα\n" +
                "2. Αριδαία\n" +
                "3. Γιαννιτσά\n" +
                "4. Βέροια\n";
        hardQuestions[16] = "Ποιος κόλπος βρέχει την Πρέβεζα;\n" +
                "1. Παγασητικός\n" +
                "2. Θερμαϊκός\n" +
                "3. Αμβρακικός\n" +
                "4. Στρυμονικός\n";
        hardQuestions[17] = "Ποια είναι η τέταρτη μεγαλύτερη τεχνητή λίμνη της Ελλάδας;\n" +
                "1. Πλαστήρα\n" +
                "2. Θησαυρού\n" +
                "3. Κερκίνη\n" +
                "4. Καστρακίου\n";
        hardQuestions[18] = "Πώς ονομάζεται η υψηλότερη κορυφή των όρων Τζουμέρκα;\n" +
                "1. Κακαρδίτσα\n" +
                "2. Καταφίδι\n" +
                "3. Καραβόλα\n" +
                "4. Πύργος\n";
        hardQuestions[19] = "Ποια πόλη χαρακτηρίζεται ως ενεργειακό κέντρο της Ελλάδος;\n" +
                "1. Κομοτηνή\n" +
                "2. Πτολεμαΐδα\n" +
                "3. Καρδίτσα\n" +
                "4. Δράμα\n";
    }
    public static String[] getHardAnswers() {
        return hardAnswers;
    }
    public static void setHardAnswers() {
        hardAnswers[0] = "1";
        hardAnswers[1] = "3";
        hardAnswers[2] = "4";
        hardAnswers[3] = "2";
        hardAnswers[4] = "4";
        hardAnswers[5] = "4";
        hardAnswers[6] = "4";
        hardAnswers[7] = "1";
        hardAnswers[8] = "4";
        hardAnswers[9] = "1";
        hardAnswers[10] = "2";
        hardAnswers[11] = "4";
        hardAnswers[12] = "1";
        hardAnswers[13] = "1";
        hardAnswers[14] = "3";
        hardAnswers[15] = "1";
        hardAnswers[16] = "3";
        hardAnswers[17] = "4";
        hardAnswers[18] = "1";
        hardAnswers[19] = "2";
    }

    protected static String[][] hardArray = new String[10][2];
    public static String[][] randomQuestions() {
       
        setHardQuestions();
        setHardAnswers();
        Random randomNumber = new Random();
        int cn;

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
