import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {

        TripPlanner[] newtrip = new TripPlanner[3];
        Scanner scan = new Scanner(System.in);

        newtrip[0] = new TripPlanner(null, null, 0);
        newtrip[1] = new TripPlanner(null, null, 0);
        newtrip[2] = new TripPlanner(null, null, 0);

        int count = 0;
        for (int i = 0; i < newtrip.length; i++) {
            System.out.println("Podaj kraj");
            newtrip[i].setCountry(scan.nextLine());
            System.out.println("Podaj walutę");
            newtrip[i].setCurrency(scan.nextLine());
            System.out.println("Podaj kurs");
            newtrip[i].setExchangeRate(scan.nextDouble());
            scan.nextLine();
            count++;
            
            for (int j = 0; j < count; j++) {
                if (i == j) {
                } else {
                    boolean alreadyExists = newtrip[i].equals(newtrip[j]);
                    if (alreadyExists) {
                        System.out.println("Taki rekord już istnieje. Spróbuj jeszcze raz");
                        i--;
                        count--;
                        break;
                    }
                }
            }
        }
        scan.close();
    }
}