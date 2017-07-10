package ru.rpgc;

/**
 * Created by bigtows on 10/07/2017.
 */
enum CoverageProperty {
    UNDEFINED, TYPE_COVERAGE, RADIUS, REFRESH_TIME, COUNT_MOBS;


    CoverageProperty fromString(String property) {
        switch (property.toUpperCase()) {
            case "TYPE_COVERAGE":
                return TYPE_COVERAGE;
            case "RADIUS":
                return RADIUS;
            case "REFRESH_TIME":
                return REFRESH_TIME;
            case "COUNT_MOBS":
                return COUNT_MOBS;
            default:
                return UNDEFINED;
        }
    }
}