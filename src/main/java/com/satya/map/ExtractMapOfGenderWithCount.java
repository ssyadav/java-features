package com.satya.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtractMapOfGenderWithCount {

  public static void main(String[] args) {
    // create a map of persons based
    List<Person> persons = Util.getPersons();

    Map<Gender, Long> generCountMap =
            persons.stream().collect(
                    Collectors.groupingBy(
                            Person::gender,
                            Collectors.counting()
                    ));

    System.out.println(generCountMap);
  }
}
