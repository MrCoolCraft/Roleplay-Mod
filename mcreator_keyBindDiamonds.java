package mod.mcreator;

import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class mcreator_keyBindDiamonds {

	public static Object instance;

	public mcreator_keyBindDiamonds() {
	}

	public void load(FMLInitializationEvent event) {
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	@SideOnly(Side.CLIENT)
	public void registerRenderers() {
		MinecraftForge.EVENT_BUS.register(new KeyHandlerClass());
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public class KeyHandlerClass {

		private final KeyBinding keys;

		public KeyHandlerClass() {
			keys = new KeyBinding("key.mcreator.keyBindDiamonds", Keyboard.KEY_R, "key.categories.misc");
			ClientRegistry.registerKeyBinding(keys);
		}

		@SubscribeEvent
		public void onKeyInput(InputEvent.KeyInputEvent event) {
			if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
				if (org.lwjgl.input.Keyboard.isKeyDown(keys.getKeyCode())) {
					EntityPlayer entity = Minecraft.getMinecraft().player;
					int i = (int) entity.posX;
					int j = (int) entity.posY;
					int k = (int) entity.posZ;
					MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
					World world = server.worlds[0];

					if (true) {
						if (true) {

							if (true) {
								if (entity instanceof EntityPlayer)
									((EntityPlayer) entity).inventory.addItemStackToInventory(new ItemStack(Items.DIAMOND, 4));
							}

						}
					}

				}
			}
		}
	}

}
