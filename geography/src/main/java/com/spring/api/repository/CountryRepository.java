package com.spring.api.repository;

import com.spring.api.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.JaasAuthenticationProvider;

public interface CountryRepository extends JpaRepository<Country, String> {
}
