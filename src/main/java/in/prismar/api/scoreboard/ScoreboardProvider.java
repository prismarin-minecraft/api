package in.prismar.api.scoreboard;

import in.prismar.api.PrismarinProvider;
import in.prismar.api.scoreboard.sidebar.SidebarProvisioner;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface ScoreboardProvider {

    void recreateTablist(Player player);
    void recreateSidebar(Player player);
    void updateTablist(Player player);
    void updateTablistAll();

    void addSidebarProvisioner(SidebarProvisioner provisioner);
    List<SidebarProvisioner> getSidebarProvisioners();
}
