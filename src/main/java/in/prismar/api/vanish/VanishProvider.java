package in.prismar.api.vanish;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface VanishProvider {

    boolean isVanished(Player player);
}
