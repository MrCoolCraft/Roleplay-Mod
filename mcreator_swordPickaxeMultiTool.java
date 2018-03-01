package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import java.util.Random;

import com.google.common.collect.Multimap;

public class mcreator_swordPickaxeMultiTool {

	public mcreator_swordPickaxeMultiTool() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack stack = new ItemStack(block, 1);
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("roleplaymod:swordpickaxemultitool", "inventory"));
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
		block = (new ItemSwordPickaxeMultiTool() {
		}).setUnlocalizedName("SwordPickaxeMultiTool");
		block.setRegistryName("SwordPickaxeMultiTool");
		GameRegistry.register(block);
		block.setCreativeTab(mcreator_toolTab.tab);

	}

	static class ItemSwordPickaxeMultiTool extends Item {

		// harvest level
		int harvest = 5;

		protected float efficiencyOnProperMaterial;

		protected ItemSwordPickaxeMultiTool() {
			efficiencyOnProperMaterial = 10;
			setMaxDamage(2000);
			setMaxStackSize(1);
			this.setCreativeTab(CreativeTabs.TOOLS);
		}

		@Override
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

			if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 10, 0));
			}

			return multimap;
		}

		@Override
		public boolean canHarvestBlock(IBlockState blockIn) {
			return true;
		}

		@Override
		public float getStrVsBlock(ItemStack par1ItemStack, IBlockState par2Block) {
			return efficiencyOnProperMaterial;
		}

		@Override
		public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
			par1ItemStack.damageItem(1, par3EntityLiving);
			return true;
		}

		public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, Block par3, int par4, int par5, int par6,
				EntityLivingBase par7EntityLiving) {
			par1ItemStack.damageItem(1, par7EntityLiving);
			return true;
		}

		@Override
		public boolean isFull3D() {
			return true;
		}

		@Override
		public int getItemEnchantability() {
			// kok se lohk cara
			return 2;
		}
	}
}
