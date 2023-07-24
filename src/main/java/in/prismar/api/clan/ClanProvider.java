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

    boolean isAllowedToBuildMachines(Location location);

    void giveBuff(T clan, ClanBuff buff);

    boolean hasBuff(T clan, ClanBuff buff);

    void sendPrefixMessage(T clan, String message);


    void teleportToIsland(Player player);

    boolean isUnlocked(Player player, String id);

    boolean isUnlocked(T clan, String id);

    void addCollectionExp(T clan, String id);

    void addCollectionExp(T clan, String id, long exp);

    long getCollectionExpToNextLevel(T clan, String id);

    long getCollectionExpToNextLevel(String id, int level);

}
