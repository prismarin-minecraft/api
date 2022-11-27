package in.prismar.api.map;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface GameMapProvider {


    /**
     * Check if provided uuid is inside the current rotated map
     *
     * @param uuid
     * @return
     */
    boolean isInMap(UUID uuid);

    /**
     * Check if provided uuid is inside map by the given name
     *
     * @param uuid
     * @param map
     * @return
     */
    boolean isInMap(UUID uuid, String map);


    /**
     * Get the current map fancy name
     *
     * @return
     */
    String getCurrentMapNameColored();

    /**
     * Get next map rotation timestamp
     *
     * @return
     */
    long getNextMapRotationTimestamp();

    /**
     * Get next vote rotation timestamp
     *
     * @return
     */
    long getVoteMapRotationTimestamp();


    /**
     * Get fancy name of map
     *
     * @return
     */
    String getMapName(String mapId);

    /**
     * Get map by player
     *
     * @param uuid
     * @return
     */
    Optional<String> getMapByPlayer(UUID uuid);

    /**
     * Gives you the top 10 player of the current map
     *
     * @return
     */
    List<GameMapLeaderboardEntry> getLeaderboard();


    /**
     * Gives you the top 10 player of the current map
     *
     * @return
     */
    List<GameMapLeaderboardEntry> getLeaderboard(String mapId);
}
