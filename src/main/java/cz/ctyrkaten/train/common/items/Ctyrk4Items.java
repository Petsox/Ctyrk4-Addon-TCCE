package cz.ctyrkaten.train.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cz.ctyrkaten.train.common.Ctyrk4_Addon_TCCE;
import cz.ctyrkaten.train.common.library.Ctyrk4AddonInfo;
import cz.ctyrkaten.train.common.library.Ctyrk4ItemIDs;
import train.common.items.ItemRollingStock;
import train.common.Traincraft;

public class Ctyrk4Items {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {
        for (Ctyrk4ItemIDs items : Ctyrk4ItemIDs.values()) {
            if (items.className != null) {
                if (items.className.equals("ItemRollingStock")) {
                    items.item = new ItemRollingStock(Ctyrk4AddonInfo.modID.toLowerCase() + ":trains/" + items.iconName, Ctyrk4_Addon_TCCE.tcAddonTab);
                }
            }
        }
    }

    private static void registerItems() {
        for (Ctyrk4ItemIDs itemId : Ctyrk4ItemIDs.values()) {
            if (itemId.item != null) {
                itemId.item.setUnlocalizedName(Ctyrk4AddonInfo.modID + ":" + itemId.name());
                GameRegistry.registerItem(itemId.item, itemId.name());
            }
        }
    }
}
