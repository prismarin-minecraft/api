package in.prismar.api.configuration.node;

import java.util.Collection;
import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface ConfigNode {

    String getId();
    String getName();

    Object getValue();

    <T extends ConfigNode> Map<String, T> getChildren();

    double valueAsDouble();

    int valueAsInteger();
}
