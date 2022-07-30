package com.visualnuts.exercisetwo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Country {

    CountryDAO countryDAO;
    
    public Country() {
        this(new CountryDAO());
    }

    public Country(CountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }
    
    public long count() {
        Optional<List<CountryDTO>> countries = countryDAO.getAll();
        if (countries.isPresent()) {
            return countries.get().stream()
                    .count();
        }
        return 0;
    }

    public String findMostOfficialLanguagesSpeakGerman() {
        Optional<List<CountryDTO>> countries = countryDAO.getAll();
        if (countries.isPresent()) {
            return countries.get().stream()
                    .filter(c -> c.getLanguages().contains("de"))
                    .reduce((o1, o2) -> (o1.getLanguages().size() > o2.getLanguages().size()) ? o1 : o2)
                    .get()
                    .getCountry();
        }
        return null;
    }

    public long countLanguages() {
        Optional<List<CountryDTO>> countries = countryDAO.getAll();
        if (countries.isPresent()) {
            return countries.get().stream()
                    .map(countryDTO -> countryDTO.getLanguages())
                    .flatMap(Collection::stream)
                    .distinct()
                    .count();
        }
        return 0;
    }

    public String findMostOfficialLanguages() {
        Optional<List<CountryDTO>> countries = countryDAO.getAll();
        if (countries.isPresent()) {
            return countries.get().stream()
                    .reduce((o1, o2) -> (o1.getLanguages().size() > o2.getLanguages().size()) ? o1 : o2)
                    .get()
                    .getCountry();
        }
        return null;
    }

    public String findMostCommonLanguage() {
        Optional<List<CountryDTO>> countries = countryDAO.getAll();
        if (countries.isPresent()) {
            return countries.get().stream()
                    .map(countryDTO -> countryDTO.getLanguages())
                    .flatMap(Collection::stream)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .max(Comparator.comparing(Map.Entry::getValue))
                    .map(Map.Entry::getKey)
                    .get();
        }
        return null;
    }
}
