package in.prismar.api.clan;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface Clan {

    String getId();
    String getName();

    /**
     * Get owner uuid
     * @return
     */
    String getOwner();

    String getOwnerName();
}
