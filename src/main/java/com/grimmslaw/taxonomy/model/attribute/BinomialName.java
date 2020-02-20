package com.grimmslaw.taxonomy.model.attribute;

import com.grimmslaw.taxonomy.model.tree.Taxonomy.Ranks;

import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

public class BinomialName extends TaxonomicName {

    public BinomialName() {}

    public BinomialName(String genus, String species) {
        this.genus = genus;
        this.species = species;
    }

    public BinomialName(String binomialName) {
        String[] splitName = binomialName.split(" ");
        if (splitName.length == 2) {
            this.genus = splitName[0];
            this.species = splitName[1];
        } else {
            System.out.println("Invalid Binomial Name");
        }
    }

    public BinomialName(Map<Ranks, String> taxonomyMap) {
        this(taxonomyMap.get(Ranks.GENUS), taxonomyMap.get(Ranks.SPECIES));
    }

    @Override
    public String asString(boolean abbr) {
        return (abbr ? getGenus(true) : getGenus()) + " " + getSpecies();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinomialName that = (BinomialName) o;
        return Objects.equals(genus, that.genus) &&
                Objects.equals(species, that.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genus, species);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BinomialName.class.getSimpleName() + "[", "]")
                .add("genus='" + genus + "'")
                .add("species='" + species + "'")
                .toString();
    }
}
