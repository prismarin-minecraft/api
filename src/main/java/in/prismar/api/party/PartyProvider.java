package in.prismar.api.party;

import in.prismar.api.PrismarinProvider;
import in.prismar.library.common.event.EventBus;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface PartyProvider {

    boolean isOwnerOfParty(Player player);

    boolean hasParty(Player player);

    List<Player> getPartyMembers(Player player);

}
