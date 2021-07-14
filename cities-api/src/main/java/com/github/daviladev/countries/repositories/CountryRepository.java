package com.github.daviladev.countries.repositories;

import com.github.daviladev.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
