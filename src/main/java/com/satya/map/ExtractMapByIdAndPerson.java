package com.satya.map;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExtractMapByIdAndPerson {

  public static void main(String[] args) {

    List<Person> persons = Util.getPersons();

    // get list of female name from the list of persons
    /*Map<Integer, Person> personMap =
    persons.stream().collect(Collectors.toMap(Person::id, person -> person));*/

    Map<Integer, Person> personMap =
        persons.stream().collect(Collectors.toMap(Person::id, Function.identity(), (p1, p2) -> p1));

    System.out.println(personMap);
  }
}
