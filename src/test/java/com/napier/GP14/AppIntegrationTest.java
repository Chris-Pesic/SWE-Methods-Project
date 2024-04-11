package com.napier.GP14;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 10000);

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


}