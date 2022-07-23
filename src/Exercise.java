import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        /**
         * 1. chcę aby w programie było o imię i nazwisko oraz wiek
         *  2. chcę aby była pętla sprawdzająca czy osoba jest pełnoletnia, jeżeli nie to napis wypad, jeżeli tak, to zaproszenie
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imię");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.next();
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();
        if (wiek >= 18) {
            System.out.println("Zapraszam do klubu");
        }
        if (wiek < 18) {
            System.out.println("Wypad z klubu kaszojadzie");
        }

    }
}
