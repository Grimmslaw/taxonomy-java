package com.grimmslaw.taxonomy.model.attribute;

import com.grimmslaw.taxonomy.model.tree.Taxonomy.Ranks;
import com.grimmslaw.taxonomy.model.tree.TaxonomyMap;

public class TrinomialName extends BinomialName {

    private String subspecies;

    public TrinomialName() {}

    public TrinomialName(String genus, String species, String subspecies) {
        super(genus, species);
        this.subspecies = subspecies;
    }

    public TrinomialName(String trinomialName) {
        String[] nameSplit = trinomialName.split(" ");
        if (nameSplit.length == 3) {
            genus = nameSplit[0];
            species = nameSplit[1];
            subspecies = nameSplit[2];
        } else {
            System.out.println("Invalid Trinomial Name");
        }
    }

    public TrinomialName(TaxonomyMap taxonomyMap) {
        super(taxonomyMap);
        this.subspecies = taxonomyMap.get(Ranks.SUBSPECIES);
    }

    public String getSubspecies() {
        return subspecies;
    }

    public String getSpeciesAbbr() {
        return getSpecies().substring(0, 1).toLowerCase() + ".";
    }

    @Override
    public String asString(boolean abbr) {
        return super.asString(abbr) + " " + getSubspecies();
    }

}
