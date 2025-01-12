package com.satya.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtractMapOfMap {

  public static void main(String[] args) {
    // create a map of persons based
    List<Person> persons = Util.getPersons();

    Map<Gender, Map<City, List<String>>> genderCityMap =
        persons.stream()
            .collect(
                Collectors.groupingBy(
                    Person::gender,
                    Collectors.groupingBy(
                        Person::city, Collectors.mapping(Person::name, Collectors.toList()))));

    System.out.println(genderCityMap);
  }
}
