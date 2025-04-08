
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

import net.mcreator.mariocraft.item.RottenmushroomItem;
import net.mcreator.mariocraft.item.Mushrom2Item;
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
	public static final RegistryObject<Item> QUESTION_MARK_COLLECTED = block(MarioCraftModBlocks.QUESTION_MARK_COLLECTED);
	public static final RegistryObject<Item> TOAD_SPAWN_EGG = REGISTRY.register("toad_spawn_egg", () -> new ForgeSpawnEggItem(MarioCraftModEntities.TOAD, -65536, -1, new Item.Properties()));
	public static final RegistryObject<Item> MUSHROOM_SPAWN_EGG = REGISTRY.register("mushroom_spawn_egg", () -> new ForgeSpawnEggItem(MarioCraftModEntities.MUSHROOM, -1, -65536, new Item.Properties()));
	public static final RegistryObject<Item> MUSHROM_2 = REGISTRY.register("mushrom_2", () -> new Mushrom2Item());
	public static final RegistryObject<Item> EVILMUSHROOM_SPAWN_EGG = REGISTRY.register("evilmushroom_spawn_egg", () -> new ForgeSpawnEggItem(MarioCraftModEntities.EVILMUSHROOM, -10092442, -13421569, new Item.Properties()));
	public static final RegistryObject<Item> ROTTENMUSHROOM = REGISTRY.register("rottenmushroom", () -> new RottenmushroomItem());
	public static final RegistryObject<Item> PERMANENT_MUSHROOM_SPAWN_EGG = REGISTRY.register("permanent_mushroom_spawn_egg", () -> new ForgeSpawnEggItem(MarioCraftModEntities.PERMANENT_MUSHROOM, -1, -13434880, new Item.Properties()));
	public static final RegistryObject<Item> PERMANENT_EVIL_MUSHROOM_SPAWN_EGG = REGISTRY.register("permanent_evil_mushroom_spawn_egg",
			() -> new ForgeSpawnEggItem(MarioCraftModEntities.PERMANENT_EVIL_MUSHROOM, -13434829, -13421569, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
