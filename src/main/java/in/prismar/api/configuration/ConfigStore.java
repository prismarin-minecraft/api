package in.prismar.api.configuration;

import in.prismar.api.PrismarinProvider;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface ConfigStore {

    String getProperty(String key);

    default int getIntProperty(String key) {
        return Integer.parseInt(getProperty(key));
    }

    default double getDoubleProperty(String key) {
        return Double.parseDouble(getProperty(key));
    }

    default long getLongProperty(String key) {
        return Long.parseLong(getProperty(key));
    }

    default boolean getBooleanProperty(String key) {
        return Boolean.parseBoolean(getProperty(key));
    }

    default float getFloatProperty(String key) {
        return Float.parseFloat(getProperty(key));
    }

    String getProperty(String category, String key);

}
