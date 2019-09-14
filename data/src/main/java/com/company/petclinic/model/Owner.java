package com.company.petclinic.model;

import java.util.Set;

public class Owner extends Person {

    private String addrees;
    private String city;
    private String tekephone;
    private Set<Pet> pets;

    public String getAddrees() {
        return addrees;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTekephone() {
        return tekephone;
    }

    public void setTekephone(String tekephone) {
        this.tekephone = tekephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
