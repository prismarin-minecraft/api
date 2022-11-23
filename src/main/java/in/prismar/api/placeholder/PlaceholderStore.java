package in.prismar.api.placeholder;

import in.prismar.api.PrismarinProvider;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface PlaceholderStore {

    <T> T getPlaceholder(String key);

    <T> void setPlaceholder(String key, T value);

    boolean existsPlaceholder(String key);
}
