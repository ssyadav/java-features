package com.satya.map;

import java.util.List;

public class Util {

    public static List<Person> getPersons() {
        return List.of(
                new Person(1, "Satya", 10, Gender.MALE, City.BLR),
                new Person(2, "Ravi", 23, Gender.MALE, City.DL),
                new Person(3, "Ram", 50, Gender.MALE, City.RJ),
                new Person(4, "Laxman", 49, Gender.MALE, City.HYD),
                new Person(5, "Pooja", 55, Gender.FEMALE, City.MUL),
                new Person(6, "Radha", 35, Gender.FEMALE, City.BLR),
                new Person(7, "Sita", 55, Gender.FEMALE, City.BLR),
                new Person(8, "Parwati", 60, Gender.FEMALE, City.BLR));
    }
}
