import java.util.Scanner;

public class CardinalDirectionTest {
    public static void main(String[] args) {

        System.out.println("Podaj kierunek geograficzny:");
        Scanner scanner = new Scanner(System.in);
        String kierunek = scanner.nextLine();

        CardinalDirection yourDirection = CardinalDirection.valueOf(kierunek);


        switch (yourDirection) {
            case NORTH:
                System.out.println(yourDirection);
                break;
            case EAST:
                System.out.println(yourDirection);
                break;
            case SOUTH:
                System.out.println(yourDirection);
                break;
            case WEST:
                System.out.println(yourDirection);
                break;
        }


        System.out.println("Podaj kierunek geograficzny:");
        int kierunekNum = scanner.nextInt();
        CardinalDirection yourDirectionNum;
        System.out.println(yourDirection.convert(kierunekNum));
    }
}
