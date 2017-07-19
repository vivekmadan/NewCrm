package com.ibm.newcrm.entity;

import javax.persistence.*;

/**
 * Created by VivekMadan on 20-06-2017.
 */

@Entity
@Table(name="CIRCLE_MAPPING")
public class CircleMapping
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "circle_mapping_generator")
    @SequenceGenerator(name = "circle_mapping_generator", sequenceName = "CIRCLE_MAPPING_SEQ")
    @Column(name="CIRCLE_CODE")
    private int circleCode;

    @Column(name="CIRCLE_NAME")
    private String circleName;

    public int getCircleCode() {
        return circleCode;
    }

    public void setCircleCode(int circleCode) {
        this.circleCode = circleCode;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    @Override
    public String toString() {
        return "CircleMapping{" +
                "circleCode='" + circleCode + '\'' +
                ", circleName='" + circleName + '\'' +
                '}';
    }
}
