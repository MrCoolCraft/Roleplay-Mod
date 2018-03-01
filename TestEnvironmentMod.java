package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.model.obj.OBJLoader;

import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Random;

@Mod(modid = TestEnvironmentMod.MODID, version = TestEnvironmentMod.VERSION)
public class TestEnvironmentMod implements IFuelHandler, IWorldGenerator {

	public static final String MODID = "testenvironmentmod";
	public static final String VERSION = "1.0";

	@SidedProxy(clientSide = "mod.mcreator.ClientProxyTestEnvironmentMod", serverSide = "mod.mcreator.CommonProxyTestEnvironmentMod")
	public static CommonProxyTestEnvironmentMod proxy;

	@Instance(MODID)
	public static TestEnvironmentMod instance;

	mcreator_till mcreator_0 = new mcreator_till();
	mcreator_dollar mcreator_1 = new mcreator_dollar();
	mcreator_mods2 mcreator_2 = new mcreator_mods2();
	mcreator_mcDonalfd mcreator_3 = new mcreator_mcDonalfd();
	mcreator_commandKeySound mcreator_4 = new mcreator_commandKeySound();
	mcreator_recipeOfItemDollar mcreator_5 = new mcreator_recipeOfItemDollar();
	mcreator_iPhone6s mcreator_6 = new mcreator_iPhone6s();
	mcreator_runSongCommand mcreator_7 = new mcreator_runSongCommand();
	mcreator_aironiteOre mcreator_8 = new mcreator_aironiteOre();
	mcreator_aironite mcreator_9 = new mcreator_aironite();
	mcreator_aironitePickaxe mcreator_10 = new mcreator_aironitePickaxe();
	mcreator_aironiteDimension mcreator_11 = new mcreator_aironiteDimension();
	mcreator_aironiteBlock mcreator_12 = new mcreator_aironiteBlock();
	mcreator_toast mcreator_13 = new mcreator_toast();
	mcreator_avocadoToast mcreator_14 = new mcreator_avocadoToast();
	mcreator_knife mcreator_15 = new mcreator_knife();
	mcreator_greenDimension mcreator_16 = new mcreator_greenDimension();
	mcreator_craftPad mcreator_17 = new mcreator_craftPad();
	mcreator_keyBindDiamonds mcreator_18 = new mcreator_keyBindDiamonds();
	mcreator_bullet mcreator_19 = new mcreator_bullet();
	mcreator_noScope mcreator_20 = new mcreator_noScope();
	mcreator_sitCommand mcreator_21 = new mcreator_sitCommand();
	mcreator_chocolateBar1 mcreator_22 = new mcreator_chocolateBar1();
	mcreator_wallpaper1 mcreator_23 = new mcreator_wallpaper1();
	mcreator_loxenium mcreator_24 = new mcreator_loxenium();
	mcreator_loxeniumStone1 mcreator_25 = new mcreator_loxeniumStone1();
	mcreator_loxeniumPaper mcreator_26 = new mcreator_loxeniumPaper();
	mcreator_achievement1ThanksForInstalling mcreator_27 = new mcreator_achievement1ThanksForInstalling();
	mcreator_toolTab mcreator_28 = new mcreator_toolTab();
	mcreator_coalStuckOnGlass mcreator_29 = new mcreator_coalStuckOnGlass();
	mcreator_yellowGrassBlock mcreator_30 = new mcreator_yellowGrassBlock();
	mcreator_grassTab mcreator_31 = new mcreator_grassTab();
	mcreator_stripyFactoryBlock mcreator_32 = new mcreator_stripyFactoryBlock();
	mcreator_greenObsidian mcreator_33 = new mcreator_greenObsidian();
	mcreator_saw1 mcreator_34 = new mcreator_saw1();
	mcreator_swordPickaxeMultiTool mcreator_35 = new mcreator_swordPickaxeMultiTool();
	mcreator_computer mcreator_36 = new mcreator_computer();
	mcreator_toolKeyBind mcreator_37 = new mcreator_toolKeyBind();
	mcreator_blueDaBaDeeKeyBind mcreator_38 = new mcreator_blueDaBaDeeKeyBind();

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (mcreator_0.addFuel(fuel) != 0)
			return mcreator_0.addFuel(fuel);
		if (mcreator_1.addFuel(fuel) != 0)
			return mcreator_1.addFuel(fuel);
		if (mcreator_2.addFuel(fuel) != 0)
			return mcreator_2.addFuel(fuel);
		if (mcreator_3.addFuel(fuel) != 0)
			return mcreator_3.addFuel(fuel);
		if (mcreator_4.addFuel(fuel) != 0)
			return mcreator_4.addFuel(fuel);
		if (mcreator_5.addFuel(fuel) != 0)
			return mcreator_5.addFuel(fuel);
		if (mcreator_6.addFuel(fuel) != 0)
			return mcreator_6.addFuel(fuel);
		if (mcreator_7.addFuel(fuel) != 0)
			return mcreator_7.addFuel(fuel);
		if (mcreator_8.addFuel(fuel) != 0)
			return mcreator_8.addFuel(fuel);
		if (mcreator_9.addFuel(fuel) != 0)
			return mcreator_9.addFuel(fuel);
		if (mcreator_10.addFuel(fuel) != 0)
			return mcreator_10.addFuel(fuel);
		if (mcreator_11.addFuel(fuel) != 0)
			return mcreator_11.addFuel(fuel);
		if (mcreator_12.addFuel(fuel) != 0)
			return mcreator_12.addFuel(fuel);
		if (mcreator_13.addFuel(fuel) != 0)
			return mcreator_13.addFuel(fuel);
		if (mcreator_14.addFuel(fuel) != 0)
			return mcreator_14.addFuel(fuel);
		if (mcreator_15.addFuel(fuel) != 0)
			return mcreator_15.addFuel(fuel);
		if (mcreator_16.addFuel(fuel) != 0)
			return mcreator_16.addFuel(fuel);
		if (mcreator_17.addFuel(fuel) != 0)
			return mcreator_17.addFuel(fuel);
		if (mcreator_18.addFuel(fuel) != 0)
			return mcreator_18.addFuel(fuel);
		if (mcreator_19.addFuel(fuel) != 0)
			return mcreator_19.addFuel(fuel);
		if (mcreator_20.addFuel(fuel) != 0)
			return mcreator_20.addFuel(fuel);
		if (mcreator_21.addFuel(fuel) != 0)
			return mcreator_21.addFuel(fuel);
		if (mcreator_22.addFuel(fuel) != 0)
			return mcreator_22.addFuel(fuel);
		if (mcreator_23.addFuel(fuel) != 0)
			return mcreator_23.addFuel(fuel);
		if (mcreator_24.addFuel(fuel) != 0)
			return mcreator_24.addFuel(fuel);
		if (mcreator_25.addFuel(fuel) != 0)
			return mcreator_25.addFuel(fuel);
		if (mcreator_26.addFuel(fuel) != 0)
			return mcreator_26.addFuel(fuel);
		if (mcreator_27.addFuel(fuel) != 0)
			return mcreator_27.addFuel(fuel);
		if (mcreator_28.addFuel(fuel) != 0)
			return mcreator_28.addFuel(fuel);
		if (mcreator_29.addFuel(fuel) != 0)
			return mcreator_29.addFuel(fuel);
		if (mcreator_30.addFuel(fuel) != 0)
			return mcreator_30.addFuel(fuel);
		if (mcreator_31.addFuel(fuel) != 0)
			return mcreator_31.addFuel(fuel);
		if (mcreator_32.addFuel(fuel) != 0)
			return mcreator_32.addFuel(fuel);
		if (mcreator_33.addFuel(fuel) != 0)
			return mcreator_33.addFuel(fuel);
		if (mcreator_34.addFuel(fuel) != 0)
			return mcreator_34.addFuel(fuel);
		if (mcreator_35.addFuel(fuel) != 0)
			return mcreator_35.addFuel(fuel);
		if (mcreator_36.addFuel(fuel) != 0)
			return mcreator_36.addFuel(fuel);
		if (mcreator_37.addFuel(fuel) != 0)
			return mcreator_37.addFuel(fuel);
		if (mcreator_38.addFuel(fuel) != 0)
			return mcreator_38.addFuel(fuel);
		return 0;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

		chunkX = chunkX * 16;
		chunkZ = chunkZ * 16;
		if (world.provider.getDimension() == -1)
			mcreator_0.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_0.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_1.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_1.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_2.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_2.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_3.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_3.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_4.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_4.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_5.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_5.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_6.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_6.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_7.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_7.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_8.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_8.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_9.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_9.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_10.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_10.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_11.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_11.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_12.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_12.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_13.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_13.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_14.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_14.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_15.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_15.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_16.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_16.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_17.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_17.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_18.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_18.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_19.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_19.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_20.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_20.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_21.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_21.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_22.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_22.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_23.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_23.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_24.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_24.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_25.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_25.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_26.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_26.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_27.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_27.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_28.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_28.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_29.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_29.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_30.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_30.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_31.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_31.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_32.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_32.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_33.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_33.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_34.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_34.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_35.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_35.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_36.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_36.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_37.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_37.generateSurface(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == -1)
			mcreator_38.generateNether(world, random, chunkX, chunkZ);
		if (world.provider.getDimension() == 0)
			mcreator_38.generateSurface(world, random, chunkX, chunkZ);

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		GameRegistry.registerFuelHandler(this);
		GameRegistry.registerWorldGenerator(this, 1);
		if (event.getSide() == Side.CLIENT) {
			OBJLoader.INSTANCE.addDomain("testenvironmentmod");
		}
		MinecraftForge.EVENT_BUS.register(new mcreator_GlobalEventsTestEnvironmentMod());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		mcreator_0.load(event);
		mcreator_1.load(event);
		mcreator_2.load(event);
		mcreator_3.load(event);
		mcreator_4.load(event);
		mcreator_5.load(event);
		mcreator_6.load(event);
		mcreator_7.load(event);
		mcreator_8.load(event);
		mcreator_9.load(event);
		mcreator_10.load(event);
		mcreator_11.load(event);
		mcreator_12.load(event);
		mcreator_13.load(event);
		mcreator_14.load(event);
		mcreator_15.load(event);
		mcreator_16.load(event);
		mcreator_17.load(event);
		mcreator_18.load(event);
		mcreator_19.load(event);
		mcreator_20.load(event);
		mcreator_21.load(event);
		mcreator_22.load(event);
		mcreator_23.load(event);
		mcreator_24.load(event);
		mcreator_25.load(event);
		mcreator_26.load(event);
		mcreator_27.load(event);
		mcreator_28.load(event);
		mcreator_29.load(event);
		mcreator_30.load(event);
		mcreator_31.load(event);
		mcreator_32.load(event);
		mcreator_33.load(event);
		mcreator_34.load(event);
		mcreator_35.load(event);
		mcreator_36.load(event);
		mcreator_37.load(event);
		mcreator_38.load(event);
		proxy.registerRenderers(this);

	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		mcreator_0.serverLoad(event);
		mcreator_1.serverLoad(event);
		mcreator_2.serverLoad(event);
		mcreator_3.serverLoad(event);
		mcreator_4.serverLoad(event);
		mcreator_5.serverLoad(event);
		mcreator_6.serverLoad(event);
		mcreator_7.serverLoad(event);
		mcreator_8.serverLoad(event);
		mcreator_9.serverLoad(event);
		mcreator_10.serverLoad(event);
		mcreator_11.serverLoad(event);
		mcreator_12.serverLoad(event);
		mcreator_13.serverLoad(event);
		mcreator_14.serverLoad(event);
		mcreator_15.serverLoad(event);
		mcreator_16.serverLoad(event);
		mcreator_17.serverLoad(event);
		mcreator_18.serverLoad(event);
		mcreator_19.serverLoad(event);
		mcreator_20.serverLoad(event);
		mcreator_21.serverLoad(event);
		mcreator_22.serverLoad(event);
		mcreator_23.serverLoad(event);
		mcreator_24.serverLoad(event);
		mcreator_25.serverLoad(event);
		mcreator_26.serverLoad(event);
		mcreator_27.serverLoad(event);
		mcreator_28.serverLoad(event);
		mcreator_29.serverLoad(event);
		mcreator_30.serverLoad(event);
		mcreator_31.serverLoad(event);
		mcreator_32.serverLoad(event);
		mcreator_33.serverLoad(event);
		mcreator_34.serverLoad(event);
		mcreator_35.serverLoad(event);
		mcreator_36.serverLoad(event);
		mcreator_37.serverLoad(event);
		mcreator_38.serverLoad(event);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		mcreator_0.instance = this.instance;
		mcreator_1.instance = this.instance;
		mcreator_2.instance = this.instance;
		mcreator_3.instance = this.instance;
		mcreator_4.instance = this.instance;
		mcreator_5.instance = this.instance;
		mcreator_6.instance = this.instance;
		mcreator_7.instance = this.instance;
		mcreator_8.instance = this.instance;
		mcreator_9.instance = this.instance;
		mcreator_10.instance = this.instance;
		mcreator_11.instance = this.instance;
		mcreator_12.instance = this.instance;
		mcreator_13.instance = this.instance;
		mcreator_14.instance = this.instance;
		mcreator_15.instance = this.instance;
		mcreator_16.instance = this.instance;
		mcreator_17.instance = this.instance;
		mcreator_18.instance = this.instance;
		mcreator_19.instance = this.instance;
		mcreator_20.instance = this.instance;
		mcreator_21.instance = this.instance;
		mcreator_22.instance = this.instance;
		mcreator_23.instance = this.instance;
		mcreator_24.instance = this.instance;
		mcreator_25.instance = this.instance;
		mcreator_26.instance = this.instance;
		mcreator_27.instance = this.instance;
		mcreator_28.instance = this.instance;
		mcreator_29.instance = this.instance;
		mcreator_30.instance = this.instance;
		mcreator_31.instance = this.instance;
		mcreator_32.instance = this.instance;
		mcreator_33.instance = this.instance;
		mcreator_34.instance = this.instance;
		mcreator_35.instance = this.instance;
		mcreator_36.instance = this.instance;
		mcreator_37.instance = this.instance;
		mcreator_38.instance = this.instance;
		mcreator_0.preInit(event);
		mcreator_1.preInit(event);
		mcreator_2.preInit(event);
		mcreator_3.preInit(event);
		mcreator_4.preInit(event);
		mcreator_5.preInit(event);
		mcreator_6.preInit(event);
		mcreator_7.preInit(event);
		mcreator_8.preInit(event);
		mcreator_9.preInit(event);
		mcreator_10.preInit(event);
		mcreator_11.preInit(event);
		mcreator_12.preInit(event);
		mcreator_13.preInit(event);
		mcreator_14.preInit(event);
		mcreator_15.preInit(event);
		mcreator_16.preInit(event);
		mcreator_17.preInit(event);
		mcreator_18.preInit(event);
		mcreator_19.preInit(event);
		mcreator_20.preInit(event);
		mcreator_21.preInit(event);
		mcreator_22.preInit(event);
		mcreator_23.preInit(event);
		mcreator_24.preInit(event);
		mcreator_25.preInit(event);
		mcreator_26.preInit(event);
		mcreator_27.preInit(event);
		mcreator_28.preInit(event);
		mcreator_29.preInit(event);
		mcreator_30.preInit(event);
		mcreator_31.preInit(event);
		mcreator_32.preInit(event);
		mcreator_33.preInit(event);
		mcreator_34.preInit(event);
		mcreator_35.preInit(event);
		mcreator_36.preInit(event);
		mcreator_37.preInit(event);
		mcreator_38.preInit(event);

		ResourceLocation sound0 = new ResourceLocation("testenvironmentmod", "till.drawer.open");
		GameRegistry.register(new net.minecraft.util.SoundEvent(sound0).setRegistryName(sound0));

		ResourceLocation sound1 = new ResourceLocation("testenvironmentmod", "mod.music.jellycastle.mdk");
		GameRegistry.register(new net.minecraft.util.SoundEvent(sound1).setRegistryName(sound1));

	}

	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			return null;
		}
	}

}