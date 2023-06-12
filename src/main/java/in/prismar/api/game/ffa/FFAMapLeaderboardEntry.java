package in.prismar.api.game.ffa;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@AllArgsConstructor
@Getter
public class FFAMapLeaderboardEntry {

    private final UUID uuid;
    private final String name;
    private final int kills;
}
