package in.prismar.api.booster;

import in.prismar.api.PrismarinProvider;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface BoosterProvider {

    /**
     * Get current activated booster multiplier
     * If nothing is enabled it defaults to 1
     *
     * @param type
     * @return
     */
    int getMultiplier(BoosterType type);
}
