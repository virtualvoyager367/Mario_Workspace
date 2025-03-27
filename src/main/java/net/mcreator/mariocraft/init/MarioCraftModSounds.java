
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mariocraft.MarioCraftMod;

public class MarioCraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MarioCraftMod.MODID);
	public static final RegistryObject<SoundEvent> COIN_SOUND = REGISTRY.register("coin_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mario_craft", "coin_sound")));
}
