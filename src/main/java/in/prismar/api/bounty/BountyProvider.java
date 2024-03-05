package in.prismar.api.bounty;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

@PrismarinProvider
public interface BountyProvider {

    /**
     * Get bounty of a player
     *
     * @param player
     * @return = if number is 0 there is no bounty on this player
     */
    double getBountyValue(Player player);
}
