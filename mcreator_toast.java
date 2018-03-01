package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class mcreator_toast {

	public mcreator_toast() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("roleplaymod:toast", "inventory"));
		GameRegistry.addRecipe(new ItemStack(block, 4), new Object[]{"01X", "X4X", "XXX", Character.valueOf('0'), Items.BREAD,
				Character.valueOf('1'), mcreator_mcDonalfd.block, Character.valueOf('4'), Items.REDSTONE,});
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

	static {
		block = (Item) (new CustomItemFood(10, 0.3F, false));
		block = ((CustomItemFood) block);
		block.setMaxStackSize(64);
		block.setCreativeTab(mcreator_mods2.tab);

	}

	public static class CustomItemFood extends ItemFood {
		public CustomItemFood(int par2, float par3, boolean par4) {
			super(par2, par3, par4);
			setUnlocalizedName("Toast");
			setRegistryName("Toast");
			GameRegistry.register(this);
		}

	}
}
