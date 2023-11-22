//FMT-Marker DFM-1.0
//Creator: Unregistered Account

package cz.ctyrkaten.train.client.render.models;


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelClassTitan extends ModelConverter {

	private int textureX = 2048;
	private int textureY = 2048;

	public ModelClassTitan(){
		barrelModel = new ModelRendererTurbo[112];
		bodyModel = new ModelRendererTurbo[224];
		//
		barrelModel[0] = new ModelRendererTurbo(this, 1921, 5, textureX, textureY);
		barrelModel[0].addBox(0, 0, 0, 10, 10, 0, 0f);
		barrelModel[0].setRotationPoint(1.5f, -3.0f, 6.0f);

		barrelModel[1] = new ModelRendererTurbo(this, 1721, 3, textureX, textureY);
		barrelModel[1].flip = true;
		barrelModel[1].addCylinder(0, 0, 0, 8, 18, 24, 1, 1, 4);
		barrelModel[1].setRotationPoint(32.0f, -10.0f, 0.0f);
		barrelModel[1].rotateAngleZ = 1.5707964f;

		barrelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		barrelModel[2].addShapeBox(0, 0, 0, 79, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		barrelModel[2].setRotationPoint(-36.0f, -9.0f, -9.0f);

		barrelModel[3] = new ModelRendererTurbo(this, 1583, 0, textureX, textureY);
		barrelModel[3].addShapeBox(0, 0, 0, 8, 8, 18, 0, 0, 0, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0, -7.5f, 0, 0, 0, 0, 0, 0, 0, 0, -7.5f, 0);
		barrelModel[3].setRotationPoint(43.0f, -9.0f, -9.0f);

		barrelModel[4] = new ModelRendererTurbo(this, 1618, 3, textureX, textureY);
		barrelModel[4].addBox(0, 0, 0, 17, 5, 1, 0f);
		barrelModel[4].setRotationPoint(35.0f, -14.0f, -9.0f);

		barrelModel[5] = new ModelRendererTurbo(this, 840, 8, textureX, textureY);
		barrelModel[5].addShapeBox(0, 0, 0, 8, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0);
		barrelModel[5].setRotationPoint(43.0f, -9.0f, -9.0f);

		barrelModel[6] = new ModelRendererTurbo(this, 1900, 5, textureX, textureY);
		barrelModel[6].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[6].setRotationPoint(26.0f, -14.0f, -9.0f);

		barrelModel[7] = new ModelRendererTurbo(this, 581, 4, textureX, textureY);
		barrelModel[7].addShapeBox(0, 0, 0, 9, 3, 1, 0, -6, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -6, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[7].setRotationPoint(35.0f, -17.0f, -9.0f);

		barrelModel[8] = new ModelRendererTurbo(this, 1626, 10, textureX, textureY);
		barrelModel[8].addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[8].setRotationPoint(44.0f, -17.0f, -9.0f);

		barrelModel[9] = new ModelRendererTurbo(this, 1255, 16, textureX, textureY);
		barrelModel[9].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1.5f, 0, -0.6f, -1, 0, -0.6f, 1, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[9].setRotationPoint(49.0f, -17.0f, -9.0f);

		barrelModel[10] = new ModelRendererTurbo(this, 875, 16, textureX, textureY);
		barrelModel[10].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.6f, -1, 0, -1.7f, -0.5f, 0, -1.6f, 0.5f, 0, -0.6f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[10].setRotationPoint(50.0f, -17.0f, -9.0f);

		barrelModel[11] = new ModelRendererTurbo(this, 1432, 8, textureX, textureY);
		barrelModel[11].addShapeBox(0, 0, 0, 2, 3, 5, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[11].setRotationPoint(51.0f, -2.0f, -9.0f);

		barrelModel[12] = new ModelRendererTurbo(this, 1887, 5, textureX, textureY);
		barrelModel[12].addBox(0, 0, 0, 2, 3, 8, 0f);
		barrelModel[12].setRotationPoint(51.0f, -2.0f, -4.0f);

		barrelModel[13] = new ModelRendererTurbo(this, 739, 16, textureX, textureY);
		barrelModel[13].addBox(0, 0, 0, 1, 7, 1, 0f);
		barrelModel[13].setRotationPoint(51.0f, -9.0f, -9.0f);

		barrelModel[14] = new ModelRendererTurbo(this, 527, 16, textureX, textureY);
		barrelModel[14].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.7f, -0.5f, 0, -2, 0, 0, -2, 0, 0, -0.6f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[14].setRotationPoint(51.0f, -16.0f, -9.0f);

		barrelModel[15] = new ModelRendererTurbo(this, 1866, 5, textureX, textureY);
		barrelModel[15].flip = true;
		barrelModel[15].addCylinder(0, 0, 0, 5, 1, 24, 1, 0.9f, 4);
		barrelModel[15].setRotationPoint(50.0f, -10.0f, 0.0f);
		barrelModel[15].rotateAngleZ = 1.5707964f;

		barrelModel[16] = new ModelRendererTurbo(this, 1942, 10, textureX, textureY);
		barrelModel[16].addBox(0, 0, 0, 1, 1, 5, 0f);
		barrelModel[16].setRotationPoint(49.7f, -13.8f, 1.4f);

		barrelModel[17] = new ModelRendererTurbo(this, 601, 0, textureX, textureY);
		barrelModel[17].addShapeBox(0, 0, 0, 18, 9, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0);
		barrelModel[17].setRotationPoint(-44.0f, -9.0f, -6.0f);

		barrelModel[18] = new ModelRendererTurbo(this, 662, 0, textureX, textureY);
		barrelModel[18].addShapeBox(0, 0, 0, 17, 6, 12, 0, -4, 0, -4, 0, 0, -3, 0, 0, -3, -4, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[18].setRotationPoint(-44.0f, -15.0f, -6.0f);

		barrelModel[19] = new ModelRendererTurbo(this, 522, 0, textureX, textureY);
		barrelModel[19].addBox(0, 0, 0, 19, 1, 20, 0f);
		barrelModel[19].setRotationPoint(-55.0f, -3.0f, -10.0f);

		barrelModel[20] = new ModelRendererTurbo(this, 930, 3, textureX, textureY);
		barrelModel[20].addBox(0, 0, 0, 19, 7, 1, 0f);
		barrelModel[20].setRotationPoint(-55.0f, -10.0f, -10.0f);

		barrelModel[21] = new ModelRendererTurbo(this, 1031, 3, textureX, textureY);
		barrelModel[21].addBox(0, 0, 0, 1, 7, 18, 0f);
		barrelModel[21].setRotationPoint(-37.0f, -10.0f, -9.0f);

		barrelModel[22] = new ModelRendererTurbo(this, 1754, 10, textureX, textureY);
		barrelModel[22].addBox(0, 0, 0, 5, 6, 1, 0f);
		barrelModel[22].setRotationPoint(-41.0f, -16.0f, 9.0f);

		barrelModel[23] = new ModelRendererTurbo(this, 1636, 10, textureX, textureY);
		barrelModel[23].addShapeBox(0, 0, 0, 1, 6, 5, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[23].setRotationPoint(-37.0f, -17.0f, -9.0f);

		barrelModel[24] = new ModelRendererTurbo(this, 992, 3, textureX, textureY);
		barrelModel[24].addBox(0, 0, 0, 1, 1, 18, 0f);
		barrelModel[24].setRotationPoint(-37.0f, -11.0f, -9.0f);

		barrelModel[25] = new ModelRendererTurbo(this, 869, 11, textureX, textureY);
		barrelModel[25].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		barrelModel[25].setRotationPoint(-49.0f, -11.0f, 9.0f);

		barrelModel[26] = new ModelRendererTurbo(this, 473, 15, textureX, textureY);
		barrelModel[26].addShapeBox(0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[26].setRotationPoint(-49.0f, -15.8f, 9.2f);

		barrelModel[27] = new ModelRendererTurbo(this, 1318, 3, textureX, textureY);
		barrelModel[27].addBox(0, 0, 0, 14, 1, 4, 0f);
		barrelModel[27].setRotationPoint(-51.0f, -4.0f, 5.0f);

		barrelModel[28] = new ModelRendererTurbo(this, 177, 12, textureX, textureY);
		barrelModel[28].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[28].setRotationPoint(-52.0f, -4.0f, 5.0f);

		barrelModel[29] = new ModelRendererTurbo(this, 1800, 3, textureX, textureY);
		barrelModel[29].addBox(0, 0, 0, 2, 7, 12, 0f);
		barrelModel[29].setRotationPoint(-57.0f, -3.0f, -6.0f);

		barrelModel[30] = new ModelRendererTurbo(this, 1340, 9, textureX, textureY);
		barrelModel[30].addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		barrelModel[30].setRotationPoint(-57.0f, -3.0f, 6.0f);

		barrelModel[31] = new ModelRendererTurbo(this, 1985, 11, textureX, textureY);
		barrelModel[31].addBox(0, 0, 0, 1, 1, 4, 0f);
		barrelModel[31].setRotationPoint(-58.0f, -3.0f, -2.0f);

		barrelModel[32] = new ModelRendererTurbo(this, 1974, 11, textureX, textureY);
		barrelModel[32].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		barrelModel[32].setRotationPoint(-58.0f, -3.0f, 2.0f);

		barrelModel[33] = new ModelRendererTurbo(this, 515, 4, textureX, textureY);
		barrelModel[33].addShapeBox(0, 0, 0, 9, 3, 1, 0, -6, 0, 1.5f, 0, 0, 1.5f, 0, 0, -1.5f, -6, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[33].setRotationPoint(35.0f, -17.0f, 8.0f);

		barrelModel[34] = new ModelRendererTurbo(this, 1508, 9, textureX, textureY);
		barrelModel[34].addShapeBox(0, 0, 0, 5, 3, 1, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[34].setRotationPoint(44.0f, -17.0f, 8.0f);

		barrelModel[35] = new ModelRendererTurbo(this, 734, 16, textureX, textureY);
		barrelModel[35].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 1.5f, 0, -0.6f, 1, 0, -0.6f, -1, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[35].setRotationPoint(49.0f, -17.0f, 8.0f);

		barrelModel[36] = new ModelRendererTurbo(this, 355, 16, textureX, textureY);
		barrelModel[36].addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.6f, 1, 0, -1.6f, 0.5f, 0, -1.7f, -0.5f, 0, -0.6f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[36].setRotationPoint(50.0f, -17.0f, 8.0f);

		barrelModel[37] = new ModelRendererTurbo(this, 350, 16, textureX, textureY);
		barrelModel[37].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.6f, 0.5f, 0, -2, 0, 0, -2, 0, 0, -0.7f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[37].setRotationPoint(51.0f, -16.0f, 8.0f);

		barrelModel[38] = new ModelRendererTurbo(this, 1995, 0, textureX, textureY);
		barrelModel[38].addShapeBox(0, 0, 0, 9, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		barrelModel[38].setRotationPoint(-53.0f, -2.0f, -6.0f);

		barrelModel[39] = new ModelRendererTurbo(this, 195, 0, textureX, textureY);
		barrelModel[39].addBox(0, 0, 0, 49, 10, 10, 0f);
		barrelModel[39].setRotationPoint(-24.5f, -5.0f, -5.0f);

		barrelModel[40] = new ModelRendererTurbo(this, 1297, 3, textureX, textureY);
		barrelModel[40].addBox(0, 0, 0, 2, 2, 16, 0f);
		barrelModel[40].setRotationPoint(48.0f, 3.0f, -8.0f);

		barrelModel[41] = new ModelRendererTurbo(this, 464, 15, textureX, textureY);
		barrelModel[41].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		barrelModel[41].setRotationPoint(45.0f, 2.5f, -7.0f);

		barrelModel[42] = new ModelRendererTurbo(this, 455, 15, textureX, textureY);
		barrelModel[42].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		barrelModel[42].setRotationPoint(50.0f, 2.5f, -7.0f);

		barrelModel[43] = new ModelRendererTurbo(this, 1314, 0, textureX, textureY);
		barrelModel[43].addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[43].setRotationPoint(27.0f, 1.5f, -7.0f);

		barrelModel[44] = new ModelRendererTurbo(this, 1771, 0, textureX, textureY);
		barrelModel[44].addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		barrelModel[44].setRotationPoint(28.0f, 5.5f, 6.0f);

		barrelModel[45] = new ModelRendererTurbo(this, 756, 3, textureX, textureY);
		barrelModel[45].addShapeBox(0, 0, 0, 22, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		barrelModel[45].setRotationPoint(-52.0f, 2.5f, 6.0f);

		barrelModel[46] = new ModelRendererTurbo(this, 846, 3, textureX, textureY);
		barrelModel[46].addShapeBox(0, 0, 0, 19, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 1, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1);
		barrelModel[46].setRotationPoint(-55.0f, -18.0f, 8.0f);

		barrelModel[47] = new ModelRendererTurbo(this, 709, 3, textureX, textureY);
		barrelModel[47].addShapeBox(0, 0, 0, 20, 2, 3, 0, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[47].setRotationPoint(-56.0f, -19.0f, 5.0f);

		barrelModel[48] = new ModelRendererTurbo(this, 813, 14, textureX, textureY);
		barrelModel[48].addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[48].setRotationPoint(-37.0f, -18.0f, 5.0f);

		barrelModel[49] = new ModelRendererTurbo(this, 650, 0, textureX, textureY);
		barrelModel[49].addBox(0, 0, 0, 1, 1, 10, 0f);
		barrelModel[49].setRotationPoint(-37.0f, -18.0f, -5.0f);

		barrelModel[50] = new ModelRendererTurbo(this, 1618, 10, textureX, textureY);
		barrelModel[50].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[50].setRotationPoint(-37.0f, -19.0f, 0.0f);

		barrelModel[51] = new ModelRendererTurbo(this, 1074, 11, textureX, textureY);
		barrelModel[51].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[51].setRotationPoint(-37.0f, -17.0f, 5.0f);

		barrelModel[52] = new ModelRendererTurbo(this, 1857, 12, textureX, textureY);
		barrelModel[52].addBox(0, 0, 0, 0, 6, 4, 0f);
		barrelModel[52].setRotationPoint(-36.5f, -17.0f, 5.0f);

		barrelModel[53] = new ModelRendererTurbo(this, 2031, 15, textureX, textureY);
		barrelModel[53].addBox(0, 0, 0, 1, 4, 1, 0f);
		barrelModel[53].setRotationPoint(-49.0f, -8.0f, 6.5f);

		barrelModel[54] = new ModelRendererTurbo(this, 1495, 9, textureX, textureY);
		barrelModel[54].addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[54].setRotationPoint(-50.0f, -9.0f, 5.5f);

		barrelModel[55] = new ModelRendererTurbo(this, 821, 8, textureX, textureY);
		barrelModel[55].addBox(0, 0, 0, 8, 1, 1, 0f);
		barrelModel[55].setRotationPoint(-45.0f, -11.0f, -5.0f);

		barrelModel[56] = new ModelRendererTurbo(this, 1157, 6, textureX, textureY);
		barrelModel[56].addBox(0, 0, 0, 0, 1, 1, 0f);
		barrelModel[56].setRotationPoint(-45.0f, -12.0f, -5.0f);

		barrelModel[57] = new ModelRendererTurbo(this, 1091, 6, textureX, textureY);
		barrelModel[57].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		barrelModel[57].setRotationPoint(-45.0f, -12.0f, -4.0f);

		barrelModel[58] = new ModelRendererTurbo(this, 1845, 6, textureX, textureY);
		barrelModel[58].addBox(0, 0, 0, 8, 1, 1, 0f);
		barrelModel[58].setRotationPoint(-44.0f, -16.0f, -6.0f);
		barrelModel[58].rotateAngleY = -0.36651915f;
		barrelModel[58].rotateAngleZ = -0.2443461f;

		barrelModel[59] = new ModelRendererTurbo(this, 15, 3, textureX, textureY);
		barrelModel[59].addBox(0, 0, 0, 1, 1, 0, 0f);
		barrelModel[59].setRotationPoint(-44.0f, -15.85f, -4.6f);
		barrelModel[59].rotateAngleY = 0.05235988f;
		barrelModel[59].rotateAngleZ = -0.19198622f;

		barrelModel[60] = new ModelRendererTurbo(this, 503, 15, textureX, textureY);
		barrelModel[60].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[60].setRotationPoint(-45.0f, -8.0f, 0.0f);

		barrelModel[61] = new ModelRendererTurbo(this, 1771, 3, textureX, textureY);
		barrelModel[61].addBox(0, 0, 0, 2, 2, 12, 0f);
		barrelModel[61].setRotationPoint(18.0f, 1.0f, -6.0f);

		barrelModel[62] = new ModelRendererTurbo(this, 1154, 15, textureX, textureY);
		barrelModel[62].flip = true;
		barrelModel[62].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		barrelModel[62].setRotationPoint(19.0f, 4.0f, 7.0f);
		barrelModel[62].rotateAngleX = -1.5707964f;

		barrelModel[63] = new ModelRendererTurbo(this, 446, 15, textureX, textureY);
		barrelModel[63].flip = true;
		barrelModel[63].addCylinder(0, 0, 0, 2, 12, 16, 0.7f, 0.7f, 4);
		barrelModel[63].setRotationPoint(0.0f, -7.3f, -8.0f);
		barrelModel[63].rotateAngleZ = 1.5707964f;

		barrelModel[64] = new ModelRendererTurbo(this, 805, 8, textureX, textureY);
		barrelModel[64].addShapeBox(0, 0, 0, 6, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[64].setRotationPoint(21.0f, -6.0f, 6.0f);

		barrelModel[65] = new ModelRendererTurbo(this, 437, 15, textureX, textureY);
		barrelModel[65].flip = true;
		barrelModel[65].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		barrelModel[65].setRotationPoint(24.0f, -4.0f, -7.0f);
		barrelModel[65].rotateAngleZ = 3.1415927f;

		barrelModel[66] = new ModelRendererTurbo(this, 1548, 0, textureX, textureY);
		barrelModel[66].addBox(0, 0, 0, 18, 4, 8, 0f);
		barrelModel[66].setRotationPoint(31.0f, -4.0f, -4.0f);

		barrelModel[67] = new ModelRendererTurbo(this, 1754, 3, textureX, textureY);
		barrelModel[67].addShapeBox(0, 0, 0, 13, 5, 1, 0, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3, 0, 0, 0, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, 0, 0);
		barrelModel[67].setRotationPoint(3.0f, 0.0f, -8.0f);

		barrelModel[68] = new ModelRendererTurbo(this, 1955, 13, textureX, textureY);
		barrelModel[68].addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		barrelModel[68].setRotationPoint(53.0f, 0.0f, -6.0f);

		barrelModel[69] = new ModelRendererTurbo(this, 11, 14, textureX, textureY);
		barrelModel[69].addBox(0, 0, 0, 1, 2, 1, 0f);
		barrelModel[69].setRotationPoint(7.0f, -20.5f, -1.5f);

		barrelModel[70] = new ModelRendererTurbo(this, 1495, 0, textureX, textureY);
		barrelModel[70].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		barrelModel[70].setRotationPoint(9.0f, -2.0f, 6.5f);

		barrelModel[71] = new ModelRendererTurbo(this, 1331, 9, textureX, textureY);
		barrelModel[71].addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -1, 0, -1, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -1, 0, 0);
		barrelModel[71].setRotationPoint(4.0f, -1.0f, 7.0f);

		barrelModel[72] = new ModelRendererTurbo(this, 496, 15, textureX, textureY);
		barrelModel[72].addShapeBox(0, 0, 0, 2, 3, 1, 0, -1.5f, 0, 0, 0, -1, 0, 0, -1, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f);
		barrelModel[72].setRotationPoint(2.0f, 1.0f, 7.0f);

		barrelModel[73] = new ModelRendererTurbo(this, 1365, 12, textureX, textureY);
		barrelModel[73].addBox(0, 0, 0, 1, 1, 1, 0f);
		barrelModel[73].setRotationPoint(-41.5f, 0.0f, -0.5f);

		barrelModel[74] = new ModelRendererTurbo(this, 489, 15, textureX, textureY);
		barrelModel[74].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		barrelModel[74].setRotationPoint(25.0f, -18.0f, 3.5f);

		barrelModel[75] = new ModelRendererTurbo(this, 971, 3, textureX, textureY);
		barrelModel[75].addBox(0, 0, 0, 12, 1, 7, 0f);
		barrelModel[75].setRotationPoint(14.0f, -18.0f, -3.5f);

		barrelModel[76] = new ModelRendererTurbo(this, 482, 15, textureX, textureY);
		barrelModel[76].addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		barrelModel[76].setRotationPoint(23.0f, -18.0f, -6.5f);

		barrelModel[77] = new ModelRendererTurbo(this, 1981, 11, textureX, textureY);
		barrelModel[77].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		barrelModel[77].setRotationPoint(23.0f, -19.0f, 5.5f);

		barrelModel[78] = new ModelRendererTurbo(this, 1070, 11, textureX, textureY);
		barrelModel[78].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		barrelModel[78].setRotationPoint(25.0f, -19.0f, 3.5f);

		barrelModel[79] = new ModelRendererTurbo(this, 428, 15, textureX, textureY);
		barrelModel[79].addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[79].setRotationPoint(23.0f, -19.0f, 3.5f);

		barrelModel[80] = new ModelRendererTurbo(this, 879, 8, textureX, textureY);
		barrelModel[80].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[80].setRotationPoint(25.0f, -19.0f, -3.5f);

		barrelModel[81] = new ModelRendererTurbo(this, 1817, 6, textureX, textureY);
		barrelModel[81].addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[81].setRotationPoint(17.0f, -19.0f, 5.5f);

		barrelModel[82] = new ModelRendererTurbo(this, 1887, 10, textureX, textureY);
		barrelModel[82].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		barrelModel[82].setRotationPoint(15.0f, -19.0f, 5.5f);

		barrelModel[83] = new ModelRendererTurbo(this, 1059, 11, textureX, textureY);
		barrelModel[83].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		barrelModel[83].setRotationPoint(14.0f, -19.0f, 3.5f);

		barrelModel[84] = new ModelRendererTurbo(this, 419, 15, textureX, textureY);
		barrelModel[84].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[84].setRotationPoint(15.0f, -19.0f, 3.5f);

		barrelModel[85] = new ModelRendererTurbo(this, 1371, 10, textureX, textureY);
		barrelModel[85].addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[85].setRotationPoint(14.0f, -19.0f, -5.5f);

		barrelModel[86] = new ModelRendererTurbo(this, 370, 9, textureX, textureY);
		barrelModel[86].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[86].setRotationPoint(15.0f, -19.0f, -6.5f);

		barrelModel[87] = new ModelRendererTurbo(this, 1107, 7, textureX, textureY);
		barrelModel[87].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		barrelModel[87].setRotationPoint(23.0f, -19.0f, -6.5f);

		barrelModel[88] = new ModelRendererTurbo(this, 1999, 8, textureX, textureY);
		barrelModel[88].addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[88].setRotationPoint(25.0f, -19.0f, -5.5f);

		barrelModel[89] = new ModelRendererTurbo(this, 1013, 3, textureX, textureY);
		barrelModel[89].addBox(0, 0, 0, 10, 1, 7, 0f);
		barrelModel[89].setRotationPoint(15.0f, -19.0f, -3.5f);

		barrelModel[90] = new ModelRendererTurbo(this, 1304, 14, textureX, textureY);
		barrelModel[90].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		barrelModel[90].setRotationPoint(23.0f, -19.0f, -5.5f);

		barrelModel[91] = new ModelRendererTurbo(this, 341, 14, textureX, textureY);
		barrelModel[91].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2);
		barrelModel[91].setRotationPoint(15.0f, -19.0f, 3.5f);

		barrelModel[92] = new ModelRendererTurbo(this, 1219, 9, textureX, textureY);
		barrelModel[92].addBox(0, 0, 0, 4, 2, 2, 0f);
		barrelModel[92].setRotationPoint(54.0f, 1.0f, -1.0f);

		barrelModel[93] = new ModelRendererTurbo(this, 1360, 12, textureX, textureY);
		barrelModel[93].addBox(0, 0, 0, 1, 1, 1, 0f);
		barrelModel[93].setRotationPoint(-43.0f, -1.0f, -7.0f);

		barrelModel[94] = new ModelRendererTurbo(this, 869, 8, textureX, textureY);
		barrelModel[94].addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1);
		barrelModel[94].setRotationPoint(-43.0f, -1.0f, -8.0f);

		barrelModel[95] = new ModelRendererTurbo(this, 786, 8, textureX, textureY);
		barrelModel[95].addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0);
		barrelModel[95].setRotationPoint(-36.0f, -2.0f, -8.0f);

		barrelModel[96] = new ModelRendererTurbo(this, 1191, 12, textureX, textureY);
		barrelModel[96].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		barrelModel[96].setRotationPoint(-28.0f, -2.0f, -8.0f);

		barrelModel[97] = new ModelRendererTurbo(this, 591, 13, textureX, textureY);
		barrelModel[97].addBox(0, 0, 0, 1, 1, 3, 0f);
		barrelModel[97].setRotationPoint(-28.0f, -2.0f, -7.0f);

		barrelModel[98] = new ModelRendererTurbo(this, 889, 12, textureX, textureY);
		barrelModel[98].addBox(0, 0, 0, 1, 1, 1, 0f);
		barrelModel[98].setRotationPoint(-29.0f, -2.0f, -4.0f);

		barrelModel[99] = new ModelRendererTurbo(this, 1081, 11, textureX, textureY);
		barrelModel[99].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[99].setRotationPoint(-39.0f, -2.0f, -7.0f);

		barrelModel[100] = new ModelRendererTurbo(this, 1548, 4, textureX, textureY);
		barrelModel[100].addBox(0, 0, 0, 2, 1, 1, 0f);
		barrelModel[100].setRotationPoint(-38.0f, -2.0f, -7.0f);

		barrelModel[101] = new ModelRendererTurbo(this, 2026, 15, textureX, textureY);
		barrelModel[101].addShapeBox(-1, 0, 0, 1, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0);
		barrelModel[101].setRotationPoint(-33.0f, -5.0f, -7.0f);

		barrelModel[102] = new ModelRendererTurbo(this, 880, 11, textureX, textureY);
		barrelModel[102].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0);
		barrelModel[102].setRotationPoint(-34.0f, -3.0f, -7.0f);

		barrelModel[103] = new ModelRendererTurbo(this, 2026, 7, textureX, textureY);
		barrelModel[103].addShapeBox(0, 0, 0, 6, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		barrelModel[103].setRotationPoint(21.0f, 3.0f, -9.0f);

		barrelModel[104] = new ModelRendererTurbo(this, 1091, 3, textureX, textureY);
		barrelModel[104].addShapeBox(0, 0, 0, 12, 0, 3, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0);
		barrelModel[104].setRotationPoint(-51.0f, -16.0f, 10.0f);
		barrelModel[104].rotateAngleX = -0.87266463f;

		barrelModel[105] = new ModelRendererTurbo(this, 337, 9, textureX, textureY);
		barrelModel[105].addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		barrelModel[105].setRotationPoint(35.0f, -20.4f, -0.5f);

		barrelModel[106] = new ModelRendererTurbo(this, 324, 9, textureX, textureY);
		barrelModel[106].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[106].setRotationPoint(35.0f, -19.4f, -0.5f);

		barrelModel[107] = new ModelRendererTurbo(this, 200, 3, textureX, textureY);
		barrelModel[107].addBox(0, 0, 0, 1, 0, 1, 0f);
		barrelModel[107].setRotationPoint(35.0f, -20.4f, -0.5f);

		barrelModel[108] = new ModelRendererTurbo(this, 1110, 14, textureX, textureY);
		barrelModel[108].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		barrelModel[108].setRotationPoint(34.0f, -20.4f, -1.5f);

		barrelModel[109] = new ModelRendererTurbo(this, 410, 15, textureX, textureY);
		barrelModel[109].flip = true;
		barrelModel[109].addCylinder(0, 0, 0, 2, 10, 8, 1, 1, 4);
		barrelModel[109].setRotationPoint(50.0f, -17.0f, 5.0f);
		barrelModel[109].rotateAngleX = -1.5707964f;

		barrelModel[110] = new ModelRendererTurbo(this, 1182, 12, textureX, textureY);
		barrelModel[110].addBox(0, 0, 0, 3, 1, 1, 0f);
		barrelModel[110].setRotationPoint(47.0f, -19.0f, 1.0f);

		barrelModel[111] = new ModelRendererTurbo(this, 190, 9, textureX, textureY);
		barrelModel[111].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[111].setRotationPoint(46.0f, -19.0f, 1.0f);

		bodyModel[0] = new ModelRendererTurbo(this, 494, 4, textureX, textureY);
		bodyModel[0].addBox(0, 0, 0, 10, 10, 0, 0f);
		bodyModel[0].setRotationPoint(-11.5f, -3.0f, 6.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 473, 4, textureX, textureY);
		bodyModel[1].addBox(0, 0, 0, 10, 10, 0, 0f);
		bodyModel[1].setRotationPoint(14.0f, -3.0f, 6.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 452, 4, textureX, textureY);
		bodyModel[2].addBox(0, 0, 0, 10, 10, 0, 0f);
		bodyModel[2].setRotationPoint(-24.0f, -3.0f, 6.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 431, 4, textureX, textureY);
		bodyModel[3].addBox(0, 0, 0, 10, 10, 0, 0f);
		bodyModel[3].setRotationPoint(14.0f, -3.0f, -6.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 410, 4, textureX, textureY);
		bodyModel[4].addBox(0, 0, 0, 10, 10, 0, 0f);
		bodyModel[4].setRotationPoint(1.5f, -3.0f, -6.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 389, 4, textureX, textureY);
		bodyModel[5].addBox(0, 0, 0, 10, 10, 0, 0f);
		bodyModel[5].setRotationPoint(-11.5f, -3.0f, -6.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 1788, 3, textureX, textureY);
		bodyModel[6].addBox(0, 0, 0, 10, 10, 0, 0f);
		bodyModel[6].setRotationPoint(-24.0f, -3.0f, -6.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 1291, 10, textureX, textureY);
		bodyModel[7].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[7].setRotationPoint(28.0f, 1.0f, -6.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 1278, 10, textureX, textureY);
		bodyModel[8].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[8].setRotationPoint(37.0f, 1.0f, -6.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 1265, 10, textureX, textureY);
		bodyModel[9].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[9].setRotationPoint(46.0f, 1.0f, -6.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 1141, 10, textureX, textureY);
		bodyModel[10].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[10].setRotationPoint(28.0f, 1.0f, 6.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 1128, 10, textureX, textureY);
		bodyModel[11].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[11].setRotationPoint(37.0f, 1.0f, 6.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 1961, 9, textureX, textureY);
		bodyModel[12].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[12].setRotationPoint(46.0f, 1.0f, 6.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 1848, 9, textureX, textureY);
		bodyModel[13].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[13].setRotationPoint(-35.0f, 1.0f, -6.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 1318, 9, textureX, textureY);
		bodyModel[14].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[14].setRotationPoint(-35.0f, 1.0f, 6.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 1252, 9, textureX, textureY);
		bodyModel[15].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[15].setRotationPoint(-44.0f, 1.0f, -6.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 1239, 9, textureX, textureY);
		bodyModel[16].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[16].setRotationPoint(-44.0f, 1.0f, 6.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 734, 9, textureX, textureY);
		bodyModel[17].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[17].setRotationPoint(-53.0f, 1.0f, -6.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 581, 9, textureX, textureY);
		bodyModel[18].addBox(0, 0, 0, 6, 6, 0, 0f);
		bodyModel[18].setRotationPoint(-53.0f, 1.0f, 6.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 1688, 3, textureX, textureY);
		bodyModel[19].flip = true;
		bodyModel[19].addCylinder(0, 0, 0, 8, 27, 24, 1, 1.03f, 4);
		bodyModel[19].setRotationPoint(32.0f, -10.0f, 0.0f);
		bodyModel[19].rotateAngleX = -3.1415927f;
		bodyModel[19].rotateAngleZ = 1.5707964f;

		bodyModel[20] = new ModelRendererTurbo(this, 1655, 3, textureX, textureY);
		bodyModel[20].flip = true;
		bodyModel[20].addCylinder(0, 0, 0, 8, 41, 24, 1.03f, 0.9f, 4);
		bodyModel[20].setRotationPoint(5.0f, -10.0f, 0.0f);
		bodyModel[20].rotateAngleX = -3.1415927f;
		bodyModel[20].rotateAngleZ = 1.5707964f;

		bodyModel[21] = new ModelRendererTurbo(this, 1276, 3, textureX, textureY);
		bodyModel[21].addBox(0, 0, 0, 17, 5, 1, 0f);
		bodyModel[21].setRotationPoint(35.0f, -14.0f, 8.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 767, 8, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 8, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0);
		bodyModel[22].setRotationPoint(43.0f, -9.0f, 8.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 2026, 0, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 9, 5, 1, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[23].setRotationPoint(26.0f, -14.0f, 8.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 1417, 8, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 2, 3, 5, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, -1, 0);
		bodyModel[24].setRotationPoint(51.0f, -2.0f, 4.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 2021, 15, textureX, textureY);
		bodyModel[25].addBox(0, 0, 0, 1, 7, 1, 0f);
		bodyModel[25].setRotationPoint(51.0f, -9.0f, 8.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 528, 9, textureX, textureY);
		bodyModel[26].addBox(0, 0, 0, 1, 1, 5, 0f);
		bodyModel[26].setRotationPoint(49.7f, -7.2f, 1.4f);

		bodyModel[27] = new ModelRendererTurbo(this, 889, 3, textureX, textureY);
		bodyModel[27].addBox(0, 0, 0, 19, 7, 1, 0f);
		bodyModel[27].setRotationPoint(-55.0f, -10.0f, 9.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 1402, 8, textureX, textureY);
		bodyModel[28].addBox(0, 0, 0, 6, 6, 1, 0f);
		bodyModel[28].setRotationPoint(-55.0f, -16.0f, 9.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 1387, 8, textureX, textureY);
		bodyModel[29].addBox(0, 0, 0, 6, 6, 1, 0f);
		bodyModel[29].setRotationPoint(-55.0f, -16.0f, -10.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 515, 9, textureX, textureY);
		bodyModel[30].addBox(0, 0, 0, 5, 6, 1, 0f);
		bodyModel[30].setRotationPoint(-41.0f, -16.0f, -10.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 721, 9, textureX, textureY);
		bodyModel[31].addShapeBox(0, 0, 0, 1, 6, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[31].setRotationPoint(-37.0f, -17.0f, 4.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 748, 8, textureX, textureY);
		bodyModel[32].addBox(0, 0, 0, 1, 6, 8, 0f);
		bodyModel[32].setRotationPoint(-37.0f, -17.0f, -4.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 827, 11, textureX, textureY);
		bodyModel[33].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[33].setRotationPoint(-49.0f, -16.6f, 9.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 2016, 15, textureX, textureY);
		bodyModel[34].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[34].setRotationPoint(-45.4f, -16.5f, 9.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 2011, 15, textureX, textureY);
		bodyModel[35].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[35].setRotationPoint(-49.0f, -16.5f, 9.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 7, 11, textureX, textureY);
		bodyModel[36].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[36].setRotationPoint(-49.0f, -11.0f, -9.4f);

		bodyModel[37] = new ModelRendererTurbo(this, 2006, 15, textureX, textureY);
		bodyModel[37].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[37].setRotationPoint(-45.4f, -16.5f, -9.4f);

		bodyModel[38] = new ModelRendererTurbo(this, 2001, 15, textureX, textureY);
		bodyModel[38].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[38].setRotationPoint(-49.0f, -16.5f, -9.4f);

		bodyModel[39] = new ModelRendererTurbo(this, 1950, 10, textureX, textureY);
		bodyModel[39].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[39].setRotationPoint(-49.0f, -16.6f, -9.4f);

		bodyModel[40] = new ModelRendererTurbo(this, 1996, 15, textureX, textureY);
		bodyModel[40].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[40].setRotationPoint(-45.4f, -16.6f, 9.4f);

		bodyModel[41] = new ModelRendererTurbo(this, 1767, 10, textureX, textureY);
		bodyModel[41].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[41].setRotationPoint(-45.0f, -11.0f, 9.4f);

		bodyModel[42] = new ModelRendererTurbo(this, 1917, 15, textureX, textureY);
		bodyModel[42].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[42].setRotationPoint(-41.4f, -16.5f, 9.4f);

		bodyModel[43] = new ModelRendererTurbo(this, 1644, 10, textureX, textureY);
		bodyModel[43].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[43].setRotationPoint(-45.0f, -16.6f, 9.4f);

		bodyModel[44] = new ModelRendererTurbo(this, 510, 15, textureX, textureY);
		bodyModel[44].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[44].setRotationPoint(-45.4f, -16.5f, -9.8f);

		bodyModel[45] = new ModelRendererTurbo(this, 709, 9, textureX, textureY);
		bodyModel[45].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[45].setRotationPoint(-45.0f, -16.6f, -9.8f);

		bodyModel[46] = new ModelRendererTurbo(this, 1996, 5, textureX, textureY);
		bodyModel[46].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[46].setRotationPoint(-45.0f, -11.0f, -9.8f);

		bodyModel[47] = new ModelRendererTurbo(this, 1649, 13, textureX, textureY);
		bodyModel[47].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, -0.6f, 0, 0, -0.6f);
		bodyModel[47].setRotationPoint(-41.4f, -16.5f, -9.8f);

		bodyModel[48] = new ModelRendererTurbo(this, 401, 15, textureX, textureY);
		bodyModel[48].addShapeBox(0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[48].setRotationPoint(-45.0f, -15.8f, 9.6f);

		bodyModel[49] = new ModelRendererTurbo(this, 392, 15, textureX, textureY);
		bodyModel[49].addShapeBox(0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[49].setRotationPoint(-49.0f, -15.8f, -9.2f);

		bodyModel[50] = new ModelRendererTurbo(this, 370, 15, textureX, textureY);
		bodyModel[50].addShapeBox(0, 0, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[50].setRotationPoint(-45.0f, -15.8f, -9.6f);

		bodyModel[51] = new ModelRendererTurbo(this, 1239, 3, textureX, textureY);
		bodyModel[51].addBox(0, 0, 0, 14, 1, 4, 0f);
		bodyModel[51].setRotationPoint(-51.0f, -4.0f, -9.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 1063, 11, textureX, textureY);
		bodyModel[52].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[52].setRotationPoint(-52.0f, -4.0f, -9.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 1052, 11, textureX, textureY);
		bodyModel[53].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[53].setRotationPoint(-53.0f, -4.0f, 5.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 820, 11, textureX, textureY);
		bodyModel[54].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[54].setRotationPoint(-53.0f, -4.0f, -9.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
		bodyModel[55].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[55].setRotationPoint(-54.0f, -4.0f, 5.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 1817, 9, textureX, textureY);
		bodyModel[56].addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[56].setRotationPoint(-54.0f, -4.0f, -9.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 374, 9, textureX, textureY);
		bodyModel[57].addShapeBox(0, 0, 0, 2, 1, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(-57.0f, -3.0f, -10.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 1165, 8, textureX, textureY);
		bodyModel[58].addShapeBox(0, 0, 0, 1, 1, 4, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[58].setRotationPoint(-58.0f, -3.0f, -6.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 361, 9, textureX, textureY);
		bodyModel[59].addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0);
		bodyModel[59].setRotationPoint(51.0f, -10.0f, -2.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 361, 15, textureX, textureY);
		bodyModel[60].flip = true;
		bodyModel[60].addCylinder(0, 0, 0, 2, 3, 8, 0.8f, 0.8f, 4);
		bodyModel[60].setRotationPoint(51.7f, -11.0f, 0.0f);
		bodyModel[60].rotateAngleZ = 1.5707964f;

		bodyModel[61] = new ModelRendererTurbo(this, 1218, 3, textureX, textureY);
		bodyModel[61].addBox(0, 0, 0, 2, 2, 16, 0f);
		bodyModel[61].setRotationPoint(39.0f, 3.0f, -8.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 1181, 3, textureX, textureY);
		bodyModel[62].addBox(0, 0, 0, 2, 2, 16, 0f);
		bodyModel[62].setRotationPoint(30.0f, 3.0f, -8.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 1144, 3, textureX, textureY);
		bodyModel[63].addBox(0, 0, 0, 2, 2, 16, 0f);
		bodyModel[63].setRotationPoint(-33.0f, 3.0f, -8.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 1107, 3, textureX, textureY);
		bodyModel[64].addBox(0, 0, 0, 2, 2, 16, 0f);
		bodyModel[64].setRotationPoint(-42.0f, 3.0f, -8.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 1070, 3, textureX, textureY);
		bodyModel[65].addBox(0, 0, 0, 2, 2, 16, 0f);
		bodyModel[65].setRotationPoint(-51.0f, 3.0f, -8.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 831, 14, textureX, textureY);
		bodyModel[66].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[66].setRotationPoint(36.0f, 2.5f, -7.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 804, 14, textureX, textureY);
		bodyModel[67].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[67].setRotationPoint(27.0f, 2.5f, -7.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 332, 14, textureX, textureY);
		bodyModel[68].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[68].setRotationPoint(41.0f, 2.5f, -7.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 323, 14, textureX, textureY);
		bodyModel[69].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[69].setRotationPoint(32.0f, 2.5f, -7.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 314, 14, textureX, textureY);
		bodyModel[70].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[70].setRotationPoint(27.0f, 2.5f, 6.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 1589, 13, textureX, textureY);
		bodyModel[71].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[71].setRotationPoint(32.0f, 2.5f, 6.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 1580, 13, textureX, textureY);
		bodyModel[72].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[72].setRotationPoint(41.0f, 2.5f, 6.0f);

		bodyModel[73] = new ModelRendererTurbo(this, 1571, 13, textureX, textureY);
		bodyModel[73].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[73].setRotationPoint(36.0f, 2.5f, 6.0f);

		bodyModel[74] = new ModelRendererTurbo(this, 1562, 13, textureX, textureY);
		bodyModel[74].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[74].setRotationPoint(50.0f, 2.5f, 6.0f);

		bodyModel[75] = new ModelRendererTurbo(this, 1331, 13, textureX, textureY);
		bodyModel[75].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[75].setRotationPoint(45.0f, 2.5f, 6.0f);

		bodyModel[76] = new ModelRendererTurbo(this, 1259, 0, textureX, textureY);
		bodyModel[76].addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[76].setRotationPoint(27.0f, 1.5f, 6.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 1204, 0, textureX, textureY);
		bodyModel[77].addShapeBox(0, 0, 0, 26, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[77].setRotationPoint(27.0f, 1.0f, -7.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 1149, 0, textureX, textureY);
		bodyModel[78].addShapeBox(0, 0, 0, 26, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[78].setRotationPoint(27.0f, 1.0f, 6.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 1094, 0, textureX, textureY);
		bodyModel[79].addShapeBox(0, 0, 0, 26, 1, 1, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[79].setRotationPoint(27.0f, 0.5f, -7.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 1039, 0, textureX, textureY);
		bodyModel[80].addShapeBox(0, 0, 0, 26, 1, 1, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[80].setRotationPoint(27.0f, 0.5f, 6.0f);

		bodyModel[81] = new ModelRendererTurbo(this, 2038, 12, textureX, textureY);
		bodyModel[81].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[81].setRotationPoint(-36.0f, 2.5f, -7.0f);

		bodyModel[82] = new ModelRendererTurbo(this, 1908, 12, textureX, textureY);
		bodyModel[82].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[82].setRotationPoint(-31.0f, 2.5f, -7.0f);

		bodyModel[83] = new ModelRendererTurbo(this, 984, 0, textureX, textureY);
		bodyModel[83].addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[83].setRotationPoint(-54.0f, 1.5f, -7.0f);

		bodyModel[84] = new ModelRendererTurbo(this, 1447, 12, textureX, textureY);
		bodyModel[84].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[84].setRotationPoint(-40.0f, 2.5f, -7.0f);

		bodyModel[85] = new ModelRendererTurbo(this, 1040, 12, textureX, textureY);
		bodyModel[85].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[85].setRotationPoint(-45.0f, 2.5f, -7.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 1031, 12, textureX, textureY);
		bodyModel[86].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[86].setRotationPoint(-49.0f, 2.5f, -7.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 1022, 12, textureX, textureY);
		bodyModel[87].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[87].setRotationPoint(-54.0f, 2.5f, -7.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 929, 0, textureX, textureY);
		bodyModel[88].addShapeBox(0, 0, 0, 26, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[88].setRotationPoint(-54.0f, 1.0f, -7.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 874, 0, textureX, textureY);
		bodyModel[89].addShapeBox(0, 0, 0, 26, 1, 1, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[89].setRotationPoint(-54.0f, 0.5f, -7.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 1013, 12, textureX, textureY);
		bodyModel[90].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[90].setRotationPoint(-31.0f, 2.5f, 6.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 995, 12, textureX, textureY);
		bodyModel[91].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[91].setRotationPoint(-36.0f, 2.5f, 6.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 986, 12, textureX, textureY);
		bodyModel[92].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[92].setRotationPoint(-40.0f, 2.5f, 6.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 977, 12, textureX, textureY);
		bodyModel[93].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[93].setRotationPoint(-45.0f, 2.5f, 6.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 968, 12, textureX, textureY);
		bodyModel[94].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[94].setRotationPoint(-49.0f, 2.5f, 6.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 959, 12, textureX, textureY);
		bodyModel[95].addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[95].setRotationPoint(-54.0f, 2.5f, 6.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 819, 0, textureX, textureY);
		bodyModel[96].addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[96].setRotationPoint(-54.0f, 1.5f, 6.0f);

		bodyModel[97] = new ModelRendererTurbo(this, 764, 0, textureX, textureY);
		bodyModel[97].addShapeBox(0, 0, 0, 26, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[97].setRotationPoint(-54.0f, 1.0f, 6.0f);

		bodyModel[98] = new ModelRendererTurbo(this, 709, 0, textureX, textureY);
		bodyModel[98].addShapeBox(0, 0, 0, 26, 1, 1, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[98].setRotationPoint(-54.0f, 0.5f, 6.0f);

		bodyModel[99] = new ModelRendererTurbo(this, 1509, 0, textureX, textureY);
		bodyModel[99].addShapeBox(0, 0, 0, 12, 1, 14, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[99].setRotationPoint(-47.0f, 0.0f, -7.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 1456, 0, textureX, textureY);
		bodyModel[100].addShapeBox(0, 0, 0, 12, 1, 14, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[100].setRotationPoint(34.0f, 0.0f, -7.0f);

		bodyModel[101] = new ModelRendererTurbo(this, 1720, 0, textureX, textureY);
		bodyModel[101].addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[101].setRotationPoint(28.0f, 5.5f, -7.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 1669, 0, textureX, textureY);
		bodyModel[102].addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[102].setRotationPoint(-53.0f, 5.5f, -7.0f);

		bodyModel[103] = new ModelRendererTurbo(this, 1618, 0, textureX, textureY);
		bodyModel[103].addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[103].setRotationPoint(-53.0f, 5.5f, 6.0f);

		bodyModel[104] = new ModelRendererTurbo(this, 1960, 0, textureX, textureY);
		bodyModel[104].addShapeBox(0, 0, 0, 22, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[104].setRotationPoint(-52.0f, 2.5f, -6.5f);

		bodyModel[105] = new ModelRendererTurbo(this, 1913, 0, textureX, textureY);
		bodyModel[105].addShapeBox(0, 0, 0, 22, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[105].setRotationPoint(29.0f, 2.5f, -6.5f);

		bodyModel[106] = new ModelRendererTurbo(this, 1866, 0, textureX, textureY);
		bodyModel[106].addShapeBox(0, 0, 0, 22, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[106].setRotationPoint(29.0f, 2.5f, 6.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 803, 3, textureX, textureY);
		bodyModel[107].addShapeBox(0, 0, 0, 19, 2, 2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 1, -1, 0);
		bodyModel[107].setRotationPoint(-55.0f, -18.0f, -10.0f);

		bodyModel[108] = new ModelRendererTurbo(this, 1819, 0, textureX, textureY);
		bodyModel[108].addShapeBox(0, 0, 0, 20, 2, 3, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 0);
		bodyModel[108].setRotationPoint(-56.0f, -19.0f, -8.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 1417, 0, textureX, textureY);
		bodyModel[109].addShapeBox(0, 0, 0, 21, 2, 5, 0, 0, -1, 0, 0, -1, 0, 0, -0.3f, 0, 1, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 1, -0.7f, 0);
		bodyModel[109].setRotationPoint(-57.0f, -20.0f, -5.0f);

		bodyModel[110] = new ModelRendererTurbo(this, 1364, 0, textureX, textureY);
		bodyModel[110].addShapeBox(0, 0, 0, 21, 2, 5, 0, 1, -0.3f, 0, 0, -0.3f, 0, 0, -1, 0, 0, -1, 0, 1, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[110].setRotationPoint(-57.0f, -20.0f, 0.0f);

		bodyModel[111] = new ModelRendererTurbo(this, 950, 12, textureX, textureY);
		bodyModel[111].addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[111].setRotationPoint(-37.0f, -18.0f, -8.0f);

		bodyModel[112] = new ModelRendererTurbo(this, 348, 9, textureX, textureY);
		bodyModel[112].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[112].setRotationPoint(-37.0f, -19.0f, -5.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 1202, 6, textureX, textureY);
		bodyModel[113].addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0);
		bodyModel[113].setRotationPoint(-37.0f, -17.0f, -9.0f);

		bodyModel[114] = new ModelRendererTurbo(this, 383, 11, textureX, textureY);
		bodyModel[114].addBox(0, 0, 0, 0, 6, 4, 0f);
		bodyModel[114].setRotationPoint(-36.5f, -17.0f, -9.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 1004, 12, textureX, textureY);
		bodyModel[115].addBox(0, 0, 0, 1, 4, 1, 0f);
		bodyModel[115].setRotationPoint(-49.0f, -8.0f, -7.5f);

		bodyModel[116] = new ModelRendererTurbo(this, 340, 9, textureX, textureY);
		bodyModel[116].addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[116].setRotationPoint(-50.0f, -9.0f, -8.5f);

		bodyModel[117] = new ModelRendererTurbo(this, 327, 9, textureX, textureY);
		bodyModel[117].addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[117].setRotationPoint(-50.5f, -7.9f, 5.5f);
		bodyModel[117].rotateAngleZ = 2.0594885f;

		bodyModel[118] = new ModelRendererTurbo(this, 314, 9, textureX, textureY);
		bodyModel[118].addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[118].setRotationPoint(-50.5f, -7.9f, -8.5f);
		bodyModel[118].rotateAngleZ = 2.0594885f;

		bodyModel[119] = new ModelRendererTurbo(this, 1980, 5, textureX, textureY);
		bodyModel[119].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[119].setRotationPoint(-45.0f, -10.0f, -5.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 1958, 5, textureX, textureY);
		bodyModel[120].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[120].setRotationPoint(-45.0f, -11.0f, -4.0f);

		bodyModel[121] = new ModelRendererTurbo(this, 1942, 5, textureX, textureY);
		bodyModel[121].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[121].setRotationPoint(-45.0f, -11.0f, -6.0f);

		bodyModel[122] = new ModelRendererTurbo(this, 202, 5, textureX, textureY);
		bodyModel[122].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[122].setRotationPoint(-45.0f, -12.0f, -6.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 1809, 3, textureX, textureY);
		bodyModel[123].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[123].setRotationPoint(-45.0f, -10.0f, -6.0f);

		bodyModel[124] = new ModelRendererTurbo(this, 1520, 3, textureX, textureY);
		bodyModel[124].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[124].setRotationPoint(-45.0f, -10.0f, -4.0f);

		bodyModel[125] = new ModelRendererTurbo(this, 859, 8, textureX, textureY);
		bodyModel[125].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[125].setRotationPoint(-45.0f, -8.0f, -2.0f);

		bodyModel[126] = new ModelRendererTurbo(this, 177, 9, textureX, textureY);
		bodyModel[126].addBox(0, 0, 0, 5, 1, 1, 0f);
		bodyModel[126].setRotationPoint(-42.0f, -12.0f, 6.0f);

		bodyModel[127] = new ModelRendererTurbo(this, 1360, 3, textureX, textureY);
		bodyModel[127].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[127].setRotationPoint(-42.0f, -12.0f, 5.0f);

		bodyModel[128] = new ModelRendererTurbo(this, 1351, 3, textureX, textureY);
		bodyModel[128].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[128].setRotationPoint(-42.0f, -12.0f, 7.0f);

		bodyModel[129] = new ModelRendererTurbo(this, 1318, 3, textureX, textureY);
		bodyModel[129].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[129].setRotationPoint(-42.0f, -13.0f, 6.0f);

		bodyModel[130] = new ModelRendererTurbo(this, 1272, 3, textureX, textureY);
		bodyModel[130].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[130].setRotationPoint(-42.0f, -11.0f, 6.0f);

		bodyModel[131] = new ModelRendererTurbo(this, 1239, 3, textureX, textureY);
		bodyModel[131].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[131].setRotationPoint(-42.0f, -13.0f, 7.0f);

		bodyModel[132] = new ModelRendererTurbo(this, 1157, 3, textureX, textureY);
		bodyModel[132].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[132].setRotationPoint(-42.0f, -11.0f, 7.0f);

		bodyModel[133] = new ModelRendererTurbo(this, 1119, 3, textureX, textureY);
		bodyModel[133].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[133].setRotationPoint(-42.0f, -13.0f, 5.0f);

		bodyModel[134] = new ModelRendererTurbo(this, 1091, 3, textureX, textureY);
		bodyModel[134].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[134].setRotationPoint(-42.0f, -11.0f, 5.0f);

		bodyModel[135] = new ModelRendererTurbo(this, 1202, 3, textureX, textureY);
		bodyModel[135].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[135].setRotationPoint(-41.0f, -16.0f, 4.0f);

		bodyModel[136] = new ModelRendererTurbo(this, 753, 3, textureX, textureY);
		bodyModel[136].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[136].setRotationPoint(-41.0f, -16.0f, 5.0f);

		bodyModel[137] = new ModelRendererTurbo(this, 709, 3, textureX, textureY);
		bodyModel[137].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[137].setRotationPoint(-41.0f, -16.0f, 3.0f);

		bodyModel[138] = new ModelRendererTurbo(this, 610, 3, textureX, textureY);
		bodyModel[138].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[138].setRotationPoint(-41.0f, -15.0f, 4.0f);

		bodyModel[139] = new ModelRendererTurbo(this, 1863, 0, textureX, textureY);
		bodyModel[139].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[139].setRotationPoint(-41.0f, -17.0f, 4.0f);

		bodyModel[140] = new ModelRendererTurbo(this, 670, 0, textureX, textureY);
		bodyModel[140].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[140].setRotationPoint(-41.0f, -17.0f, 5.0f);

		bodyModel[141] = new ModelRendererTurbo(this, 663, 0, textureX, textureY);
		bodyModel[141].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[141].setRotationPoint(-41.0f, -17.0f, 3.0f);

		bodyModel[142] = new ModelRendererTurbo(this, 609, 0, textureX, textureY);
		bodyModel[142].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[142].setRotationPoint(-41.0f, -15.0f, 3.0f);

		bodyModel[143] = new ModelRendererTurbo(this, 581, 0, textureX, textureY);
		bodyModel[143].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[143].setRotationPoint(-41.0f, -15.0f, 5.0f);

		bodyModel[144] = new ModelRendererTurbo(this, 1343, 3, textureX, textureY);
		bodyModel[144].addBox(0, 0, 0, 2, 2, 12, 0f);
		bodyModel[144].setRotationPoint(5.5f, 1.0f, -6.0f);

		bodyModel[145] = new ModelRendererTurbo(this, 1202, 3, textureX, textureY);
		bodyModel[145].addBox(0, 0, 0, 2, 2, 12, 0f);
		bodyModel[145].setRotationPoint(-7.5f, 1.0f, -6.0f);

		bodyModel[146] = new ModelRendererTurbo(this, 1165, 3, textureX, textureY);
		bodyModel[146].addBox(0, 0, 0, 2, 2, 12, 0f);
		bodyModel[146].setRotationPoint(-20.0f, 1.0f, -6.0f);

		bodyModel[147] = new ModelRendererTurbo(this, 1091, 7, textureX, textureY);
		bodyModel[147].addBox(0, 0, 0, 6, 7, 3, 0f);
		bodyModel[147].setRotationPoint(21.0f, -4.0f, -9.0f);

		bodyModel[148] = new ModelRendererTurbo(this, 1829, 6, textureX, textureY);
		bodyModel[148].addBox(0, 0, 0, 6, 7, 3, 0f);
		bodyModel[148].setRotationPoint(21.0f, -4.0f, 6.0f);

		bodyModel[149] = new ModelRendererTurbo(this, 1942, 10, textureX, textureY);
		bodyModel[149].flip = true;
		bodyModel[149].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[149].setRotationPoint(-19.0f, 4.0f, 7.0f);
		bodyModel[149].rotateAngleX = -1.5707964f;

		bodyModel[150] = new ModelRendererTurbo(this, 1778, 10, textureX, textureY);
		bodyModel[150].flip = true;
		bodyModel[150].addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4);
		bodyModel[150].setRotationPoint(3.0f, 4.0f, 8.0f);
		bodyModel[150].rotateAngleX = -1.5707964f;

		bodyModel[151] = new ModelRendererTurbo(this, 1618, 10, textureX, textureY);
		bodyModel[151].flip = true;
		bodyModel[151].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[151].setRotationPoint(19.0f, 4.0f, -6.0f);
		bodyModel[151].rotateAngleX = -1.5707964f;

		bodyModel[152] = new ModelRendererTurbo(this, 536, 10, textureX, textureY);
		bodyModel[152].flip = true;
		bodyModel[152].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[152].setRotationPoint(-19.0f, 4.0f, -6.0f);
		bodyModel[152].rotateAngleX = -1.5707964f;

		bodyModel[153] = new ModelRendererTurbo(this, 1154, 10, textureX, textureY);
		bodyModel[153].flip = true;
		bodyModel[153].addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4);
		bodyModel[153].setRotationPoint(3.0f, 4.0f, -6.0f);
		bodyModel[153].rotateAngleX = -1.5707964f;

		bodyModel[154] = new ModelRendererTurbo(this, 941, 12, textureX, textureY);
		bodyModel[154].flip = true;
		bodyModel[154].addCylinder(0, 0, 0, 2, 12, 16, 0.7f, 0.7f, 4);
		bodyModel[154].setRotationPoint(0.0f, -7.3f, 8.0f);
		bodyModel[154].rotateAngleZ = 1.5707964f;

		bodyModel[155] = new ModelRendererTurbo(this, 932, 12, textureX, textureY);
		bodyModel[155].flip = true;
		bodyModel[155].addCylinder(0, 0, 0, 2, 8, 16, 0.7f, 0.7f, 4);
		bodyModel[155].setRotationPoint(30.0f, -7.3f, 8.0f);
		bodyModel[155].rotateAngleZ = 1.5707964f;

		bodyModel[156] = new ModelRendererTurbo(this, 923, 12, textureX, textureY);
		bodyModel[156].flip = true;
		bodyModel[156].addCylinder(0, 0, 0, 2, 8, 16, 0.7f, 0.7f, 4);
		bodyModel[156].setRotationPoint(30.0f, -7.3f, -8.0f);
		bodyModel[156].rotateAngleZ = 1.5707964f;

		bodyModel[157] = new ModelRendererTurbo(this, 1980, 5, textureX, textureY);
		bodyModel[157].addShapeBox(0, 0, 0, 6, 2, 3, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[157].setRotationPoint(21.0f, -6.0f, -9.0f);

		bodyModel[158] = new ModelRendererTurbo(this, 1824, 9, textureX, textureY);
		bodyModel[158].flip = true;
		bodyModel[158].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[158].setRotationPoint(16.0f, 1.0f, -7.0f);
		bodyModel[158].rotateAngleX = -1.5707964f;

		bodyModel[159] = new ModelRendererTurbo(this, 1349, 9, textureX, textureY);
		bodyModel[159].flip = true;
		bodyModel[159].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[159].setRotationPoint(16.0f, 1.0f, 8.0f);
		bodyModel[159].rotateAngleX = -1.5707964f;

		bodyModel[160] = new ModelRendererTurbo(this, 463, 0, textureX, textureY);
		bodyModel[160].addShapeBox(0, 0, 0, 38, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[160].setRotationPoint(-19.0f, 3.0f, -6.5f);

		bodyModel[161] = new ModelRendererTurbo(this, 384, 0, textureX, textureY);
		bodyModel[161].addShapeBox(0, 0, 0, 38, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[161].setRotationPoint(-19.0f, 3.0f, 6.0f);

		bodyModel[162] = new ModelRendererTurbo(this, 914, 12, textureX, textureY);
		bodyModel[162].flip = true;
		bodyModel[162].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		bodyModel[162].setRotationPoint(24.0f, -4.0f, 7.0f);
		bodyModel[162].rotateAngleZ = 3.1415927f;

		bodyModel[163] = new ModelRendererTurbo(this, 905, 12, textureX, textureY);
		bodyModel[163].flip = true;
		bodyModel[163].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		bodyModel[163].setRotationPoint(24.0f, -6.4f, 7.0f);
		bodyModel[163].rotateAngleX = -0.29670596f;
		bodyModel[163].rotateAngleZ = 3.1415927f;

		bodyModel[164] = new ModelRendererTurbo(this, 896, 12, textureX, textureY);
		bodyModel[164].flip = true;
		bodyModel[164].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		bodyModel[164].setRotationPoint(24.0f, -6.4f, -7.0f);
		bodyModel[164].rotateAngleX = 0.29670596f;
		bodyModel[164].rotateAngleZ = 3.1415927f;

		bodyModel[165] = new ModelRendererTurbo(this, 1455, 8, textureX, textureY);
		bodyModel[165].addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[165].setRotationPoint(16.0f, 0.0f, 7.0f);

		bodyModel[166] = new ModelRendererTurbo(this, 1442, 8, textureX, textureY);
		bodyModel[166].addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[166].setRotationPoint(16.0f, 0.0f, -7.5f);

		bodyModel[167] = new ModelRendererTurbo(this, 1128, 3, textureX, textureY);
		bodyModel[167].addShapeBox(0, 0, 0, 13, 5, 1, 0, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3, 0, 0, 0, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, 0, 0);
		bodyModel[167].setRotationPoint(3.0f, 0.0f, 6.5f);

		bodyModel[168] = new ModelRendererTurbo(this, 1372, 8, textureX, textureY);
		bodyModel[168].addBox(0, 0, 0, 1, 3, 6, 0f);
		bodyModel[168].setRotationPoint(53.0f, 0.0f, -3.0f);

		bodyModel[169] = new ModelRendererTurbo(this, 596, 4, textureX, textureY);
		bodyModel[169].addBox(0, 0, 0, 1, 1, 6, 0f);
		bodyModel[169].setRotationPoint(53.0f, 5.0f, -3.0f);

		bodyModel[170] = new ModelRendererTurbo(this, 759, 8, textureX, textureY);
		bodyModel[170].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[170].setRotationPoint(53.0f, 3.0f, -3.0f);

		bodyModel[171] = new ModelRendererTurbo(this, 1887, 5, textureX, textureY);
		bodyModel[171].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[171].setRotationPoint(53.0f, 3.0f, 1.0f);

		bodyModel[172] = new ModelRendererTurbo(this, 795, 12, textureX, textureY);
		bodyModel[172].addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[172].setRotationPoint(53.0f, 0.0f, 3.0f);

		bodyModel[173] = new ModelRendererTurbo(this, 1052, 3, textureX, textureY);
		bodyModel[173].addShapeBox(0, 0, 0, 10, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[173].setRotationPoint(1.0f, -19.0f, -2.5f);

		bodyModel[174] = new ModelRendererTurbo(this, 304, 0, textureX, textureY);
		bodyModel[174].addShapeBox(0, 0, 0, 37, 3, 5, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[174].setRotationPoint(-36.0f, -19.0f, -2.5f);

		bodyModel[175] = new ModelRendererTurbo(this, 1861, 9, textureX, textureY);
		bodyModel[175].addBox(0, 0, 0, 1, 4, 1, 0f);
		bodyModel[175].setRotationPoint(-4.0f, -21.5f, -1.5f);

		bodyModel[176] = new ModelRendererTurbo(this, 729, 9, textureX, textureY);
		bodyModel[176].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[176].setRotationPoint(-4.0f, -20.5f, 0.0f);

		bodyModel[177] = new ModelRendererTurbo(this, 721, 9, textureX, textureY);
		bodyModel[177].flip = true;
		bodyModel[177].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[177].setRotationPoint(9.0f, -1.0f, 8.0f);
		bodyModel[177].rotateAngleX = -1.5707964f;

		bodyModel[178] = new ModelRendererTurbo(this, 528, 9, textureX, textureY);
		bodyModel[178].flip = true;
		bodyModel[178].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[178].setRotationPoint(4.0f, 1.0f, 8.0f);
		bodyModel[178].rotateAngleX = -1.5707964f;

		bodyModel[179] = new ModelRendererTurbo(this, 177, 0, textureX, textureY);
		bodyModel[179].addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[179].setRotationPoint(9.0f, -2.0f, -8.0f);

		bodyModel[180] = new ModelRendererTurbo(this, 383, 9, textureX, textureY);
		bodyModel[180].flip = true;
		bodyModel[180].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[180].setRotationPoint(9.0f, -1.0f, -7.0f);
		bodyModel[180].rotateAngleX = -1.5707964f;

		bodyModel[181] = new ModelRendererTurbo(this, 1360, 8, textureX, textureY);
		bodyModel[181].addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -1, 0, -1, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -1, 0, 0);
		bodyModel[181].setRotationPoint(4.0f, -1.0f, -8.5f);

		bodyModel[182] = new ModelRendererTurbo(this, 1417, 8, textureX, textureY);
		bodyModel[182].flip = true;
		bodyModel[182].addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 4);
		bodyModel[182].setRotationPoint(4.0f, 1.0f, -7.0f);
		bodyModel[182].rotateAngleX = -1.5707964f;

		bodyModel[183] = new ModelRendererTurbo(this, 1078, 3, textureX, textureY);
		bodyModel[183].addShapeBox(0, 0, 0, 2, 3, 1, 0, -1.5f, 0, 0, 0, -1, 0, 0, -1, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[183].setRotationPoint(2.0f, 1.0f, -7.5f);

		bodyModel[184] = new ModelRendererTurbo(this, 1172, 8, textureX, textureY);
		bodyModel[184].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[184].setRotationPoint(39.5f, 0.0f, -0.5f);

		bodyModel[185] = new ModelRendererTurbo(this, 786, 12, textureX, textureY);
		bodyModel[185].flip = true;
		bodyModel[185].addCylinder(0, 0, 0, 2, 3, 8, 1, 1, 4);
		bodyModel[185].setRotationPoint(43.0f, -20.0f, 0.0f);

		bodyModel[186] = new ModelRendererTurbo(this, 605, 4, textureX, textureY);
		bodyModel[186].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[186].setRotationPoint(25.0f, -18.0f, -5.5f);

		bodyModel[187] = new ModelRendererTurbo(this, 1041, 3, textureX, textureY);
		bodyModel[187].addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[187].setRotationPoint(23.0f, -18.0f, 5.5f);

		bodyModel[188] = new ModelRendererTurbo(this, 1013, 3, textureX, textureY);
		bodyModel[188].addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[188].setRotationPoint(15.0f, -18.0f, 5.5f);

		bodyModel[189] = new ModelRendererTurbo(this, 1003, 3, textureX, textureY);
		bodyModel[189].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[189].setRotationPoint(14.0f, -18.0f, 3.5f);

		bodyModel[190] = new ModelRendererTurbo(this, 971, 3, textureX, textureY);
		bodyModel[190].addShapeBox(0, 0, 0, 1, 3, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[190].setRotationPoint(14.0f, -18.0f, -5.5f);

		bodyModel[191] = new ModelRendererTurbo(this, 1593, 0, textureX, textureY);
		bodyModel[191].addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[191].setRotationPoint(15.0f, -18.0f, -6.5f);

		bodyModel[192] = new ModelRendererTurbo(this, 1495, 3, textureX, textureY);
		bodyModel[192].addBox(0, 0, 0, 10, 3, 2, 0f);
		bodyModel[192].setRotationPoint(15.0f, -18.0f, 3.5f);

		bodyModel[193] = new ModelRendererTurbo(this, 177, 3, textureX, textureY);
		bodyModel[193].addBox(0, 0, 0, 10, 3, 2, 0f);
		bodyModel[193].setRotationPoint(15.0f, -18.0f, -5.5f);

		bodyModel[194] = new ModelRendererTurbo(this, 1182, 6, textureX, textureY);
		bodyModel[194].addBox(0, 0, 0, 6, 4, 1, 0f);
		bodyModel[194].setRotationPoint(17.0f, -18.0f, 5.5f);

		bodyModel[195] = new ModelRendererTurbo(this, 1219, 3, textureX, textureY);
		bodyModel[195].addBox(0, 0, 0, 6, 4, 1, 0f);
		bodyModel[195].setRotationPoint(17.0f, -18.0f, -6.5f);

		bodyModel[196] = new ModelRendererTurbo(this, 859, 8, textureX, textureY);
		bodyModel[196].addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[196].setRotationPoint(14.0f, -19.0f, -3.5f);

		bodyModel[197] = new ModelRendererTurbo(this, 184, 12, textureX, textureY);
		bodyModel[197].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[197].setRotationPoint(15.0f, -19.0f, -5.5f);

		bodyModel[198] = new ModelRendererTurbo(this, 1182, 3, textureX, textureY);
		bodyModel[198].addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[198].setRotationPoint(17.0f, -19.0f, -6.5f);

		bodyModel[199] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
		bodyModel[199].addBox(0, 0, 0, 6, 1, 2, 0f);
		bodyModel[199].setRotationPoint(17.0f, -19.0f, -5.5f);

		bodyModel[200] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		bodyModel[200].addBox(0, 0, 0, 6, 1, 2, 0f);
		bodyModel[200].setRotationPoint(17.0f, -19.0f, 3.5f);

		bodyModel[201] = new ModelRendererTurbo(this, 1304, 10, textureX, textureY);
		bodyModel[201].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0);
		bodyModel[201].setRotationPoint(23.0f, -19.0f, 3.5f);

		bodyModel[202] = new ModelRendererTurbo(this, 747, 9, textureX, textureY);
		bodyModel[202].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[202].setRotationPoint(23.0f, -19.0f, -5.5f);

		bodyModel[203] = new ModelRendererTurbo(this, 356, 9, textureX, textureY);
		bodyModel[203].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[203].setRotationPoint(15.0f, -19.0f, -5.5f);

		bodyModel[204] = new ModelRendererTurbo(this, 1165, 3, textureX, textureY);
		bodyModel[204].addBox(0, 0, 0, 3, 2, 2, 0f);
		bodyModel[204].setRotationPoint(-60.0f, 1.0f, -1.0f);

		bodyModel[205] = new ModelRendererTurbo(this, 2042, 7, textureX, textureY);
		bodyModel[205].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[205].setRotationPoint(-28.0f, -2.0f, -4.0f);

		bodyModel[206] = new ModelRendererTurbo(this, 1427, 8, textureX, textureY);
		bodyModel[206].addBox(0, 0, 0, 1, 1, 3, 0f);
		bodyModel[206].setRotationPoint(-28.0f, -2.0f, 4.0f);

		bodyModel[207] = new ModelRendererTurbo(this, 1209, 6, textureX, textureY);
		bodyModel[207].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[207].setRotationPoint(-28.0f, -2.0f, 3.0f);

		bodyModel[208] = new ModelRendererTurbo(this, 1052, 3, textureX, textureY);
		bodyModel[208].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[208].setRotationPoint(-29.0f, -2.0f, 3.0f);

		bodyModel[209] = new ModelRendererTurbo(this, 1465, 0, textureX, textureY);
		bodyModel[209].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[209].setRotationPoint(-28.0f, -2.0f, 7.0f);

		bodyModel[210] = new ModelRendererTurbo(this, 1961, 5, textureX, textureY);
		bodyModel[210].addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0);
		bodyModel[210].setRotationPoint(-36.0f, -2.0f, 7.0f);

		bodyModel[211] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[211].addShapeBox(0, 0, 0, 7, 1, 1, 0, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[211].setRotationPoint(-43.0f, -1.0f, 7.0f);

		bodyModel[212] = new ModelRendererTurbo(this, 304, 0, textureX, textureY);
		bodyModel[212].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[212].setRotationPoint(-43.0f, -1.0f, 6.0f);

		bodyModel[213] = new ModelRendererTurbo(this, 1548, 0, textureX, textureY);
		bodyModel[213].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0);
		bodyModel[213].setRotationPoint(-36.0f, -3.0f, -7.0f);

		bodyModel[214] = new ModelRendererTurbo(this, 1942, 5, textureX, textureY);
		bodyModel[214].addShapeBox(0, 0, 0, 6, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1, 0, -0.5f, -1);
		bodyModel[214].setRotationPoint(21.0f, 3.0f, 6.0f);

		bodyModel[215] = new ModelRendererTurbo(this, 581, 0, textureX, textureY);
		bodyModel[215].addShapeBox(0, 0, 0, 12, 0, 3, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0);
		bodyModel[215].setRotationPoint(-39.0f, -16.0f, -10.0f);
		bodyModel[215].rotateAngleX = -0.87266463f;
		bodyModel[215].rotateAngleY = 3.1415927f;

		bodyModel[216] = new ModelRendererTurbo(this, 1110, 7, textureX, textureY);
		bodyModel[216].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[216].setRotationPoint(35.0f, -21.4f, -2.5f);

		bodyModel[217] = new ModelRendererTurbo(this, 650, 4, textureX, textureY);
		bodyModel[217].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[217].setRotationPoint(37.0f, -20.4f, -1.5f);
		bodyModel[217].rotateAngleY = -1.5707964f;

		bodyModel[218] = new ModelRendererTurbo(this, 1412, 0, textureX, textureY);
		bodyModel[218].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[218].setRotationPoint(37.0f, -20.4f, 1.5f);
		bodyModel[218].rotateAngleY = -3.1415927f;

		bodyModel[219] = new ModelRendererTurbo(this, 650, 0, textureX, textureY);
		bodyModel[219].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[219].setRotationPoint(34.0f, -20.4f, 1.5f);
		bodyModel[219].rotateAngleY = -4.712389f;

		bodyModel[220] = new ModelRendererTurbo(this, 1381, 8, textureX, textureY);
		bodyModel[220].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[220].setRotationPoint(35.0f, -21.4f, -2.5f);

		bodyModel[221] = new ModelRendererTurbo(this, 1118, 6, textureX, textureY);
		bodyModel[221].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f);
		bodyModel[221].setRotationPoint(35.0f, -21.4f, 1.5f);

		bodyModel[222] = new ModelRendererTurbo(this, 663, 0, textureX, textureY);
		bodyModel[222].addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[222].setRotationPoint(46.0f, -19.0f, 2.0f);

		bodyModel[223] = new ModelRendererTurbo(this, 536, 4, textureX, textureY);
		bodyModel[223].addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -1, -1, 0, -1, -1);
		bodyModel[223].setRotationPoint(46.0f, -16.0f, 6.0f);

		flipAll();
	}

}
