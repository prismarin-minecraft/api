package in.prismar.api.location;

import in.prismar.api.PrismarinProvider;
import org.bukkit.Location;

import java.util.Optional;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface LocationProvider {

    Location getLocation(String key);
    Optional<Location> getLocationOptional(String key);
    void setLocation(String key, Location location);

    boolean deleteLocation(String key);

    boolean existsLocation(String key);
}
