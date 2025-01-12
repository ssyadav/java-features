package com.satya.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtractMapOfMap1 {

  public static void main(String[] args) {
    // create a map of persons based
    List<Person> persons = Util.getPersons();

    /*Map<Gender, Map<City, List<Person>>> genderCityMap =
    persons.stream()
        .collect(
            Collectors.groupingBy(
                Person::gender,
                Collectors.groupingBy(
                    Person::city, Collectors.mapping(Function.identity(), Collectors.toList()))));*/

    Map<Gender, Map<City, List<Person>>> genderCityMap =
        persons.stream()
            .collect(Collectors.groupingBy(Person::gender, Collectors.groupingBy(Person::city)));

    System.out.println(genderCityMap);

    // access the map
    List<Person> persons1 =
        genderCityMap
            .computeIfAbsent(Gender.MALE, p -> new HashMap<>())
            .computeIfAbsent(City.HYD, p -> new ArrayList<>());

    System.out.println(persons1);
  }
}
