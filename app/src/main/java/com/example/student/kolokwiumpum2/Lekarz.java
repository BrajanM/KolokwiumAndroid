package com.example.student.kolokwiumpum2;

/**
 * Created by student on 2018-01-17.
 */

public class Lekarz {
    private String imie;
    private String nazwisko;
    private String specjalka;
    private String specjalizacja;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    Lekarz(String imie, String nazwisko, String specjalka)
    {


        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalka = specjalka;
    }
}
