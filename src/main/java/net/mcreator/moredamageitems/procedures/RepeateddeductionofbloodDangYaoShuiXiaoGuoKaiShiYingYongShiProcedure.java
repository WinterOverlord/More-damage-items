package net.mcreator.moredamageitems.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class RepeateddeductionofbloodDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 100; index0++) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.MOB);
		}
	}
}
