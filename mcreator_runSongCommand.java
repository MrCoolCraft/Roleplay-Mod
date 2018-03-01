package mod.mcreator;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.ICommand;

import java.util.Random;

public class mcreator_runSongCommand {

	public static Object instance;

	public mcreator_runSongCommand() {
	}

	public void load(FMLInitializationEvent event) {
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void registerRenderers() {
	}

	public void serverLoad(FMLServerStartingEvent event) {

		event.registerServerCommand(new CommandrunSongCommand());

	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	class CommandrunSongCommand implements ICommand {
		public boolean isUsernameIndex(int var1) {
			return false;
		}

		public boolean checkPermission(MinecraftServer server, ICommandSender var1) {
			return true;
		}

		public java.util.List getAliases() {
			return (java.util.List) (new java.util.ArrayList());
		}

		public java.util.List getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
			return (java.util.List) (new java.util.ArrayList());
		}

		public boolean isUsernameIndex(String[] string, int index) {
			return true;
		}

		public String getName() {
			return "/runsong Da_Ba_Dee";
		}

		public String getUsage(ICommandSender var1) {
			return "//runsong Da_Ba_Dee /runsong Blue";
		}

		@Override
		public void execute(MinecraftServer server, ICommandSender var1, String[] cmd) {
			int i = var1.getPosition().getX();
			int j = var1.getPosition().getY();
			int k = var1.getPosition().getZ();
			EntityPlayer entity = (EntityPlayer) var1;

			int x = i;
			int y = j;
			int z = k;

			World world = null;
			WorldServer[] list = server.worlds;
			for (WorldServer ins : list) {
				if (ins.provider.getDimension() == entity.world.provider.getDimension())
					world = ins;
			}
			if (world == null)
				world = list[0];

			if (true) {
				world.playSound((EntityPlayer) null, (double) i + 0.5D, (double) j + 0.5D, (double) k + 0.5D,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(
								("roleplaymod:till.drawer.open"))), SoundCategory.NEUTRAL, 1.0F, 1.0F);
			}

		}

		public int compareTo(ICommand c) {
			return getName().compareTo(c.getName());
		}

	}

}
