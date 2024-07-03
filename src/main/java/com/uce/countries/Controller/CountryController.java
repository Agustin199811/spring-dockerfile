package com.uce.countries.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.countries.Model.Country;
import com.uce.countries.Repository.CountryRepository;

@RestController
@RequestMapping("/api")
public class CountryController {
    
    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/countries")
    private ResponseEntity<List<Country>> getAllCountries(){
        return ResponseEntity.ok(countryRepository.findAll());
    }

    @PostMapping("/countries")
    private ResponseEntity<Country> saveCountry(@RequestBody Country country){
        Country newCountry = countryRepository.save(country);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCountry);
    }
}
