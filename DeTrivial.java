import java.util.Scanner;

public class DeTrivial
{
    public int numb;
    public int dif;
	
	public static void main(String[] args) {
	    Welcome.message();
	    
	    System.out.println("START GAME (press 1)"/n "INSTRUCTIONS (press 2)"/n "EXIT GAME (press 3)");
        Scanner sc = new Scanner(System.in);
	    
	    do {
	        int choice = sc.nextInt;
	        if (choice <1 || choice>3) {
	            System.out.println("Invalid option. Please try again.");
	        }
	   } while (choice <1 || choice>3 )     
	    
	   if (choice == 1) {
	       Welcome.level();
	       Welcome.players();
	   } else if (choice == 2) {
	       instructions();
	   } else {
	       System.exit(0);
	   }
	    
	}
	
	public static void instructions() {
	    System.out.println("Το παιχνίδι αποτελείται από ένα σύνολο 60 ερωτήσεων που αφορούν την\n"
	                       "ελληνική ιστορία, μυθολογία, γεωγραφία και πολιτισμό. Χωρίζεται σε 4\n"
	                       "επίπεδα:εύκολο, μέτριο, δύσκολο και μεικτό στο οποίο υπάρχει διαβάθμιση\n"
	                       "ερωτήσεων από εύκολες σε δύσκολες. Το κάθε επίπεδο αποτελείται απο 10 ερωτήσεις\n"
	                       "εκτός του μεικτού που αποτελείται από 30. Δίνεται η δυνατότητα στον παίκτη να\n"
	                       "να παίξει μόνος του (singleplayer) ή με άλλα άτομα (multiplayer). Σκοπός του\n"
	                       "singleplayer είναι να απανατήσει σωστά σε όσες περισσότερες ερωτήσεις μπορεί\n"
	                       "ενώ στο multiplayer οι παίκτες δέχονται τις ίδιες ερωτήσεις και όποιος απαντήσει\n"
	                       "σωστά στις περισσότερες αναδεικνύεται νικητής. Στο multiplayer, σε περίπτωση\n"
	                       "ισοβασθμίας 2 παικτών, θα υπάρξει ένας τελευταίος γύρος 'φωτιά' στον όποιο γίνεται\n"
	                       "1 διαφορετική ερώτηση στον καθένα και αυτός που θα απαντήσει σωστά νικάει.");
	}
}
