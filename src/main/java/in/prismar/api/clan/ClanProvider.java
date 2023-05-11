package in.prismar.api.clan;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface ClanProvider<T extends Clan> {

    T getClanById(String id);

    T getClanByPlayer(Player player);

    boolean existsClanById(String id);

    boolean isInClan(Player player);

    boolean isInClan(Player player, T clan);

}
