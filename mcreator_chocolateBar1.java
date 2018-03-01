package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class mcreator_chocolateBar1 {

	public mcreator_chocolateBar1() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("roleplaymod:chocolatebar1", "inventory"));
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
		block = (Item) (new CustomItemFood(4, 0.3F, false));
		block = ((CustomItemFood) block);
		block.setMaxStackSize(64);
		block.setCreativeTab(mcreator_mods2.tab);

	}

	public static class CustomItemFood extends ItemFood {
		public CustomItemFood(int par2, float par3, boolean par4) {
			super(par2, par3, par4);
			setUnlocalizedName("ChocolateBar1");
			setRegistryName("ChocolateBar1");
			GameRegistry.register(this);
		}

		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			float var4 = 1.0F;
			int i = (int) (entity.prevPosX + (entity.posX - entity.prevPosX) * (double) var4);
			int j = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) * (double) var4 + 1.62D - (double) entity.getYOffset());
			int k = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) var4);

			if (true) {
				world.playSound((EntityPlayer) null, (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(
								("roleplaymod:mod.music.jellycastle.mdk"))), SoundCategory.NEUTRAL, 1.0F, 1.0F);
			}

		}
	}
}
