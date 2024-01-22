package in.prismar.api.item;

import in.prismar.api.PrismarinProvider;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

@PrismarinProvider
public interface CustomItemProvider {

    void createAmmoFilledGun(Player player, ItemStack based);
}
