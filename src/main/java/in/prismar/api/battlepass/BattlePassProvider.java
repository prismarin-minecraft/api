package in.prismar.api.battlepass;

import in.prismar.api.PrismarinProvider;
import in.prismar.api.user.User;
import in.prismar.library.common.event.EventBus;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface BattlePassProvider {

    void addExp(User user, long exp);
    long getExpToNextLevel(User user);
    long getExpToNextLevel(int level);
    EventBus getEventBus();
}
