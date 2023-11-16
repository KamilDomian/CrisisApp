import java.util.Scanner;

public class Uzytkownik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj! :)");

        System.out.print("Podaj imie: " );
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj nick: ");
        String  nick = scanner.nextLine();

        System.out.print("Podaj haslo: ");
        String hasło = scanner.nextLine();

        System.out.println("Super, ze jestes "+ imie+nazwisko + "!");


    }
}
