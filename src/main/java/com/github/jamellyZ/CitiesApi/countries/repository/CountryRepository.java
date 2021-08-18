package com.github.jamellyZ.CitiesApi.countries.repository;

import com.github.jamellyZ.CitiesApi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
