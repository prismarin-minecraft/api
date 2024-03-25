package in.prismar.api.hungergames;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

@PrismarinProvider
public interface HGProvider {

    boolean isPlaying(Player player);
}
