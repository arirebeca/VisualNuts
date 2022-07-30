package com.visualnuts.exercisetwo;

import java.util.List;
import java.util.Objects;

public class CountryDTO {
    String country;
    List<String> languages;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryDTO that = (CountryDTO) o;
        return country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
                "country='" + country + '\'' +
                ", languages=" + languages +
                '}';
    }
}
