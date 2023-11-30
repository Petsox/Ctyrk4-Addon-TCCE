//FMT-Marker DFM-1.0
//Creator: Unregistered Account

package cz.ctyrkaten.train.client.render.models;

import net.minecraft.client.model.PositionTextureVertex;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelSF482 extends ModelConverter {

	private int textureX = 2048;
	private int textureY = 2048;

	public ModelSF482(){
		bodyModel = new ModelRendererTurbo[82];
		model = new ModelRendererTurbo[192];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 422, 4, textureX, textureY);
		bodyModel[0].addBox(0, 0, 0, 10, 10, 0, 0f);
		bodyModel[0].setRotationPoint(1.5f, -3.0f, 6.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 1726, 0, textureX, textureY);
		bodyModel[1].addCylinder(0, 0, 0, 8, 18, 24, 1, 1, 4);
		bodyModel[1].setRotationPoint(27.0f, -10.0f, 0.0f);
		bodyModel[1].rotateAngleZ = 1.5707964f;

		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[2].addShapeBox(0, 0, 0, 70, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[2].setRotationPoint(-32.0f, -9.0f, -9.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 728, 0, textureX, textureY);
		bodyModel[3].addShapeBox(0, 0, 0, 8, 8, 18, 0, 0, 0, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0, -7.5f, 0, 0, 0, 0, 0, 0, 0, 0, -7.5f, 0);
		bodyModel[3].setRotationPoint(38.0f, -9.0f, -9.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 159, 6, textureX, textureY);
		bodyModel[4].addShapeBox(0, 0, 0, 2, 3, 5, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(46.0f, -2.0f, -9.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 2005, 3, textureX, textureY);
		bodyModel[5].addBox(0, 0, 0, 2, 3, 8, 0f);
		bodyModel[5].setRotationPoint(46.0f, -2.0f, -4.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 401, 4, textureX, textureY);
		bodyModel[6].addCylinder(0, 0, 0, 5, 1, 24, 1, 0.9f, 4);
		bodyModel[6].setRotationPoint(45.0f, -10.0f, 0.0f);
		bodyModel[6].rotateAngleZ = 1.5707964f;

		bodyModel[7] = new ModelRendererTurbo(this, 1907, 7, textureX, textureY);
		bodyModel[7].addBox(0, 0, 0, 1, 1, 5, 0f);
		bodyModel[7].setRotationPoint(44.7f, -13.8f, -0.6f);

		bodyModel[8] = new ModelRendererTurbo(this, 424, 0, textureX, textureY);
		bodyModel[8].addBox(0, 0, 0, 19, 1, 20, 0f);
		bodyModel[8].setRotationPoint(-51.0f, -3.0f, -10.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 1095, 0, textureX, textureY);
		bodyModel[9].addBox(0, 0, 0, 19, 7, 1, 0f);
		bodyModel[9].setRotationPoint(-51.0f, -10.0f, -10.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 1207, 0, textureX, textureY);
		bodyModel[10].addBox(0, 0, 0, 1, 7, 18, 0f);
		bodyModel[10].setRotationPoint(-33.0f, -10.0f, -9.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 1460, 7, textureX, textureY);
		bodyModel[11].addBox(0, 0, 0, 5, 6, 1, 0f);
		bodyModel[11].setRotationPoint(-37.0f, -16.0f, 9.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 1789, 7, textureX, textureY);
		bodyModel[12].addShapeBox(0, 0, 0, 1, 6, 5, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[12].setRotationPoint(-33.0f, -17.0f, -9.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 1168, 0, textureX, textureY);
		bodyModel[13].addBox(0, 0, 0, 1, 1, 18, 0f);
		bodyModel[13].setRotationPoint(-33.0f, -11.0f, -9.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 674, 8, textureX, textureY);
		bodyModel[14].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[14].setRotationPoint(-45.0f, -11.0f, 9.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 1344, 9, textureX, textureY);
		bodyModel[15].addShapeBox(0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(-45.0f, -15.8f, 9.2f);

		bodyModel[16] = new ModelRendererTurbo(this, 1534, 0, textureX, textureY);
		bodyModel[16].addBox(0, 0, 0, 14, 1, 4, 0f);
		bodyModel[16].setRotationPoint(-47.0f, -4.0f, 5.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 667, 8, textureX, textureY);
		bodyModel[17].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(-48.0f, -4.0f, 5.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 1955, 0, textureX, textureY);
		bodyModel[18].addBox(0, 0, 0, 2, 7, 12, 0f);
		bodyModel[18].setRotationPoint(-53.0f, -3.0f, -6.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 1557, 6, textureX, textureY);
		bodyModel[19].addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[19].setRotationPoint(-53.0f, -3.0f, 6.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 656, 8, textureX, textureY);
		bodyModel[20].addBox(0, 0, 0, 1, 1, 4, 0f);
		bodyModel[20].setRotationPoint(-54.0f, -3.0f, -2.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 645, 8, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[21].setRotationPoint(-54.0f, -3.0f, 2.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 177, 0, textureX, textureY);
		bodyModel[22].addBox(0, 0, 0, 49, 10, 10, 0f);
		bodyModel[22].setRotationPoint(-24.5f, -5.0f, -5.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 1693, 0, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[23].setRotationPoint(30.0f, 5.5f, 6.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 990, 5, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[24].setRotationPoint(-44.0f, 2.5f, 6.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 990, 0, textureX, textureY);
		bodyModel[25].addShapeBox(0, 0, 0, 19, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 1, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[25].setRotationPoint(-51.0f, -18.0f, 8.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 860, 0, textureX, textureY);
		bodyModel[26].addShapeBox(0, 0, 0, 20, 2, 3, 0, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[26].setRotationPoint(-52.0f, -19.0f, 5.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 1315, 9, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(-33.0f, -18.0f, 5.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 1425, 3, textureX, textureY);
		bodyModel[28].addBox(0, 0, 0, 1, 1, 10, 0f);
		bodyModel[28].setRotationPoint(-33.0f, -18.0f, -5.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 1544, 6, textureX, textureY);
		bodyModel[29].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[29].setRotationPoint(-33.0f, -19.0f, 0.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 541, 8, textureX, textureY);
		bodyModel[30].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[30].setRotationPoint(-33.0f, -17.0f, 5.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 1411, 9, textureX, textureY);
		bodyModel[31].addBox(0, 0, 0, 0, 6, 4, 0f);
		bodyModel[31].setRotationPoint(-32.5f, -17.0f, 5.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 763, 10, textureX, textureY);
		bodyModel[32].addBox(0, 0, 0, 1, 4, 1, 0f);
		bodyModel[32].setRotationPoint(-45.0f, -8.0f, 6.5f);

		bodyModel[33] = new ModelRendererTurbo(this, 1536, 6, textureX, textureY);
		bodyModel[33].addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[33].setRotationPoint(-45.0f, -9.0f, 5.5f);

		bodyModel[34] = new ModelRendererTurbo(this, 953, 5, textureX, textureY);
		bodyModel[34].addBox(0, 0, 0, 8, 1, 1, 0f);
		bodyModel[34].setRotationPoint(-41.0f, -11.0f, -5.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 1306, 6, textureX, textureY);
		bodyModel[35].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[35].setRotationPoint(-41.0f, -12.0f, -5.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 859, 6, textureX, textureY);
		bodyModel[36].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[36].setRotationPoint(-41.0f, -12.0f, -4.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 1460, 4, textureX, textureY);
		bodyModel[37].addBox(0, 0, 0, 8, 1, 1, 0f);
		bodyModel[37].setRotationPoint(-41.0f, -16.0f, -6.0f);
		bodyModel[37].rotateAngleY = -0.36651915f;
		bodyModel[37].rotateAngleZ = -0.2443461f;

		bodyModel[38] = new ModelRendererTurbo(this, 15, 0, textureX, textureY);
		bodyModel[38].addBox(0, 0, 0, 1, 1, 0, 0f);
		bodyModel[38].setRotationPoint(-41.0f, -15.85f, -4.6f);
		bodyModel[38].rotateAngleY = 0.05235988f;
		bodyModel[38].rotateAngleZ = -0.19198622f;

		bodyModel[39] = new ModelRendererTurbo(this, 1216, 9, textureX, textureY);
		bodyModel[39].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[39].setRotationPoint(-39.0f, -8.0f, 0.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 1926, 0, textureX, textureY);
		bodyModel[40].addBox(0, 0, 0, 2, 2, 12, 0f);
		bodyModel[40].setRotationPoint(18.0f, 1.0f, -6.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 1907, 7, textureX, textureY);
		bodyModel[41].addCylinder(1, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[41].setRotationPoint(18.0f, 4.0f, 7.0f);
		bodyModel[41].rotateAngleX = -1.5707964f;

		bodyModel[42] = new ModelRendererTurbo(this, 1360, 9, textureX, textureY);
		bodyModel[42].addCylinder(0, 0, 0, 2, 12, 16, 0.7f, 0.7f, 4);
		bodyModel[42].setRotationPoint(6.0f, -7.3f, -8.0f);
		bodyModel[42].rotateAngleZ = 1.5707964f;

		bodyModel[43] = new ModelRendererTurbo(this, 1412, 3, textureX, textureY);
		bodyModel[43].addShapeBox(0, 0, 0, 8, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[43].setRotationPoint(21.0f, -6.0f, 6.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 1207, 9, textureX, textureY);
		bodyModel[44].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		bodyModel[44].setRotationPoint(25.0f, -4.0f, -7.0f);
		bodyModel[44].rotateAngleZ = 3.1415927f;

		bodyModel[45] = new ModelRendererTurbo(this, 1909, 0, textureX, textureY);
		bodyModel[45].addShapeBox(0, 0, 0, 13, 5, 1, 0, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3, 0, 0, 0, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, 0, 0);
		bodyModel[45].setRotationPoint(3.0f, 0.0f, -8.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 1306, 9, textureX, textureY);
		bodyModel[46].addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[46].setRotationPoint(48.0f, 0.0f, -6.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 1979, 6, textureX, textureY);
		bodyModel[47].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[47].setRotationPoint(-19.0f, -19.5f, -1.5f);

		bodyModel[48] = new ModelRendererTurbo(this, 1282, 3, textureX, textureY);
		bodyModel[48].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[48].setRotationPoint(9.0f, -2.0f, 6.5f);

		bodyModel[49] = new ModelRendererTurbo(this, 892, 6, textureX, textureY);
		bodyModel[49].addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -1, 0, -1, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -1, 0, 0);
		bodyModel[49].setRotationPoint(4.0f, -1.0f, 7.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 942, 8, textureX, textureY);
		bodyModel[50].addShapeBox(0, 0, 0, 2, 3, 1, 0, -1.5f, 0, 0, 0, -1, 0, 0, -1, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[50].setRotationPoint(2.0f, 1.0f, 7.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 833, 6, textureX, textureY);
		bodyModel[51].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[51].setRotationPoint(-39.0f, 0.0f, -0.5f);

		bodyModel[52] = new ModelRendererTurbo(this, 1353, 9, textureX, textureY);
		bodyModel[52].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[52].setRotationPoint(14.0f, -18.0f, 3.5f);

		bodyModel[53] = new ModelRendererTurbo(this, 1147, 0, textureX, textureY);
		bodyModel[53].addBox(0, 0, 0, 12, 1, 7, 0f);
		bodyModel[53].setRotationPoint(3.0f, -18.0f, -3.5f);

		bodyModel[54] = new ModelRendererTurbo(this, 1179, 9, textureX, textureY);
		bodyModel[54].addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[54].setRotationPoint(12.0f, -18.0f, -6.5f);

		bodyModel[55] = new ModelRendererTurbo(this, 739, 8, textureX, textureY);
		bodyModel[55].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[55].setRotationPoint(12.0f, -19.0f, 5.5f);

		bodyModel[56] = new ModelRendererTurbo(this, 663, 8, textureX, textureY);
		bodyModel[56].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[56].setRotationPoint(14.0f, -19.0f, 3.5f);

		bodyModel[57] = new ModelRendererTurbo(this, 1198, 9, textureX, textureY);
		bodyModel[57].addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(12.0f, -19.0f, 3.5f);

		bodyModel[58] = new ModelRendererTurbo(this, 595, 4, textureX, textureY);
		bodyModel[58].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[58].setRotationPoint(14.0f, -19.0f, -3.5f);

		bodyModel[59] = new ModelRendererTurbo(this, 1822, 5, textureX, textureY);
		bodyModel[59].addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[59].setRotationPoint(6.0f, -19.0f, 5.5f);

		bodyModel[60] = new ModelRendererTurbo(this, 605, 8, textureX, textureY);
		bodyModel[60].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[60].setRotationPoint(4.0f, -19.0f, 5.5f);

		bodyModel[61] = new ModelRendererTurbo(this, 652, 8, textureX, textureY);
		bodyModel[61].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[61].setRotationPoint(3.0f, -19.0f, 3.5f);

		bodyModel[62] = new ModelRendererTurbo(this, 1147, 9, textureX, textureY);
		bodyModel[62].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[62].setRotationPoint(4.0f, -19.0f, 3.5f);

		bodyModel[63] = new ModelRendererTurbo(this, 490, 8, textureX, textureY);
		bodyModel[63].addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[63].setRotationPoint(3.0f, -19.0f, -5.5f);

		bodyModel[64] = new ModelRendererTurbo(this, 1784, 7, textureX, textureY);
		bodyModel[64].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[64].setRotationPoint(4.0f, -19.0f, -6.5f);

		bodyModel[65] = new ModelRendererTurbo(this, 879, 6, textureX, textureY);
		bodyModel[65].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[65].setRotationPoint(12.0f, -19.0f, -6.5f);

		bodyModel[66] = new ModelRendererTurbo(this, 1530, 0, textureX, textureY);
		bodyModel[66].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[66].setRotationPoint(14.0f, -19.0f, -5.5f);

		bodyModel[67] = new ModelRendererTurbo(this, 1189, 0, textureX, textureY);
		bodyModel[67].addBox(0, 0, 0, 10, 1, 7, 0f);
		bodyModel[67].setRotationPoint(4.0f, -19.0f, -3.5f);

		bodyModel[68] = new ModelRendererTurbo(this, 1123, 9, textureX, textureY);
		bodyModel[68].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[68].setRotationPoint(12.0f, -19.0f, -5.5f);

		bodyModel[69] = new ModelRendererTurbo(this, 1114, 9, textureX, textureY);
		bodyModel[69].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2);
		bodyModel[69].setRotationPoint(4.0f, -19.0f, 3.5f);

		bodyModel[70] = new ModelRendererTurbo(this, 1523, 6, textureX, textureY);
		bodyModel[70].addBox(0, 0, 0, 4, 2, 2, 0f);
		bodyModel[70].setRotationPoint(49.0f, 1.0f, -1.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 1389, 3, textureX, textureY);
		bodyModel[71].addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		bodyModel[71].setRotationPoint(21.0f, 3.0f, -9.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 1460, 0, textureX, textureY);
		bodyModel[72].addShapeBox(0, 0, 0, 12, 0, 3, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0);
		bodyModel[72].setRotationPoint(-47.0f, -16.0f, 10.0f);
		bodyModel[72].rotateAngleX = -0.87266463f;

		bodyModel[73] = new ModelRendererTurbo(this, 1409, 3, textureX, textureY);
		bodyModel[73].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[73].setRotationPoint(-9.0f, -20.4f, -0.5f);

		bodyModel[74] = new ModelRendererTurbo(this, 790, 3, textureX, textureY);
		bodyModel[74].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[74].setRotationPoint(-9.0f, -19.4f, -0.5f);

		bodyModel[75] = new ModelRendererTurbo(this, 857, 0, textureX, textureY);
		bodyModel[75].addBox(0, 0, 0, 1, 0, 1, 0f);
		bodyModel[75].setRotationPoint(-9.0f, -20.4f, -0.5f);

		bodyModel[76] = new ModelRendererTurbo(this, 1822, 8, textureX, textureY);
		bodyModel[76].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[76].setRotationPoint(-10.0f, -20.4f, -1.5f);

		bodyModel[77] = new ModelRendererTurbo(this, 536, 0, textureX, textureY);
		bodyModel[77].addBox(0, 0, 0, 15, 2, 16, 0f);
		bodyModel[77].setRotationPoint(-47.0f, -2.0f, -8.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 1670, 0, textureX, textureY);
		bodyModel[78].addShapeBox(0, 0, 0, 6, 9, 10, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[78].setRotationPoint(-39.0f, -12.0f, -5.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 1064, 0, textureX, textureY);
		bodyModel[79].addShapeBox(0, 0, 0, 10, 5, 10, 0, -3, 0, -2, 0, 0, -3, 0, 0, -3, -3, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[79].setRotationPoint(-36.0f, -17.0f, -5.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 599, 0, textureX, textureY);
		bodyModel[80].addShapeBox(0, 0, 0, 12, 15, 16, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, -2, -5, 0, -2, -5, 0, 0, 0);
		bodyModel[80].setRotationPoint(-32.0f, -15.0f, -8.0f);

		bodyModel[81] = new ModelRendererTurbo(this, 640, 8, textureX, textureY);
		bodyModel[81].addShapeBox(0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[81].setRotationPoint(45.0f, -10.0f, -8.0f);

		model[0] = new ModelRendererTurbo(this, 380, 4, textureX, textureY);
		model[0].addBox(0, 0, 0, 10, 10, 0, 0f);
		model[0].setRotationPoint(-11.5f, -3.0f, 6.0f);

		model[1] = new ModelRendererTurbo(this, 359, 4, textureX, textureY);
		model[1].addBox(1, 0, 0, 10, 10, 0, 0f);
		model[1].setRotationPoint(13.0f, -3.0f, 6.0f);

		model[2] = new ModelRendererTurbo(this, 338, 4, textureX, textureY);
		model[2].addBox(0, 0, 0, 10, 10, 0, 0f);
		model[2].setRotationPoint(-24.0f, -3.0f, 6.0f);

		model[3] = new ModelRendererTurbo(this, 317, 4, textureX, textureY);
		model[3].addBox(0, 0, 0, 10, 10, 0, 0f);
		model[3].setRotationPoint(14.0f, -3.0f, -6.0f);

		model[4] = new ModelRendererTurbo(this, 296, 4, textureX, textureY);
		model[4].addBox(0, 0, 0, 10, 10, 0, 0f);
		model[4].setRotationPoint(1.5f, -3.0f, -6.0f);

		model[5] = new ModelRendererTurbo(this, 1984, 3, textureX, textureY);
		model[5].addBox(0, 0, 0, 10, 10, 0, 0f);
		model[5].setRotationPoint(-11.5f, -3.0f, -6.0f);

		model[6] = new ModelRendererTurbo(this, 1703, 3, textureX, textureY);
		model[6].addBox(0, 0, 0, 10, 10, 0, 0f);
		model[6].setRotationPoint(-24.0f, -3.0f, -6.0f);

		model[7] = new ModelRendererTurbo(this, 1510, 6, textureX, textureY);
		model[7].addBox(0, 0, 0, 6, 6, 0, 0f);
		model[7].setRotationPoint(30.0f, 1.0f, -6.0f);

		model[8] = new ModelRendererTurbo(this, 1497, 6, textureX, textureY);
		model[8].addBox(0, 0, 0, 6, 6, 0, 0f);
		model[8].setRotationPoint(39.0f, 1.0f, -6.0f);

		model[9] = new ModelRendererTurbo(this, 1369, 6, textureX, textureY);
		model[9].addBox(0, 0, 0, 6, 6, 0, 0f);
		model[9].setRotationPoint(30.0f, 1.0f, 6.0f);

		model[10] = new ModelRendererTurbo(this, 1293, 6, textureX, textureY);
		model[10].addBox(0, 0, 0, 6, 6, 0, 0f);
		model[10].setRotationPoint(39.0f, 1.0f, 6.0f);

		model[11] = new ModelRendererTurbo(this, 1280, 6, textureX, textureY);
		model[11].addBox(0, 0, 0, 6, 6, 0, 0f);
		model[11].setRotationPoint(-44.0f, 1.0f, -6.0f);

		model[12] = new ModelRendererTurbo(this, 1267, 6, textureX, textureY);
		model[12].addBox(0, 0, 0, 6, 6, 0, 0f);
		model[12].setRotationPoint(-44.0f, 1.0f, 6.0f);

		model[13] = new ModelRendererTurbo(this, 1637, 0, textureX, textureY);
		model[13].addCylinder(0, 0, 0, 8, 27, 24, 1, 1.03f, 4);
		model[13].setRotationPoint(27.0f, -10.0f, 0.0f);
		model[13].rotateAngleX = -3.1415927f;
		model[13].rotateAngleZ = 1.5707964f;

		model[14] = new ModelRendererTurbo(this, 1604, 0, textureX, textureY);
		model[14].addCylinder(0, 0, 0, 8, 32, 24, 1.03f, 0.95f, 4);
		model[14].setRotationPoint(0.0f, -10.0f, 0.0f);
		model[14].rotateAngleX = -3.1415927f;
		model[14].rotateAngleZ = 1.5707964f;

		model[15] = new ModelRendererTurbo(this, 1774, 5, textureX, textureY);
		model[15].addShapeBox(0, 0, 0, 2, 3, 5, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, -1, 0);
		model[15].setRotationPoint(46.0f, -2.0f, 4.0f);

		model[16] = new ModelRendererTurbo(this, 1254, 6, textureX, textureY);
		model[16].addBox(0, 0, 0, 1, 1, 5, 0f);
		model[16].setRotationPoint(44.7f, -7.2f, -0.6f);

		model[17] = new ModelRendererTurbo(this, 1033, 0, textureX, textureY);
		model[17].addBox(0, 0, 0, 19, 7, 1, 0f);
		model[17].setRotationPoint(-51.0f, -10.0f, 9.0f);

		model[18] = new ModelRendererTurbo(this, 2026, 5, textureX, textureY);
		model[18].addBox(0, 0, 0, 6, 6, 1, 0f);
		model[18].setRotationPoint(-51.0f, -16.0f, 9.0f);

		model[19] = new ModelRendererTurbo(this, 1892, 5, textureX, textureY);
		model[19].addBox(0, 0, 0, 6, 6, 1, 0f);
		model[19].setRotationPoint(-51.0f, -16.0f, -10.0f);

		model[20] = new ModelRendererTurbo(this, 1241, 6, textureX, textureY);
		model[20].addBox(0, 0, 0, 5, 6, 1, 0f);
		model[20].setRotationPoint(-37.0f, -16.0f, -10.0f);

		model[21] = new ModelRendererTurbo(this, 1228, 6, textureX, textureY);
		model[21].addShapeBox(0, 0, 0, 1, 6, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[21].setRotationPoint(-33.0f, -17.0f, 4.0f);

		model[22] = new ModelRendererTurbo(this, 942, 5, textureX, textureY);
		model[22].addBox(0, 0, 0, 1, 6, 8, 0f);
		model[22].setRotationPoint(-33.0f, -17.0f, -4.0f);

		model[23] = new ModelRendererTurbo(this, 534, 8, textureX, textureY);
		model[23].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		model[23].setRotationPoint(-45.0f, -16.6f, 9.0f);

		model[24] = new ModelRendererTurbo(this, 525, 11, textureX, textureY);
		model[24].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		model[24].setRotationPoint(-41.4f, -16.5f, 9.0f);

		model[25] = new ModelRendererTurbo(this, 520, 11, textureX, textureY);
		model[25].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		model[25].setRotationPoint(-45.0f, -16.5f, 9.0f);

		model[26] = new ModelRendererTurbo(this, 523, 8, textureX, textureY);
		model[26].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		model[26].setRotationPoint(-45.0f, -11.0f, -9.4f);

		model[27] = new ModelRendererTurbo(this, 515, 11, textureX, textureY);
		model[27].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		model[27].setRotationPoint(-41.4f, -16.5f, -9.4f);

		model[28] = new ModelRendererTurbo(this, 510, 11, textureX, textureY);
		model[28].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		model[28].setRotationPoint(-45.0f, -16.5f, -9.4f);

		model[29] = new ModelRendererTurbo(this, 512, 8, textureX, textureY);
		model[29].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		model[29].setRotationPoint(-45.0f, -16.6f, -9.4f);

		model[30] = new ModelRendererTurbo(this, 505, 11, textureX, textureY);
		model[30].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		model[30].setRotationPoint(-41.4f, -16.6f, 9.4f);

		model[31] = new ModelRendererTurbo(this, 501, 8, textureX, textureY);
		model[31].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		model[31].setRotationPoint(-41.0f, -11.0f, 9.4f);

		model[32] = new ModelRendererTurbo(this, 2041, 10, textureX, textureY);
		model[32].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		model[32].setRotationPoint(-37.4f, -16.5f, 9.4f);

		model[33] = new ModelRendererTurbo(this, 1926, 7, textureX, textureY);
		model[33].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		model[33].setRotationPoint(-41.0f, -16.6f, 9.4f);

		model[34] = new ModelRendererTurbo(this, 1920, 10, textureX, textureY);
		model[34].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		model[34].setRotationPoint(-41.4f, -16.5f, -9.8f);

		model[35] = new ModelRendererTurbo(this, 1915, 7, textureX, textureY);
		model[35].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		model[35].setRotationPoint(-41.0f, -16.6f, -9.8f);

		model[36] = new ModelRendererTurbo(this, 1797, 7, textureX, textureY);
		model[36].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		model[36].setRotationPoint(-41.0f, -11.0f, -9.8f);

		model[37] = new ModelRendererTurbo(this, 1004, 10, textureX, textureY);
		model[37].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		model[37].setRotationPoint(-37.4f, -16.5f, -9.8f);

		model[38] = new ModelRendererTurbo(this, 1189, 9, textureX, textureY);
		model[38].addShapeBox(0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[38].setRotationPoint(-41.0f, -15.8f, 9.6f);

		model[39] = new ModelRendererTurbo(this, 1170, 9, textureX, textureY);
		model[39].addShapeBox(0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[39].setRotationPoint(-45.0f, -15.8f, -9.2f);

		model[40] = new ModelRendererTurbo(this, 1161, 9, textureX, textureY);
		model[40].addShapeBox(0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[40].setRotationPoint(-41.0f, -15.8f, -9.6f);

		model[41] = new ModelRendererTurbo(this, 1497, 0, textureX, textureY);
		model[41].addBox(0, 0, 0, 14, 1, 4, 0f);
		model[41].setRotationPoint(-47.0f, -4.0f, -9.0f);

		model[42] = new ModelRendererTurbo(this, 494, 8, textureX, textureY);
		model[42].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[42].setRotationPoint(-48.0f, -4.0f, -9.0f);

		model[43] = new ModelRendererTurbo(this, 483, 8, textureX, textureY);
		model[43].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[43].setRotationPoint(-49.0f, -4.0f, 5.0f);

		model[44] = new ModelRendererTurbo(this, 1438, 7, textureX, textureY);
		model[44].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[44].setRotationPoint(-49.0f, -4.0f, -9.0f);

		model[45] = new ModelRendererTurbo(this, 1972, 6, textureX, textureY);
		model[45].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[45].setRotationPoint(-50.0f, -4.0f, 5.0f);

		model[46] = new ModelRendererTurbo(this, 1858, 6, textureX, textureY);
		model[46].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[46].setRotationPoint(-50.0f, -4.0f, -9.0f);

		model[47] = new ModelRendererTurbo(this, 883, 6, textureX, textureY);
		model[47].addShapeBox(0, 0, 0, 2, 1, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[47].setRotationPoint(-53.0f, -3.0f, -10.0f);

		model[48] = new ModelRendererTurbo(this, 1382, 6, textureX, textureY);
		model[48].addShapeBox(0, 0, 0, 1, 1, 4, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[48].setRotationPoint(-54.0f, -3.0f, -6.0f);

		model[49] = new ModelRendererTurbo(this, 870, 6, textureX, textureY);
		model[49].addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0);
		model[49].setRotationPoint(46.0f, -9.0f, -2.0f);

		model[50] = new ModelRendererTurbo(this, 1105, 9, textureX, textureY);
		model[50].addCylinder(0, 0, 0, 2, 3, 8, 0.8f, 0.8f, 4);
		model[50].setRotationPoint(46.7f, -10.0f, 0.0f);
		model[50].rotateAngleZ = 1.5707964f;

		model[51] = new ModelRendererTurbo(this, 1476, 0, textureX, textureY);
		model[51].addBox(0, 0, 0, 2, 2, 16, 0f);
		model[51].setRotationPoint(41.0f, 3.0f, -8.0f);

		model[52] = new ModelRendererTurbo(this, 1439, 0, textureX, textureY);
		model[52].addBox(0, 0, 0, 2, 2, 16, 0f);
		model[52].setRotationPoint(-42.0f, 3.0f, -8.0f);

		model[53] = new ModelRendererTurbo(this, 1051, 9, textureX, textureY);
		model[53].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		model[53].setRotationPoint(43.0f, 2.5f, 6.0f);

		model[54] = new ModelRendererTurbo(this, 1042, 9, textureX, textureY);
		model[54].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		model[54].setRotationPoint(35.5f, 2.5f, 6.0f);

		model[55] = new ModelRendererTurbo(this, 1418, 0, textureX, textureY);
		model[55].addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[55].setRotationPoint(29.0f, 1.5f, 6.0f);

		model[56] = new ModelRendererTurbo(this, 1381, 0, textureX, textureY);
		model[56].addShapeBox(0, 0, 0, 17, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[56].setRotationPoint(29.0f, 1.0f, 6.0f);

		model[57] = new ModelRendererTurbo(this, 1344, 0, textureX, textureY);
		model[57].addShapeBox(0, 0, 0, 17, 1, 1, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		model[57].setRotationPoint(29.0f, 0.5f, 6.0f);

		model[58] = new ModelRendererTurbo(this, 1255, 3, textureX, textureY);
		model[58].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[58].setRotationPoint(-46.0f, 1.5f, -7.0f);

		model[59] = new ModelRendererTurbo(this, 813, 9, textureX, textureY);
		model[59].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		model[59].setRotationPoint(-37.0f, 2.5f, -7.0f);

		model[60] = new ModelRendererTurbo(this, 583, 9, textureX, textureY);
		model[60].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		model[60].setRotationPoint(-46.0f, 2.5f, -7.0f);

		model[61] = new ModelRendererTurbo(this, 1228, 3, textureX, textureY);
		model[61].addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[61].setRotationPoint(-46.0f, 1.0f, -7.0f);

		model[62] = new ModelRendererTurbo(this, 763, 3, textureX, textureY);
		model[62].addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		model[62].setRotationPoint(-46.0f, 0.5f, -7.0f);

		model[63] = new ModelRendererTurbo(this, 962, 8, textureX, textureY);
		model[63].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		model[63].setRotationPoint(-37.0f, 2.5f, 6.0f);

		model[64] = new ModelRendererTurbo(this, 953, 8, textureX, textureY);
		model[64].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		model[64].setRotationPoint(-46.0f, 2.5f, 6.0f);

		model[65] = new ModelRendererTurbo(this, 159, 3, textureX, textureY);
		model[65].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[65].setRotationPoint(-46.0f, 1.5f, 6.0f);

		model[66] = new ModelRendererTurbo(this, 1999, 0, textureX, textureY);
		model[66].addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[66].setRotationPoint(-46.0f, 1.0f, 6.0f);

		model[67] = new ModelRendererTurbo(this, 1972, 0, textureX, textureY);
		model[67].addShapeBox(0, 0, 0, 12, 1, 1, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		model[67].setRotationPoint(-46.0f, 0.5f, 6.0f);

		model[68] = new ModelRendererTurbo(this, 1122, 0, textureX, textureY);
		model[68].addShapeBox(0, 0, 0, 5, 1, 14, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		model[68].setRotationPoint(-41.0f, 0.0f, -7.0f);

		model[69] = new ModelRendererTurbo(this, 961, 0, textureX, textureY);
		model[69].addShapeBox(0, 0, 0, 7, 1, 14, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		model[69].setRotationPoint(34.0f, 0.0f, -7.0f);

		model[70] = new ModelRendererTurbo(this, 1369, 3, textureX, textureY);
		model[70].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		model[70].setRotationPoint(-45.0f, 5.5f, -7.0f);

		model[71] = new ModelRendererTurbo(this, 2025, 2, textureX, textureY);
		model[71].addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		model[71].setRotationPoint(-45.0f, 5.5f, 6.0f);

		model[72] = new ModelRendererTurbo(this, 583, 4, textureX, textureY);
		model[72].addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[72].setRotationPoint(-44.0f, 2.5f, -6.5f);

		model[73] = new ModelRendererTurbo(this, 1880, 0, textureX, textureY);
		model[73].addShapeBox(0, 0, 0, 13, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[73].setRotationPoint(31.0f, 2.5f, 6.0f);

		model[74] = new ModelRendererTurbo(this, 932, 0, textureX, textureY);
		model[74].addShapeBox(0, 0, 0, 19, 2, 2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 1, -1, 0);
		model[74].setRotationPoint(-51.0f, -18.0f, -10.0f);

		model[75] = new ModelRendererTurbo(this, 813, 0, textureX, textureY);
		model[75].addShapeBox(0, 0, 0, 20, 2, 3, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 0);
		model[75].setRotationPoint(-52.0f, -19.0f, -8.0f);

		model[76] = new ModelRendererTurbo(this, 693, 0, textureX, textureY);
		model[76].addShapeBox(0, 0, 0, 21, 2, 5, 0, 0, -1, 0, 0, -1, 0, 0, -0.3f, 0, 1, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 1, -0.7f, 0);
		model[76].setRotationPoint(-53.0f, -20.0f, -5.0f);

		model[77] = new ModelRendererTurbo(this, 640, 0, textureX, textureY);
		model[77].addShapeBox(0, 0, 0, 21, 2, 5, 0, 1, -0.3f, 0, 0, -0.3f, 0, 0, -1, 0, 0, -1, 0, 1, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0);
		model[77].setRotationPoint(-53.0f, -20.0f, 0.0f);

		model[78] = new ModelRendererTurbo(this, 1805, 7, textureX, textureY);
		model[78].addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[78].setRotationPoint(-33.0f, -18.0f, -8.0f);

		model[79] = new ModelRendererTurbo(this, 857, 6, textureX, textureY);
		model[79].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[79].setRotationPoint(-33.0f, -19.0f, -5.0f);

		model[80] = new ModelRendererTurbo(this, 785, 6, textureX, textureY);
		model[80].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0);
		model[80].setRotationPoint(-33.0f, -17.0f, -9.0f);

		model[81] = new ModelRendererTurbo(this, 1330, 5, textureX, textureY);
		model[81].addBox(0, 0, 0, 0, 6, 4, 0f);
		model[81].setRotationPoint(-32.5f, -17.0f, -9.0f);

		model[82] = new ModelRendererTurbo(this, 1420, 9, textureX, textureY);
		model[82].addBox(0, 0, 0, 1, 4, 1, 0f);
		model[82].setRotationPoint(-45.0f, -8.0f, -7.5f);

		model[83] = new ModelRendererTurbo(this, 849, 6, textureX, textureY);
		model[83].addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[83].setRotationPoint(-46.0f, -9.0f, -8.5f);

		model[84] = new ModelRendererTurbo(this, 836, 6, textureX, textureY);
		model[84].addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[84].setRotationPoint(-45.5f, -7.9f, 5.5f);
		model[84].rotateAngleZ = 2.0594885f;

		model[85] = new ModelRendererTurbo(this, 823, 6, textureX, textureY);
		model[85].addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[85].setRotationPoint(-46.5f, -7.9f, -8.5f);
		model[85].rotateAngleZ = 2.0594885f;

		model[86] = new ModelRendererTurbo(this, 849, 6, textureX, textureY);
		model[86].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[86].setRotationPoint(-41.0f, -10.0f, -5.0f);

		model[87] = new ModelRendererTurbo(this, 846, 6, textureX, textureY);
		model[87].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[87].setRotationPoint(-41.0f, -11.0f, -4.0f);

		model[88] = new ModelRendererTurbo(this, 792, 6, textureX, textureY);
		model[88].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[88].setRotationPoint(-41.0f, -11.0f, -6.0f);

		model[89] = new ModelRendererTurbo(this, 1972, 5, textureX, textureY);
		model[89].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[89].setRotationPoint(-41.0f, -12.0f, -6.0f);

		model[90] = new ModelRendererTurbo(this, 972, 5, textureX, textureY);
		model[90].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		model[90].setRotationPoint(-41.0f, -10.0f, -6.0f);

		model[91] = new ModelRendererTurbo(this, 947, 5, textureX, textureY);
		model[91].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1);
		model[91].setRotationPoint(-41.0f, -10.0f, -4.0f);

		model[92] = new ModelRendererTurbo(this, 730, 8, textureX, textureY);
		model[92].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[92].setRotationPoint(-39.0f, -8.0f, -2.0f);

		model[93] = new ModelRendererTurbo(this, 813, 6, textureX, textureY);
		model[93].addBox(0, 0, 0, 5, 1, 1, 0f);
		model[93].setRotationPoint(-38.0f, -12.0f, 4.0f);

		model[94] = new ModelRendererTurbo(this, 1981, 3, textureX, textureY);
		model[94].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[94].setRotationPoint(-38.0f, -12.0f, 3.0f);

		model[95] = new ModelRendererTurbo(this, 1432, 3, textureX, textureY);
		model[95].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[95].setRotationPoint(-38.0f, -12.0f, 5.0f);

		model[96] = new ModelRendererTurbo(this, 1963, 0, textureX, textureY);
		model[96].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[96].setRotationPoint(-38.0f, -13.0f, 4.0f);

		model[97] = new ModelRendererTurbo(this, 1943, 0, textureX, textureY);
		model[97].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[97].setRotationPoint(-38.0f, -11.0f, 4.0f);

		model[98] = new ModelRendererTurbo(this, 1871, 0, textureX, textureY);
		model[98].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[98].setRotationPoint(-38.0f, -13.0f, 5.0f);

		model[99] = new ModelRendererTurbo(this, 1851, 0, textureX, textureY);
		model[99].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1);
		model[99].setRotationPoint(-38.0f, -11.0f, 5.0f);

		model[100] = new ModelRendererTurbo(this, 1842, 0, textureX, textureY);
		model[100].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[100].setRotationPoint(-38.0f, -13.0f, 3.0f);

		model[101] = new ModelRendererTurbo(this, 1822, 0, textureX, textureY);
		model[101].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		model[101].setRotationPoint(-38.0f, -11.0f, 3.0f);

		model[102] = new ModelRendererTurbo(this, 1851, 6, textureX, textureY);
		model[102].addBox(0, 0, 0, 4, 1, 1, 0f);
		model[102].setRotationPoint(-37.0f, -16.0f, 3.0f);

		model[103] = new ModelRendererTurbo(this, 1567, 0, textureX, textureY);
		model[103].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[103].setRotationPoint(-37.0f, -16.0f, 4.0f);

		model[104] = new ModelRendererTurbo(this, 1497, 0, textureX, textureY);
		model[104].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[104].setRotationPoint(-37.0f, -16.0f, 2.0f);

		model[105] = new ModelRendererTurbo(this, 1488, 0, textureX, textureY);
		model[105].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[105].setRotationPoint(-37.0f, -15.0f, 3.0f);

		model[106] = new ModelRendererTurbo(this, 1460, 0, textureX, textureY);
		model[106].addBox(0, 0, 0, 0, 1, 1, 0f);
		model[106].setRotationPoint(-37.0f, -17.0f, 3.0f);

		model[107] = new ModelRendererTurbo(this, 904, 0, textureX, textureY);
		model[107].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[107].setRotationPoint(-37.0f, -17.0f, 4.0f);

		model[108] = new ModelRendererTurbo(this, 813, 0, textureX, textureY);
		model[108].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[108].setRotationPoint(-37.0f, -17.0f, 2.0f);

		model[109] = new ModelRendererTurbo(this, 611, 0, textureX, textureY);
		model[109].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		model[109].setRotationPoint(-37.0f, -15.0f, 2.0f);

		model[110] = new ModelRendererTurbo(this, 583, 0, textureX, textureY);
		model[110].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1);
		model[110].setRotationPoint(-37.0f, -15.0f, 4.0f);

		model[111] = new ModelRendererTurbo(this, 1863, 0, textureX, textureY);
		model[111].addBox(0, 0, 0, 2, 2, 12, 0f);
		model[111].setRotationPoint(5.5f, 1.0f, -6.0f);

		model[112] = new ModelRendererTurbo(this, 1834, 0, textureX, textureY);
		model[112].addBox(0, 0, 0, 2, 2, 12, 0f);
		model[112].setRotationPoint(-7.5f, 1.0f, -6.0f);

		model[113] = new ModelRendererTurbo(this, 1805, 0, textureX, textureY);
		model[113].addBox(0, 0, 0, 2, 2, 12, 0f);
		model[113].setRotationPoint(-20.0f, 1.0f, -6.0f);

		model[114] = new ModelRendererTurbo(this, 781, 0, textureX, textureY);
		model[114].addBox(0, 0, 0, 8, 7, 15, 0f);
		model[114].setRotationPoint(21.0f, -4.0f, -9.0f);

		model[115] = new ModelRendererTurbo(this, 1943, 0, textureX, textureY);
		model[115].addBox(0, 0, 0, 8, 7, 3, 0f);
		model[115].setRotationPoint(21.0f, -4.0f, 6.0f);

		model[116] = new ModelRendererTurbo(this, 1566, 6, textureX, textureY);
		model[116].addCylinder(1, 0, 0, 1, 1, 8, 1, 1, 4);
		model[116].setRotationPoint(-20.0f, 4.0f, 7.0f);
		model[116].rotateAngleX = -1.5707964f;

		model[117] = new ModelRendererTurbo(this, 1262, 6, textureX, textureY);
		model[117].addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4);
		model[117].setRotationPoint(3.0f, 4.0f, 8.0f);
		model[117].rotateAngleX = -1.5707964f;

		model[118] = new ModelRendererTurbo(this, 1254, 6, textureX, textureY);
		model[118].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		model[118].setRotationPoint(19.0f, 4.0f, -6.0f);
		model[118].rotateAngleX = -1.5707964f;

		model[119] = new ModelRendererTurbo(this, 1236, 6, textureX, textureY);
		model[119].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		model[119].setRotationPoint(-19.0f, 4.0f, -6.0f);
		model[119].rotateAngleX = -1.5707964f;

		model[120] = new ModelRendererTurbo(this, 1228, 6, textureX, textureY);
		model[120].addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4);
		model[120].setRotationPoint(3.0f, 4.0f, -6.0f);
		model[120].rotateAngleX = -1.5707964f;

		model[121] = new ModelRendererTurbo(this, 1033, 9, textureX, textureY);
		model[121].addCylinder(0, 0, 0, 2, 12, 16, 0.7f, 0.7f, 4);
		model[121].setRotationPoint(6.0f, -7.3f, 8.0f);
		model[121].rotateAngleZ = 1.5707964f;

		model[122] = new ModelRendererTurbo(this, 1402, 8, textureX, textureY);
		model[122].addCylinder(0, 0, 0, 2, 8, 16, 0.7f, 0.7f, 4);
		model[122].setRotationPoint(30.0f, -7.3f, 8.0f);
		model[122].rotateAngleZ = 1.5707964f;

		model[123] = new ModelRendererTurbo(this, 1393, 8, textureX, textureY);
		model[123].addCylinder(0, 0, 0, 2, 8, 16, 0.7f, 0.7f, 4);
		model[123].setRotationPoint(30.0f, -7.3f, -8.0f);
		model[123].rotateAngleZ = 1.5707964f;

		model[124] = new ModelRendererTurbo(this, 1851, 0, textureX, textureY);
		model[124].addShapeBox(0, 0, 0, 8, 2, 3, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[124].setRotationPoint(21.0f, -6.0f, -9.0f);

		model[125] = new ModelRendererTurbo(this, 182, 6, textureX, textureY);
		model[125].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		model[125].setRotationPoint(16.0f, 1.0f, -7.0f);
		model[125].rotateAngleX = -1.5707964f;

		model[126] = new ModelRendererTurbo(this, 159, 6, textureX, textureY);
		model[126].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		model[126].setRotationPoint(16.0f, 1.0f, 8.0f);
		model[126].rotateAngleX = -1.5707964f;

		model[127] = new ModelRendererTurbo(this, 365, 0, textureX, textureY);
		model[127].addShapeBox(0, 0, 0, 38, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[127].setRotationPoint(-19.0f, 3.0f, -6.5f);

		model[128] = new ModelRendererTurbo(this, 286, 0, textureX, textureY);
		model[128].addShapeBox(1, 0, 0, 38, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[128].setRotationPoint(-20.0f, 3.0f, 6.0f);

		model[129] = new ModelRendererTurbo(this, 721, 8, textureX, textureY);
		model[129].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		model[129].setRotationPoint(25.0f, -4.0f, 7.0f);
		model[129].rotateAngleZ = 3.1415927f;

		model[130] = new ModelRendererTurbo(this, 712, 8, textureX, textureY);
		model[130].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		model[130].setRotationPoint(25.0f, -6.4f, 7.0f);
		model[130].rotateAngleX = -0.29670596f;
		model[130].rotateAngleZ = 3.1415927f;

		model[131] = new ModelRendererTurbo(this, 703, 8, textureX, textureY);
		model[131].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		model[131].setRotationPoint(25.0f, -6.4f, -7.0f);
		model[131].rotateAngleX = 0.29670596f;
		model[131].rotateAngleZ = 3.1415927f;

		model[132] = new ModelRendererTurbo(this, 776, 6, textureX, textureY);
		model[132].addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[132].setRotationPoint(16.0f, 0.0f, 7.0f);

		model[133] = new ModelRendererTurbo(this, 763, 6, textureX, textureY);
		model[133].addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[133].setRotationPoint(16.0f, 0.0f, -7.5f);

		model[134] = new ModelRendererTurbo(this, 1788, 0, textureX, textureY);
		model[134].addShapeBox(0, 0, 0, 13, 5, 1, 0, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3, 0, 0, 0, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, 0, 0);
		model[134].setRotationPoint(3.0f, 0.0f, 6.5f);

		model[135] = new ModelRendererTurbo(this, 1018, 5, textureX, textureY);
		model[135].addBox(0, 0, 0, 1, 3, 6, 0f);
		model[135].setRotationPoint(48.0f, 0.0f, -3.0f);

		model[136] = new ModelRendererTurbo(this, 1473, 4, textureX, textureY);
		model[136].addBox(0, 0, 0, 1, 1, 6, 0f);
		model[136].setRotationPoint(48.0f, 5.0f, -3.0f);

		model[137] = new ModelRendererTurbo(this, 2041, 5, textureX, textureY);
		model[137].addBox(0, 0, 0, 1, 2, 2, 0f);
		model[137].setRotationPoint(48.0f, 3.0f, -3.0f);

		model[138] = new ModelRendererTurbo(this, 10, 4, textureX, textureY);
		model[138].addBox(0, 0, 0, 1, 2, 2, 0f);
		model[138].setRotationPoint(48.0f, 3.0f, 1.0f);

		model[139] = new ModelRendererTurbo(this, 694, 8, textureX, textureY);
		model[139].addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f);
		model[139].setRotationPoint(48.0f, 0.0f, 3.0f);

		model[140] = new ModelRendererTurbo(this, 483, 0, textureX, textureY);
		model[140].addShapeBox(0, 0, 0, 29, 2, 5, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[140].setRotationPoint(-32.0f, -19.0f, -2.5f);

		model[141] = new ModelRendererTurbo(this, 1324, 9, textureX, textureY);
		model[141].addBox(0, 0, 0, 1, 4, 1, 0f);
		model[141].setRotationPoint(-24.0f, -21.5f, -1.5f);

		model[142] = new ModelRendererTurbo(this, 1840, 5, textureX, textureY);
		model[142].addBox(0, 0, 0, 1, 3, 1, 0f);
		model[142].setRotationPoint(-24.0f, -20.5f, 0.0f);

		model[143] = new ModelRendererTurbo(this, 1774, 5, textureX, textureY);
		model[143].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		model[143].setRotationPoint(9.0f, -1.0f, 8.0f);
		model[143].rotateAngleX = -1.5707964f;

		model[144] = new ModelRendererTurbo(this, 741, 0, textureX, textureY);
		model[144].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		model[144].setRotationPoint(4.0f, 1.0f, 8.0f);
		model[144].rotateAngleX = -1.5707964f;

		model[145] = new ModelRendererTurbo(this, 159, 0, textureX, textureY);
		model[145].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[145].setRotationPoint(9.0f, -2.0f, -8.0f);

		model[146] = new ModelRendererTurbo(this, 640, 0, textureX, textureY);
		model[146].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		model[146].setRotationPoint(9.0f, -1.0f, -7.0f);
		model[146].rotateAngleX = -1.5707964f;

		model[147] = new ModelRendererTurbo(this, 169, 6, textureX, textureY);
		model[147].addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -1, 0, -1, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -1, 0, 0);
		model[147].setRotationPoint(4.0f, -1.0f, -8.5f);

		model[148] = new ModelRendererTurbo(this, 547, 0, textureX, textureY);
		model[148].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		model[148].setRotationPoint(4.0f, 1.0f, -7.0f);
		model[148].rotateAngleX = -1.5707964f;

		model[149] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		model[149].addShapeBox(0, 0, 0, 2, 3, 1, 0, -1.5f, 0, 0, 0, -1, 0, 0, -1, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f);
		model[149].setRotationPoint(2.0f, 1.0f, -7.5f);

		model[150] = new ModelRendererTurbo(this, 685, 8, textureX, textureY);
		model[150].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		model[150].setRotationPoint(38.0f, -20.0f, 0.0f);

		model[151] = new ModelRendererTurbo(this, 2018, 3, textureX, textureY);
		model[151].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		model[151].setRotationPoint(14.0f, -18.0f, -5.5f);

		model[152] = new ModelRendererTurbo(this, 2005, 3, textureX, textureY);
		model[152].addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		model[152].setRotationPoint(12.0f, -18.0f, 5.5f);

		model[153] = new ModelRendererTurbo(this, 1217, 0, textureX, textureY);
		model[153].addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		model[153].setRotationPoint(4.0f, -18.0f, 5.5f);

		model[154] = new ModelRendererTurbo(this, 1189, 0, textureX, textureY);
		model[154].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		model[154].setRotationPoint(3.0f, -18.0f, 3.5f);

		model[155] = new ModelRendererTurbo(this, 1179, 0, textureX, textureY);
		model[155].addShapeBox(0, 0, 0, 1, 3, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[155].setRotationPoint(3.0f, -18.0f, -5.5f);

		model[156] = new ModelRendererTurbo(this, 1147, 0, textureX, textureY);
		model[156].addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[156].setRotationPoint(4.0f, -18.0f, -6.5f);

		model[157] = new ModelRendererTurbo(this, 1344, 3, textureX, textureY);
		model[157].addBox(0, 0, 0, 10, 3, 2, 0f);
		model[157].setRotationPoint(4.0f, -18.0f, 3.5f);

		model[158] = new ModelRendererTurbo(this, 1309, 3, textureX, textureY);
		model[158].addBox(0, 0, 0, 10, 3, 2, 0f);
		model[158].setRotationPoint(4.0f, -18.0f, -5.5f);

		model[159] = new ModelRendererTurbo(this, 1759, 5, textureX, textureY);
		model[159].addBox(0, 0, 0, 6, 4, 1, 0f);
		model[159].setRotationPoint(6.0f, -18.0f, 5.5f);

		model[160] = new ModelRendererTurbo(this, 1009, 5, textureX, textureY);
		model[160].addBox(0, 0, 0, 6, 4, 1, 0f);
		model[160].setRotationPoint(6.0f, -18.0f, -6.5f);

		model[161] = new ModelRendererTurbo(this, 0, 4, textureX, textureY);
		model[161].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[161].setRotationPoint(3.0f, -19.0f, -3.5f);

		model[162] = new ModelRendererTurbo(this, 1445, 7, textureX, textureY);
		model[162].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0);
		model[162].setRotationPoint(4.0f, -19.0f, -5.5f);

		model[163] = new ModelRendererTurbo(this, 932, 5, textureX, textureY);
		model[163].addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[163].setRotationPoint(6.0f, -19.0f, -6.5f);

		model[164] = new ModelRendererTurbo(this, 1438, 3, textureX, textureY);
		model[164].addBox(0, 0, 0, 6, 1, 2, 0f);
		model[164].setRotationPoint(6.0f, -19.0f, -5.5f);

		model[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		model[165].addBox(0, 0, 0, 6, 1, 2, 0f);
		model[165].setRotationPoint(6.0f, -19.0f, 3.5f);

		model[166] = new ModelRendererTurbo(this, 1865, 6, textureX, textureY);
		model[166].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0);
		model[166].setRotationPoint(12.0f, -19.0f, 3.5f);

		model[167] = new ModelRendererTurbo(this, 1552, 6, textureX, textureY);
		model[167].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0);
		model[167].setRotationPoint(12.0f, -19.0f, -5.5f);

		model[168] = new ModelRendererTurbo(this, 865, 6, textureX, textureY);
		model[168].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[168].setRotationPoint(4.0f, -19.0f, -5.5f);

		model[169] = new ModelRendererTurbo(this, 1880, 5, textureX, textureY);
		model[169].addBox(0, 0, 0, 3, 2, 2, 0f);
		model[169].setRotationPoint(-56.0f, 1.0f, -1.0f);

		model[170] = new ModelRendererTurbo(this, 1822, 0, textureX, textureY);
		model[170].addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1);
		model[170].setRotationPoint(21.0f, 3.0f, 6.0f);

		model[171] = new ModelRendererTurbo(this, 583, 0, textureX, textureY);
		model[171].addShapeBox(0, 0, 0, 12, 0, 3, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0);
		model[171].setRotationPoint(-35.0f, -16.0f, -10.0f);
		model[171].rotateAngleX = -0.87266463f;
		model[171].rotateAngleY = 3.1415927f;

		model[172] = new ModelRendererTurbo(this, 1832, 5, textureX, textureY);
		model[172].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		model[172].setRotationPoint(-9.0f, -21.4f, -2.5f);

		model[173] = new ModelRendererTurbo(this, 1670, 5, textureX, textureY);
		model[173].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		model[173].setRotationPoint(-7.0f, -20.4f, -1.5f);
		model[173].rotateAngleY = -1.5707964f;

		model[174] = new ModelRendererTurbo(this, 1482, 4, textureX, textureY);
		model[174].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		model[174].setRotationPoint(-7.0f, -20.4f, 1.5f);
		model[174].rotateAngleY = -3.1415927f;

		model[175] = new ModelRendererTurbo(this, 605, 4, textureX, textureY);
		model[175].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		model[175].setRotationPoint(-10.0f, -20.4f, 1.5f);
		model[175].rotateAngleY = -4.712389f;

		model[176] = new ModelRendererTurbo(this, 1027, 5, textureX, textureY);
		model[176].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		model[176].setRotationPoint(-9.0f, -21.4f, -2.5f);

		model[177] = new ModelRendererTurbo(this, 1334, 3, textureX, textureY);
		model[177].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		model[177].setRotationPoint(-9.0f, -21.4f, 1.5f);

		model[178] = new ModelRendererTurbo(this, 1323, 0, textureX, textureY);
		model[178].addBox(0, 0, 0, 2, 2, 16, 0f);
		model[178].setRotationPoint(32.0f, 3.0f, -8.0f);

		model[179] = new ModelRendererTurbo(this, 286, 4, textureX, textureY);
		model[179].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		model[179].setRotationPoint(29.0f, 2.5f, 6.0f);

		model[180] = new ModelRendererTurbo(this, 1302, 0, textureX, textureY);
		model[180].addShapeBox(0, 0, 0, 17, 1, 1, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		model[180].setRotationPoint(29.0f, 0.5f, -7.0f);

		model[181] = new ModelRendererTurbo(this, 1265, 0, textureX, textureY);
		model[181].addShapeBox(0, 0, 0, 17, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[181].setRotationPoint(29.0f, 1.0f, -7.0f);

		model[182] = new ModelRendererTurbo(this, 1228, 0, textureX, textureY);
		model[182].addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[182].setRotationPoint(29.0f, 1.5f, -7.0f);

		model[183] = new ModelRendererTurbo(this, 1693, 3, textureX, textureY);
		model[183].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		model[183].setRotationPoint(29.0f, 2.5f, -7.0f);

		model[184] = new ModelRendererTurbo(this, 763, 0, textureX, textureY);
		model[184].addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		model[184].setRotationPoint(30.0f, 5.5f, -7.0f);

		model[185] = new ModelRendererTurbo(this, 1670, 0, textureX, textureY);
		model[185].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		model[185].setRotationPoint(43.0f, 2.5f, -7.0f);

		model[186] = new ModelRendererTurbo(this, 688, 0, textureX, textureY);
		model[186].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		model[186].setRotationPoint(35.5f, 2.5f, -7.0f);

		model[187] = new ModelRendererTurbo(this, 1759, 0, textureX, textureY);
		model[187].addShapeBox(0, 0, 0, 13, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[187].setRotationPoint(31.0f, 2.5f, -6.5f);

		model[188] = new ModelRendererTurbo(this, 483, 0, textureX, textureY);
		model[188].addBox(0, 0, 0, 1, 1, 1, 0f);
		model[188].setRotationPoint(37.0f, 0.0f, -0.5f);

		model[189] = new ModelRendererTurbo(this, 897, 0, textureX, textureY);
		model[189].addBox(0, 0, 0, 12, 5, 10, 0f);
		model[189].setRotationPoint(31.0f, -5.0f, -5.0f);

		model[190] = new ModelRendererTurbo(this, 1571, 0, textureX, textureY);
		model[190].setRotationPoint(45.0f, -10.0f, 0.0f);
		model[190].rotateAngleZ = 1.5707964f;

		model[191] = new ModelRendererTurbo(this, 1972, 3, textureX, textureY);
		model[191].addShapeBox(0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[191].setRotationPoint(45.0f, -10.0f, 6.0f);

		flipAll();
	}

}
