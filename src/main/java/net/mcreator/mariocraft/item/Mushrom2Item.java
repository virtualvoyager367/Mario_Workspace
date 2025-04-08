
package net.mcreator.mariocraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class Mushrom2Item extends Item {
	public Mushrom2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(20).saturationMod(0.8f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 5;
	}
}
