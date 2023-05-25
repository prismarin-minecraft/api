package in.prismar.api;

import in.prismar.library.spigot.text.ColoredMessage;

import java.awt.*;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public final class PrismarinConstants {

    public static final String RAW_PREFIX = "§f下";
    public static final String PREFIX = RAW_PREFIX + " §7";
    public static final String CURRENT_SEASON = "0";
    public static final String PERMISSION_PREFIX = "prismarin.";

    /** Messages **/
    public static final String NO_PERMISSION_MESSAGE = PREFIX + "§cYou do not have enough permissions.";
    public static final String NOT_VALID_NUMBER_MESSAGE = PREFIX + "§cPlease type a valid number.";
    public static final String PLAYER_NOT_FOUND_MESSAGE = PREFIX + "§7This player does not exists.";
    public static final String PLAYER_NOT_ONLINE_MESSAGE = PREFIX + "§7This player is not online.";

    /** Extra **/
    public static final String BORDER = "§8§m---------------§8[ §b● §8]§8§m---------------";
    public static final String DOT = "§8▪";
    public static final String LISTING_DOT = " §8│";
    public static final String ARROW_RIGHT = "§8»";
    public static final String ARROW_LEFT = "§8«";
}
