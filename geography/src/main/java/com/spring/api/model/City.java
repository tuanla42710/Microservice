package com.spring.api.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class City {

    @Id
    @Column(name = "ID")
    private int Id;

    @Column(name = "Name")
    private String name;

    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "District")
    private String district;

    @Column(name = "Population")
    private int population;

}
