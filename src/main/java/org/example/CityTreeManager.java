package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CityTreeManager {
    private final TreeNode root = new TreeNode("World");
    private final Map<String, String> countryToContinent = new HashMap<>();
    private final Map<String, String> cityToCountry = new HashMap<>();

    public TreeNode buildTree(List<CityData> data) {
        for (CityData entry : data) {
            addCity(entry);
        }
        return root;
    }

    private void addCity(CityData entry) {
        String city = entry.city();
        String country = entry.country();
        String continent = entry.continent();

        validateCountryToContinentRelation(country, continent);
        countryToContinent.put(country, continent);

        validateCityToCountryRelation(city, country);
        cityToCountry.put(city, country);

        TreeNode continentNode = root.addChild(continent);
        TreeNode countryNode = continentNode.addChild(country);
        countryNode.addChild(city);

        System.out.println("Added " + city + " (" + country + ", " + continent + ")");
    }

    private void validateCityToCountryRelation(String city, String country) {
        if (cityToCountry.containsKey(city) &&
                !cityToCountry.get(city).equals(country)) {
            throw new IllegalArgumentException(
                    "Inconsistent data: " + city + " cannot belong to two countries!");
        }
    }

    private void validateCountryToContinentRelation(String country, String continent) {
        if (countryToContinent.containsKey(country) &&
                !countryToContinent.get(country).equals(continent)) {
            throw new IllegalArgumentException(
                    "Inconsistent data: " + country + " cannot belong to two continents!");
        }
    }

}
