package in.prismar.api.crate;

import in.prismar.api.PrismarinProvider;
import in.prismar.api.user.User;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface CrateProvider {

    void addCrates(User user, String id, int amount);
    String getDisplayName(String id);

}
