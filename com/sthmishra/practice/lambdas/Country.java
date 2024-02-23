package com.sthmishra.practice.lambdas;

public class Country {
    private String country;
    private String continent;
    private long population;

    Country(String country, String continent, long population) {
        this.country = country;
        this.continent = continent;
        this.population = population;
    }

    public String getCountry() { return this.country; }
    public String getContinent() { return this.continent; }
    public long getPopulation() { return this.population; }
}
