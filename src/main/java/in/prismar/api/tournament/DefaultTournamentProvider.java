package in.prismar.api.tournament;

import org.bukkit.entity.Player;

public class DefaultTournamentProvider implements TournamentProvider{
    @Override
    public boolean isPlaying(Player player) {
        return false;
    }
}
