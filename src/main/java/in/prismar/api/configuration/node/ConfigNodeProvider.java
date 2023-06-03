package in.prismar.api.configuration.node;

import in.prismar.api.PrismarinProvider;
import in.prismar.library.common.event.EventBus;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface ConfigNodeProvider<T extends ConfigNode> {

    T getNode(String id);

    int getInteger(String id, int defaultValue);

    double getDouble(String id, double defaultValue);

    String getString(String id, String defaultValue);

    EventBus getEventBus();
}
