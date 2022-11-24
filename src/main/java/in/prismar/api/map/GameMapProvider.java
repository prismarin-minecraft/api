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
public interface GameMapProvider {

    boolean isInMap(UUID uuid);
    String getCurrentMapNameColored();
}
