package in.prismar.api.user.data;

import in.prismar.library.common.repository.entity.RepositoryEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
@NoArgsConstructor
public class UserData implements RepositoryEntity<String> {

    private String id;
    private String name;

    //------------------------------------------------------//
    // Global
    private long joined;
    private long lastJoined;
    //------------------------------------------------------//

    private Map<String, SeasonData> seasons;
}
