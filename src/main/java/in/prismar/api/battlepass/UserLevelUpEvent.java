package in.prismar.api.battlepass;

import in.prismar.api.user.User;
import in.prismar.library.common.event.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Getter
@AllArgsConstructor
public class UserLevelUpEvent implements Event {

    private User user;
    private Player player;
    private int oldLevel;
    private int nextLevel;
}
