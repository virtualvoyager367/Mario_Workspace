
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mariocraft.entity.ToadEntity;
import net.mcreator.mariocraft.entity.PurpleCoinEntity;
import net.mcreator.mariocraft.entity.MushroomEntity;
import net.mcreator.mariocraft.entity.EvilmushroomEntity;
import net.mcreator.mariocraft.entity.CoinEntity;
import net.mcreator.mariocraft.MarioCraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MarioCraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MarioCraftMod.MODID);
	public static final RegistryObject<EntityType<CoinEntity>> COIN = register("coin",
			EntityType.Builder.<CoinEntity>of(CoinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CoinEntity::new).fireImmune().sized(1.6f, 1.8f));
	public static final RegistryObject<EntityType<PurpleCoinEntity>> PURPLE_COIN = register("purple_coin", EntityType.Builder.<PurpleCoinEntity>of(PurpleCoinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(PurpleCoinEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadEntity>> TOAD = register("toad",
			EntityType.Builder.<ToadEntity>of(ToadEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MushroomEntity>> MUSHROOM = register("mushroom",
			EntityType.Builder.<MushroomEntity>of(MushroomEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MushroomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EvilmushroomEntity>> EVILMUSHROOM = register("evilmushroom",
			EntityType.Builder.<EvilmushroomEntity>of(EvilmushroomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvilmushroomEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CoinEntity.init();
			PurpleCoinEntity.init();
			ToadEntity.init();
			MushroomEntity.init();
			EvilmushroomEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COIN.get(), CoinEntity.createAttributes().build());
		event.put(PURPLE_COIN.get(), PurpleCoinEntity.createAttributes().build());
		event.put(TOAD.get(), ToadEntity.createAttributes().build());
		event.put(MUSHROOM.get(), MushroomEntity.createAttributes().build());
		event.put(EVILMUSHROOM.get(), EvilmushroomEntity.createAttributes().build());
	}
}
