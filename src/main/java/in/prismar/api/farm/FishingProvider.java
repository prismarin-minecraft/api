package in.prismar.api.farm;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

@PrismarinProvider
public interface FishingProvider {

    String giveRewardByAssignedRod(Player player, String assignedRod);
}
