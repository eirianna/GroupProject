import java.util.Scanner;
import java.util.Random;

public class FireRound {
   
    String [] fireQuestions = new String [8];
    String [] fireAnswers = new String [8];
    
    public static void setFireQuestions() {
    
        fireQuestions[0] = "Ποιός ποιητής ανήκε σε ομάδα της ΕΠΟΝ κατά τη διάρκεια των Δεκεμβριανών;" +
        "1. Ο Τάσος Λειβαδίτης\n" +
        "2. Ο Γιάννης Ρίτσος\n" +
        "3. Ο Κώστας Βάρναλης\n" +
        "4. Ο Γιάννης Καραμήτσος\n";
        fireQuestions[1] = "Ποιός Έλληνας καλλιτέχνης πολέμησε στο Αλβανικό Μέτωπο το 1941;" +
        "1. Ο Νίκος Καββαδίας\n" +
        "2. Ο Νίκος Εγγονόπουλος\n" +
        "3. Ο Μίκης Θεοδωράκης\n" +
        "4. Ο Μάνος Χατζιδάκις\n";
        fireQuestions[2] = "Ποιά συνθήκη έφερε το τέλος του Α' Βαλκανικού πολέμου στις 30/05/1913;" +
        "1. Η συνθήκη του Λονδίνου\n" +
        "2. Η συνθήκη του Βουκουρεστίου\n" +
        "3. Η συνθήκη των Σεβρών\n" +
        "4. Η συνθήκη του Κάρλοβιτς\n";
        fireQuestions[3] = "Η πρώτη δικτατορική κυβέρνηση που δημιουργήθηκε το 1967 ήταν αυτή του " +
        "1. Κωνσταντίνου Κόλλια\n" +
        "2. Γεωργίου Παπαδόπουλου\n" +
        "3. Σπύρου Μαρκεζίνη\n" +
        "4. Αδαμαντίου Ανδριτσόπουλου\n";
        fireQuestions[4] = "Ποιός από τους παρακάτω ποταμούς της Ελλάδας είναι μεγαλύτερος σε μήκος;" +
        "1. Λάδωνας\n" +
        "2. Ευρώτας\n" +
        "3. Εύηνος\n" +
        "4. Μόρνος\n";
        fireQuestions[5] = "Ποιά από τις παρακάτω πόλεις της Ελλάδας έχει τον μεγαλύτερο πληθυσμό σύμφωνα με την " +
        "απογραφή πληθυσμού του 2011; " +
        "1. Ξάνθη\n" +
        "2. Αλεξανδρούπολη\n" +
        "3. Κατερίνη\n" +
        "4. Σέρρες\n";
        fireQuestions[6] = "Η μητέρα του Φρίξου και της Έλλης ήταν η Νεφέλη. Η Νεφέλη ήταν " +
        "1. νύμφη\n" +
        "2. ωκεανίδα\n" +
        "3. νηρηίδα\n" +
        "4. χάριτα\n";
        fireQuestions[7] = "Ποιά από τις παρακάτω ΔΕΝ αποτελεί ονομασία του Ποσειδώνα;" +
        "1. Σεισίχθων\n" +
        "2. Μοχλευτήρ\n" +
        "3. Γαιήοχος\n" +
        "4. Επιτιμήτωρ\n";
    }
    
    public static void setFireAnswers() {

        fireAnswers[0] = "1";
        fireAnswers[1] = "2";
        fireAnswers[2] = "1";
        fireAnswers[3] = "1";
        fireAnswers[4] = "3";
        fireAnswers[5] = "4";
        fireAnswers[6] = "2";
        fireAnswers[7] = "4";
    }
    
    public static int[] round(int [] points) {
        
        int equals = 1;         /* calculating the ammout of players with the same score*/
        
        for (int i = 1; i < points.length(); i++) {
            if (points[i][1] == points[i-1][1]) {
                equals += 1;
            }
        }
        
        setFireQuestions();
        setFireAnswers();
        
        Scanner sc = new Scanner(System.in);
        
        Random randomNumber = new Random();
        int cn;
        int[] controlArray = new int[8];
        
        for (int i = 0; i < 8; i++) {
                controlArray[i] = -1;
        }
        
        long [] times = new long [equals];
        
        for (int i = 0; i < equals; i++) {       
            
            do {
                cn = randomNumber.nextInt(8); //cn = chosen number [ο αριθμός που έγινε random generated (0-7)]
            } while (controlArray[cn] == cn);
        
            controlArray[cn] = cn;
            System.out.printf("Player: " + points[i][0]);
            System.out.println(fireQuestions[cn]);
            String answer;
        
            long startTime = System.nanoTime();    /*calculating player's answering time*/
            do {
                answer = sc.nextLine();
                if (answer != "1" && answer != "2" && answer != "3" && answer != "4" && answer != "q") {
                    System.out.println("Invalid option. Please try again.");
                }
            } while (answer != "1" && answer != "2" && answer != "3" && answer != "4" && answer != "q");
            long estimatedTime = System.nanoTime() - startTime;
            times[i] = estimatedTime;
            
            if (answer != 'q') {
                if (answer == fireAnswers[cn]) {
                    System.out.println("Σωστή απάντηση!");
                    points[i][1] += 100;
                } else {
                    System.out.println("Λάθος απάντηση.. η σωστή απάντηση ειναι: ", fireAnswers[cn]);
                }
            } else {
                System.exit(0);
            }
            
            if (i < equals - 1) {
                System.out.println("Next player");
            }
        }
        
        for (int i = 0; i<equals - 1; i++) {        /*rearranging points array according to new results*/
            if (points[i][1] < points[i+1][1]) {
                for (int j = 0; j<2; j++) {
                    swapping(points[i][j], points[i+1][j]);
                }
                swapping2(times[i], times[i+1]);
                
            } else if (points[i][1] == points[i+1][1]) {
                if (times[i] > times[i+1]) {                /*if there's another tie, player's answering time is considered*/
                   points[i+1][1] += 50;
                   for (int j = 0; j<2; j++) {
                        swapping(points[i][j], points[i+1][j]);
                    }
                    swapping2(times[i],times[i+1]);
                } else {
                    points[i][j] += 50;
                }
            }
        }
    }
    
    public static int swapping(int a,int b) {
        int temp = a;
        a = b;
        b = a;
        return a,b;
    }
   
    public static long swapping2(long a,long b) {
        int temp = a;
        a = b;
        b = a;
        return a,b;
    }
}
