package in.prismar.api.song;

import in.prismar.api.PrismarinProvider;
import org.bukkit.Location;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface SongProvider {

    void play(Location location, String url, int distance);
    void stop(Location location);
}
