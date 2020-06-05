package com.lambdaschool.countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/data")
public class CountryController
{
   // http://localhost:8080/data/names/all
   @GetMapping(value = "/names/all",
           produces = {"application/json"})
   public ResponseEntity<?> getAllCountries()
   {
      CountriesApplication.theCountryList.countryList.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
      return new ResponseEntity<>(CountriesApplication.theCountryList.countryList, HttpStatus.OK);
   }
   // http://localhost:8080/data/names/start/{letter}
   @GetMapping(value = "/names/start/{letter}",
           produces = {"application/json"})
   public ResponseEntity<?> getCountriesByLetter(@PathVariable char letter)
   {
      List<Country> rtnCountriesByLetter = CountriesApplication.theCountryList.findCountriesByLetter(c -> c.getName().toUpperCase().charAt(0)==Character.toUpperCase(letter));
      return new ResponseEntity<>(rtnCountriesByLetter, HttpStatus.OK);
   }
}
