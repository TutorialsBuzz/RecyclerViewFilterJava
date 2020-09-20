package com.tutorialsbuzz.recyclerview.TabFragments;

public class CountryModel {

    String name;
    String isocode;

    CountryModel(String name, String isocode){
        this.name=name;
        this.isocode=isocode;
    }

    public String getName() {
        return name;
    }

    public String getisoCode() {
        return isocode;
    }
}
