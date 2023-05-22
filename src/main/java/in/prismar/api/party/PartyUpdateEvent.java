package in.prismar.api.party;

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
@AllArgsConstructor
@Getter
public class PartyUpdateEvent implements Event {

    private Player player;
}
