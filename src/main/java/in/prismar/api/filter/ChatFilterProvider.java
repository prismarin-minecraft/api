package in.prismar.api.filter;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface ChatFilterProvider {

    boolean check(Player sender, String message);

}
