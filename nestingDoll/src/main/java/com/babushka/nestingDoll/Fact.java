package com.babushka.nestingDoll;

import javax.persistence.*;

@Entity
@Table(name = "fact_tbl")
public class Fact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String factOne;
    private String factTwo;
    private String factThree;

    public Fact() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFactOne() {
        return factOne;
    }

    public void setFactOne(String factOne) {
        this.factOne = factOne;
    }

    public String getFactTwo() {
        return factTwo;
    }

    public void setFactTwo(String factTwo) {
        this.factTwo = factTwo;
    }

    public String getFactThree() {
        return factThree;
    }

    public void setFactThree(String factThree) {
        this.factThree = factThree;
    }
}
