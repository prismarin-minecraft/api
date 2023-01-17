package in.prismar.api.rank;

import java.util.Collection;
import java.util.List;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface RankGroup {

    String getName();
    String getPrefix();
    String getSuffix();

    String getDiscordId();

    String getWebColor();

    Collection<String> getPermissions();

    String getTabSort();
    int getWeight();
}
