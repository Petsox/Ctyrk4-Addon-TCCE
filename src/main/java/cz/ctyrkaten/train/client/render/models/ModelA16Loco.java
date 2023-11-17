//FMT-Marker DFM-1.0
//Creator: Unregistered Account

package cz.ctyrkaten.train.client.render.models;


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelA16Loco extends ModelConverter {

	private int textureX = 1024;
	private int textureY = 1024;

	public ModelA16Loco(){
		bodyModel = new ModelRendererTurbo[98];
		barrelModel = new ModelRendererTurbo[94];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 0, 29, textureX, textureY);
		bodyModel[0].addBox(0, 0, 0, 24, 1, 24, 0f);
		bodyModel[0].setRotationPoint(-80.0f, -3.0f, -12.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 102, 111, textureX, textureY);
		bodyModel[1].addBox(0, 0, 0, 24, 16, 1, 0f);
		bodyModel[1].setRotationPoint(-80.0f, -19.0f, -12.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 221, 208, textureX, textureY);
		bodyModel[2].addBox(0, 0, 0, 5, 7, 1, 0f);
		bodyModel[2].setRotationPoint(-80.0f, -26.0f, -12.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 121, 103, textureX, textureY);
		bodyModel[3].addShapeBox(0, 0, 0, 24, 2, 5, 0, 0, -2, 0, 0, -2, 0, 0, 1, 0, 0, 1, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -2, 0);
		bodyModel[3].setRotationPoint(-80.0f, -28.0f, -12.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 197, 10, textureX, textureY);
		bodyModel[4].addShapeBox(0, 0, 0, 24, 2, 5, 0, 0, 1, 0, 0, 1, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[4].setRotationPoint(-80.0f, -28.0f, 7.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 63, 98, textureX, textureY);
		bodyModel[5].addShapeBox(0, 0, 0, 24, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(-80.0f, -30.0f, 0.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 0, 98, textureX, textureY);
		bodyModel[6].addShapeBox(0, 0, 0, 24, 2, 7, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0);
		bodyModel[6].setRotationPoint(-80.0f, -30.0f, -7.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 256, 0, textureX, textureY);
		bodyModel[7].flip = true;
		bodyModel[7].addCylinder(0, 0, 0, 11, 116, 12, 1, 1, 4);
		bodyModel[7].setRotationPoint(-56.0f, -18.0f, 0.0f);
		bodyModel[7].rotateAngleZ = 1.5707964f;

		bodyModel[8] = new ModelRendererTurbo(this, 229, 197, textureX, textureY);
		bodyModel[8].addShapeBox(0, 0, 0, 105, 7, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -7, 0, 0, -7, 0, 0, -7, 0, 0, -7, 0);
		bodyModel[8].setRotationPoint(-56.0f, -14.0f, -13.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 30, 147, textureX, textureY);
		bodyModel[9].addShapeBox(0, 0, 0, 12, 12, 5, 0, 0, 0, 0, 0, -14, 0, 0, -14, 0, 0, 0, 0, 0, -12, 0, 0, 2, 0, 0, 2, 0, 0, -12, 0);
		bodyModel[9].setRotationPoint(49.0f, -14.0f, -13.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 91, 70, textureX, textureY);
		bodyModel[10].addBox(0, 0, 0, 8, 1, 26, 0f);
		bodyModel[10].setRotationPoint(57.0f, 0.0f, -13.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 117, 157, textureX, textureY);
		bodyModel[11].addShapeBox(0, 0, 0, 3, 8, 13, 0, 0, -8, 0, -3, -8, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[11].setRotationPoint(65.0f, 0.0f, -13.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 201, 77, textureX, textureY);
		bodyModel[12].addBox(0, 0, 0, 1, 7, 26, 0f);
		bodyModel[12].setRotationPoint(64.0f, 1.0f, -13.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 0, 55, textureX, textureY);
		bodyModel[13].addShapeBox(0, 0, 0, 23, 20, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -8, 0, 1, -8, 0, 1, 0, 0, 1);
		bodyModel[13].setRotationPoint(-56.0f, -18.0f, -11.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 154, 67, textureX, textureY);
		bodyModel[14].addShapeBox(0, 0, 0, 12, 4, 24, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, -4, -0.2f, 0, 0, 0, 0, 0, 0, 0, -4, -0.2f);
		bodyModel[14].setRotationPoint(-68.0f, -2.0f, -12.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 23, 203, textureX, textureY);
		bodyModel[15].addBox(0, 0, 0, 8, 8, 0, 0f);
		bodyModel[15].setRotationPoint(54.0f, 2.0f, -6.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 171, 192, textureX, textureY);
		bodyModel[16].addBox(0, 0, 0, 14, 14, 0, 0f);
		bodyModel[16].setRotationPoint(30.0f, -4.0f, -6.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 114, 194, textureX, textureY);
		bodyModel[17].addShapeBox(0, 0, 0, 12, 14, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -12, 0, 0, 0, 0, 0, 0, 0, 0, -12, 0, 0);
		bodyModel[17].setRotationPoint(49.0f, -14.0f, -13.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 76, 145, textureX, textureY);
		bodyModel[18].addBox(0, 0, 0, 16, 14, 1, 0f);
		bodyModel[18].setRotationPoint(46.0f, -28.0f, -13.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 70, 147, textureX, textureY);
		bodyModel[19].addBox(0, 0, 0, 1, 14, 1, 0f);
		bodyModel[19].setRotationPoint(61.0f, -14.0f, -13.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 127, 210, textureX, textureY);
		bodyModel[20].addShapeBox(0, 0, 0, 1, 28, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[20].setRotationPoint(62.0f, -28.0f, -13.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 100, 209, textureX, textureY);
		bodyModel[21].addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[21].setRotationPoint(44.0f, -28.0f, -13.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 243, 208, textureX, textureY);
		bodyModel[22].addShapeBox(0, 0, 0, 3, 13, 1, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(41.0f, -27.0f, -13.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 202, 163, textureX, textureY);
		bodyModel[23].addShapeBox(0, 0, 0, 4, 9, 1, 0, 0, -9, 0, 0, 0, 0, 0, 0, 0, 0, -9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[23].setRotationPoint(37.0f, -23.0f, -13.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 200, 196, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 1, 26, 9, 0, 0, 0, 0, 0, 0, 0, 0, -7, -3, 0, -7, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3);
		bodyModel[24].setRotationPoint(-57.0f, -29.0f, 5.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 158, 201, textureX, textureY);
		bodyModel[25].addShapeBox(0, 0, 0, 1, 26, 6, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[25].setRotationPoint(-57.0f, -29.0f, -11.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 0, 195, textureX, textureY);
		bodyModel[26].addBox(0, 0, 0, 1, 26, 10, 0f);
		bodyModel[26].setRotationPoint(-57.0f, -29.0f, -5.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 121, 21, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 33, 11, 20, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(-22.0f, -28.0f, -10.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 83, 53, textureX, textureY);
		bodyModel[28].addShapeBox(0, 0, 0, 33, 1, 14, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[28].setRotationPoint(-22.0f, -29.0f, -7.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 164, 53, textureX, textureY);
		bodyModel[29].addShapeBox(0, 0, 0, 33, 1, 12, 0, 0, 0, -6, 0, 0, -6, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[29].setRotationPoint(-22.0f, -30.0f, -6.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 31, 115, textureX, textureY);
		bodyModel[30].addShapeBox(0, 0, 0, 2, 11, 20, 0, 0, 0, -3, 0, 0, -4, 0, 0, -4, 0, 0, -3, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0);
		bodyModel[30].setRotationPoint(11.0f, -28.0f, -10.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 76, 115, textureX, textureY);
		bodyModel[31].addShapeBox(0, 0, 0, 1, 11, 18, 0, 0, 0, -3, 0, 0, -5.3f, 0, 0, -5.3f, 0, 0, -3, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0);
		bodyModel[31].setRotationPoint(13.0f, -28.0f, -9.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 162, 154, textureX, textureY);
		bodyModel[32].addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, -1, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0);
		bodyModel[32].setRotationPoint(11.0f, -29.0f, -7.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 228, 39, textureX, textureY);
		bodyModel[33].addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, -1, 0, 0, -6, 0, 0, -6, 0, 0, -1, 0, 0, 0, 0, 0, -2.3f, 0, 0, -2.3f, 0, 0, 0);
		bodyModel[33].setRotationPoint(13.0f, -29.0f, -6.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 58, 188, textureX, textureY);
		bodyModel[34].addShapeBox(0, 0, 0, 2, 1, 12, 0, 0, 0, -6, 0, -0.3f, -6, 0, -0.3f, -6, 0, 0, -6, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0);
		bodyModel[34].setRotationPoint(11.0f, -30.0f, -6.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 203, 74, textureX, textureY);
		bodyModel[35].addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, -0.3f, -5, 0, -1, -5, 0, -1, -5, 0, -0.3f, -5, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0);
		bodyModel[35].setRotationPoint(13.0f, -30.0f, -5.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 207, 111, textureX, textureY);
		bodyModel[36].addShapeBox(0, 0, 0, 3, 11, 20, 0, 0, 0, -10, 0, 0, -3, 0, 0, -3, 0, 0, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[36].setRotationPoint(-25.0f, -28.0f, -10.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 220, 143, textureX, textureY);
		bodyModel[37].addShapeBox(0, 0, 0, 3, 1, 14, 0, 0, 0, -7, 0, 0, -1, 0, 0, -1, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0, 0, 0, 0, -7);
		bodyModel[37].setRotationPoint(-25.0f, -29.0f, -7.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 183, 163, textureX, textureY);
		bodyModel[38].addShapeBox(0, 0, 0, 3, 1, 12, 0, 0, -1, -6, 0, 0, -6, 0, 0, -6, 0, -1, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6);
		bodyModel[38].setRotationPoint(-25.0f, -30.0f, -6.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[39].addBox(0, 0, 0, 88, 10, 10, 0f);
		bodyModel[39].setRotationPoint(-43.0f, -3.0f, -5.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 186, 207, textureX, textureY);
		bodyModel[40].addBox(0, 0, 0, 3, 5, 3, 0f);
		bodyModel[40].setRotationPoint(-27.0f, -8.0f, -1.5f);

		bodyModel[41] = new ModelRendererTurbo(this, 185, 143, textureX, textureY);
		bodyModel[41].addBox(0, 0, 0, 10, 12, 7, 0f);
		bodyModel[41].setRotationPoint(45.0f, -5.0f, -12.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
		bodyModel[42].addShapeBox(0, 0, 0, 10, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[42].setRotationPoint(45.0f, -6.0f, 5.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 143, 154, textureX, textureY);
		bodyModel[43].addShapeBox(0, 0, 0, 10, 1, 6, 0, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[43].setRotationPoint(45.0f, -7.0f, -11.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 0, 126, textureX, textureY);
		bodyModel[44].addShapeBox(0, 0, 0, 10, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1);
		bodyModel[44].setRotationPoint(45.0f, 7.0f, 5.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 173, 207, textureX, textureY);
		bodyModel[45].addBox(0, 0, 0, 3, 12, 3, 0f);
		bodyModel[45].setRotationPoint(48.5f, -13.0f, 3.0f);
		bodyModel[45].rotateAngleX = 0.5061455f;

		bodyModel[46] = new ModelRendererTurbo(this, 40, 203, textureX, textureY);
		bodyModel[46].addBox(0, 0, 0, 3, 11, 3, 0f);
		bodyModel[46].setRotationPoint(48.5f, -14.4f, -5.6f);
		bodyModel[46].rotateAngleX = -0.5061455f;

		bodyModel[47] = new ModelRendererTurbo(this, 35, 126, textureX, textureY);
		bodyModel[47].addBox(0, 0, 0, 1, 2, 6, 0f);
		bodyModel[47].setRotationPoint(54.0f, -30.0f, -3.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 203, 86, textureX, textureY);
		bodyModel[48].addBox(0, 0, 0, 6, 3, 1, 0f);
		bodyModel[48].setRotationPoint(47.0f, -30.0f, -5.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 13, 195, textureX, textureY);
		bodyModel[49].addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, -1);
		bodyModel[49].setRotationPoint(53.0f, -30.0f, -5.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 0, 195, textureX, textureY);
		bodyModel[50].addShapeBox(0, 0, 0, 2, 3, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		bodyModel[50].setRotationPoint(45.0f, -30.0f, -5.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 9, 174, textureX, textureY);
		bodyModel[51].addShapeBox(0, 0, 0, 2, 3, 2, 0, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1);
		bodyModel[51].setRotationPoint(53.0f, -30.0f, 3.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 0, 174, textureX, textureY);
		bodyModel[52].addShapeBox(0, 0, 0, 2, 3, 2, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2);
		bodyModel[52].setRotationPoint(45.0f, -30.0f, 3.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 160, 103, textureX, textureY);
		bodyModel[53].addBox(0, 0, 0, 3, 12, 20, 0f);
		bodyModel[53].setRotationPoint(60.5f, -13.0f, -10.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 9, 49, textureX, textureY);
		bodyModel[54].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[54].setRotationPoint(60.5f, -12.0f, -12.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 0, 49, textureX, textureY);
		bodyModel[55].addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[55].setRotationPoint(60.5f, -3.0f, 10.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 122, 210, textureX, textureY);
		bodyModel[56].addShapeBox(0, 0, 0, 1, 27, 1, 0, 0, 0.5f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[56].setRotationPoint(63.0f, -27.0f, -13.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 117, 210, textureX, textureY);
		bodyModel[57].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0.7f, 0, 0, -1, 0, 0, -1, 0, 0, 0.7f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(64.0f, -26.0f, -13.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 216, 74, textureX, textureY);
		bodyModel[58].addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[58].setRotationPoint(-50.0f, 3.0f, 6.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 51, 108, textureX, textureY);
		bodyModel[59].addShapeBox(0, 0, 0, 24, 5, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[59].setRotationPoint(-74.0f, 3.0f, -7.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 200, 194, textureX, textureY);
		bodyModel[60].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1, -1, 0, 0);
		bodyModel[60].setRotationPoint(-76.0f, 4.0f, -7.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 92, 69, textureX, textureY);
		bodyModel[61].addBox(0, 0, 0, 1, 4, 10, 0f);
		bodyModel[61].setRotationPoint(-76.0f, 4.0f, -5.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 75, 188, textureX, textureY);
		bodyModel[62].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, -1, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, -2, 0, 0, 0);
		bodyModel[62].setRotationPoint(-46.0f, 4.0f, 5.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 0, 29, textureX, textureY);
		bodyModel[63].addBox(0, 0, 0, 1, 4, 10, 0f);
		bodyModel[63].setRotationPoint(-45.0f, 4.0f, -5.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 56, 202, textureX, textureY);
		bodyModel[64].addBox(0, 0, 0, 6, 6, 2, 0f);
		bodyModel[64].setRotationPoint(-56.0f, 3.0f, 6.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 225, 184, textureX, textureY);
		bodyModel[65].addBox(0, 0, 0, 2, 2, 12, 0f);
		bodyModel[65].setRotationPoint(-54.0f, 5.0f, -6.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 220, 151, textureX, textureY);
		bodyModel[66].addShapeBox(0, 0, 0, 4, 3, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[66].setRotationPoint(-55.0f, 4.0f, -10.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 187, 5, textureX, textureY);
		bodyModel[67].addBox(0, 0, 0, 30, 2, 2, 0f);
		bodyModel[67].setRotationPoint(-75.0f, 5.0f, 2.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 137, 162, textureX, textureY);
		bodyModel[68].addBox(0, 0, 0, 2, 2, 4, 0f);
		bodyModel[68].setRotationPoint(-61.5f, 5.0f, -2.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 230, 83, textureX, textureY);
		bodyModel[69].addBox(0, 0, 0, 1, 5, 1, 0f);
		bodyModel[69].setRotationPoint(-61.0f, 0.0f, -0.5f);

		bodyModel[70] = new ModelRendererTurbo(this, 0, 60, textureX, textureY);
		bodyModel[70].addBox(0, 0, 0, 8, 2, 2, 0f);
		bodyModel[70].setRotationPoint(37.0f, -1.0f, 6.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 105, 69, textureX, textureY);
		bodyModel[71].addBox(0, 0, 0, 3, 3, 2, 0f);
		bodyModel[71].setRotationPoint(37.0f, 1.0f, 6.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
		bodyModel[72].addShapeBox(0, 0, 0, 69, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[72].setRotationPoint(-35.0f, 4.0f, 6.0f);

		bodyModel[73] = new ModelRendererTurbo(this, 160, 96, textureX, textureY);
		bodyModel[73].addShapeBox(0, 0, 0, 30, 5, 1, 0, 0, -3.5f, 0, 0, -1, 0, 0, -1, 0, 0, -3.5f, 0, 0, -0.5f, 0, 0, -3, 0, 0, -3, 0, 0, -0.5f, 0);
		bodyModel[73].setRotationPoint(7.0f, 1.0f, 7.0f);

		bodyModel[74] = new ModelRendererTurbo(this, 0, 158, textureX, textureY);
		bodyModel[74].addBox(0, 0, 0, 4, 4, 2, 0f);
		bodyModel[74].setRotationPoint(7.0f, 2.0f, 6.5f);
		bodyModel[74].rotateAngleZ = -0.43633232f;

		bodyModel[75] = new ModelRendererTurbo(this, 159, 162, textureX, textureY);
		bodyModel[75].flip = true;
		bodyModel[75].addCylinder(0, 0, 0, 2, 1, 8, 0.7f, 0.7f, 4);
		bodyModel[75].setRotationPoint(34.0f, 5.0f, 6.0f);
		bodyModel[75].rotateAngleY = -1.5707964f;
		bodyModel[75].rotateAngleZ = 1.5707964f;

		bodyModel[76] = new ModelRendererTurbo(this, 108, 48, textureX, textureY);
		bodyModel[76].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0, 0, -1.2f, 0, -1, 0, 0, -1, 0, 0, 0, -1.2f, 0);
		bodyModel[76].setRotationPoint(8.0f, 4.0f, 8.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 134, 69, textureX, textureY);
		bodyModel[77].addShapeBox(0, 0, 0, 20, 10, 1, 0, 0, -9, 0, -1, 0, 0, -1, 0, 0, 0, -9, 0, 0, 0, 0, 0, -10, 0, 0, -10, 0, 0, 0, 0);
		bodyModel[77].setRotationPoint(10.0f, -3.0f, 8.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 73, 48, textureX, textureY);
		bodyModel[78].addShapeBox(0, 0, 0, 16, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[78].setRotationPoint(29.0f, -4.0f, 8.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 248, 27, textureX, textureY);
		bodyModel[79].flip = true;
		bodyModel[79].addCylinder(0, 0, 0, 1, 1, 8, 0.6f, 0.6f, 4);
		bodyModel[79].setRotationPoint(29.8f, -3.2f, 8.0f);
		bodyModel[79].rotateAngleY = -1.5707964f;
		bodyModel[79].rotateAngleZ = 1.5707964f;

		bodyModel[80] = new ModelRendererTurbo(this, 97, 115, textureX, textureY);
		bodyModel[80].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[80].setRotationPoint(-68.0f, -26.0f, 11.25f);

		bodyModel[81] = new ModelRendererTurbo(this, 112, 210, textureX, textureY);
		bodyModel[81].flip = true;
		bodyModel[81].addCylinder(0, 0, 0, 1, 20, 8, 1.5f, 1.5f, 4);
		bodyModel[81].setRotationPoint(-9.0f, -12.5f, 11.5f);
		bodyModel[81].rotateAngleZ = 1.5707964f;

		bodyModel[82] = new ModelRendererTurbo(this, 208, 27, textureX, textureY);
		bodyModel[82].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[82].setRotationPoint(36.0f, -31.2f, -0.5f);

		bodyModel[83] = new ModelRendererTurbo(this, 228, 46, textureX, textureY);
		bodyModel[83].addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[83].setRotationPoint(35.0f, -31.2f, 0.5f);

		bodyModel[84] = new ModelRendererTurbo(this, 13, 35, textureX, textureY);
		bodyModel[84].addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[84].setRotationPoint(35.0f, -31.2f, -1.5f);

		bodyModel[85] = new ModelRendererTurbo(this, 248, 18, textureX, textureY);
		bodyModel[85].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[85].setRotationPoint(35.0f, -31.2f, -0.5f);

		bodyModel[86] = new ModelRendererTurbo(this, 251, 4, textureX, textureY);
		bodyModel[86].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[86].setRotationPoint(36.0f, -30.0f, -0.5f);

		bodyModel[87] = new ModelRendererTurbo(this, 241, 83, textureX, textureY);
		bodyModel[87].addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0);
		bodyModel[87].setRotationPoint(36.0f, -32.0f, -3.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 51, 151, textureX, textureY);
		bodyModel[88].addShapeBox(0, 0, 0, 2, 22, 14, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[88].setRotationPoint(-59.0f, -25.0f, -7.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 230, 83, textureX, textureY);
		bodyModel[89].addBox(0, 0, 0, 1, 8, 8, 0f);
		bodyModel[89].setRotationPoint(-60.0f, -14.0f, -4.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 93, 209, textureX, textureY);
		bodyModel[90].addShapeBox(0, 0, 0, 2, 13, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[90].setRotationPoint(-61.0f, -16.0f, -5.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 163, 113, textureX, textureY);
		bodyModel[91].addBox(0, 0, 0, 1, 1, 7, 0f);
		bodyModel[91].setRotationPoint(-60.0f, -17.0f, -5.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 173, 111, textureX, textureY);
		bodyModel[92].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[92].setRotationPoint(-60.0f, -24.0f, 1.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 249, 91, textureX, textureY);
		bodyModel[93].addBox(0, 0, 0, 1, 10, 1, 0f);
		bodyModel[93].setRotationPoint(-60.0f, -13.0f, 5.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 208, 27, textureX, textureY);
		bodyModel[94].addBox(0, 0, 0, 17, 3, 5, 0f);
		bodyModel[94].setRotationPoint(-74.0f, -6.0f, 6.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 0, 71, textureX, textureY);
		bodyModel[95].addBox(0, 0, 0, 4, 1, 4, 0f);
		bodyModel[95].setRotationPoint(-70.5f, -13.0f, 6.5f);

		bodyModel[96] = new ModelRendererTurbo(this, 73, 202, textureX, textureY);
		bodyModel[96].addShapeBox(0, 0, 0, 2, 7, 4, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[96].setRotationPoint(-72.3f, -19.0f, 6.5f);

		bodyModel[97] = new ModelRendererTurbo(this, 230, 74, textureX, textureY);
		bodyModel[97].addBox(0, 0, 0, 8, 4, 4, 0f);
		bodyModel[97].setRotationPoint(-86.0f, -2.5f, -2.0f);

		barrelModel[0] = new ModelRendererTurbo(this, 0, 108, textureX, textureY);
		barrelModel[0].addBox(0, 0, 0, 24, 16, 1, 0f);
		barrelModel[0].setRotationPoint(-80.0f, -19.0f, 11.0f);

		barrelModel[1] = new ModelRendererTurbo(this, 242, 184, textureX, textureY);
		barrelModel[1].addBox(0, 0, 0, 5, 7, 1, 0f);
		barrelModel[1].setRotationPoint(-61.0f, -26.0f, -12.0f);

		barrelModel[2] = new ModelRendererTurbo(this, 243, 175, textureX, textureY);
		barrelModel[2].addBox(0, 0, 0, 5, 7, 1, 0f);
		barrelModel[2].setRotationPoint(-61.0f, -26.0f, 11.0f);

		barrelModel[3] = new ModelRendererTurbo(this, 243, 166, textureX, textureY);
		barrelModel[3].addBox(0, 0, 0, 5, 7, 1, 0f);
		barrelModel[3].setRotationPoint(-80.0f, -26.0f, 11.0f);

		barrelModel[4] = new ModelRendererTurbo(this, 58, 188, textureX, textureY);
		barrelModel[4].flip = true;
		barrelModel[4].addCylinder(0, 0, 0, 2, 3, 12, 1, 1, 4);
		barrelModel[4].setRotationPoint(60.0f, -25.0f, 0.0f);
		barrelModel[4].rotateAngleZ = 1.5707964f;

		barrelModel[5] = new ModelRendererTurbo(this, 150, 136, textureX, textureY);
		barrelModel[5].addShapeBox(0, 0, 0, 12, 12, 5, 0, 0, 0, 0, 0, -14, 0, 0, -14, 0, 0, 0, 0, 0, -12, 0, 0, 2, 0, 0, 2, 0, 0, -12, 0);
		barrelModel[5].setRotationPoint(49.0f, -14.0f, 8.0f);

		barrelModel[6] = new ModelRendererTurbo(this, 0, 152, textureX, textureY);
		barrelModel[6].addShapeBox(0, 0, 0, 3, 8, 13, 0, 0, 0, 0, -3, 0, 0, -3, -8, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0);
		barrelModel[6].setRotationPoint(65.0f, 0.0f, 0.0f);

		barrelModel[7] = new ModelRendererTurbo(this, 141, 200, textureX, textureY);
		barrelModel[7].addBox(0, 0, 0, 8, 8, 0, 0f);
		barrelModel[7].setRotationPoint(54.0f, 2.0f, 6.0f);

		barrelModel[8] = new ModelRendererTurbo(this, 38, 180, textureX, textureY);
		barrelModel[8].flip = true;
		barrelModel[8].addCylinder(0, 0, 0, 2, 3, 12, 1, 1, 4);
		barrelModel[8].setRotationPoint(50.0f, -25.0f, 0.0f);
		barrelModel[8].rotateAngleZ = 1.5707964f;

		barrelModel[9] = new ModelRendererTurbo(this, 29, 188, textureX, textureY);
		barrelModel[9].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[9].setRotationPoint(13.0f, -4.0f, -6.0f);

		barrelModel[10] = new ModelRendererTurbo(this, 142, 185, textureX, textureY);
		barrelModel[10].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[10].setRotationPoint(-4.0f, -4.0f, -6.0f);

		barrelModel[11] = new ModelRendererTurbo(this, 208, 181, textureX, textureY);
		barrelModel[11].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[11].setRotationPoint(-21.0f, -4.0f, -6.0f);

		barrelModel[12] = new ModelRendererTurbo(this, 0, 180, textureX, textureY);
		barrelModel[12].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[12].setRotationPoint(-38.0f, -4.0f, -6.0f);

		barrelModel[13] = new ModelRendererTurbo(this, 113, 179, textureX, textureY);
		barrelModel[13].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[13].setRotationPoint(30.0f, -4.0f, 6.0f);

		barrelModel[14] = new ModelRendererTurbo(this, 179, 177, textureX, textureY);
		barrelModel[14].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[14].setRotationPoint(13.0f, -4.0f, 6.0f);

		barrelModel[15] = new ModelRendererTurbo(this, 84, 173, textureX, textureY);
		barrelModel[15].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[15].setRotationPoint(-4.0f, -4.0f, 6.0f);

		barrelModel[16] = new ModelRendererTurbo(this, 150, 170, textureX, textureY);
		barrelModel[16].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[16].setRotationPoint(-21.0f, -4.0f, 6.0f);

		barrelModel[17] = new ModelRendererTurbo(this, 214, 166, textureX, textureY);
		barrelModel[17].addBox(0, 0, 0, 14, 14, 0, 0f);
		barrelModel[17].setRotationPoint(-38.0f, -4.0f, 6.0f);

		barrelModel[18] = new ModelRendererTurbo(this, 238, 199, textureX, textureY);
		barrelModel[18].addBox(0, 0, 0, 8, 8, 0, 0f);
		barrelModel[18].setRotationPoint(-72.0f, 2.0f, 6.0f);

		barrelModel[19] = new ModelRendererTurbo(this, 221, 199, textureX, textureY);
		barrelModel[19].addBox(0, 0, 0, 8, 8, 0, 0f);
		barrelModel[19].setRotationPoint(-57.0f, 2.0f, 6.0f);

		barrelModel[20] = new ModelRendererTurbo(this, 234, 120, textureX, textureY);
		barrelModel[20].addBox(0, 0, 0, 8, 8, 0, 0f);
		barrelModel[20].setRotationPoint(-57.0f, 2.0f, -6.0f);

		barrelModel[21] = new ModelRendererTurbo(this, 207, 120, textureX, textureY);
		barrelModel[21].addBox(0, 0, 0, 8, 8, 0, 0f);
		barrelModel[21].setRotationPoint(-72.0f, 2.0f, -6.0f);

		barrelModel[22] = new ModelRendererTurbo(this, 38, 165, textureX, textureY);
		barrelModel[22].flip = true;
		barrelModel[22].addCylinder(0, 0, 0, 3, 5, 12, 1, 1, 4);
		barrelModel[22].setRotationPoint(60.0f, -18.0f, 0.0f);
		barrelModel[22].rotateAngleZ = 1.5707964f;

		barrelModel[23] = new ModelRendererTurbo(this, 87, 193, textureX, textureY);
		barrelModel[23].addShapeBox(0, 0, 0, 12, 14, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -12, 0, 0, 0, 0, 0, 0, 0, 0, -12, 0, 0);
		barrelModel[23].setRotationPoint(49.0f, -14.0f, 12.0f);

		barrelModel[24] = new ModelRendererTurbo(this, 56, 115, textureX, textureY);
		barrelModel[24].addBox(0, 0, 0, 16, 14, 1, 0f);
		barrelModel[24].setRotationPoint(46.0f, -28.0f, 12.0f);

		barrelModel[25] = new ModelRendererTurbo(this, 251, 111, textureX, textureY);
		barrelModel[25].addBox(0, 0, 0, 1, 14, 1, 0f);
		barrelModel[25].setRotationPoint(61.0f, -14.0f, 12.0f);

		barrelModel[26] = new ModelRendererTurbo(this, 150, 209, textureX, textureY);
		barrelModel[26].addShapeBox(0, 0, 0, 1, 28, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[26].setRotationPoint(62.0f, -28.0f, 12.0f);

		barrelModel[27] = new ModelRendererTurbo(this, 86, 209, textureX, textureY);
		barrelModel[27].addShapeBox(0, 0, 0, 2, 14, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[27].setRotationPoint(44.0f, -28.0f, 12.0f);

		barrelModel[28] = new ModelRendererTurbo(this, 234, 208, textureX, textureY);
		barrelModel[28].addShapeBox(0, 0, 0, 3, 13, 1, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[28].setRotationPoint(41.0f, -27.0f, 12.0f);

		barrelModel[29] = new ModelRendererTurbo(this, 164, 53, textureX, textureY);
		barrelModel[29].addShapeBox(0, 0, 0, 4, 9, 1, 0, 0, -9, 0, 0, 0, 0, 0, 0, 0, 0, -9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[29].setRotationPoint(37.0f, -23.0f, 12.0f);

		barrelModel[30] = new ModelRendererTurbo(this, 0, 149, textureX, textureY);
		barrelModel[30].addBox(0, 0, 0, 3, 5, 3, 0f);
		barrelModel[30].setRotationPoint(35.0f, -8.0f, -1.5f);

		barrelModel[31] = new ModelRendererTurbo(this, 115, 129, textureX, textureY);
		barrelModel[31].addBox(0, 0, 0, 10, 12, 7, 0f);
		barrelModel[31].setRotationPoint(45.0f, -5.0f, 5.0f);

		barrelModel[32] = new ModelRendererTurbo(this, 187, 111, textureX, textureY);
		barrelModel[32].addShapeBox(0, 0, 0, 10, 1, 7, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[32].setRotationPoint(45.0f, -6.0f, -12.0f);

		barrelModel[33] = new ModelRendererTurbo(this, 116, 149, textureX, textureY);
		barrelModel[33].addShapeBox(0, 0, 0, 10, 1, 6, 0, 0, 0, -1, 0, 0, -1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[33].setRotationPoint(45.0f, -7.0f, 5.0f);

		barrelModel[34] = new ModelRendererTurbo(this, 134, 81, textureX, textureY);
		barrelModel[34].addShapeBox(0, 0, 0, 10, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1);
		barrelModel[34].setRotationPoint(45.0f, 7.0f, -12.0f);

		barrelModel[35] = new ModelRendererTurbo(this, 84, 166, textureX, textureY);
		barrelModel[35].addShapeBox(0, 0, 0, 10, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -2, 0, 0, -2);
		barrelModel[35].setRotationPoint(45.0f, 8.0f, 6.0f);

		barrelModel[36] = new ModelRendererTurbo(this, 215, 159, textureX, textureY);
		barrelModel[36].addShapeBox(0, 0, 0, 10, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -3, 0, 0, -3);
		barrelModel[36].setRotationPoint(45.0f, 8.0f, -11.0f);

		barrelModel[37] = new ModelRendererTurbo(this, 162, 81, textureX, textureY);
		barrelModel[37].addBox(0, 0, 0, 6, 3, 1, 0f);
		barrelModel[37].setRotationPoint(47.0f, -30.0f, 4.0f);

		barrelModel[38] = new ModelRendererTurbo(this, 102, 87, textureX, textureY);
		barrelModel[38].addBox(0, 0, 0, 1, 2, 6, 0f);
		barrelModel[38].setRotationPoint(45.0f, -30.0f, -3.0f);

		barrelModel[39] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
		barrelModel[39].addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0);
		barrelModel[39].setRotationPoint(60.5f, -3.0f, -12.0f);

		barrelModel[40] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
		barrelModel[40].addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		barrelModel[40].setRotationPoint(60.5f, -12.0f, 10.0f);

		barrelModel[41] = new ModelRendererTurbo(this, 29, 180, textureX, textureY);
		barrelModel[41].flip = true;
		barrelModel[41].addCylinder(0, 0, 0, 2, 3, 12, 1, 1, 4);
		barrelModel[41].setRotationPoint(60.0f, -18.0f, 0.0f);
		barrelModel[41].rotateAngleZ = 1.5707964f;

		barrelModel[42] = new ModelRendererTurbo(this, 241, 143, textureX, textureY);
		barrelModel[42].addBox(0, 0, 0, 3, 5, 3, 0f);
		barrelModel[42].setRotationPoint(7.0f, -8.0f, -1.5f);

		barrelModel[43] = new ModelRendererTurbo(this, 145, 209, textureX, textureY);
		barrelModel[43].addShapeBox(0, 0, 0, 1, 27, 1, 0, 0, 0.5f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[43].setRotationPoint(63.0f, -27.0f, 12.0f);

		barrelModel[44] = new ModelRendererTurbo(this, 140, 209, textureX, textureY);
		barrelModel[44].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0.7f, 0, 0, -1, 0, 0, -1, 0, 0, 0.7f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[44].setRotationPoint(64.0f, -26.0f, 12.0f);

		barrelModel[45] = new ModelRendererTurbo(this, 228, 39, textureX, textureY);
		barrelModel[45].addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[45].setRotationPoint(-50.0f, 3.0f, -7.0f);

		barrelModel[46] = new ModelRendererTurbo(this, 203, 67, textureX, textureY);
		barrelModel[46].addShapeBox(0, 0, 0, 24, 5, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[46].setRotationPoint(-74.0f, 3.0f, 6.0f);

		barrelModel[47] = new ModelRendererTurbo(this, 150, 162, textureX, textureY);
		barrelModel[47].addShapeBox(0, 0, 0, 2, 4, 2, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2);
		barrelModel[47].setRotationPoint(-76.0f, 4.0f, 5.0f);

		barrelModel[48] = new ModelRendererTurbo(this, 246, 159, textureX, textureY);
		barrelModel[48].addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, -1);
		barrelModel[48].setRotationPoint(-46.0f, 4.0f, -7.0f);

		barrelModel[49] = new ModelRendererTurbo(this, 234, 111, textureX, textureY);
		barrelModel[49].addBox(0, 0, 0, 6, 6, 2, 0f);
		barrelModel[49].setRotationPoint(-71.0f, 3.0f, 6.0f);

		barrelModel[50] = new ModelRendererTurbo(this, 153, 111, textureX, textureY);
		barrelModel[50].addBox(0, 0, 0, 6, 6, 2, 0f);
		barrelModel[50].setRotationPoint(-71.0f, 3.0f, -8.0f);

		barrelModel[51] = new ModelRendererTurbo(this, 91, 84, textureX, textureY);
		barrelModel[51].addBox(0, 0, 0, 6, 6, 2, 0f);
		barrelModel[51].setRotationPoint(-56.0f, 3.0f, -8.0f);

		barrelModel[52] = new ModelRendererTurbo(this, 21, 165, textureX, textureY);
		barrelModel[52].addBox(0, 0, 0, 2, 2, 12, 0f);
		barrelModel[52].setRotationPoint(-69.0f, 5.0f, -6.0f);

		barrelModel[53] = new ModelRendererTurbo(this, 185, 136, textureX, textureY);
		barrelModel[53].addShapeBox(0, 0, 0, 4, 3, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[53].setRotationPoint(-70.0f, 4.0f, -10.0f);

		barrelModel[54] = new ModelRendererTurbo(this, 28, 126, textureX, textureY);
		barrelModel[54].addShapeBox(0, 0, 0, 4, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[54].setRotationPoint(-70.0f, 4.0f, 8.0f);

		barrelModel[55] = new ModelRendererTurbo(this, 134, 90, textureX, textureY);
		barrelModel[55].addShapeBox(0, 0, 0, 4, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[55].setRotationPoint(-55.0f, 4.0f, 8.0f);

		barrelModel[56] = new ModelRendererTurbo(this, 187, 0, textureX, textureY);
		barrelModel[56].addBox(0, 0, 0, 30, 2, 2, 0f);
		barrelModel[56].setRotationPoint(-75.0f, 5.0f, -4.0f);

		barrelModel[57] = new ModelRendererTurbo(this, 0, 55, textureX, textureY);
		barrelModel[57].addBox(0, 0, 0, 8, 2, 2, 0f);
		barrelModel[57].setRotationPoint(37.0f, 4.0f, 6.0f);

		barrelModel[58] = new ModelRendererTurbo(this, 116, 157, textureX, textureY);
		barrelModel[58].flip = true;
		barrelModel[58].addCylinder(0, 0, 0, 2, 1, 8, 0.7f, 0.7f, 4);
		barrelModel[58].setRotationPoint(-34.0f, 5.0f, 6.0f);
		barrelModel[58].rotateAngleY = -1.5707964f;
		barrelModel[58].rotateAngleZ = 1.5707964f;

		barrelModel[59] = new ModelRendererTurbo(this, 20, 155, textureX, textureY);
		barrelModel[59].flip = true;
		barrelModel[59].addCylinder(0, 0, 0, 2, 1, 8, 0.7f, 0.7f, 4);
		barrelModel[59].setRotationPoint(38.5f, 2.5f, 8.0f);
		barrelModel[59].rotateAngleY = -1.5707964f;
		barrelModel[59].rotateAngleZ = 1.5707964f;

		barrelModel[60] = new ModelRendererTurbo(this, 20, 149, textureX, textureY);
		barrelModel[60].flip = true;
		barrelModel[60].addCylinder(0, 0, 0, 2, 1, 8, 0.7f, 0.7f, 4);
		barrelModel[60].setRotationPoint(8.0f, 4.5f, 8.0f);
		barrelModel[60].rotateAngleY = -1.5707964f;
		barrelModel[60].rotateAngleZ = 1.5707964f;

		barrelModel[61] = new ModelRendererTurbo(this, 0, 44, textureX, textureY);
		barrelModel[61].addBox(0, 0, 0, 8, 2, 2, 0f);
		barrelModel[61].setRotationPoint(37.0f, -1.0f, -8.0f);

		barrelModel[62] = new ModelRendererTurbo(this, 116, 36, textureX, textureY);
		barrelModel[62].addBox(0, 0, 0, 8, 2, 2, 0f);
		barrelModel[62].setRotationPoint(37.0f, 4.0f, -8.0f);

		barrelModel[63] = new ModelRendererTurbo(this, 13, 29, textureX, textureY);
		barrelModel[63].addBox(0, 0, 0, 3, 3, 2, 0f);
		barrelModel[63].setRotationPoint(37.0f, 1.0f, -8.0f);

		barrelModel[64] = new ModelRendererTurbo(this, 198, 136, textureX, textureY);
		barrelModel[64].flip = true;
		barrelModel[64].addCylinder(0, 0, 0, 2, 1, 8, 0.7f, 0.7f, 4);
		barrelModel[64].setRotationPoint(38.5f, 2.5f, -9.0f);
		barrelModel[64].rotateAngleY = -1.5707964f;
		barrelModel[64].rotateAngleZ = 1.5707964f;

		barrelModel[65] = new ModelRendererTurbo(this, 73, 29, textureX, textureY);
		barrelModel[65].addShapeBox(0, 0, 0, 30, 5, 1, 0, 0, -3.5f, 0, 0, -1, 0, 0, -1, 0, 0, -3.5f, 0, 0, -0.5f, 0, 0, -3, 0, 0, -3, 0, 0, -0.5f, 0);
		barrelModel[65].setRotationPoint(7.0f, 1.0f, -8.0f);

		barrelModel[66] = new ModelRendererTurbo(this, 0, 21, textureX, textureY);
		barrelModel[66].addShapeBox(0, 0, 0, 69, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[66].setRotationPoint(-35.0f, 4.0f, -7.0f);

		barrelModel[67] = new ModelRendererTurbo(this, 215, 111, textureX, textureY);
		barrelModel[67].flip = true;
		barrelModel[67].addCylinder(0, 0, 0, 2, 1, 8, 0.7f, 0.7f, 4);
		barrelModel[67].setRotationPoint(34.0f, 5.0f, -7.0f);
		barrelModel[67].rotateAngleY = -1.5707964f;
		barrelModel[67].rotateAngleZ = 1.5707964f;

		barrelModel[68] = new ModelRendererTurbo(this, 203, 74, textureX, textureY);
		barrelModel[68].flip = true;
		barrelModel[68].addCylinder(0, 0, 0, 2, 1, 8, 0.7f, 0.7f, 4);
		barrelModel[68].setRotationPoint(-34.0f, 5.0f, -7.0f);
		barrelModel[68].rotateAngleY = -1.5707964f;
		barrelModel[68].rotateAngleZ = 1.5707964f;

		barrelModel[69] = new ModelRendererTurbo(this, 143, 129, textureX, textureY);
		barrelModel[69].addBox(0, 0, 0, 4, 4, 2, 0f);
		barrelModel[69].setRotationPoint(7.0f, 2.0f, -8.5f);
		barrelModel[69].rotateAngleZ = -0.43633232f;

		barrelModel[70] = new ModelRendererTurbo(this, 0, 29, textureX, textureY);
		barrelModel[70].flip = true;
		barrelModel[70].addCylinder(0, 0, 0, 2, 1, 8, 0.7f, 0.7f, 4);
		barrelModel[70].setRotationPoint(8.0f, 4.5f, -9.0f);
		barrelModel[70].rotateAngleY = -1.5707964f;
		barrelModel[70].rotateAngleZ = 1.5707964f;

		barrelModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		barrelModel[71].addShapeBox(0, 0, 0, 3, 3, 1, 0, -1, 0, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0, 0, -1.2f, 0, -1, 0, 0, -1, 0, 0, 0, -1.2f, 0);
		barrelModel[71].setRotationPoint(8.0f, 4.0f, -9.0f);

		barrelModel[72] = new ModelRendererTurbo(this, 73, 36, textureX, textureY);
		barrelModel[72].addShapeBox(0, 0, 0, 20, 10, 1, 0, 0, -9, 0, -1, 0, 0, -1, 0, 0, 0, -9, 0, 0, 0, 0, 0, -10, 0, 0, -10, 0, 0, 0, 0);
		barrelModel[72].setRotationPoint(10.0f, -3.0f, -9.0f);

		barrelModel[73] = new ModelRendererTurbo(this, 208, 18, textureX, textureY);
		barrelModel[73].flip = true;
		barrelModel[73].addCylinder(0, 0, 0, 1, 1, 8, 0.6f, 0.6f, 4);
		barrelModel[73].setRotationPoint(29.8f, -3.2f, -9.0f);
		barrelModel[73].rotateAngleY = -1.5707964f;
		barrelModel[73].rotateAngleZ = 1.5707964f;

		barrelModel[74] = new ModelRendererTurbo(this, 208, 36, textureX, textureY);
		barrelModel[74].addShapeBox(0, 0, 0, 16, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[74].setRotationPoint(29.0f, -4.0f, -9.0f);

		barrelModel[75] = new ModelRendererTurbo(this, 111, 84, textureX, textureY);
		barrelModel[75].addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f);
		barrelModel[75].setRotationPoint(-68.0f, -26.0f, -11.75f);

		barrelModel[76] = new ModelRendererTurbo(this, 69, 72, textureX, textureY);
		barrelModel[76].addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		barrelModel[76].setRotationPoint(-75.0f, -23.0f, 11.25f);

		barrelModel[77] = new ModelRendererTurbo(this, 69, 69, textureX, textureY);
		barrelModel[77].addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f);
		barrelModel[77].setRotationPoint(-75.0f, -23.0f, -11.75f);

		barrelModel[78] = new ModelRendererTurbo(this, 107, 209, textureX, textureY);
		barrelModel[78].flip = true;
		barrelModel[78].addCylinder(0, 0, 0, 1, 20, 8, 1.5f, 1.5f, 4);
		barrelModel[78].setRotationPoint(-9.0f, -12.5f, -10.5f);
		barrelModel[78].rotateAngleZ = 1.5707964f;

		barrelModel[79] = new ModelRendererTurbo(this, 197, 10, textureX, textureY);
		barrelModel[79].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		barrelModel[79].setRotationPoint(37.0f, -31.2f, -0.5f);

		barrelModel[80] = new ModelRendererTurbo(this, 134, 81, textureX, textureY);
		barrelModel[80].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f);
		barrelModel[80].setRotationPoint(36.0f, -32.0f, -3.0f);

		barrelModel[81] = new ModelRendererTurbo(this, 251, 9, textureX, textureY);
		barrelModel[81].addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0);
		barrelModel[81].setRotationPoint(36.0f, -32.0f, 2.0f);

		barrelModel[82] = new ModelRendererTurbo(this, 97, 149, textureX, textureY);
		barrelModel[82].addBox(0, 0, 0, 2, 2, 14, 0f);
		barrelModel[82].setRotationPoint(57.0f, 5.0f, -7.0f);

		barrelModel[83] = new ModelRendererTurbo(this, 17, 65, textureX, textureY);
		barrelModel[83].addBox(0, 0, 0, 1, 5, 1, 0f);
		barrelModel[83].setRotationPoint(57.5f, 0.0f, -0.5f);

		barrelModel[84] = new ModelRendererTurbo(this, 208, 18, textureX, textureY);
		barrelModel[84].addBox(0, 0, 0, 17, 3, 5, 0f);
		barrelModel[84].setRotationPoint(-74.0f, -6.0f, -11.0f);

		barrelModel[85] = new ModelRendererTurbo(this, 220, 143, textureX, textureY);
		barrelModel[85].addBox(0, 0, 0, 1, 2, 5, 0f);
		barrelModel[85].setRotationPoint(-75.0f, -5.0f, 6.0f);

		barrelModel[86] = new ModelRendererTurbo(this, 56, 98, textureX, textureY);
		barrelModel[86].addBox(0, 0, 0, 1, 1, 5, 0f);
		barrelModel[86].setRotationPoint(-76.0f, -4.0f, 6.0f);

		barrelModel[87] = new ModelRendererTurbo(this, 187, 103, textureX, textureY);
		barrelModel[87].addBox(0, 0, 0, 1, 2, 5, 0f);
		barrelModel[87].setRotationPoint(-75.0f, -5.0f, -11.0f);

		barrelModel[88] = new ModelRendererTurbo(this, 243, 53, textureX, textureY);
		barrelModel[88].addBox(0, 0, 0, 1, 1, 5, 0f);
		barrelModel[88].setRotationPoint(-76.0f, -4.0f, -11.0f);

		barrelModel[89] = new ModelRendererTurbo(this, 116, 41, textureX, textureY);
		barrelModel[89].addBox(0, 0, 0, 1, 6, 1, 0f);
		barrelModel[89].setRotationPoint(-71.0f, -12.0f, -9.0f);

		barrelModel[90] = new ModelRendererTurbo(this, 136, 29, textureX, textureY);
		barrelModel[90].addBox(0, 0, 0, 1, 6, 1, 0f);
		barrelModel[90].setRotationPoint(-69.0f, -12.0f, 8.0f);

		barrelModel[91] = new ModelRendererTurbo(this, 0, 65, textureX, textureY);
		barrelModel[91].addBox(0, 0, 0, 4, 1, 4, 0f);
		barrelModel[91].setRotationPoint(-72.5f, -13.0f, -10.5f);

		barrelModel[92] = new ModelRendererTurbo(this, 243, 36, textureX, textureY);
		barrelModel[92].addShapeBox(0, 0, 0, 2, 7, 4, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		barrelModel[92].setRotationPoint(-74.3f, -19.0f, -10.5f);

		barrelModel[93] = new ModelRendererTurbo(this, 69, 55, textureX, textureY);
		barrelModel[93].addBox(0, 0, 0, 8, 4, 4, 0f);
		barrelModel[93].setRotationPoint(64.0f, -2.5f, -2.0f);

		flipAll();
	}

}
