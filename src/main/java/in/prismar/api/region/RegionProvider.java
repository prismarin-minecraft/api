package in.prismar.api.region;

import in.prismar.api.PrismarinProvider;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface RegionProvider {

    boolean exists(String region);

    boolean isIn(Location location, String region);

    Map<String, Object> getFlag(String region, String flag);

    boolean hasFlag(String region, String flag);

    boolean isInRegionWithFlag(Location location, String flag);

    Location getRandomLocationInRegion(String region);

    Location getLocationA(String region);

    Location getLocationB(String region);

}
