package com.satya.map;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtractMapByGenderAndListOfPersons {
    public static void main(String[] args){
        List<Person> persons = Util.getPersons();

        // create a map of persons based on gender
        Map<Gender, List<Person>> genderMap =
                persons.stream().collect(
                    Collectors.groupingBy(Person::gender)
                );

    System.out.println(genderMap);
  }
}
