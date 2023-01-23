package in.prismar.api.mission;

import in.prismar.api.PrismarinProvider;

import java.util.UUID;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface MissionProvider<T extends Mission> {

    T create(String id, MissionType type, String title, long maxProgress);

    T getById(String id);

    T addProgress(UUID uuid, String missionId, long progress);

    T getProgressByPlayer(UUID uuid, String missionId);

    boolean isFinished(UUID uuid);
}
