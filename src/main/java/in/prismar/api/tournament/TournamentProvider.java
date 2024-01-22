package in.prismar.api.tournament;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

@PrismarinProvider
public interface TournamentProvider {

    boolean isPlaying(Player player);
}
