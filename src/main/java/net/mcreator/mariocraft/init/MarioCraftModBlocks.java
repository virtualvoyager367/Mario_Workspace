
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mariocraft.block.QuestionMarkCollectedBlock;
import net.mcreator.mariocraft.block.QuestionMarkBlock;
import net.mcreator.mariocraft.block.PipeBlock;
import net.mcreator.mariocraft.block.BrickBlock;
import net.mcreator.mariocraft.MarioCraftMod;

public class MarioCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MarioCraftMod.MODID);
	public static final RegistryObject<Block> PIPE = REGISTRY.register("pipe", () -> new PipeBlock());
	public static final RegistryObject<Block> QUESTION_MARK = REGISTRY.register("question_mark", () -> new QuestionMarkBlock());
	public static final RegistryObject<Block> BRICK = REGISTRY.register("brick", () -> new BrickBlock());
	public static final RegistryObject<Block> QUESTION_MARK_COLLECTED = REGISTRY.register("question_mark_collected", () -> new QuestionMarkCollectedBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
