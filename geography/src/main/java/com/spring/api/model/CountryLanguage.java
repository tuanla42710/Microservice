package com.spring.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

@Entity
@Table(name = "countrylanguage")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryLanguage {

    @Id
    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "Language")
    private String language;

    @Column(name = "IsOfficial")
    private String isOfficial;

    @Column(name = "Percentage")
    private double percentage;
}
