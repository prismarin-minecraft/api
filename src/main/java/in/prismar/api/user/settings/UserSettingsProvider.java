package in.prismar.api.user.settings;

import in.prismar.api.PrismarinProvider;
import in.prismar.api.user.User;

import java.util.Collection;
import java.util.List;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface UserSettingsProvider<T extends User> {

    void registerSetting(UserSetting<T> setting);

    Collection<UserSetting<T>> getRegisteredSettings();


    void setSetting(T user, String settingKey, Object value);

    boolean isSetting(T user, String settingKey);

}
