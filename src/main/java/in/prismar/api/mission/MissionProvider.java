package in.prismar.api.mission;

import in.prismar.api.PrismarinProvider;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface MissionProvider<T extends Mission> {

    T create(T mission);

    Optional<T> getByIdOptional(String id);

    T addProgress(Player player, String missionId, int stage, long progress);

    Optional<MissionData> getDataByUUIDOptional(UUID uuid, Mission mission);

    Collection<T> getAllMissions();

    boolean isFinished(UUID uuid, T mission);
}
