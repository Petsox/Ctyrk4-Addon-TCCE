/*******************************************************************************
 * Copyright (c) 20getNetworkID()2 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import train.common.Ctyrk4_Addon_TCCE;
import train.common.library.Ctyrk4AddonInfo;
import train.common.adminbook.ItemAdminBook;
import train.common.mtc.packets.*;
import train.common.mtc.packets.handlers.*;

public class PacketHandler {

	public static void init(){
		Ctyrk4_Addon_TCCE.tcLog.info("Initialize Packets");
		Ctyrk4_Addon_TCCE.modChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Ctyrk4AddonInfo.channel);
		Ctyrk4_Addon_TCCE.keyChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Ctyrk4AddonInfo.keyChannel);
		Ctyrk4_Addon_TCCE.rotationChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Ctyrk4AddonInfo.rotationChannel);


		Ctyrk4_Addon_TCCE.slotschannel = NetworkRegistry.INSTANCE.newSimpleChannel("slots");
		Ctyrk4_Addon_TCCE.ignitionChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ignition");
		Ctyrk4_Addon_TCCE.brakeChannel = NetworkRegistry.INSTANCE.newSimpleChannel("brake");
		Ctyrk4_Addon_TCCE.lockChannel = NetworkRegistry.INSTANCE.newSimpleChannel("lock");
		Ctyrk4_Addon_TCCE.builderChannel = NetworkRegistry.INSTANCE.newSimpleChannel("builder");



		Ctyrk4_Addon_TCCE.keyChannel.registerMessage(train.common.adminbook.ItemAdminBook.PacketAdminBook.Handler.class, train.common.adminbook.ItemAdminBook.PacketAdminBook.class, 4, Side.CLIENT);
		Ctyrk4_Addon_TCCE.keyChannel.registerMessage(train.common.adminbook.ItemAdminBook.PacketAdminBookClient.Handler.class, ItemAdminBook.PacketAdminBookClient.class, 5, Side.SERVER);

		Ctyrk4_Addon_TCCE.keyChannel.registerMessage(train.common.core.network.PacketKeyPress.Handler.class, PacketKeyPress.class, 1,
				Side.SERVER);
		Ctyrk4_Addon_TCCE.rotationChannel.registerMessage(PacketRollingStockRotation.Handler.class,
				PacketRollingStockRotation.class, 2, Side.CLIENT);
		 Ctyrk4_Addon_TCCE.modChannel.registerMessage(train.common.core.network.PacketSetJukeboxStreamingUrl.Handler.class,
				PacketSetJukeboxStreamingUrl.class, 1, Side.SERVER);
		Ctyrk4_Addon_TCCE.slotschannel.registerMessage(PacketSlotsFilled.Handler.class, PacketSlotsFilled.class,
				3, Side.CLIENT);
		Ctyrk4_Addon_TCCE.brakeChannel.registerMessage(train.common.core.network.PacketParkingBrake.Handler.class, PacketParkingBrake.class,
				4, Side.SERVER);
		Ctyrk4_Addon_TCCE.lockChannel.registerMessage(train.common.core.network.PacketSetTrainLockedToClient.Handler.class,
				PacketSetTrainLockedToClient.class, 5, Side.SERVER);
		Ctyrk4_Addon_TCCE.ignitionChannel.registerMessage(train.common.core.network.PacketSetLocoTurnedOn.Handler.class, PacketSetLocoTurnedOn.class,
				6, Side.SERVER);
		Ctyrk4_Addon_TCCE.modChannel.registerMessage(PacketLantern.Handler.class, PacketLantern.class, 7,
				Side.SERVER);

		//Traincraft.degActivateChannel.registerMessage(PacketDEGActivate.Handler.class,
		//		PacketDEGActivate.class, 10, Side.SERVER);

		/*Traincraft.degActivateChannel.registerMessage(PacketDEGActivate.Handler.class,
				PacketDEGActivate.class, 10, Side.SERVER);*/

		Ctyrk4_Addon_TCCE.updateTrainIDChannel.registerMessage(train.common.core.network.PacketUpdateTrainID.Handler.class, PacketUpdateTrainID.class, 11, Side.SERVER);
        Ctyrk4_Addon_TCCE.updateDestinationChannel.registerMessage(train.common.core.network.PacketDestination.Handler.class, PacketDestination.class, 12, Side.SERVER);
		Ctyrk4_Addon_TCCE.itsChannel.registerMessage(PacketSetSpeedHandler.class, PacketSetSpeed.class, 200, Side.CLIENT);
		Ctyrk4_Addon_TCCE.itsChannel.registerMessage(PacketSetSpeedHandler.class, PacketSetSpeed.class, 212, Side.SERVER);

		Ctyrk4_Addon_TCCE.itnsChannel.registerMessage(PacketNextSpeedHandler.class, PacketNextSpeed.class, 211, Side.CLIENT);
		Ctyrk4_Addon_TCCE.mtlChannel.registerMessage(PacketMTCLevelUpdateHandler.class,  PacketMTCLevelUpdate.class, 201, Side.SERVER);
		Ctyrk4_Addon_TCCE.msChannel.registerMessage(PacketMTChandler.class, PacketMTC.class, 202, Side.SERVER);
		Ctyrk4_Addon_TCCE.mscChannel.registerMessage(PacketMTChandler.class, PacketMTC.class, 203, Side.CLIENT);
		Ctyrk4_Addon_TCCE.atoChannel.registerMessage(PacketATOHandler.class, PacketATO.class, 205, Side.SERVER);
		Ctyrk4_Addon_TCCE.atoDoSlowDownChannel.registerMessage(PacketATODOSlowDownHandler.class, PacketATODoSlowDown.class, 206, Side.SERVER);
		Ctyrk4_Addon_TCCE.atoDoAccelChannel.registerMessage(PacketATODoAccelHandler.class, PacketDoAccel.class, 207, Side.SERVER);
		Ctyrk4_Addon_TCCE.atoSetStopPoint.registerMessage(PacketATOSetStopPointHandler.class, PacketATOSetStopPoint.class, 208, Side.CLIENT);
		Ctyrk4_Addon_TCCE.NCSlowDownChannel.registerMessage(PacketNCSlowDownHandler.class, PacketNCSlowDown.class, 209, Side.SERVER);
		//Traincraft.ctChannel.registerMessage(PacketWMTCChannelTransmitHandler.class, PacketWMTCChannelTransmit.class, 210, Side.CLIENT);
		Ctyrk4_Addon_TCCE.gsfsChannel.registerMessage(PacketGetSomethingFromServerHandler.class, PacketGetSomethingFromServer.class, 213, Side.SERVER);
		Ctyrk4_Addon_TCCE.gsfsrChannel.registerMessage(PacketThingFromServerHandler.class, PacketThingFromServer.class, 214, Side.CLIENT);
	}
}
