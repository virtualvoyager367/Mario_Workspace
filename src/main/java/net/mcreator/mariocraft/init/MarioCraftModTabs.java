
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mariocraft.MarioCraftMod;

public class MarioCraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarioCraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> MARIO_TAB = REGISTRY.register("mario_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mario_craft.mario_tab")).icon(() -> new ItemStack(MarioCraftModItems.ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MarioCraftModBlocks.PIPE.get().asItem());
				tabData.accept(MarioCraftModBlocks.QUESTION_MARK.get().asItem());
				tabData.accept(MarioCraftModItems.COIN_SPAWN_EGG.get());
				tabData.accept(MarioCraftModBlocks.BRICK.get().asItem());
				tabData.accept(MarioCraftModItems.PURPLE_COIN_SPAWN_EGG.get());
				tabData.accept(MarioCraftModItems.TOAD_SPAWN_EGG.get());
				tabData.accept(MarioCraftModItems.MUSHROOM_SPAWN_EGG.get());
				tabData.accept(MarioCraftModItems.MUSHROM_2.get());
				tabData.accept(MarioCraftModItems.EVILMUSHROOM_SPAWN_EGG.get());
				tabData.accept(MarioCraftModItems.ROTTENMUSHROOM.get());
				tabData.accept(MarioCraftModItems.PERMANENT_MUSHROOM_SPAWN_EGG.get());
				tabData.accept(MarioCraftModItems.PERMANENT_EVIL_MUSHROOM_SPAWN_EGG.get());
			}).build());
}
