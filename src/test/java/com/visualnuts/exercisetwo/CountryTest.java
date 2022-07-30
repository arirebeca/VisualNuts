package com.visualnuts.exercisetwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CountryTest {

    Country country;

    @BeforeEach
    void setUp(@Mock CountryDAO countryDAO) {
        country = new Country(countryDAO);

        Mockito.lenient().when(countryDAO.getAll()).thenReturn(getAll());
    }

    @Test
    void givenTestData_whenCount_ThenFive() {
        assertEquals(5, country.count());
    }

    @Test
    void givenTestData_whenFindMostOfficialLanguagesSpeakGerman_ThenBE() {
        assertEquals("BE", country.findMostOfficialLanguagesSpeakGerman());
    }

    @Test
    void givenTestData_whenCountLanguages_ThenSix() {
        assertEquals(6, country.countLanguages());
    }

    @Test
    void givenTestData_whenFindMostOfficialLanguages_ThenBE() {
        assertEquals("BE", country.findMostOfficialLanguages());
    }

    @Test
    void givenTestData_whenFindMostCommonLanguage_ThenDe() {
        assertEquals("de", country.findMostCommonLanguage());
    }

    private Optional<List<CountryDTO>> getAll() {
        List<CountryDTO> countryDTOs = new ArrayList<>();

        countryDTOs.add(countryDTO("US", "en"));
        countryDTOs.add(countryDTO("BE", "nl","fr","de"));
        countryDTOs.add(countryDTO("NL", "nl","fy"));
        countryDTOs.add(countryDTO("DE", "de"));
        countryDTOs.add(countryDTO("ES", "es"));

        return Optional.of(countryDTOs);
    }

    private CountryDTO countryDTO(String country, String... languages) {
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setCountry(country);
        countryDTO.setLanguages(Arrays.asList(languages));
        return countryDTO;
    }
}