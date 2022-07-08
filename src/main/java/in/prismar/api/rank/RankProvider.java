package in.prismar.api.rank;


import in.prismar.api.PrismarinProvider;

import java.util.List;
import java.util.UUID;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface RankProvider {

    RankGroup getGroupByName(String name);
    RankGroup getGroupByPlayer(UUID uuid);
    List<RankGroup> getGroups();
}
