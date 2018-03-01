package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.ActionResult;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.Random;
import java.util.List;

@SuppressWarnings("unchecked")
public class mcreator_iPhone6s {

	public mcreator_iPhone6s() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("roleplaymod:IPhone6s", "inventory"));

		GameRegistry.addRecipe(
				new ItemStack(block, 1),
				new Object[]{"012", "345", "678", Character.valueOf('0'), mcreator_dollar.block, Character.valueOf('1'),
						new ItemStack(Blocks.WOOL, 1, 15), Character.valueOf('2'), mcreator_dollar.block, Character.valueOf('3'),
						new ItemStack(Blocks.WOOL, 1, 15), Character.valueOf('4'), new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 8),
						Character.valueOf('5'), new ItemStack(Blocks.WOOL, 1, 15), Character.valueOf('6'), mcreator_dollar.block,
						Character.valueOf('7'), new ItemStack(Blocks.WOOL, 1, 15), Character.valueOf('8'), mcreator_dollar.block,});
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
		block = (new ItemiPhone6s());

	}

	static class ItemiPhone6s extends Item {

		public ItemiPhone6s() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("IPhone6s");
			setRegistryName("IPhone6s");
			GameRegistry.register(this);
			setCreativeTab(mcreator_mods2.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 0;
		}

		@Override
		public float getStrVsBlock(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1.0F;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
			float var4 = 1.0F;
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			int i = (int) (entity.prevPosX + (entity.posX - entity.prevPosX) * (double) var4);
			int j = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) * (double) var4 + 1.62D);
			int k = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) var4);

			if (true) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100000, 255));
			}

			return ar;
		}

		@Override
		public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ,
				EnumHand hand) {
			float var4 = 1.0F;
			int i = pos.getX();
			int j = pos.getY();
			int k = pos.getZ();

			if (true) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100000, 255));
			}

			return EnumActionResult.PASS;
		}

		@Override
		public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
			list.add("IPhone");
			list.add("Apple Inc");
			list.add("2018");
			list.add("MinePhone");
		}

	}
}
