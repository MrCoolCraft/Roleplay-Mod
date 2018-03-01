package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;

import java.util.Set;
import java.util.Random;
import java.util.HashMap;

public class mcreator_aironitePickaxe {

	public mcreator_aironitePickaxe() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack stack = new ItemStack(block, 1);
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("roleplaymod:aironitepickaxe", "inventory"));

		GameRegistry.addRecipe(stack, new Object[]{"012", "X4X", "X7X", Character.valueOf('0'), mcreator_aironite.block, Character.valueOf('1'),
				mcreator_aironite.block, Character.valueOf('2'), mcreator_aironite.block, Character.valueOf('4'), Items.STICK,
				Character.valueOf('7'), Items.STICK,});
		GameRegistry.addSmelting(Blocks.BEACON, stack, 1.0f);
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
		Item.ToolMaterial enumt = EnumHelper.addToolMaterial("AIRONITEPICKAXE", 5, 1900, 15F, 100, 64);
		block = (Item) (new ItemPickaxe(enumt) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 5);
				return ret.keySet();
			}

			@Override
			public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX,
					float hitY, float hitZ) {
				EnumActionResult ret = super.onItemUse(entity, world, pos, hand, facing, hitX, hitY, hitZ);
				int i = pos.getX();
				int j = pos.getY();
				int k = pos.getZ();
				float var4 = 1.0F;

				if (true) {
					world.playSound((EntityPlayer) null, (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(
									("roleplaymod:mod.music.jellycastle.mdk"))), SoundCategory.NEUTRAL, 1.0F, 1.0F);
				}

				return ret;
			}

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
				super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int i = pos.getX();
				int j = pos.getY();
				int k = pos.getZ();

				if (true) {
					if (entity instanceof EntityPlayerMP) {
						MinecraftServer minecraftserver = FMLCommonHandler.instance().getMinecraftServerInstance();
						if (minecraftserver != null)
							minecraftserver.getCommandManager().executeCommand((EntityPlayerMP) entity, "give @p aironite 2");
					}
				}

				if (true) {
					world.playSound((EntityPlayer) null, (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(
									("entity.villager.yes"))), SoundCategory.NEUTRAL, 1.0F, 1.0F);
				}

				if ((Math.random() * 100) <= 40) {
					System.out.println("Do You Like DanTDM?");
				}

				if ((Math.random() * 100) <= 50) {
					System.out.println("Ahoy There!");
				}

				if ((Math.random() * 100) <= 60) {
					System.out.println("Aironite Pickaxe Lost 1 Durability.");
				}

				return true;
			}
		}).setUnlocalizedName("AironitePickaxe");
		block.setRegistryName("AironitePickaxe");
		GameRegistry.register(block);
		block.setCreativeTab(mcreator_mods2.tab);

	}

}
