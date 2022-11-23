package in.prismar.api.user.data;

import lombok.Data;

import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
public class ArsenalItem {

    private String customItemId;
    private Map<String, Object> data;
}
