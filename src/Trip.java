import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {

        TripPlanner[] newtrip = new TripPlanner[3];
        Scanner scan = new Scanner(System.in);

        newtrip[0] = new TripPlanner(null, null, 0);
        newtrip[1] = new TripPlanner(null, null, 0);
        newtrip[2] = new TripPlanner(null, null, 0);

        for (int i = 0; i < newtrip.length; i++) {
            System.out.println("Podaj kraj");
            newtrip[i].setCountry(scan.nextLine());
            System.out.println("Podaj walutę");
            newtrip[i].setCurrency(scan.nextLine());
            System.out.println("Podaj kurs");
            newtrip[i].setExchangeRate(scan.nextDouble());
            scan.nextLine();
            if (i > 1) {
                if (newtrip[i].equals(newtrip[i - 1])) {
                    System.out.println("Wprowadzone informacje już istnieją. Podaj inny kraj");
                    i--;
                }
            }
        }
    }
}