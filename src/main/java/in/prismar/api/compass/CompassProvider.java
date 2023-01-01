package in.prismar.api.compass;

import in.prismar.api.PrismarinProvider;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface CompassProvider {

    void addEntry(Player player, Location location, String name, String color);
    void removeEntry(Player player, String name);
    boolean hasEntry(Player player, String name);
}
