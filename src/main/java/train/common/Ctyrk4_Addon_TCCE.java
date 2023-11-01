package train.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.core.CommonProxy;
import train.common.core.Ctyrk4ModCore;
import train.common.items.Ctyrk4Items;
import train.common.core.handlers.EntityHandler;
import train.common.core.handlers.PacketHandler;
import train.common.generation.Ctyrk4WorldGenWorld;
import train.common.core.handlers.RetrogenHandler;
import train.common.core.handlers.FuelHandler;
import train.common.core.Ctyrk4CreativeTabTraincraft;
import train.common.core.Ctyrk4CreativeTabTraincraftTrains;
import train.common.api.LiquidManager;

import train.common.library.Ctyrk4AddonInfo;
import train.common.core.util.TraincraftUtil;

import java.io.File;

@Mod(modid = Ctyrk4AddonInfo.modID, name = Ctyrk4AddonInfo.modName, version = Ctyrk4AddonInfo.modVersion)
public class Ctyrk4_Addon_TCCE {

	/* TrainCraft instance */
	@Instance(Ctyrk4AddonInfo.modID)
	public static Ctyrk4_Addon_TCCE instance;

	/* TrainCraft proxy files */
	@SidedProxy(clientSide = "train.client.core.ClientProxy", serverSide = "train.common.core.CommonProxy")
	public static CommonProxy proxy;

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(Ctyrk4AddonInfo.modName);

	/** Network Channel to send packets on */
	public static SimpleNetworkWrapper modChannel;
	public static SimpleNetworkWrapper keyChannel;
	public static SimpleNetworkWrapper rotationChannel;
	public static SimpleNetworkWrapper slotschannel;
	public static SimpleNetworkWrapper ignitionChannel;
	public static SimpleNetworkWrapper brakeChannel;
	public static SimpleNetworkWrapper lockChannel;
	public static SimpleNetworkWrapper builderChannel;
	public static SimpleNetworkWrapper updateTrainIDChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TrainIDChannel");
    public static SimpleNetworkWrapper updateDestinationChannel = NetworkRegistry.INSTANCE.newSimpleChannel("updateDestnChannel");
	public static final SimpleNetworkWrapper itaChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterAspect");
	public static  SimpleNetworkWrapper itsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterSpeed");
	//public static  SimpleNetworkWrapper mtcsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCSysSetSpeed");
	public static  SimpleNetworkWrapper itnsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterNextSpeed");
	public static final SimpleNetworkWrapper mtlChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCLevelUpdater");
	public static final SimpleNetworkWrapper msChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatus");
	public static final SimpleNetworkWrapper mscChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatusToClient");
	public static final SimpleNetworkWrapper atoChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATOPacket");
	public static final SimpleNetworkWrapper atoDoSlowDownChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATODoSlowDown");
	public static final SimpleNetworkWrapper atoDoAccelChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATODoAccel");
	public static final SimpleNetworkWrapper atoSetStopPoint = NetworkRegistry.INSTANCE.newSimpleChannel("ATOSetStopPoint");
	public static final SimpleNetworkWrapper NCSlowDownChannel = NetworkRegistry.INSTANCE.newSimpleChannel("NCDoSlowDown");
	//public static final SimpleNetworkWrapper ctChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ctmChannel");
	public static final SimpleNetworkWrapper gsfsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsChannel");
	public static final SimpleNetworkWrapper gsfsrChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsReturnChannel");



	public static File configDirectory;

	/* Creative tab for Traincraft */
	public static CreativeTabs tc4Tab, tc4TrainTab;

	public static Ctyrk4WorldGenWorld worldGen;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		TraincraftUtil.dev = (Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
		tcLog.info("Starting Traincraft " + Ctyrk4AddonInfo.modVersion + "!");
		/* Config handler */
		configDirectory= event.getModConfigurationDirectory();

		/* Register the KeyBinding Handler */
		proxy.registerKeyBindingHandler();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");
		tc4Tab = new Ctyrk4CreativeTabTraincraft(CreativeTabs.getNextID(), "Ctyrk4 Addon for Traincraft");
		if(train.common.core.handlers.ConfigHandler.SPLIT_CREATIVE) {
			tc4TrainTab = new Ctyrk4CreativeTabTraincraftTrains(CreativeTabs.getNextID(), "Ctyrk4 Trains");
		}
		Ctyrk4Items.justInit();
		EntityHandler.init();
		proxy.registerSounds();
		proxy.setHook(); // Moved file needed to run JLayer, we need to set a hook in order to retrieve it

		GameRegistry.registerFuelHandler(new FuelHandler());

		//Retrogen Handling
		RetrogenHandler retroGen = new RetrogenHandler();
		MinecraftForge.EVENT_BUS.register(retroGen);
		FMLCommonHandler.instance().bus().register(retroGen);


		/* Other Proxy init */
		tcLog.info("Initialize Renderer and Events");
		proxy.registerRenderInformation();
		proxy.registerEvents(event);


		tcLog.info("Finished PreInitialization");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		/* Networking and Packet initialisation, apparently this needs to be in init to prevent conflicts */
		PacketHandler.init();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		tcLog.info("Start Initialization");

		//proxy.getCape();

		/* GUI handler initiation */
		tcLog.info("Initialize Gui");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);

		/* Liquid FX */
		proxy.registerTextureFX();

		proxy.registerBookHandler();

		tcLog.info("Finished Initialization");


	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		tcLog.info("Start to PostInitialize");
		tcLog.info("Register ChunkHandler");

		tcLog.info("Activation Mod Compatibility");
		Ctyrk4ModCore.ModsLoaded();
		LiquidManager.getLiquidsFromDictionnary();

		tcLog.info("Finished PostInitialization");
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
		proxy.killAllStreams();
	}
}