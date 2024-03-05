package in.prismar.api.bounty;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Getter
public class BountyEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final Player player;
    private final double value;


    public BountyEvent(Player player, double value) {
        this.player = player;
        this.value = value;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
