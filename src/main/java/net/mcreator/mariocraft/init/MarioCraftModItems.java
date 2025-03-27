
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mariocraft.item.IconItem;
import net.mcreator.mariocraft.block.display.QuestionMarkDisplayItem;
import net.mcreator.mariocraft.MarioCraftMod;

public class MarioCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MarioCraftMod.MODID);
	public static final RegistryObject<Item> PIPE = block(MarioCraftModBlocks.PIPE);
	public static final RegistryObject<Item> QUESTION_MARK = REGISTRY.register(MarioCraftModBlocks.QUESTION_MARK.getId().getPath(), () -> new QuestionMarkDisplayItem(MarioCraftModBlocks.QUESTION_MARK.get(), new Item.Properties()));
	public static final RegistryObject<Item> COIN_SPAWN_EGG = REGISTRY.register("coin_spawn_egg", () -> new ForgeSpawnEggItem(MarioCraftModEntities.COIN, -13261, -256, new Item.Properties()));
	public static final RegistryObject<Item> BRICK = block(MarioCraftModBlocks.BRICK);
	public static final RegistryObject<Item> PURPLE_COIN_SPAWN_EGG = REGISTRY.register("purple_coin_spawn_egg", () -> new ForgeSpawnEggItem(MarioCraftModEntities.PURPLE_COIN, -3407617, -6736897, new Item.Properties()));
	public static final RegistryObject<Item> ICON = REGISTRY.register("icon", () -> new IconItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
