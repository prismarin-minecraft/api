package in.prismar.api.mission;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface Mission {

    String getId();
    MissionType getType();

    String getTitle();
    long getMaxProgress();

}
