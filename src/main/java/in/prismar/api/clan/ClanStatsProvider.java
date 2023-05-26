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
public interface ClanStatsProvider {

    void addKill(Player player);
    void addDeath(Player player);

    void addBossFights(Player player);

    void addMobKills(Player player);

    void addMinedBlock(Player player);

    void addFarmedWood(Player player);
}
