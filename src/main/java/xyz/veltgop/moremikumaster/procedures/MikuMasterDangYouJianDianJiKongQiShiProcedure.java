package xyz.veltgop.moremikumaster.procedures;

import xyz.veltgop.moremikumaster.MoremikumasterModElements;
import xyz.veltgop.moremikumaster.MoremikumasterMod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@MoremikumasterModElements.ModElement.Tag
public class MikuMasterDangYouJianDianJiKongQiShiProcedure extends MoremikumasterModElements.ModElement {
	public MikuMasterDangYouJianDianJiKongQiShiProcedure(MoremikumasterModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoremikumasterMod.LOGGER.warn("Failed to load dependency entity for procedure MikuMasterDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LUCK, (int) 600, (int) 5));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 600, (int) 5));
	}
}
