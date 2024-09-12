package com.huidos22.algoritmos.exercise.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.huidos22.algoritmos.domain.City;
import com.huidos22.algoritmos.domain.Country;

public class Exercise1Streams {

	public static void main(String... argsss) {
//http://binkurt.blogspot.com/2017/10/exercises-to-study-java-stream-api.html
		// Find the highest populated city of each country
		List<Country> countries = new ArrayList<>();
		List<City> highPopulatedCitiesOfCountries = 
				countries.stream()
				.map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
				.filter(Optional::isPresent)
				.map(Optional::get)
				.collect(Collectors.toList());
		highPopulatedCitiesOfCountries.forEach(System.out::println);
		
		
		System.arraycopy(countries, 0, highPopulatedCitiesOfCountries, 0, 0);
	}
}
