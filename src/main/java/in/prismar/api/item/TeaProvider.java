package in.prismar.api.item;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;

@PrismarinProvider
public interface TeaProvider {

    int getMultiplier(Player player, TeaType type);

    long getDuration(Player player, TeaType type);

    boolean hasAnyTea(Player player);
}
