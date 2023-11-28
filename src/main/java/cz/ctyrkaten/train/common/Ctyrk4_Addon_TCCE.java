package cz.ctyrkaten.train.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cz.ctyrkaten.train.common.items.Ctyrk4Items;

import cz.ctyrkaten.train.common.library.Ctyrk4AddonInfo;
import train.common.api.TrainRecord;
import train.common.core.util.TraincraftUtil;

import cz.ctyrkaten.train.common.core.Ctyrk4CreativeTabTraincraftTrains;
import cz.ctyrkaten.train.common.library.Ctyrk4EnumTrains;
import cz.ctyrkaten.train.common.library.Ctyrk4Registry;

@Mod(modid = Ctyrk4AddonInfo.modID, name = Ctyrk4AddonInfo.modName, version = Ctyrk4AddonInfo.modVersion)
public class Ctyrk4_Addon_TCCE {

	/* Mod instance */
	@Instance(Ctyrk4AddonInfo.modID)
	public static Ctyrk4_Addon_TCCE instance;

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(Ctyrk4AddonInfo.modName);

//	public static File configDirectory;

	/* Creative tab for Addon */
	public static CreativeTabs tcAddonTab;

    private Ctyrk4Registry registry;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tcLog.info("Starting Ctyrk4 Traincraft Addon " + Ctyrk4AddonInfo.modVersion + "!");

        /* Config handler */
//		configDirectory= event.getModConfigurationDirectory();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");

        tcAddonTab = new Ctyrk4CreativeTabTraincraftTrains(CreativeTabs.getNextID(), "Ctyrk4 Trains");

        Ctyrk4Items.init();
        registerEntityHandlers();

		/* Other Proxy init */
		tcLog.info("Initialize Renderer and Events");

        registry = new Ctyrk4Registry();
        registry.registerTrainRecords();
        registry.registerRenderRecords();
        registry.registerSoundRecords();

        tcLog.info("Finished PreInitialization");
	}
    
    private void registerEntityHandlers() {
		int trainID = 1;
		for(Ctyrk4EnumTrains train : Ctyrk4EnumTrains.values()){
			EntityRegistry.registerModEntity(train.getEntityClass(), train.getInternalName(), trainID, Ctyrk4_Addon_TCCE.instance, 512, 1, true);
			trainID++;
		}
    } 

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
	}
}