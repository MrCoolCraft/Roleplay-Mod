package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.Random;

public class mcreator_saw1 {

	public mcreator_saw1() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack stack = new ItemStack(block, 1);
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("roleplaymod:saw1", "inventory"));
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
		block = (new ItemSaw1() {
		}).setUnlocalizedName("Saw1");
		block.setRegistryName("Saw1");
		GameRegistry.register(block);
		block.setCreativeTab(mcreator_toolTab.tab);

	}

	static class ItemSaw1 extends Item {
		private Block[] blocksEffectiveAgainst = new Block[]{Blocks.LOG, Blocks.LOG2, Blocks.PLANKS, Blocks.OAK_FENCE, Blocks.SPRUCE_FENCE,
				Blocks.BIRCH_FENCE, Blocks.JUNGLE_FENCE, Blocks.DARK_OAK_FENCE, Blocks.ACACIA_FENCE, Blocks.OAK_FENCE_GATE, Blocks.SPRUCE_FENCE_GATE,
				Blocks.BIRCH_FENCE_GATE, Blocks.JUNGLE_FENCE_GATE, Blocks.DARK_OAK_FENCE_GATE, Blocks.ACACIA_FENCE_GATE, Blocks.JUNGLE_FENCE,};

		// harvest level
		int harvest = 5;

		protected float efficiencyOnProperMaterial;

		protected ItemSaw1() {
			efficiencyOnProperMaterial = 8;
			setMaxDamage(3100);
			setMaxStackSize(1);
			this.setCreativeTab(CreativeTabs.TOOLS);
		}

		@Override
		public float getStrVsBlock(ItemStack par1ItemStack, IBlockState par2Block) {
			for (int i = 0; i < blocksEffectiveAgainst.length; i++) {
				if (blocksEffectiveAgainst[i] == par2Block.getBlock()) {
					return efficiencyOnProperMaterial;
				}
			}

			return 0.0F;
		}

		@Override
		public boolean isFull3D() {
			return true;
		}

		@Override
		public int getItemEnchantability() {
			// kok se lohk cara
			return 64;
		}

	}
}
