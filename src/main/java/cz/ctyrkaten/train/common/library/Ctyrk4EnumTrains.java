package cz.ctyrkaten.train.common.library;

import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import cz.ctyrkaten.train.common.entity.rollingStock.*;

public enum Ctyrk4EnumTrains {

    LOCO_CD843("locoCD843", "CD 843", Ctyrk4EntityLocoDieselCD843.class, Ctyrk4ItemIDs.minecartLocoCD843.item, "diesel", 816, 111, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"Orange", "Green", "Grey", "LightBlue"}, 18, -4.25, Constants.TOOLTIP),
    LOCO_CD127("locoElectricCD127", "Loco Electric CD 127", Ctyrk4EntityLocoElectricCD127.class, Ctyrk4ItemIDs.minecartCD127.item, "electric", 2978, 66, 0, 15, 0, 400, 0.9, 0.946, 0, new String[]{"Red", "Lime"}, 18, -1, Constants.TOOLTIP),
    MOTOR_CD127("CD127Motor", "CD 127 Motor", Ctyrk4EntityCD127Motor.class, Ctyrk4ItemIDs.minecartCD127Motor.item, "freight", 0.5, new String[]{"Red", "Lime"}, 0, 27, Constants.TOOLTIP),
    PASSENGER_CSDBP920("passengerCSDBP920", "CSD Bp 920", Ctyrk4EntityPassengerCSDBP920.class, Ctyrk4ItemIDs.minecartCSDBP920.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 10, 0, Constants.TOOLTIP),
    PASSENGER_CDBDMTEEO("passengerCDBDMTEEO", "CSD Bp 920", Ctyrk4EntityPassengerCDBDMTEEO.class, Ctyrk4ItemIDs.minecartCDBDMTEEO.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Red", "LightBlue", "Blue"}, 10, 0, Constants.TOOLTIP),
    PASSENGER_CDA149("passengerCDA149", "Passenger CD A149", Ctyrk4EntityPassengerCDA149.class, Ctyrk4ItemIDs.minecartCDA149.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 18, 0, Constants.TOOLTIP),
    PASSENGER_CDB249("passengerCDB249", "Passenger CD B249", Ctyrk4EntityPassengerCDB249.class, Ctyrk4ItemIDs.minecartCDB249.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Green", "Lime"}, 18, 0, Constants.TOOLTIP),
    PASSENGER_CDBDS("passengerCDBDS", "Passenger CD BDs", Ctyrk4EntityPassengerCDBDS.class, Ctyrk4ItemIDs.minecartCDBDS.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 18, 0, Constants.TOOLTIP),
    PASSENGER_CDDS("passengerCDDS", "Passenger CD Ds", Ctyrk4EntityFreightCDDS.class, Ctyrk4ItemIDs.minecartCDDS.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 18, 0, Constants.TOOLTIP),
    PASSENGER_CDWRMZ("passengerCDWRMZ", "Passenger CD WRMz", Ctyrk4EntityPassengerCDWRMZ.class, Ctyrk4ItemIDs.minecartCDWRMZ.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red"}, 18, 0, Constants.TOOLTIP),
    PROPAGANDA_CZECH("propagandaCzech", "Propaganda Czech", Ctyrk4EntityPropagandaCzech.class, Ctyrk4ItemIDs.minecartPropagandaCzech.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, new String[]{"Flag"}, 14, 0, Constants.TOOLTIP),
    PASSENGER_CDBDTN("passengerCDBDTN", "CD Bdtn", Ctyrk4EntityPassengerCDBDTN.class, Ctyrk4ItemIDs.minecartCDBDTN.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Brown", "Red"}, 0, 0, Constants.TOOLTIP),
    PROPAGANDA_CTYRK4("propagandaCtyrk4", "Propaganda Ctyrk4", Ctyrk4EntityPropaganda.class, Ctyrk4ItemIDs.minecartPropagandaCtyrk4.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, new String[]{"White"}, 14, 0, Constants.TOOLTIP),
    TENDER_CSD387("tenderCSD387", "CSD 387 Tender", Ctyrk4EntityTenderCSD387.class, Ctyrk4ItemIDs.minecartCSD387Tender.item, "tender", 0,
            0, 0.5, 0, 0, 0, 0, 0, 14000, new String[]{"Black", "Green"}, 18, 0,
            Constants.TOOLTIP),
    LOCO_CD742("locoDieselGP40", "Loco Diesel CD742", Ctyrk4EntityLocoDieselCD742.class, Ctyrk4ItemIDs.minecartCD742.item, "diesel", 1200, 91,
            0, 50, 0, 250, 0.8, 0.966, 10000, new String[]{"Yellow", "White", "Blue", "Orange", "LightBlue", "Green", "Lime", "Red"}, 15, -2.5, Constants.TOOLTIP),
    LOCO_CD751("locoDieselCD751", "Loco Diesel CD 751", Ctyrk4EntityLocoDieselCD751.class, Ctyrk4ItemIDs.minecartCD751.item, "diesel",
            1985, 101, 0, 40, 0, 100, 0.8, 0.97, 12000, new String[]{"Red", "Blue", "Grey" ,"Yellow", "Green", "Pruhy"}, 10, -4.2, Constants.TOOLTIP),
    LOCO_CD754("locoDieselCD754", "Loco Diesel CD 754", Ctyrk4EntityLocoDieselCD754.class, Ctyrk4ItemIDs.minecartCD754.item, "diesel",
            1985, 101, 0, 40, 0, 100, 0.8, 0.97, 12000, new String[]{"Red", "Cyan", "Orange", "Green", "Yellow", "Lime", "Grey", "Blue", "Bleskovka"}, 10, -4.2, Constants.TOOLTIP),
    LOCO_CD720("locoDieselCD720", "Loco Diesel CD 720", Ctyrk4EntityLocoDieselCD720.class, Ctyrk4ItemIDs.minecartCD720.item, "diesel",
            750, 61, 0, 40, 0, 100, 0.8, 0.97, 12000, new String[]{"Red", "Green", "Blue"}, 10, -4.2, Constants.TOOLTIP),
    LOCO_CD151("locoElectricCD151", "Loco Electric CD151", Ctyrk4EntityLocoElectricCD151.class, Ctyrk4ItemIDs.minecartLocoCD151.item, "electric", 5438, 161, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Blue", "Yellow", "Red", "Green", "Cyan", "Brown", "Orange", "Purple", "White", "Magenta", "LightBlue"}, 18, -4, Constants.TOOLTIP),
    LOCO_ARR845("ARR845", "Arriva 845", Ctyrk4EntityLocoDieselARR845.class, Ctyrk4ItemIDs.minecartARR845.item, "diesel", 286, 121, 0, 10, 0, 100, 0.85, 0.7, 15000, new String[]{"Cyan", "LightBlue"}, 18, -4.5, Constants.TOOLTIP),
    LOCO_ZSSK350("locoElectricZSSK350", "Loco Electric ZSSK 350", Ctyrk4EntityLocoElectricZSSK350.class, Ctyrk4ItemIDs.minecartLocoZSSK350.item, "electric", 5438, 161, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Red", "Blue", "Brown"}, 18, -4, Constants.TOOLTIP),
    LOCO_ZSSK362("locoElectricZSSK362", "Loco Electric ZSSK362", Ctyrk4EntityLocoElectricZSSK362.class, Ctyrk4ItemIDs.minecartZSSK362.item, "electric", 4446, 141, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Red"}, 18, -4, Constants.TOOLTIP),
    LOCO_ZSSK363("locoElectricZSSK363", "Loco Electric ZSSK363", Ctyrk4EntityLocoElectricZSSK363.class, Ctyrk4ItemIDs.minecartZSSK363.item, "electric", 4446, 121, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Blue"}, 18, -4, Constants.TOOLTIP),
    LOCO_CD362("locoElectricCD362", "Loco Electric CD362", Ctyrk4EntityLocoElectricCD362.class, Ctyrk4ItemIDs.minecartLocoCD362.item, "electric", 4446, 141, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Red", "Blue", "Yellow", "LightBlue", "Pink", "Brown"}, 18, -4, Constants.TOOLTIP),
    LOCO_CD363("locoElectricCD363", "Loco Electric CD363", Ctyrk4EntityLocoElectricCD363.class, Ctyrk4ItemIDs.minecartLocoCD363.item, "electric", 4446, 121, 0, 10, 0, 170, 0.7, 0.965, 6850, new String[]{"Blue", "Red", "LightBlue"}, 18, -4, Constants.TOOLTIP),
    LOCO_CD242("locoCD242", "Loco Electric CD 242", Ctyrk4EntityLocoElectricCD242.class, Ctyrk4ItemIDs.locoCD242.item, "electric", 4188, 121, 0, 8, 0, 170, 0.66, 0.96, 8000, new String[]{"Blue", "Grey", "Brown", "Green", "Red", "LightBlue"}, 15, -3.8, Constants.TOOLTIP),
    LOCO_CD100("locoCD100", "Loco Electric CD 100", Ctyrk4EntityLocoElectricCD100.class, Ctyrk4ItemIDs.locoCD100.item, "electric", 4188, 51, 0, 8, 0, 170, 0.66, 0.96, 8000, new String[]{"Green"}, 15, -3.8, Constants.TOOLTIP),
    LOCO_CD140("locoCD140", "Loco Electric CD 140", Ctyrk4EntityLocoElectricCD140.class, Ctyrk4ItemIDs.locoCD140.item, "electric", 4188, 121, 0, 8, 0, 170, 0.66, 0.96, 8000, new String[]{"Green", "Blue", "LightBlue"}, 15, -3.8, Constants.TOOLTIP),
    LOCO_CD111("locoCD111", "Loco Electric CD 111", Ctyrk4EntityLocoElectricCD111.class, Ctyrk4ItemIDs.locoCD111.item, "electric", 1186, 81, 0, 8, 0, 170, 0.66, 0.96, 8000, new String[]{"Blue", "Orange", "Green", "Red", "Yellow", "Najbrt", "Najbrt2"}, 15, -2.35, Constants.TOOLTIP),
    //    LOCO_CD714("CD714", EntityLocoDieselCD714.class, Ctyrk4ItemIDs.minecartCD714.item, "diesel", 816, 81, 0, 45, 0, 200, 0.87, 0.93, 16000, new String[] {"Test"}), 10, 2.5, Constants.TOOLTIP),
    LOCO_RE420("locoRE420", "Loco Electric RE 420", Ctyrk4EntityLocoElectricRE420.class, Ctyrk4ItemIDs.minecartRE420.item, "electric", 6390, 141, 0, 8, 0, 170, 0.66, 0.96, 8000, new String[]{"Red"}, 15, -3.8, Constants.TOOLTIP),
    LOCO_ZSSK131("locoZSSK131", "Loco Electric ZSSK 131", Ctyrk4EntityLocoElectricZSSK131.class, Ctyrk4ItemIDs.minecartZSSK131.item, "electric", 3046, 101, 0, 8, 0, 400, 1.1, 0.956, 0, new String[]{"Green"}, 14, -2.3, Constants.TOOLTIP),
    LOCO_CSD387("locoSteamCSD387", "CSD 387", Ctyrk4EntityLocoSteamCSD387.class, Ctyrk4ItemIDs.minecartCSD387.item,
            "steam", 2102, 111, 0, 60, 180, 160, 0.7, 0.97, 10000, new String[]{"Black", "Green"}, 7, -5.66, Constants.TOOLTIP),
    LOCO_U57("locoSteamU57", "Loco U57", Ctyrk4EntityLocoSteamU57.class, Ctyrk4ItemIDs.minecartLocoSteamU57.item, "steam", 800, 31, 0, 60, 160, 150, 1, 0.968, 5000, null, 15, -1.5, Constants.TOOLTIP),
    TENDER_U57("tenderU57", "Tender U57", Ctyrk4EntityTenderU57.class, Ctyrk4ItemIDs.minecartTenderU57.item, "tender", 0, 0, 0.5, 0, 0, 0, 0, 0, 10000, null, 18, 0, Constants.TOOLTIP),
    LOCO_M1("locoElectricM1Motor", "Loco Electric M1 Motor", Ctyrk4EntityLocoElectricM1.class, Ctyrk4ItemIDs.minecartM1Loco.item, "electric", 770, 91, 0, 3, 0, 230, 1.4, 0.98, 0, new String[]{"Red"}, 10, -3.1, Constants.TOOLTIP),
    PASSENGER_M1("passengerM1Coach", "Passenger M1 Coach", Ctyrk4EntityPassengerM1Coach.class, Ctyrk4ItemIDs.minecartM1Coach.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Red"}, 10, 0, Constants.TOOLTIP),
    CABOOSE_M1("cabooseM1Tail", "Passenger M1 Tail", Ctyrk4EntityCabooseM1Tail.class, Ctyrk4ItemIDs.minecartM1Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Red"}, 10, 0, Constants.TOOLTIP),
    LOCO_CD471("CD471Motor", "Loco Electric CD471 Motor", Ctyrk4EntityLocoElectricCD471Motor.class, Ctyrk4ItemIDs.minecartLocoCD471Motor.item, "electric", 2719, 141, 0, 3, 0, 230, 1.4, 0.98, 0, new String[]{"White", "Blue", "Grey"}, 10, -3.6, Constants.TOOLTIP),
    LOCO_CD971("CD971Motor", "Loco Electric CD971 Motor", Ctyrk4EntityLocoElectricCD471Tail.class, Ctyrk4ItemIDs.minecartCabooseCD471Tail.item, "electric", 2719, 141, 0, 3, 0, 230, 1.4, 0.98, 0, new String[]{"White", "Blue", "Grey"}, 10, -3.6, Constants.TOOLTIP),
    PASSENGER_CD471("passengerCD471Coach", "Passenger CD471 Coach", Ctyrk4EntityPassengerCD471Coach.class, Ctyrk4ItemIDs.minecartPassengerCD471Coach.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"White", "Blue", "Grey"}, 10, 0, Constants.TOOLTIP),
    LOCO_CD470("locoElectricCD470Motor", "Loco Electric CD470 Motor", Ctyrk4EntityLocoElectricCD470Motor.class, Ctyrk4ItemIDs.minecartLocoCD470Motor.item, "electric", 2654, 121, 0, 3, 0, 230, 1.4, 0.98, 0, new String[]{"Red", "Blue"}, 10, -3.6, Constants.TOOLTIP),
    PASSENGER_CD470("passengerCD470Coach", "Passenger CD470 Coach", Ctyrk4EntityPassengerCD470Coach.class, Ctyrk4ItemIDs.minecartPassengerCD470Coach.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Blue"}, 10, 0, Constants.TOOLTIP),
    LOCO_CD451("locoCD451", "CD 451", Ctyrk4EntityLocoElectricCD451Motor.class, Ctyrk4ItemIDs.minecartCD451.item, "electric", 1795, 101, 0, 3, 0, 200, 1.5, 0.98, 0, null, 10, -3.6, Constants.TOOLTIP),
    PASSENGER_CD451("passengerCD451Coach", "CD 451 Coach", Ctyrk4EntityPassengerCD451Coach.class, Ctyrk4ItemIDs.minecartCD451Coach.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, null, 10, 0, Constants.TOOLTIP),
    LOCO_CD812("locoCD812", "CD812 Driving Motor", Ctyrk4EntityLocoDieselCD812.class, Ctyrk4ItemIDs.minecartCD812.item, "diesel", 329, 81, 0, 60, 0, 200, 0.8, 0.97, 6000, null, 10, -2.4, Constants.TOOLTIP),
    LOCO_CD854("locoCD854", "CD854 Driving Motor", Ctyrk4EntityLocoDieselCD854.class, Ctyrk4ItemIDs.minecartCD854.item, "diesel", 810, 121, 0, 60, 0, 200, 0.8, 0.97, 6000, new String[]{"Red", "Orange", "Blue"}, 10, -6.1, Constants.TOOLTIP),
    LOCO_CD460("locoCD460", "Loco 460", Ctyrk4EntityLocoElectricCD460.class, Ctyrk4ItemIDs.minecartCD460.item, "electric", 2719, 111, 0, 35, 0, 230, 1.4, 0.98, 0, new String[]{"Purple", "Green"}, 10, -3.6, Constants.TOOLTIP),
    PASSENGER_CD460("passengerCD460", "Passenger 060", Ctyrk4EntityPassengerCD460Coach.class, Ctyrk4ItemIDs.minecartCD060.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"Red", "Lime"}, 10, 0, Constants.TOOLTIP),
    LOCO_8171M("loco8171M", "Loco 8171M Front", Ctyrk4EntityLocoElectric8171MLoco.class, Ctyrk4ItemIDs.minecart8171Loco.item, "electric", 598, 81, 0, 35, 0, 230, 1.4, 0.98, 0, new String[]{"White", "Red"}, 10, -3.6, Constants.TOOLTIP),
    PASSENGER_8171M_MID("passenger8171Mid", "Passenger 8171M Mid", Ctyrk4EntityPassenger8171MMid.class, Ctyrk4ItemIDs.minecart8171M_Middle.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"White", "Red"}, 10, 0, Constants.TOOLTIP),
    PASSENGER_8171M_REAR("passenger8171Rear", "Passenger 8171M Rear", Ctyrk4EntityPassenger8171Tail.class, Ctyrk4ItemIDs.minecart8171MTail.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, new String[]{"White", "Red"}, 10, 0, Constants.TOOLTIP),
    LOCO_CD383("CD383", "CD383", Ctyrk4EntityLocoElectricCD383.class, Ctyrk4ItemIDs.minecartCD383.item, "electric", 7885, 201, 0, 10, 0, 0, 0.9, 0.79, 0, new String[]{"Red", "Orange", "Yellow", "Magenta", "LightBlue", "Blue", "White", "Grey", "Cargo Modra"}, 10, -3.7, Constants.TOOLTIP),
    LOCO_ZSSK383("ZSSK383", "ZSSK383", Ctyrk4EntityLocoElectricZSSK383.class, Ctyrk4ItemIDs.minecartZSSK383.item, "electric", 7885, 201, 0, 10, 0, 0, 0.9, 0.79, 0, new String[]{"Red"}, 10, -3.7, Constants.TOOLTIP),
    LOCO_CD814("locoCD814", "CD814 Driving Motor", Ctyrk4EntityLocoDieselCD814.class, Ctyrk4ItemIDs.minecartCD814.item, "diesel", 329, 81, 0, 10, 0, 200, 0.8, 0.97, 6000, new String[]{"Blue", "Yellow", "Pink", "Orange", "Najbrt"}, 10, -2.0, Constants.TOOLTIP),
    LOCO_CD914("locoCD914", "CD914 Driving Motor", Ctyrk4EntityLocoDieselCD914.class, Ctyrk4ItemIDs.minecartCD914.item, "diesel", 329, 81, 0, 10, 0, 200, 0.8, 0.97, 6000, new String[]{"Blue", "Yellow", "Pink", "Orange", "Najbrt"}, 10, -2.0, Constants.TOOLTIP),
    PASSENGE_CD014("passengerCD014", "CD014 Trailer", Ctyrk4EntityPassengerCD014.class, Ctyrk4ItemIDs.minecartCD014.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Yellow", "Pink"}, 10, 0, Constants.TOOLTIP),
    LOCO_CD810("locoCD810", "CD810 Driving Motor", Ctyrk4EntityLocoDieselCD810.class, Ctyrk4ItemIDs.minecartCD810.item, "diesel", 210, 81, 0, 60, 0, 200, 0.8, 0.97, 6000, new String[]{"Blue", "Red", "Yellow", "Green", "Pink", "White", "Orange", "Grey", "Magenta", "LightGrey", "LightBlue", "Lime"}, 10, -2.0, Constants.TOOLTIP),
    PASSENGER_CD010("passengerCD010", "CD010 Trailer", Ctyrk4EntityPassengerCD010.class, Ctyrk4ItemIDs.minecartCD010.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Red", "Yellow", "Green", "Pink", "White", "Grey", "Orange"}, 10, 0, Constants.TOOLTIP),
    LOCO_CD704("CD704", "CD704", Ctyrk4EntityLocoDieselCD704.class, Ctyrk4ItemIDs.minecartCD704.item, "diesel", 340, 61, 0, 45, 0, 200, 0.87, 0.93, 16000, new String[]{"Red", "Blue", "Yellow"}, 10, -1.15, Constants.TOOLTIP),
    PASSENGER_CDBBDGMEE236("passengerCDBBDGMEE236", "CDBBDGMEE 236", Ctyrk4EntityPassengerCDBBDGMEE236.class, Ctyrk4ItemIDs.minecartCDBBDGMEE236.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 10, 0, Constants.TOOLTIP),
    PASSENGER_MVZSV2("passengerMVZSV2", "SZDC MVZSv2", Ctyrk4EntityPassengerMVZSV2.class, Ctyrk4ItemIDs.minecartPassengerMVZSV2.item, "work", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, new String[]{"Yellow"}, 18, 0, Constants.TOOLTIP),
    FREIGHT_CDEAS11("CDEAS11", "CD EAs 11", Ctyrk4EntityFreightCDEAS11.class, Ctyrk4ItemIDs.minecartCDEAS11.item, "freight", 3.5, new String[]{"Brown"}, 18, 36, Constants.TOOLTIP),
    PASSENGER_CDAB349("passengerCDAB349", "CD AB349", Ctyrk4EntityPassengerCDAB349.class, Ctyrk4ItemIDs.minecartCDAB349.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 10, 0, Constants.TOOLTIP),
    PASSENGER_ZSSK012("passengerZSSK012", "ZSSK 012", Ctyrk4EntityPassengerZSSK012.class, Ctyrk4ItemIDs.minecartZSSK012.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Red"}, 10, 0, Constants.TOOLTIP),
    LOCO_CD650("CD650", "CD 650", Ctyrk4EntityLocoElectricCD650Loco.class, Ctyrk4ItemIDs.minecartCD650.item, "electric", 1849, 161, 0, 10, 0, 0, 0.9, 0.9, 0, new String[]{"Najbrt"}, 10, -4.5, Constants.TOOLTIP),
    LOCO_CD651("CD651", "CD 651", Ctyrk4EntityLocoElectricCD651Loco.class, Ctyrk4ItemIDs.minecartCD651.item, "electric", 1849, 161, 0, 10, 0, 0, 0.9, 0.9, 0, new String[]{"Najbrt"}, 10, -4.7, Constants.TOOLTIP),
    PASSENGER_CD652("CD652", "CD 652", Ctyrk4EntityPassengerCD652.class, Ctyrk4ItemIDs.minecartCD652.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, new String[]{"Najbrt"}, 0, 0, Constants.TOOLTIP),
    LOCO_ZSSK812("locoZSSK812", "ZSSK812 Driving Motor", Ctyrk4EntityLocoDieselZSSK812.class, Ctyrk4ItemIDs.minecartZSSK812.item, "diesel", 349, 81, 0, 60, 0, 200, 0.8, 0.97, 6000, new String[]{"Red"}, 10, -2.0, Constants.TOOLTIP),
    LOCO_CDBFHPVEE295("CDBFHPVEE295", "CDBFHPVEE295", Ctyrk4EntityElectricCDBFHPVEE295.class, Ctyrk4ItemIDs.minecartCDBFHPVEE295.item, "electric", 4446, 141, 0, 60, 0, 100, 0.7, 0.7, 1000, new String[]{"Blue"}, 18, -4, Constants.TOOLTIP),
    PASSENGER_CDBDMTEE("CDBDMTEE", "CDBDMTEE", Ctyrk4EntityPassengerCDBDMTEE.class, Ctyrk4ItemIDs.minecartCDBDMTEE.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, new String[]{"Blue", "Green"}, 0, 0),
    LOCO_CD680("locoElectricCD680", "CD680 Loco", Ctyrk4EntityLocoElectricCD680.class, Ctyrk4ItemIDs.minecartCD680Loco.item, "electric", 6840, 260, 0, 60, 0, 100, 0.7, 0.8, 1000, new String[]{"Blue"}, 18, -5.1, Constants.TOOLTIP),
    PASSENGER_CD680("passengerCD680Coach", "CD680 Coach", Ctyrk4EntityPassengerCD680Coach.class, Ctyrk4ItemIDs.minecartCD680Coach.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 0, 0, Constants.TOOLTIP),
    CABOOSE_CD680("cabooseCD680Tail", "CD680 Tail", Ctyrk4EntityPassengerCD680Tail.class, Ctyrk4ItemIDs.minecartCD680Tail.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 0, 0, Constants.TOOLTIP),
    LOCO_CD715("CD715", "CD 715", Ctyrk4EntityLocoDieselCD715.class, Ctyrk4ItemIDs.minecartCD715.item, "diesel", 1058, 60, 0, 60, 0, 170, 0.66, 0.96, 8000, null, 15, -1.5, Constants.TOOLTIP),
    FREIGHT_CDZAS30("CDZAS30", "Zas 30", Ctyrk4EntityCDZAS30.class, Ctyrk4ItemIDs.minecartCDZAS30.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 50000, new String[]{"Blue", "White"}, 18, 0, Constants.TOOLTIP),
    FREIGHT_CDNP("CDNP", "CD NP", Ctyrk4EntityCDNP.class, Ctyrk4ItemIDs.minecartCDNP.item, "freight", 5, new String[]{"Brown"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_CDKNS("CDKNS", "CD KNS", Ctyrk4EntityCDKNS.class, Ctyrk4ItemIDs.minecartCDKNS.item, "freight", 4, new String[]{"Red"}, 18, 45, Constants.TOOLTIP),
    FREIGHT_CDES11("CDES11", "CD ES11", Ctyrk4EntityCDES11.class, Ctyrk4ItemIDs.minecartCDES11.item, "freight", 3.5, new String[]{"Brown"}, 18, 45, Constants.TOOLTIP),
    LOCO_CSD464("CSD464", "Loco Steam CSD 387", Ctyrk4EntityCSD464.class, Ctyrk4ItemIDs.minecartCSD464.item, "steam", 1030, 97, 0, 80, 100, 200, 0.35, 0.975, 16000, new String[]{"Red"}, 10, -3.0, Constants.TOOLTIP),
    LOCO_T4("T4", "T4", Ctyrk4EntityElectricT4.class, Ctyrk4ItemIDs.minecartT4.item, "electric", 200, 70, 0, 20, 0, 100, 0.7, 0.8, 1000, new String[]{"Red", "Orange"}, 18, -2, Constants.TOOLTIP),
    LOCO_CD954("locoCD954", "CD854 Driving Motor", Ctyrk4EntityLocoDieselCD954.class, Ctyrk4ItemIDs.minecartCD954.item, "diesel", 810, 121, 0, 60, 0, 200, 0.8, 0.97, 6000, new String[]{"Red"}, 10, -6.1, Constants.TOOLTIP),
    LOCO_A16("ClassA16", "A16", Ctyrk4EntityLocoSteamA16.class, Ctyrk4ItemIDs.minecartA16Loco.item,
            "steam", 5000, 146, 0, 60, 180, 160, 0.7, 0.97, 16000, new String[]{"Black", "Brown", "Cyan", "Green", "Grey", "LightBlue", "Lime", "Magenta", "Pink", "Red", "White", "Skin16", "Skin17", "Skin18"}, 7, -8, Constants.TOOLTIP),
    TENDER_A16("ClassA16tender", "A16 tender", Ctyrk4EntityTenderA16.class, Ctyrk4ItemIDs.minecartA16Tender.item, "tender", 0,
            0, 0.5, 0, 0, 0, 0, 0, 25000, new String[]{"Black"}, 18, 0,
            Constants.TOOLTIP),
    FREIGHT_FLBOX("FlBox", "FreeLance Box Cart", Ctyrk4EntityFreightFLBox.class, Ctyrk4ItemIDs.minecartFLBox.item, "freight", 3.5, new String[]{"Brown"}, 18, 36, Constants.TOOLTIP),
    LOCO_TITAN("ClassTitan", "Titan", Ctyrk4EntityLocoSteamTitan.class, Ctyrk4ItemIDs.minecartTitanLoco.item,
            "steam", 4200, 178, 0, 60, 180, 160, 0.7, 0.97, 25000, new String[]{"Black", "Grey", "LightGrey", "Red", "White", "White", "Yellow"}, 7, -6, Constants.TOOLTIP),
    TENDER_TITAN("ClassTitanTender", "Titan Tender", Ctyrk4EntityTenderTitan.class, Ctyrk4ItemIDs.minecartTitanTender.item, "tender", 0,
            0, 0.5, 0, 0, 0, 0, 0, 30000, new String[]{"Black"}, 18, 0,
            Constants.TOOLTIP),
    LOCO_SF482("SF482", "SF 4-8-2", Ctyrk4EntityLocoSteamSF482.class, Ctyrk4ItemIDs.minecartSF482.item,
            "steam", 2600, 161, 0, 60, 180, 160, 0.7, 0.97, 20000, new String[]{"Black", "Grey", "LightGrey"}, 7, -5.6, Constants.TOOLTIP),
    TENDER_SF_LARGE("SFLargeTender", "SF Large Tender", Ctyrk4EntityTenderSFLarge.class, Ctyrk4ItemIDs.minecartSFTenderLarge.item, "tender", 0,
            0, 0.5, 0, 0, 0, 0, 0, 30000, new String[]{"Black", "Red"}, 18, 0,
            Constants.TOOLTIP),
    LOCO_SDHIGH("SDHigh", "Early SD High Hood", Ctyrk4EntityLocoDieselSDHigh.class, Ctyrk4ItemIDs.minecartSDHigh.item, "diesel", 2400, 106,
            0, 50, 0, 250, 0.8, 0.966, 10000, new String[]{"Yellow", "Grey", "Southfield", "Union Pacific 448 1", "Union Pacific 448 2"}, 15, -3.4, Constants.TOOLTIP),
    LOCO_SDLOW("SDLOW", "Early SD LOW Hood", Ctyrk4EntityLocoDieselSDLow.class, Ctyrk4ItemIDs.minecartSDLow.item, "diesel", 2400, 106,
            0, 50, 0, 250, 0.8, 0.966, 10000, new String[]{"Yellow", "Yellow2", "Yellow3", "Grey", "Guilford", "Santa Fe 1", "Santa Fe 2", "Santa Fe 3", "Santa Fe 4"}, 15, -3.4, Constants.TOOLTIP),
    LOCO_SDBUnit("SDBUnit", "Early SD B-Unit", Ctyrk4EntityLocoDieselSDBUnit.class, Ctyrk4ItemIDs.minecartSDBUnit.item, "diesel", 2400, 106,
            0, 50, 0, 250, 0.8, 0.966, 10000, new String[]{"Default", "Southfield"}, 15, -3.4, Constants.TOOLTIP),
    LOCO_SD("SD", "Early SD", Ctyrk4EntityLocoDieselSD.class, Ctyrk4ItemIDs.minecartSD.item, "diesel", 3800, 114,
            0, 50, 0, 250, 0.8, 0.966, 10000, new String[]{"Default", "Canadian National", "Illinois Central 1", "Illinois Central 2", "Southfield 1", "Southfield 2"}, 15, -4.9, Constants.TOOLTIP),
    PASSENGER_CSDAA("passengerCSDAA", "Passenger CSD Aa", Ctyrk4EntityPassengerCSDAA.class, Ctyrk4ItemIDs.minecartCSDAa.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Green"}, 18, 0, Constants.TOOLTIP),
    PASSENGER_CSDABA("passengerCSDABA", "Passenger CSD ABa", Ctyrk4EntityPassengerCSDABA.class, Ctyrk4ItemIDs.minecartCSDABa.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Green"}, 18, 0, Constants.TOOLTIP),
    PASSENGER_CSDBA("passengerCSDBA", "Passenger CSD Ba", Ctyrk4EntityPassengerCSDBA.class, Ctyrk4ItemIDs.minecartCSDBa.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Green"}, 18, 0, Constants.TOOLTIP),
    PASSENGER_CSDBDA("passengerCSDBDA", "Passenger CSD Bda", Ctyrk4EntityPassengerCSDBDA.class, Ctyrk4ItemIDs.minecartCSDBda.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Green"}, 18, 0, Constants.TOOLTIP),
    PASSENGER_CSDWR("passengerCSDWR", "Passenger CSD WR", Ctyrk4EntityPassengerCSDWR.class, Ctyrk4ItemIDs.minecartCSDWR.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"Blue"}, 18, 0, Constants.TOOLTIP),
    ;
    private String trainId;
    private String internalName;
    private Class entityClass;
    private Item item;
    private String trainType;
    private int MHP;
    private int maxSpeed;
    private double mass;
    private int fuelConsumption;
    private int waterConsumption;
    private int heatingTime;
    private double accelerationRate;
    private double brakeRate;
    private int tankCapacity;
    private String[] liveries;
    private int guiRenderScale;
    private double bogieLocoPosition;
    private String additionalTooltip;
    private int cargoCapacity;

    /**
     * Constructor for standard train.
     *
     * @param internalName : Only used by EntityRegistry
     * @param entityClass
     * @param item
     * @param trainType: "steam", "diesel", "freight", "passenger", "special",
     * "flat", "electric"
     * @param MHP: power of the locomotive
     * @param maxSpeed
     * @param mass (will be multiplied by 10 internally. That means putting 0.1
     * here will create a mass of 1 Ton in game)
     * @param fuelConsumption: 1 unit is consumed every x ticks
     * @param waterConsumption: 1 unit is consumed every x ticks
     * @param heatingTime
     * @param accelerationRate: generally around 0.45
     * @param brakeRate: generally around 0.98
     * @param tankCapacity
     * @param liveries: an array with all possible colors / variants. Index 0 is
     * used as default color when train is first spawned. leave null if no color
     * available
     * @param guiRenderScale: scale at which the entity will be rendered inside
     * the GUI (crafting GUI)
     */
    private Ctyrk4EnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] liveries, int guiRenderScale, double bogieLocoPosition) {
        this.trainId = trainId;
        this.internalName = internalName;
        this.entityClass = entityClass;
        this.item = item;
        this.trainType = trainType;
        this.MHP = MHP;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.fuelConsumption = fuelConsumption;
        this.waterConsumption = waterConsumption;
        this.heatingTime = heatingTime;
        this.accelerationRate = accelerationRate;
        this.brakeRate = brakeRate;
        this.tankCapacity = tankCapacity;
        this.liveries = liveries;
        this.guiRenderScale = guiRenderScale;
        this.bogieLocoPosition = bogieLocoPosition;
    }

    /**
     * Constructor for additional tooltips on the item
     *
     * @param internalName
     * @param entityClass
     * @param item
     * @param trainType
     * @param MHP
     * @param maxSpeed
     * @param mass
     * @param fuelConsumption
     * @param waterConsumption
     * @param heatingTime
     * @param accelerationRate
     * @param brakeRate
     * @param tankCapacity
     * @param liveries
     * @param guiRenderScale
     * @param bogieLocoPositions
     * @param additionalTooltip
     */
    private Ctyrk4EnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] liveries, int guiRenderScale, double bogieLocoPositions, String additionalTooltip) {
        this.trainId = trainId;
        this.internalName = internalName;
        this.entityClass = entityClass;
        this.item = item;
        this.trainType = trainType;
        this.MHP = MHP;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.fuelConsumption = fuelConsumption;
        this.waterConsumption = waterConsumption;
        this.heatingTime = heatingTime;
        this.accelerationRate = accelerationRate;
        this.brakeRate = brakeRate;
        this.tankCapacity = tankCapacity;
        this.liveries = liveries;
        this.guiRenderScale = guiRenderScale;
        this.bogieLocoPosition = bogieLocoPositions;
        this.additionalTooltip = additionalTooltip;
    }

    /**
     * Constructor for freight carts
     *
     * @param internalName
     * @param entityClass
     * @param item
     * @param trainType
     * @param mass
     * @param liveries
     * @param guiRenderScale
     * @param cargoCapacity
     * @param additionalTooltip
     */
    private Ctyrk4EnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, double mass, String[] liveries, int guiRenderScale, int cargoCapacity, String additionalTooltip) {
        this.trainId = trainId;
        this.internalName = internalName;
        this.entityClass = entityClass;
        this.item = item;
        this.trainType = trainType;
        this.mass = mass;
        this.liveries = liveries;
        this.guiRenderScale = guiRenderScale;
        this.additionalTooltip = additionalTooltip;
        this.cargoCapacity = cargoCapacity;
    }

    public String getTrainId() {
        return trainId;
    }

    public String getInternalName() {
        return this.internalName;
    }

    public Item getItem() {
        return this.item;
    }

    public String getTrainType() {
        return this.trainType;
    }

    public int getMHP() {
        return this.MHP;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getMass() {
        return this.mass;
    }

    public int getFuelConsumption() {
        return this.fuelConsumption;
    }

    public int getWaterConsumption() {
        return this.waterConsumption;
    }

    public int getHeatingTime() {
        return this.heatingTime;
    }

    public double getAccelerationRate() {
        return this.accelerationRate;
    }

    public double getBrakeRate() {
        return this.brakeRate;
    }

    public int getTankCapacity() {
        return this.tankCapacity;
    }

    public String[] getLiveries() {
        return this.liveries;
    }

    public double getBogieLocoPosition() {
        return this.bogieLocoPosition;
    }

    public Class getEntityClass() {
        return this.entityClass;
    }

    public int getGuiRenderScale() {
        return this.guiRenderScale;
    }

    public String getAdditionnalTooltip() {
        return this.additionalTooltip;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    private static class Constants {

        public static final String TOOLTIP = "Pack: " + EnumChatFormatting.YELLOW + "Ctyrk4 Pack" + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "  -Petsox";
    }
}
