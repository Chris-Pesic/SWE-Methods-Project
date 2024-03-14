package com.napier.GP14;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppTest {

    static App app;

    @BeforeAll
    static void init() {
        app = new App();
    }

    @Test
    void printCountriesTestNull() {
        app.printCountriesinOrder(null);
    }

    @Test
    void printCountriesTestEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountriesinOrder(countries);
    }



    @Test
    void printCountries() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "B";
        cou.Name = "X";
        cou.Continent = "Y";
        cou.Region = "Z";
        cou.Population = 55000;
        cou.Capital = "A";
        countries.add(cou);
        app.printCountriesinOrder(countries);
    }


    @Test
    void displayCity() {
        City cit = new City();
        System.out.println(
                cit.Name + " "
                        + cit.CountryCode + " "
                        + cit.District + " "
                        + cit.Population + " ");
        app.displayCity(cit);
    }


}
