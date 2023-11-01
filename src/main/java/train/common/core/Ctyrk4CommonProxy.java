package train.common.core;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import train.common.Ctyrk4_Addon_TCCE;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.api.LiquidTank;
import train.common.api.Tender;
import train.common.containers.*;
import train.common.core.handlers.ChunkEvents;
import train.common.core.handlers.WorldEvents;
import train.common.core.util.MP3Player;
import train.common.inventory.*;
import train.common.library.GuiIDs;
import java.util.ArrayList;
import java.util.List;

public class Ctyrk4CommonProxy implements IGuiHandler {
	public static List<MP3Player> playerList = new ArrayList<MP3Player>();
	public static boolean debug = false;

	public void throwAlphaException() {
		throw new IllegalStateException("You're trying to use a Traincraft alpha-version past its expiry date. Download a release-build at https://minecraft.curseforge.com/projects/traincraft.");
	}

	public void setKeyBinding(String name, int value) {}

	public void registerRenderInformation() {}

	public void registerEvents(FMLPreInitializationEvent event){
		WorldEvents worldEvents = new WorldEvents();
		ChunkEvents chunkEvents = new ChunkEvents();

		registerEvent(worldEvents);
		registerEvent(chunkEvents);
		ForgeChunkManager.setForcedChunkLoadingCallback(Ctyrk4_Addon_TCCE.instance, chunkEvents);

	}

	public void registerEvent(Object o){
		FMLCommonHandler.instance().bus().register(o);
		MinecraftForge.EVENT_BUS.register(o);
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		EntityPlayer riddenByEntity = null;
		Entity entity = player.ridingEntity;

		if (player.ridingEntity != null) {
			riddenByEntity = (EntityPlayer) entity.riddenByEntity;
		}

		Entity entity1 = null;
		if (y == -1) {
			entity1 = getEntity(world, x);
		}

		switch (ID) {
		case (GuiIDs.LOCO):
			return riddenByEntity != null ? new InventoryLoco(riddenByEntity.inventory, (EntityRollingStock) entity) : null;
		case (GuiIDs.CRAFTING_CART):
			return new ContainerWorkbenchCart(player.inventory, player.worldObj);
		case (GuiIDs.FURNACE_CART):
			return riddenByEntity != null ? new InventoryWorkCart(player.inventory, entity) : null;

			/* Stationary entities while player is not riding. */
		case (GuiIDs.FREIGHT):
			//System.out.println("Freight: " + ID + " | " + entity1.getEntityName() + " | " + x + ":" + y + ":" + z);
			return entity1 != null && entity1 instanceof Freight ? new InventoryFreight(player.inventory, (Freight) entity1) : null;
		case (GuiIDs.TENDER):
			return entity1 != null && entity1 instanceof Tender ? new InventoryTender(player.inventory, (Tender) entity1) : null;
		case (GuiIDs.LIQUID):
			return entity1 != null && entity1 instanceof LiquidTank ? new InventoryLiquid(player.inventory, (LiquidTank) entity1) : null;
		/*case (GuiIDs.FORTY_FOOT_CONTAINER):
			return new ContainerStorage((TileFortyFootContainer)te, player);*/

			default:
			return null;

		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public static Entity getEntity(World world, int entityId) {
		if ((world != null) && (world instanceof WorldServer)) {
			return world.getEntityByID(entityId);
		}
		return null;
	}

	public int addArmor(String armor) {
		return 0;
	}

	public Minecraft getClientInstance() {
		return FMLClientHandler.instance().getClient();
	}

	public GuiScreen getCurrentScreen() {
		return null;
	}

	public void registerTextureFX() {}

	public void registerSounds() {}

	public void registerBookHandler() {}

	public Minecraft getMinecraft() {
		return null;
	}

	public void registerVillagerSkin(int villagerId, String textureName) {}

	public static void killAllStreams() {
		for (MP3Player p : playerList) {
			p.stop();
		}
	}

	public void openadmingui(String data){}

	public static boolean checkJukeboxEntity(World world, int id) {
		return  world.getEntityByID(id)!=null;
	}

	public void doNEICheck(ItemStack stack) {}

	public EntityPlayer getPlayer() {
		return null;
	}

	public float getJukeboxVolume() {
		return 0;
	}

	public void registerKeyBindingHandler() {}

	public void setHook() {}
	
}