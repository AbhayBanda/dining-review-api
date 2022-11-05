package com.abhay.dining_review_api.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="DINING_REVIEWS")
@Data
public class DiningReview {


    public DiningReview(Restraunt restraunt) {
        this.restrauntId = restraunt.getId();
    }

    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "REVIEWER_NAME")
    private String reviewerName;

    @Column(name = "RESTRAUNT_ID")
    private Long restrauntId;

    @Column(name = "OPTIONAL_PEANUT_SCORE")
    private Integer optionalPeanutScore;

    @Column(name = "OPTIONAL_EGG_SCORE")
    private Integer optionalEggScore;

    @Column(name = "OPTIONAL_DAIRY_SCORE")
    private Integer optionalDairyScore;

    @Column(name = "OPTIONAL_COMMENTRY")
    private Integer optionalCommentry;

    @Column(name = "ADMIN_REVIEW_STATUS")
    private Boolean adminReviewStatus;


}
