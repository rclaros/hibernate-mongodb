package com.ads.project.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Proyecto implements Serializable {

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "budget")
    private double budget;

    public Proyecto() {
    }

    public Proyecto(String name, String description, double budget) {
        this.name = name;
        this.description = description;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}
