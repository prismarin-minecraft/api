package in.prismar.api.warp;

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
public interface WarpProvider {

    void teleport(Player player, String warp);
    void teleportToSpawn(Player player);

    boolean existsWarp(String name);

    Location getWarp(String name);

}
