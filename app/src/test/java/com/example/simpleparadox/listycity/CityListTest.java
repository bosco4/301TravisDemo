package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Regina", "Saskatchewan")));
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

    }

    @Test
    void testRemoveCities() {
        CityList cityList = mockCityList();
        assertTrue(cityList.getCities().size() == 1);

        City tempCity = new City("Regina", "Saskatchewan");
        cityList.add(tempCity);
        cityList.add(new City("Vancouver", "BC"));
        assertTrue(cityList.getCities().size() == 3);

        cityList.delete(tempCity);
        assertTrue(cityList.getCities().size() == 2);




    }

}
