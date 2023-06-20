package MyFirstApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class KalkulatorTest {

    @DisplayName("Dodawanie")
    @Test
    void shouldAddLiczba1ToLiczba2() {

        //given
        Kalkulator kalkulator = new Kalkulator();
        double liczba1 = 6;
        double liczba2 = 3;

        //when
        double wynik = liczba1 + liczba2;

        //then
        Assertions.assertEquals(9, wynik);
    }

    @DisplayName("Odejmowanie")
    @Test
    void shouldSubtractLiczba1FromLiczba2() {

        //given
        Kalkulator kalkulator = new Kalkulator();
        double liczba1 = 6;
        double liczba2 = 3;

        //when
        double wynik = liczba1 - liczba2;

        //then
        Assertions.assertEquals(3, wynik);
    }

    @DisplayName("Mnożenie")
    @Test
    void shouldMultiplyLiczba1ByLiczba2() {

        //given
        Kalkulator kalkulator = new Kalkulator();
        double liczba1 = 6;
        double liczba2 = 3;

        //when
        double wynik = liczba1 * liczba2;

        //then
        Assertions.assertEquals(18, wynik);
    }

    @DisplayName("Dzielenie")
    @Test
    void shouldDivideLiczba1ByLiczba2() {

        //given
        Kalkulator kalkulator = new Kalkulator();
        double liczba1 = 6;
        double liczba2 = 3;

        //when
        double wynik = liczba1 / liczba2;

        //then
        Assertions.assertEquals(2, wynik);
    }
}