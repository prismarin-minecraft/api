package in.prismar.api.clan;

import in.prismar.api.PrismarinProvider;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

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

    T getClanByPlayer(UUID uuid);

    boolean existsClanById(String id);

    boolean isInClan(UUID uuid);

    boolean isInClan(UUID uuid, T clan);

    boolean isInClan(Player player);

    boolean isInClan(Player player, T clan);

    boolean isAnyoneOnline(String id);

    boolean existsClanByLocation(Location location);

    T getClanByLocation(Location location);

    boolean refreshBanner(String id);

    void increaseMachines(String clanId);

    void decreaseMachines(String clanId);

}
