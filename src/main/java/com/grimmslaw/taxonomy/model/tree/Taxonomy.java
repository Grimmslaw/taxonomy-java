package com.grimmslaw.taxonomy.model.tree;

public class Taxonomy {

    public enum Fields {
        ZOOLOGY, BIOLOGY, BOTANY, VIROLOGY, BACTERIOLOGY, LEPIDOPTEROLOGY,
        PROTISTOLOGY, ICHTHYOLOGY, MYCOLOGY, UNSPECIFIED
    }

    public enum GenusTypes {
        BACTERIA, PLANTS, ALGAE, FUNGI, ANIMAL
    }

    public enum Ranks {
        DOMAIN("domain", true, 0),
        EMPIRE("empire", false, 0),
        SUBDOMAIN("subdomain", false, 1, Fields.BIOLOGY),
        REALM("realm", false, 2, Fields.VIROLOGY),
        SUBREALM("subrealm", false, 3, Fields.VIROLOGY),
        HYPERKINGDOM("hyperkingdom", false, 4, Fields.PROTISTOLOGY),
        SUPERKINGDOM("superkingdom", false, 5),
        KINGDOM("kingdom", true, 6),
        SUBKINGDOM("subkingdom", false, 7),
        INFRAKINGDOM("infrakingdom", false, 8),
        PARVKINGDOM("parvkingdom", false, 9),
        SUPERPHYLUM("superphylum", false, 10),
        SUPERDIVISION_B("superdivision", false, 10, Fields.BOTANY),
        PHYLUM("phylum", true, 11, new GenusTypeMap(null, "phyta",
                "phyta", "mycota", null)),
        DIVISION_B("division", false, 11, Fields.BOTANY, new GenusTypeMap(null,
                "phyta","phyta", "mycota", null)),
        SUBPHYLUM("subphylum", false, 12, new GenusTypeMap(null, "phytina",
                "phytina", "mycotina", null)),
        SUBDIVISION_B("subdivision", false, 12, Fields.BOTANY, new GenusTypeMap(null,
                "phytina","phytina", "mycotina", null)),
        INFRAPHYLUM("infraphylum", false, 13),
        INFRADIVISION_B("infradivision", false, 13, Fields.BOTANY),
        MICROPHYLUM("microphylum", false, 14),
        SUPERCLASS("superclass", false, 15),
        CLASS("class", true, 16, new GenusTypeMap("ia", "opsida",
                "phyceae", "mycetes", null)),
        SUBCLASS("subclass", false, 17, new GenusTypeMap("idae", "idae",
                "phycidae", "mycetidae", null)),
        INFRACLASS("infraclass", false, 18),
        PARVCLASS("parvclass", false, 19),
        SUPERDIVISION_Z("superdivision", false, 20, Fields.ZOOLOGY),
        DIVISION_Z("division", false, 21, Fields.ZOOLOGY),
        SUBDIVISION_Z("subdivision", false, 22, Fields.ZOOLOGY),
        INFRADIVISION_Z("infradivision", false, 23, Fields.ZOOLOGY),
        SUPERLEGION("superlegion", false, 24, Fields.ZOOLOGY),
        LEGION("legion", false, 25, Fields.ZOOLOGY),
        SUBLEGION("sublegion", false, 26, Fields.ZOOLOGY),
        INFRALEGION("infralegion", false, 27, Fields.ZOOLOGY),
        SUPERCOHORT("supercohort", false, 28, Fields.ZOOLOGY),
        COHORT("cohort", false, 29, Fields.ZOOLOGY),
        SUBCOHORT("subcohort", false, 30, Fields.ZOOLOGY),
        INFRACOHORT("infracohort", false, 31, Fields.ZOOLOGY),
        GIGAORDER("gigaorder", false, 32, Fields.ZOOLOGY),
        MAGNORDER("magnorder", false, 33, Fields.ZOOLOGY),
        MEGAORDER("megaorder", false, 33, Fields.ZOOLOGY),
        GRANDORDER("grandorder", false, 34, Fields.ZOOLOGY),
        CAPAXORDER("capaxorder", false, 34, Fields.ZOOLOGY),
        MIRORDER("mirorder", false, 35, Fields.ZOOLOGY),
        HYPERORDER("hyperorder", false, 35, Fields.ZOOLOGY),
        SUPERORDER("superorder", false, 36, new GenusTypeMap(null, "anae",
                "anae", "anae", null)),
        SERIES_I("series", false, 37, Fields.ICHTHYOLOGY),
        ORDER("order", true, 38, new GenusTypeMap("ales", "ales",
                "ales", "ales", null)),
        NANORDER("nanorder", false, 39, Fields.ZOOLOGY),
        HYPOORDER("hypoorder", false, 40, Fields.ZOOLOGY),
        MINORDER("minorder", false, 41, Fields.ZOOLOGY),
        SUBORDER("suborder", false, 42, new GenusTypeMap("ineae", "ineae",
                "ineae", "ineae", null)),
        INFRAORDER("infraorder", false, 43, new GenusTypeMap(null, "aria",
                "aria", "aria", null)),
        PARVORDER("parvorder", false, 44, Fields.ZOOLOGY),
        MICROORDER("microorder", false, 44, Fields.ZOOLOGY),
        SECTION_Z("section", false, 45, Fields.ZOOLOGY),
        SUBSECTION_Z("subsection", false, 46, Fields.ZOOLOGY),
        GIGAFAMILY("gigafamily", false, 47, Fields.ZOOLOGY),
        MEGAFAMILY("megafamily", false, 48, Fields.ZOOLOGY),
        GRANDFAMILY("grandfamily", false, 49, Fields.ZOOLOGY),
        HYPERFAMILY("hyperfamily", false, 50, Fields.ZOOLOGY),
        SUPERFAMILY("superfamily", false, 51, new GenusTypeMap(null, "acea",
                "acea", "acea", "oidea")),
        EPIFAMILY("epifamily", false, 52, Fields.ZOOLOGY, new GenusTypeMap(null,
                null, null, null, "oidae")),
        SERIES_L("series", false, 53, Fields.LEPIDOPTEROLOGY),
        GROUP("group", false, 54, Fields.LEPIDOPTEROLOGY),
        FAMILY("family", true, 55, new GenusTypeMap("aceae", "aceae",
                "aceae", "aceae", "idae")),
        SUBFAMILY("subfamily", false, 56, new GenusTypeMap("oideae", "oideae",
                "oideae", "oideae", "inae")),
        INFRAFAMILY("infrafamily", false, 57, new GenusTypeMap(null, null,
                null, null, "odd")),
        SUPERTRIBE("supertribe", false, 58),
        TRIBE("tribe", false, 59, new GenusTypeMap("eae", "eae",
                "eae", "eae", "ini")),
        SUBTRIBE("subtribe", false, 60, new GenusTypeMap("inae", "inae",
                "inae", "inae", "ina")),
        INFRATRIBE("infratribe", false, 61, new GenusTypeMap(null, null,
                null, null, "ad/iti")),
        GENUS("genus", true, 62),
        SUBGENUS("subgenus", false, 63),
        SECTION_B("section", false, 64, Fields.BOTANY),
        SUBSECTION_B("subsection", false, 65, Fields.BOTANY),
        SERIES_B("series", false, 66, Fields.BOTANY),
        SUBSERIES_B("subseries", false, 67, Fields.BOTANY),
        SUPERSPECIES("superspecies", false, 68),
        SPECIES_GROUP("species-group", false, 68),
        SPECIES("species", true, 69),
        SUBSPECIES("subspecies", false, 70),
        FORMA_SPECIALIS("forma specialis", false, 70, Fields.MYCOLOGY),
        PATHOVAR("pathovar", false, 70, Fields.BACTERIOLOGY),
        VARIETY("variety", false, 71),
        VARIETAS("varietas", false, 71, Fields.BOTANY),
        FORM_Z("form", false, 71, Fields.ZOOLOGY),
        MORPH("morph", false, 71, Fields.ZOOLOGY),
        ABERRATION("aberration", false, 71, Fields.LEPIDOPTEROLOGY),
        SUBVARIETY("subvariety", false, 72, Fields.BOTANY),
        FORM_B("form", false, 73, Fields.BOTANY),
        FORMA("forma", false, 73, Fields.BOTANY),
        SUBFORM("subform", false, 74, Fields.BOTANY);

        public String label;
        Fields field;
        boolean main;
        GenusTypeMap suffixes;
        // not guaranteed unique
        int index;

        Ranks(String label, boolean main, int index, Fields field, GenusTypeMap suffixes) {
            this.label = label;
            this.main = main;
            this.index = index;
            this.field = field;
            this.suffixes = suffixes;
        }

        Ranks(String label, boolean main, int index, Fields field) {
            this(label, main, index, field, new GenusTypeMap());
        }

        Ranks(String label, boolean main, int index, GenusTypeMap suffixes) {
            this(label, main, index, Fields.UNSPECIFIED, suffixes);
        }

        Ranks(String label, boolean main, int index) {
            this(label, main, index, Fields.UNSPECIFIED, new GenusTypeMap());
        }

        public int compareToRank(Ranks rank) {
            if (rank == null) {
                return 1;
            }

            if (this == rank || this.index == rank.index) {
                return 0;
            } else if (this.index > rank.index) {
                return 1;
            } else {
                return -1;
            }
        }
    }

}
