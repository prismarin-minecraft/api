package in.prismar.api.scoreboard.sidebar;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.function.Consumer;

public interface SidebarEntity {

    void addStaticLine(String content);

    void addDynamicLine(String content, String name, Consumer<Team> update);

    Player getPlayer();
}
