package in.prismar.api.booster;

import in.prismar.api.PrismarinProvider;
import in.prismar.api.user.User;

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

    /**
     * Get users booster amount
     *
     * @param user
     * @param type
     * @return
     */
    int getBoosters(User user, BoosterType type);

    /**
     * Give a user a booster
     *
     * @param user
     * @param type
     * @param amount
     */
    void giveBoosters(User user, BoosterType type, int amount);

    /**
     * Remove boosters from user
     *
     * @param user
     * @param type
     * @param amount
     */
    void removeBoosters(User user, BoosterType type, int amount);
}
