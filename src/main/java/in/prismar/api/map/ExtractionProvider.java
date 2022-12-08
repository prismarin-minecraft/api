package in.prismar.api.map;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface ExtractionProvider {

    /**
     * Check if provided player is inside extraction
     *
     * @param player
     * @return
     */
    boolean isIn(Player player);

    /**
     * Check if provided player is inside extraction safe zone
     *
     * @param player
     * @return
     */
    boolean isInSafeZone(Player player);
}
