package com.uce.countries.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uce.countries.Model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    
}
