
package net.mcreator.mariocraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RottenmushroomItem extends Item {
	public RottenmushroomItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
