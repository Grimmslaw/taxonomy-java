package com.grimmslaw.taxonomy.model.attribute;

public abstract class TaxonomicName {

    protected String genus;
    protected String species;

    public String getGenus() {
        return getGenus(false);
    }

    public String getGenus(boolean abbr) {
        return genus.substring(0, 1).toUpperCase() + ".";
    }

    public String getSpecies() {
        return species;
    }

    public String asString() {
        return asString(false);
    }

    public abstract String asString(boolean abbr);

}
