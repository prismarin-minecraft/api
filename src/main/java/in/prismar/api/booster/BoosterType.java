package in.prismar.api.booster;

import in.prismar.library.spigot.item.ItemBuilder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@RequiredArgsConstructor
@Getter
public enum BoosterType {

    MONEY(new ItemBuilder(Material.GOLD_INGOT).setName("§6Money").build(), 30 * 60),
    BATTLEPASS(new ItemBuilder(Material.NAME_TAG).setName("§dBattlepass").build(), 30 * 60),
    MINE(new ItemBuilder(Material.NETHERITE_PICKAXE).setName("§cMine").allFlags().build(), 30 * 60),
    LUMBER(new ItemBuilder(Material.OAK_LOG).setName("§2Lumber").build(), 30 * 60),
    COLLECTION(new ItemBuilder(Material.PAINTING).setName("§aCollection XP").build(), 30 * 60);

    private final ItemStack icon;
    private final long untilInSeconds;
}
