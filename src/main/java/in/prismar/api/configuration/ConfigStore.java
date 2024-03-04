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

    default String getPropertyOrDefault(String key, String defaultValue) {
        try {
            String property = getProperty(key);
            return property == null ? defaultValue : property;
        } catch (Exception ex) {
            return defaultValue;
        }
    }

    default int getIntPropertyOrDefault(String key, int defaultValue) {
        try {
            return getIntProperty(key);
        } catch (Exception ex) {
            return defaultValue;
        }
    }

    default double getDoublePropertyOrDefault(String key, double defaultValue) {
        try {
            return getDoubleProperty(key);
        } catch (Exception ex) {
            return defaultValue;
        }
    }

    default long getLongPropertyOrDefault(String key, long defaultValue) {
        try {
            return getLongProperty(key);
        } catch (Exception ex) {
            return defaultValue;
        }
    }

    default boolean getBooleanPropertyOrDefault(String key, boolean defaultValue) {
        try {
            return getBooleanProperty(key);
        } catch (Exception ex) {
            return defaultValue;
        }
    }

    default float getFloatPropertyOrDefault(String key, float defaultValue) {
        try {
            return getFloatProperty(key);
        } catch (Exception ex) {
            return defaultValue;
        }
    }

    String getProperty(String category, String key);

}
