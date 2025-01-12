package com.satya.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtractMapByGenderAndListOfNames {

  public static void main(String[] args) {
    // create a map of persons based
    List<Person> persons = Util.getPersons();

    Map<Gender, List<String>> genderMap =
        persons.stream()
            .collect(
                Collectors.groupingBy(
                    Person::gender, Collectors.mapping(Person::name, Collectors.toList())));

    System.out.println(genderMap);

    List<String> names = persons.stream()
            .collect(Collectors.mapping(Person::name, Collectors.toList()));
    System.out.println(names);

  }
}
