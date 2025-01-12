package com.satya.map;

import java.util.List;
import java.util.stream.Collectors;

public class ExtractListOfString {

  public static void main(String[] args) {

    List<Person> persons = Util.getPersons();

    // get list of female name from the list of persons
    List<String> femaleNames =
        persons.stream()
            .filter(person -> person.gender().equals(Gender.FEMALE))
            .map(Person::name)
            .collect(Collectors.toList());

    System.out.println(femaleNames);
  }
}
