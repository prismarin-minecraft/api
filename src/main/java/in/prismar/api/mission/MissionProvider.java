package in.prismar.api.mission;

import in.prismar.api.PrismarinProvider;
import org.bukkit.Material;

import java.util.UUID;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface MissionProvider<T extends Mission> {

    T create(String id, MissionType type, Material icon, String title, int maxStage);

    T create(T mission);

    T getById(String id);

    T addProgress(UUID uuid, String missionId, int stage, long progress);

    MissionData getDataByUUID(UUID uuid, String missionId);

    boolean isFinished(UUID uuid, String missionId);
}
