package com.visualnuts.exercisetwo;

/*
Image you have a set of data in JSON, describing official languages spoken by countries, as
such:
[
{
country:"US",
languages: ["en"]
},
{
country:"BE",
languages: ["nl","fr","de"]
},
{
country:"NL",
languages: ["nl","fy"]
},
{
country:"DE",
languages: ["de"]
},
{
country:"ES",
languages: ["es"]
}
]
Write a function in Java that:

- returns the number of countries in the world
- finds the country with the most official languages, where they officially speak German (de).
- that counts all the official languages spoken in the listed countries.
- to find the country with the highest number of official languages.
- to find the most common official language(s), of all countries.
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        Country country = new Country();
        System.out.println(country.count());
        System.out.println(country.findMostOfficialLanguagesSpeakGerman());
        System.out.println(country.countLanguages());
        System.out.println(country.findMostOfficialLanguages());
        System.out.println(country.findMostCommonLanguage());
    }
}
