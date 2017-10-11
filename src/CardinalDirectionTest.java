import java.util.Scanner;

public class CardinalDirectionTest {
    public static void main(String[] args) {

        System.out.println("Podaj kierunek geograficzny:");
        Scanner scanner = new Scanner(System.in);
        String kierunek = scanner.nextLine();

        CardinalDirection yourDirection = CardinalDirection.valueOf(kierunek);
        System.out.println(yourDirection);

        System.out.println("Podaj kierunek geograficzny:");
        int kierunekNum = scanner.nextInt();
        CardinalDirection yourDirectionNum;
        System.out.println(yourDirection.convert(kierunekNum));
    }
}
