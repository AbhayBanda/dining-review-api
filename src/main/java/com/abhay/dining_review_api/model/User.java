package com.abhay.dining_review_api.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
@Data
public class User {

    @Column(name="ID")
    @GeneratedValue
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "INTERESTED_IN_PEANUT_ALLERGY")
    private Boolean interestedInPeanutAllergy;

    @Column(name = "INTERESTED_IN_PEANUT_ALLERGY")
    private Boolean interestedInEggAllergy;

    @Column(name = "INTERESTED_IN_PEANUT_ALLERGY")
    private Boolean interestedInDairyAllergy;

}
