/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import train.common.library.Ctyrk4AddonInfo;
import train.common.library.Ctyrk4ItemIDs;

public class Ctyrk4Items {

	public static void justInit() {
		loadItems();
		registerItems();
	}

	private static void loadItems() {
		for (Ctyrk4ItemIDs items : Ctyrk4ItemIDs.values()) {
			if (items.className != null) {
				if (items.className.equals("ItemRollingStock")) {
					items.item = new Ctyrk4RollingStock(items.iconName);
				}
			}
		}
	}
	private static void registerItems() {
		for (Ctyrk4ItemIDs ctyrk4Items : Ctyrk4ItemIDs.values()) {
			if (ctyrk4Items.item != null) {
				ctyrk4Items.item.setUnlocalizedName(Ctyrk4AddonInfo.modID + ":" + ctyrk4Items.name());
				GameRegistry.registerItem(ctyrk4Items.item, ctyrk4Items.name());
			}
		}
	}
}
