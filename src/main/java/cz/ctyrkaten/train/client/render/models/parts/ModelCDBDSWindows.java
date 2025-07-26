//FMT-Marker DFM-1.0

package cz.ctyrkaten.train.client.render.models.parts;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCDBDSWindows extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public ModelCDBDSWindows(){
		bodyModel = new ModelRendererTurbo[6];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		bodyModel[0].addBox(0, 0, 0, 6, 7, 1, 0f);
		bodyModel[0].setRotationPoint(11.0f, -13.0f, 0.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		bodyModel[1].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[1].setRotationPoint(10.0f, -13.0f, 0.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		bodyModel[2].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(17.0f, -13.0f, 0.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 183
		bodyModel[3].addBox(0, 0, 0, 6, 7, 1, 0f);
		bodyModel[3].setRotationPoint(11.0f, -13.0f, -23.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		bodyModel[4].addShapeBox(0, 0, 0, 1, 7, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(10.0f, -13.0f, -23.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 184
		bodyModel[5].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(17.0f, -13.0f, -23.0f);

		flipAll();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for (int i = 0; i < bodyModel.length; i++) {
			bodyModel[i].render(f5);
		}
	}

}
