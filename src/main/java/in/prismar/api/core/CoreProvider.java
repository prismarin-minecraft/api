package in.prismar.api.core;

import in.prismar.api.PrismarinProvider;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface CoreProvider {

    String getApiUrl();
    String getApiToken();
}
