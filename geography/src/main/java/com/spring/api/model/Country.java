package com.spring.api.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;

@Entity
@Table(name = "country")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Country {

    @Id
    @Column(name = "Code")
    private String code;

    @Column(name = "Name", nullable = true)
    private String name;

    @Column(name = "Continent")
    private String continent;

    @Column(name = "Region")
    private String region;

    @Column(name = "SurfaceArea")
    private double surfaceArea;

    @Column(name = "IndepYear")
    private Integer indepYear;

    @Column(name = "Population")
    private int population;

    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;

    @Column(name = "GNP")
    private Double gnp;

    @Column(name = "GNPOld")
    private Double gnpold;

    @Column(name = "LocalName")
    private String localName;

    @Column(name = "GovernmentForm")
    private String governmentForm;

    @Column(name = "HeadOfState")
    private String headOfState;

    @Column(name = "Capital")
    private Integer capital;

    @Column(name = "Code2")
    private String code2;


}

