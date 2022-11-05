package com.abhay.dining_review_api.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="RESTRAUNTS")
@Data
public class Restraunt {

    @Column(name="ID")
    @GeneratedValue
    private Long id;

    @Column(name="RESTRAUNT_NAME")
    private String restrauntName;

    @Column(name = "RESTRAUNT_ADDRESS")
    private String restrauntAddress;

    @Column(name = "RESTRAUNT_RATING")
    private Integer restrauntRating;

    @Column(name = "PEANUT_ALLERGY_SCORE")
    private Integer peanutAllergyScore;

    @Column(name = "EGG_ALLERGY_SCORE")
    private Integer eggAllergyScore;

    @Column(name = "DAIRY_ALLERGY_SCORE")
    private Integer dairyAllergyScore;



}
