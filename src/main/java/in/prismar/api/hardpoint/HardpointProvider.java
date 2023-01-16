package in.prismar.api.hardpoint;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface HardpointProvider {

    boolean isCurrentlyPlaying(Player player);

    String getCurrentCapturedTeam();

    long getPointRotation();

    long getCurrentPoints(String team);

    int getTeamSize(String team);
}
