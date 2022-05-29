package com.kmorath.ecommerce.dao;

import com.kmorath.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")	// exposes endpint
public interface CountryRepository extends JpaRepository<Country, Integer> {
}