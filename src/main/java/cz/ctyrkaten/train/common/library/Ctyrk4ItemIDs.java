package cz.ctyrkaten.train.common.library;

import net.minecraft.item.Item;

public enum Ctyrk4ItemIDs {
	minecartCD742("ItemRollingStock", "CD_742", 10),
	minecartCD754("ItemRollingStock", "CD_754", 10),
	minecartCD451("ItemRollingStock", "CD_451", 10),
	minecartCD451Coach("ItemRollingStock", "CD_051", 10),
	minecartCSDBP920("ItemRollingStock", "CSD_BP_920", 10),
	minecartCD383("ItemRollingStock", "CD_383", 10),
	minecartZSSK383("ItemRollingStock", "ZSSK_383", 10),
	minecartZSSK362("ItemRollingStock", "ZSSK_361", 10),
	minecartZSSK363("ItemRollingStock", "ZSSK_363", 10),
	minecartCSD387("ItemRollingStock", "CSD387", 10),
	minecartCSD387Tender("ItemRollingStock", "CSD387Tender", 10),
	minecartLocoSteamU57("ItemRollingStock","LocoU57Icon",10),
	minecartTenderU57("ItemRollingStock","TenderU57Icon",10),
	minecartLocoCD151("ItemRollingStock", "CD_151", 3),
	minecartLocoCD362("ItemRollingStock", "CD_362", 3),
	minecartLocoCD363("ItemRollingStock", "CD_363", 3),
	minecartLocoCD843("ItemRollingStock", "CD_843", 3),
	minecartLocoZSSK350("ItemRollingStock", "ZSSK_350", 3),
	minecartCD230("ItemRollingStock", "CD_230", 3),
	locoCD242("ItemRollingStock", "CD_242", 3),
	locoCD100("ItemRollingStock", "CD_100", 3),
	locoCD140("ItemRollingStock", "CD_140", 3),
	minecartCDBDTN("ItemRollingStock", "CD_Bdtn", 3),
	minecartPassengerMVZSV2("ItemRollingStock", "MVZSV2", 3),

	minecartZSSK131("ItemRollingStock", "ZSSK_131", 3),
	//minecartCD714("ItemRollingStock", "CD_714", 3),
	locoCD111("ItemRollingStock", "CD_111", 3),
	minecartCD010("ItemRollingStock", "CD010", 2),
	minecartCD810("ItemRollingStock", "CD810", 2),
	minecartCD812("ItemRollingStock", "CD_812", 2),
	minecartCD854("ItemRollingStock", "CD_854", 2),
	minecartLocoCD471Motor("ItemRollingStock", "CD_471", 2),
	minecartCabooseCD471Tail("ItemRollingStock", "CD_971", 2),
	minecartPassengerCD471Coach("ItemRollingStock", "CD_071", 2),
	minecartLocoCD470Motor("ItemRollingStock", "CD_470", 2),
	minecartPassengerCD470Coach("ItemRollingStock", "CD_070", 2),
	minecartCDBDMTEEO("ItemRollingStock", "CD_Bdteeo", 2),
	minecartCDBFHPVEE295("ItemRollingStock", "CD_Bfhpvee295", 2),
	minecartCDBDMTEE("ItemRollingStock", "CD_Bdmtee", 2),
	minecartCD014("ItemRollingStock", "CD014", 2),// bruh
	minecartCD814("ItemRollingStock", "CD814", 2),
	minecartCD720("ItemRollingStock", "CD_720", 2),
	minecartCD460("ItemRollingStock", "CD_460", 2),
	minecartCD060("ItemRollingStock", "CD_060", 2),
	minecartCD127Motor("ItemRollingStock", "CD_127_Motor", 2),
	minecartCD127("ItemRollingStock", "CD_127_Loco", 2),
	minecartCD770("ItemRollingStock", "CD_770", 2),
	minecartCD704("ItemRollingStock", "CD_704", 2),
	minecartRE420("ItemRollingStock", "RE_420", 2),
	minecartCDEAS11("ItemRollingStock", "CD_EAS11", 2),
	minecartCDAB349("ItemRollingStock", "CD_AB", 2),
	minecartZSSK012("ItemRollingStock", "ZSSK_012", 2),
	minecartZSSK812("ItemRollingStock", "ZSSK_812", 2),
	minecartCD650Loco("ItemRollingStock", "CD_650_Loco", 2),
	minecartCD650Tail("ItemRollingStock", "CD_650_Tail", 2),
	minecartCDBBDGMEE236("ItemRollingStock", "CD_Bbdgmee236", 2),
	minecartPropagandaCzech("ItemRollingStock", "Propag_Czech", 2),
	minecartPropagandaCtyrk4("ItemRollingStock", "Propag_Ctyrk4", 2),
	minecartM1Loco("ItemRollingStock", "M1Loco", 2),
	minecartM1Coach("ItemRollingStock", "M1Coach", 2),
	minecartM1Tail("ItemRollingStock", "M1Tail", 2),
	minecart8171MTail("ItemRollingStock", "8171M_Tail", 2),
	minecart8171M_Middle("ItemRollingStock", "8171M_Middle", 2),
	minecart8171Loco("ItemRollingStock", "8171M-Loco", 2),
	minecartARR845("ItemRollingStock", "ARR845", 2),
	minecartCDA149("ItemRollingStock", "CD_A149", 2),
	minecartCDB249("ItemRollingStock", "CD_B249", 2),
	minecartCDBDS("ItemRollingStock", "CD_BDs", 2),
	minecartCDWRMZ("ItemRollingStock", "CD_WRMz", 2),
	minecartCDDS("ItemRollingStock", "CD_Ds", 2),
	minecartCD914("ItemRollingStock", "CD914", 2),
	;

	public Item item;
	public String className;
	public String iconName;

	/**
	 * Amount for one emerald. For ItemRollingStock, it is the price for one train.
	 */
	public int amountForEmerald;

	/**
	 * @param classMethodName
	 * @param iconName
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	Ctyrk4ItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}