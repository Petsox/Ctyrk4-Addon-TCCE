/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package cz.ctyrkaten.train.common.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cz.ctyrkaten.train.common.library.Ctyrk4ItemIDs;

public class Ctyrk4CreativeTabTraincraftTrains extends CreativeTabs {

	public Ctyrk4CreativeTabTraincraftTrains(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(Ctyrk4ItemIDs.minecartPropagandaCzech.item);
	}

	@Override
	public String getTranslatedTabLabel() {
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem(){return Ctyrk4ItemIDs.minecartPropagandaCzech.item;}
}
