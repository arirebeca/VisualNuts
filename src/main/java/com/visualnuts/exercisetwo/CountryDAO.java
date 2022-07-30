package com.visualnuts.exercisetwo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountryDAO {

    public Optional<List<CountryDTO>> getAll() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return Optional.of(Arrays.asList(objectMapper.readValue(json(), CountryDTO[].class)));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    private String json() throws IOException {
        return readFromInputStream(getClass().getClassLoader().getResourceAsStream("country.json"));
    }

    private String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append(System.lineSeparator());
            }
        }
        return resultStringBuilder.toString();
    }

}
