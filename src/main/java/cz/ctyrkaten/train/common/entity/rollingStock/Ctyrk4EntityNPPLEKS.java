//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cz.ctyrkaten.train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.entity.rollingStock.EntityStockCar;

public class Ctyrk4EntityNPPLEKS extends EntityStockCar {
	public Ctyrk4EntityNPPLEKS(World world) {
		super(world);
	}

	public Ctyrk4EntityNPPLEKS(World world, double d, double d1, double d2) {
		this(world);
		this.setPosition(d, d1 + (double) this.yOffset, d2);
		this.motionX = 0.0;
		this.motionY = 0.0;
		this.motionZ = 0.0;
		this.prevPosX = d;
		this.prevPosY = d1;
		this.prevPosZ = d2;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.84F;
	}
}
