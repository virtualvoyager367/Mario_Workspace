
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mariocraft.block.entity.QuestionMarkTileEntity;
import net.mcreator.mariocraft.MarioCraftMod;

public class MarioCraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MarioCraftMod.MODID);
	public static final RegistryObject<BlockEntityType<QuestionMarkTileEntity>> QUESTION_MARK = REGISTRY.register("question_mark", () -> BlockEntityType.Builder.of(QuestionMarkTileEntity::new, MarioCraftModBlocks.QUESTION_MARK.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
