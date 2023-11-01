package train.client.core;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import javazoom.jl.decoder.JavaLayerUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.Level;
import train.client.core.handlers.ClientTickHandler;
import train.client.core.handlers.TCKeyHandler;
import train.client.core.helpers.JLayerHook;
import train.client.gui.HUDloco;
import train.client.render.Ctyrk4RenderRollingStock;
import train.common.core.Ctyrk4CommonProxy;
import train.client.render.RenderBogie;
import train.common.api.EntityRollingStock;
import train.common.Ctyrk4_Addon_TCCE;
import train.common.adminbook.GUIAdminBook;
import train.common.api.EntityBogie;
import train.common.core.Traincraft_EventSounds;
import train.common.library.GuiIDs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClientProxy extends Ctyrk4CommonProxy {

	@Override
	public void throwAlphaException() {
		throw new AlphaExpiredException();
	}

	@Override
	public void registerEvents(FMLPreInitializationEvent event) {
		super.registerEvents(event);
		train.client.core.handlers.ClientTickHandler tickHandler = new train.client.core.handlers.ClientTickHandler();

		train.client.gui.HUDloco huDloco = new HUDloco();

		registerEvent(tickHandler);

		registerEvent(huDloco);
	}

	@Override
	public void registerRenderInformation() {
		FMLCommonHandler.instance().bus().register(new ClientTickHandler());

		RenderingRegistry.registerEntityRenderingHandler(EntityRollingStock.class, new Ctyrk4RenderRollingStock());
		//bogies
		RenderingRegistry.registerEntityRenderingHandler(EntityBogie.class, new RenderBogie());


	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		EntityPlayer riddenByEntity = null;
		Entity entity = player.ridingEntity;
		if (player.ridingEntity != null) {
			riddenByEntity = (EntityPlayer) entity.riddenByEntity;
		}

		Entity entity1 = null;
		if (y == -1) {
			for (Object ent : world.loadedEntityList) {
				if (((Entity) ent).getEntityId() == x)
					entity1 = (Entity) ent;
			}
		}
		switch (ID) {
		case (GuiIDs.LOCO):
			return riddenByEntity != null ? new train.client.gui.GuiLoco2(riddenByEntity.inventory, entity) : null;
		case (GuiIDs.FORNEY):
			return riddenByEntity != null ? new train.client.gui.GuiForney(riddenByEntity.inventory, entity) : null;
		case (GuiIDs.CRAFTING_CART):
			return riddenByEntity != null ? new train.client.gui.GuiCraftingCart(riddenByEntity.inventory, world) : null;
		case (GuiIDs.FURNACE_CART):
			return riddenByEntity != null ? new train.client.gui.GuiFurnaceCart(riddenByEntity.inventory, entity) : null;

			//Stationary entities while player is not riding.
		case (GuiIDs.FREIGHT):
			return entity1 != null ? new train.client.gui.GuiFreight(player,player.inventory, entity1) : null;
		case (GuiIDs.TENDER):
			return entity1 != null ? new train.client.gui.GuiTender(player,player.inventory, entity1) : null;
		case (GuiIDs.LIQUID):
			return entity1 != null ? new train.client.gui.GuiLiquid(player,player.inventory, entity1) : null;
		default:
			return null;
		}
	}

	@Override
	public GuiScreen getCurrentScreen() {
		return Minecraft.getMinecraft().currentScreen;
	}

	@Override
	public void registerSounds() {
		MinecraftForge.EVENT_BUS.register(new Traincraft_EventSounds());
	}

	@Override
	public Minecraft getMinecraft() {
		return Minecraft.getMinecraft();
	}

	@Override
	public EntityPlayer getPlayer() {
		return getMinecraft().thePlayer;
	}

	@Optional.Method(modid = "NotEnoughItems")
	@Override
	public void doNEICheck(ItemStack stack) {
		if (Minecraft.getMinecraft().thePlayer != null) {
			if(Loader.isModLoaded("Not Enough Items")) {
				try {
					Class neiApi = Class.forName("codechicken.nei.api.API");
					Method hideItem = neiApi.getDeclaredMethod("hideItem", stack.getClass());
					hideItem.invoke(null, stack);
				} catch (ClassNotFoundException e) {
					Ctyrk4_Addon_TCCE.tcLog.log(Level.WARN, "Chicken core didn't have required class: Wrong version of the library or something is horribly wrong", e);
				} catch (NoSuchMethodException e) {
					Ctyrk4_Addon_TCCE.tcLog.log(Level.WARN, "Chicken core didn't have required method: Wrong version of the library or something is horribly wrong", e);
				} catch (SecurityException e) {
					Ctyrk4_Addon_TCCE.tcLog.log(Level.FATAL, "Something is horribly wrong", e);
				} catch (IllegalAccessException e) {
					Ctyrk4_Addon_TCCE.tcLog.log(Level.FATAL, "Something is horribly wrong", e);
				} catch (IllegalArgumentException e) {
					Ctyrk4_Addon_TCCE.tcLog.log(Level.WARN, "Chicken core had the method but it's signature was wrong: Wrong version of the library or something is horribly wrong", e);
				} catch (InvocationTargetException e) {
					Ctyrk4_Addon_TCCE.tcLog.log(Level.WARN, "The method we called from Chicken core threw an exception", e);
				}
			}
        }
	}

	@Override
	public float getJukeboxVolume() {
		return Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.RECORDS) * Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.MASTER);
	}

	@Override
	public void openadmingui(String data){
		Minecraft.getMinecraft().displayGuiScreen(new GUIAdminBook(data));
	}

	@Override
	public void registerKeyBindingHandler() {
		FMLCommonHandler.instance().bus().register(new TCKeyHandler());
	}

	@Override
	public void setHook() {
		JavaLayerUtils.setHook(new JLayerHook(Minecraft.getMinecraft()));
	}
}