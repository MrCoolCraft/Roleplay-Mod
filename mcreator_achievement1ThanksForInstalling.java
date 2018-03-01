package mod.mcreator;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.stats.Achievement;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class mcreator_achievement1ThanksForInstalling {

	public mcreator_achievement1ThanksForInstalling() {
	}

	public static Object instance;
	public static Achievement achievement = (new Achievement("achievement.achievement1ThanksForInstalling", "achievement1ThanksForInstalling", 0, 0,
			new ItemStack(mcreator_craftPad.block), (Achievement) null));

	public void load(FMLInitializationEvent event) {
		achievement.registerStat();
		achievement.setSpecial();
		achievement.initIndependentStat();
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public void registerRenderers() {
	}
}
