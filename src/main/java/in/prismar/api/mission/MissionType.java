package in.prismar.api.mission;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Getter
@AllArgsConstructor
public enum MissionType {

    DAILY(60 * 60 * 24),

    WEEKLY(60 * 60 * 24 * 7),

    SEASONAL(-1);

    private final long resetTimeInSeconds;
}
