package com.lambdaschool.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountriesApplication {
   public static CountryList theCountryList;
   public static void main(String[] args) {
      theCountryList = new CountryList();
      SpringApplication.run(CountriesApplication.class, args);
   }

}
