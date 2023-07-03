package in.prismar.api.warzone.dungeon;

import in.prismar.api.PrismarinProvider;
import org.bukkit.Location;

import java.util.Optional;

@PrismarinProvider
public interface DungeonProvider {

    Optional<DungeonInfo> getDungeonByLocation(Location location);
}
