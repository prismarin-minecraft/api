package in.prismar.api.user.data;

import lombok.Data;

import java.util.Map;
import java.util.Set;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@Data
public class SeasonData {

    private double balance;

    private BattlePass battlePass;

    private Map<String, Long> timestamps;

    private Map<String, Long> stats;

    private Map<String, ArsenalItem> arsenal;

    private String perk;

    private Map<String, String> storage;

    private Map<String, Object> attachments;

    private Set<String> unlocked;

    private String clan;
}
