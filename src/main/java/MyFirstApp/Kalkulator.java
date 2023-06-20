package MyFirstApp;

import java.util.Scanner;

public class Kalkulator {
    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w aplikacji kalkulator!");

        while (true) {
            System.out.println("Wybierz operację, którą chcesz wykonać:");
            System.out.println("1. Dodawanie.");
            System.out.println("2. Odejmowanie.");
            System.out.println("3. Mnożenie.");
            System.out.println("4. Dzielenie.");
            System.out.println("0. Wyjście.");

            int wybranaCyfra = scanner.nextByte();

            if (wybranaCyfra == 0) {
                System.out.println("Do widzenia!");
                break;
            }

            System.out.println("Podaj pierwszą liczbę:");
            double liczba1 = scanner.nextDouble();

            System.out.println("Podaj drugą liczbę:");
            double liczba2 = scanner.nextDouble();

            double wynik = 0;

            switch (wybranaCyfra) {
                case 1:
                    wynik = liczba1 + liczba2;
                    break;
                case 2:
                    wynik = liczba1 - liczba2;
                    break;
                case 3:
                    wynik = liczba1 * liczba2;
                    break;
                case 4:
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Nie można podzielić przez 0!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór cyfry.");
                    continue;
            }

            System.out.println("Wynik:" + wynik);
        }
    }
}
