package in.prismar.api.user.settings;


import in.prismar.api.user.User;
import org.bukkit.inventory.ItemStack;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface UserSetting<T extends User> {

    void onChange(T user, boolean state);

    boolean getDefaultValue(T user);

    ItemStack getIcon(T user);

    String getKey();

    default String getPermission() {return "";}
}
