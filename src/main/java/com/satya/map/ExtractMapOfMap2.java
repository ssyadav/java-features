package com.satya.map;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtractMapOfMap2 {
    public static void main(String[] args){
        List<Person> persons = Util.getPersons();
        Map<Gender, Map<City, Long>> genderCityCount =
                persons.stream().collect(
                                Collectors.groupingBy(
                                        Person::gender,
                                        Collectors.groupingBy(
                                                Person::city,
                                                Collectors.counting())));

        System.out.println(genderCityCount);
    }
}
