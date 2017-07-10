package ru.rpgc;

import static org.bukkit.entity.EntityType.RABBIT;
import static org.bukkit.entity.EntityType.ZOMBIE;

/**
 * Created by bigtows on 10/07/2017.
 */
public class EntityType {
    public static org.bukkit.entity.EntityType fromString(String entity) {
        switch (entity.toUpperCase()) {
            case "ZOMBIE":
                return ZOMBIE;
            case "RABBIT":
                return RABBIT;
            default:
                return null;
        }
    }
}
