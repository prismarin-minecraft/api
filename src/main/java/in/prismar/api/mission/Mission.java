package in.prismar.api.mission;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface Mission {

    String getId();
    MissionType getType();
    Material getIcon();
    String getTitle();
    String getDescription(int stage);
    String[] getRewards();
    void onReceiveReward(Player player);
    long getMaxProgress(int stage);
    int getMaxStage();

}
