
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
	public static final RegistryObject<SoundEvent> TOADSOUND = REGISTRY.register("toadsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mario_craft", "toadsound")));
	public static final RegistryObject<SoundEvent> TOADSOUND2 = REGISTRY.register("toadsound2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mario_craft", "toadsound2")));
	public static final RegistryObject<SoundEvent> TOADHURTSOUND = REGISTRY.register("toadhurtsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mario_craft", "toadhurtsound")));
	public static final RegistryObject<SoundEvent> TOADDEATHSOUND = REGISTRY.register("toaddeathsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mario_craft", "toaddeathsound")));
	public static final RegistryObject<SoundEvent> BOING = REGISTRY.register("boing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mario_craft", "boing")));
	public static final RegistryObject<SoundEvent> BOING1 = REGISTRY.register("boing1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mario_craft", "boing1")));
}
