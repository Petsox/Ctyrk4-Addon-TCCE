//FMT-Marker DFM-1.0

package cz.ctyrkaten.train.client.render.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCD850 extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public ModelCD850(){
		bodyModel = new ModelRendererTurbo[345];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[0].addBox(0, 0, 0, 105, 1, 22, 0f);
		bodyModel[0].setRotationPoint(-75.0f, 2.0f, -22.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		bodyModel[1].addShapeBox(0, 0, 0, 107, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[1].setRotationPoint(-76.0f, -17.0f, -2.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 15
		bodyModel[2].addShapeBox(0, 0, 0, 107, 4, 18, 0, 0, -1, -5, 0, -1, -5, 0, -1, -5, 0, -1, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(-76.0f, -21.0f, -20.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 99
		bodyModel[3].addShapeBox(0, 0, 0, 107, 3, 2, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[3].setRotationPoint(-76.0f, -17.0f, -22.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 94
		bodyModel[4].addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(39.0f, 2.0f, -19.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 95
		bodyModel[5].addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(36.0f, 2.0f, -21.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 97
		bodyModel[6].addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0);
		bodyModel[6].setRotationPoint(39.0f, 2.0f, -11.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 99
		bodyModel[7].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[7].setRotationPoint(30.0f, 2.0f, -22.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 90
		bodyModel[8].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.75f, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[8].setRotationPoint(31.0f, -20.0f, -11.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 91
		bodyModel[9].addShapeBox(0, 0, 0, 4, 3, 5, 0, 0, 0, -3, -1, 0, 0, -1, 0, -4, 0, 0, -2, 0, 0, -4, -1, 0, -2, -1, 0, -2, 0, 0, 0);
		bodyModel[9].setRotationPoint(36.0f, -17.0f, -6.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 97
		bodyModel[10].addShapeBox(0, 0, 0, 4, 3, 8, 0, 0, -0.5f, 0, -1, -1, 0, -1, -1, -6, 0, -0.75f, -4, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0);
		bodyModel[10].setRotationPoint(36.0f, -20.0f, -11.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 109
		bodyModel[11].addShapeBox(0, 0, 0, 4, 4, 8, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0);
		bodyModel[11].setRotationPoint(39.0f, 3.0f, -19.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 110
		bodyModel[12].addShapeBox(0, 0, 0, 4, 4, 8, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0);
		bodyModel[12].setRotationPoint(39.0f, 3.0f, -11.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 111
		bodyModel[13].addShapeBox(0, 0, 0, 4, 4, 8, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -2, -1, 0, 0, -3, 0, 0);
		bodyModel[13].setRotationPoint(36.0f, 3.0f, -21.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 112
		bodyModel[14].addShapeBox(0, 0, 0, 4, 4, 8, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, -3, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -1);
		bodyModel[14].setRotationPoint(36.0f, 3.0f, -9.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 109
		bodyModel[15].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[15].setRotationPoint(30.0f, 2.0f, -8.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 114
		bodyModel[16].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[16].setRotationPoint(39.0f, 3.0f, -4.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 116
		bodyModel[17].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[17].setRotationPoint(39.0f, 3.0f, -19.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 117
		bodyModel[18].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[18].setRotationPoint(43.0f, 2.0f, -20.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 119
		bodyModel[19].addShapeBox(0, 0, 0, 7, 4, 4, 0, 0, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, -3, 0, -1, -1, -1, 0, -2, -1, 0, -1, 0, -1, -2);
		bodyModel[19].setRotationPoint(30.0f, 3.0f, -22.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 126
		bodyModel[20].addBox(0, 0, 0, 6, 1, 6, 0f);
		bodyModel[20].setRotationPoint(30.0f, 2.0f, -14.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 127
		bodyModel[21].addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0);
		bodyModel[21].setRotationPoint(36.0f, 2.0f, -9.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 128
		bodyModel[22].addBox(0, 0, 0, 3, 1, 4, 0f);
		bodyModel[22].setRotationPoint(36.0f, 2.0f, -13.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 129
		bodyModel[23].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -2, 0, 0, -1, 0, 0, -3, 0, 0, -2, 0, 0, -3, 0, 0, -2, 0, 0, -1, 0, 0, 0);
		bodyModel[23].setRotationPoint(31.0f, -17.0f, -4.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 130
		bodyModel[24].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, 0, -5, 0, -0.75f, -5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[24].setRotationPoint(31.0f, -20.0f, -20.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 131
		bodyModel[25].addShapeBox(0, 0, 0, 4, 3, 8, 0, 0, -0.75f, -4, -1, -1, -6, -1, -1, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0);
		bodyModel[25].setRotationPoint(36.0f, -20.0f, -19.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 132
		bodyModel[26].addShapeBox(0, 0, 0, 4, 3, 5, 0, 0, 0, -2, -1, 0, -4, -1, 0, 0, 0, 0, -3, 0, 0, 0, -1, 0, -2, -1, 0, -2, 0, 0, -4);
		bodyModel[26].setRotationPoint(36.0f, -17.0f, -21.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 133
		bodyModel[27].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -2, 0, 0, -3, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, -3);
		bodyModel[27].setRotationPoint(31.0f, -17.0f, -22.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 91
		bodyModel[28].addShapeBox(0, 0, 0, 4, 3, 8, 0, -3, 0, -4, 0, 0, -2, 0, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, 0, -1, 0, 0, -3, 0, 0);
		bodyModel[28].setRotationPoint(-88.0f, -17.0f, -19.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 92
		bodyModel[29].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -5, 0, -0.75f, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[29].setRotationPoint(-81.0f, -20.0f, -11.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 93
		bodyModel[30].addShapeBox(0, 0, 0, 4, 3, 5, 0, -1, 0, 0, 0, 0, -3, 0, 0, -2, -1, 0, -4, -1, 0, -2, 0, 0, -4, 0, 0, 0, -1, 0, -2);
		bodyModel[30].setRotationPoint(-85.0f, -17.0f, -6.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 94
		bodyModel[31].addShapeBox(0, 0, 0, 4, 3, 8, 0, -1, -1, 0, 0, -0.5f, 0, 0, -0.75f, -4, -1, -1, -6, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2);
		bodyModel[31].setRotationPoint(-85.0f, -20.0f, -11.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 95
		bodyModel[32].addShapeBox(0, 0, 0, 4, 3, 6, 0, -4, -1, -4, 0, -1, -4, 0, -1, 0, -4, -1, 0, -3, 0, -2, 0, 0, 0, 0, 0, 0, -3, 0, 0);
		bodyModel[32].setRotationPoint(-88.0f, -20.0f, -17.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 96
		bodyModel[33].addShapeBox(0, 0, 0, 4, 3, 6, 0, -4, -1, 0, 0, -1, 0, 0, -1, -4, -4, -1, -4, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, -2);
		bodyModel[33].setRotationPoint(-88.0f, -20.0f, -11.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 97
		bodyModel[34].addShapeBox(0, 0, 0, 9, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0);
		bodyModel[34].setRotationPoint(-85.5f, -20.0f, -13.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 100
		bodyModel[35].addShapeBox(0, 0, 0, 4, 3, 8, 0, -3, 0, 0, 0, 0, 0, 0, 0, -2, -3, 0, -4, -3, 0, 0, -1, 0, 0, 0, 0, 0, -3, 0, -2);
		bodyModel[35].setRotationPoint(-88.0f, -17.0f, -11.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 101
		bodyModel[36].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[36].setRotationPoint(-86.5f, -18.5f, -12.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 119
		bodyModel[37].addBox(0, 0, 0, 6, 1, 6, 0f);
		bodyModel[37].setRotationPoint(-81.0f, 2.0f, -14.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 358, 203, textureX, textureY); // Box 121
		bodyModel[38].addBox(0, 0, 0, 3, 1, 4, 0f);
		bodyModel[38].setRotationPoint(-84.0f, 2.0f, -13.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 122
		bodyModel[39].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -1, 0, 0, -2, 0, 0, -2, 0, 0, -3, 0, 0, -2, 0, 0, -3, 0, 0, 0, 0, 0, -1);
		bodyModel[39].setRotationPoint(-81.0f, -17.0f, -4.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 123
		bodyModel[40].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, -0.75f, -5, 0, 0, -5, 0, 0, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[40].setRotationPoint(-81.0f, -20.0f, -20.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 124
		bodyModel[41].addShapeBox(0, 0, 0, 4, 3, 8, 0, -1, -1, -6, 0, -0.75f, -4, 0, -0.5f, 0, -1, -1, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[41].setRotationPoint(-85.0f, -20.0f, -19.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 126
		bodyModel[42].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -3, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -3, 0, 0, -2);
		bodyModel[42].setRotationPoint(-81.0f, -17.0f, -22.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 152
		bodyModel[43].addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1);
		bodyModel[43].setRotationPoint(-86.5f, -20.0f, -15.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 168
		bodyModel[44].addBox(0, 0, 0, 8, 4, 18, 0f);
		bodyModel[44].setRotationPoint(-16.0f, 3.0f, -20.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 169
		bodyModel[45].addBox(0, 0, 0, 8, 4, 18, 0f);
		bodyModel[45].setRotationPoint(-31.0f, 3.0f, -20.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 171
		bodyModel[46].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[46].setRotationPoint(-34.0f, -14.0f, -21.5f);

		bodyModel[47] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 173
		bodyModel[47].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[47].setRotationPoint(-43.0f, -14.0f, -21.5f);

		bodyModel[48] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 174
		bodyModel[48].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[48].setRotationPoint(14.0f, -14.0f, -21.5f);

		bodyModel[49] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 176
		bodyModel[49].addBox(0, 0, 0, 1, 16, 20, 0f);
		bodyModel[49].setRotationPoint(23.0f, -14.0f, -21.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 177
		bodyModel[50].addBox(0, 0, 0, 1, 16, 20, 0f);
		bodyModel[50].setRotationPoint(-69.0f, -14.0f, -21.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 260
		bodyModel[51].addShapeBox(0, 0, 0, 1, 7, 6, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[51].setRotationPoint(-73.0f, -8.0f, -9.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 261
		bodyModel[52].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[52].setRotationPoint(-77.0f, -1.0f, -9.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 262
		bodyModel[53].addShapeBox(0, 0, 0, 3, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[53].setRotationPoint(-76.5f, 0.0f, -9.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 264
		bodyModel[54].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[54].setRotationPoint(40.0f, 3.0f, -12.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 265
		bodyModel[55].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[55].setRotationPoint(14.0f, -17.0f, -21.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 266
		bodyModel[56].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[56].setRotationPoint(23.0f, -17.0f, -21.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 267
		bodyModel[57].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(-34.0f, -17.0f, -21.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 268
		bodyModel[58].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[58].setRotationPoint(-43.0f, -17.0f, -21.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 269
		bodyModel[59].addShapeBox(0, 0, 0, 47, 0, 7, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[59].setRotationPoint(-33.0f, -12.2f, -9.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 270
		bodyModel[60].addShapeBox(0, 0, 0, 47, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0);
		bodyModel[60].setRotationPoint(-33.0f, -12.2f, -21.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 384, 80, textureX, textureY); // Box 271
		bodyModel[61].addBox(0, 0, 0, 6, 7, 5, 0f);
		bodyModel[61].setRotationPoint(-84.5f, -5.0f, -10.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 272
		bodyModel[62].addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[62].setRotationPoint(-83.5f, -7.0f, -9.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 273
		bodyModel[63].addShapeBox(0, 0, 0, 1, 7, 6, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[63].setRotationPoint(27.0f, -8.0f, -18.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 274
		bodyModel[64].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[64].setRotationPoint(27.0f, -1.0f, -18.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 275
		bodyModel[65].addShapeBox(0, 0, 0, 3, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[65].setRotationPoint(28.5f, 0.0f, -18.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 277
		bodyModel[66].addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[66].setRotationPoint(37.5f, -7.0f, -18.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 9
		bodyModel[67].addShapeBox(0, 0, 0, 51, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[67].setRotationPoint(-36.0f, -14.0f, -1.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 241
		bodyModel[68].addShapeBox(0, 0, 0, 4, 3, 8, 0, 0, 0, -2, -3, 0, -4, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, -2, -3, 0, 0, -1, 0, 0);
		bodyModel[68].setRotationPoint(39.0f, -17.0f, -19.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 242
		bodyModel[69].addShapeBox(0, 0, 0, 4, 3, 8, 0, 0, 0, 0, -3, 0, 0, -3, 0, -4, 0, 0, -2, -1, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, 0);
		bodyModel[69].setRotationPoint(39.0f, -17.0f, -11.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 2
		bodyModel[70].addShapeBox(0, 0, 0, 6, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -0.5f);
		bodyModel[70].setRotationPoint(-84.5f, -5.0f, -5.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 294, 86, textureX, textureY); // Box 3
		bodyModel[71].addBox(0, 0, 0, 6, 7, 7, 0f);
		bodyModel[71].setRotationPoint(33.5f, -5.0f, -17.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 4
		bodyModel[72].addShapeBox(0, 0, 0, 4, 16, 3, 0, 0, 0, 0, -1, 0, -2, -1, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, -1, 0, -2, -1, 0, -0.5f, 0, 0, -2.5f);
		bodyModel[72].setRotationPoint(36.0f, -14.0f, -21.0f);

		bodyModel[73] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 5
		bodyModel[73].addShapeBox(0, 0, 0, 2, 16, 4, 0, 0, 0, 0, -1, 0, -2, -1.25f, 0, -2, 0, 0, -3.5f, 0, 0, 0, 0, 0, -2, -0.25f, 0, -2, 0, 0, -3.5f);
		bodyModel[73].setRotationPoint(39.0f, -14.0f, -19.0f);

		bodyModel[74] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 6
		bodyModel[74].addShapeBox(0, 0, 0, 1, 16, 12, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 1, 0, 0, 1, 0, 0, -0.75f, 0, 0);
		bodyModel[74].setRotationPoint(39.0f, -14.0f, -17.0f);

		bodyModel[75] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 7
		bodyModel[75].addShapeBox(0, 0, 0, 4, 16, 3, 0, 0, 0, -2.5f, -1, 0, -0.5f, -1, 0, -2, 0, 0, 0, 0, 0, -2.5f, -1, 0, -0.5f, -1, 0, -2, 0, 0, 0);
		bodyModel[75].setRotationPoint(36.0f, -14.0f, -4.0f);

		bodyModel[76] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 9
		bodyModel[76].addShapeBox(0, 0, 0, 6, 7, 2, 0, 0, 0, 0, -0.75f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[76].setRotationPoint(33.5f, -5.0f, -19.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 0
		bodyModel[77].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[77].setRotationPoint(-69.0f, -17.0f, -21.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 7
		bodyModel[78].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[78].setRotationPoint(-12.0f, -8.0f, -9.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 9
		bodyModel[79].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[79].setRotationPoint(-14.0f, -1.0f, -9.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 10
		bodyModel[80].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[80].setRotationPoint(-13.5f, 0.0f, -9.0f);

		bodyModel[81] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 36
		bodyModel[81].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[81].setRotationPoint(-42.0f, -14.0f, -0.75f);

		bodyModel[82] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // 40
		bodyModel[82].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[82].setRotationPoint(-73.0f, 4.0f, -16.5f);

		bodyModel[83] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 23
		bodyModel[83].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[83].setRotationPoint(-71.0f, 3.0f, -5.0f);

		bodyModel[84] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 27
		bodyModel[84].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[84].setRotationPoint(-55.0f, 3.0f, -5.0f);

		bodyModel[85] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 28
		bodyModel[85].addBox(0, 0, 0, 3, 1, 12, 0f);
		bodyModel[85].setRotationPoint(-61.0f, 3.0f, -17.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 77
		bodyModel[86].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[86].setRotationPoint(-71.0f, 3.0f, -17.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 81
		bodyModel[87].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[87].setRotationPoint(-55.0f, 3.0f, -17.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 12
		bodyModel[88].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[88].setRotationPoint(-52.0f, 6.0f, -17.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 14
		bodyModel[89].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[89].setRotationPoint(-68.0f, 6.0f, -17.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 15
		bodyModel[90].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[90].setRotationPoint(-73.0f, 4.0f, -7.5f);

		bodyModel[91] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 16
		bodyModel[91].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[91].setRotationPoint(-73.0f, 4.0f, -14.5f);

		bodyModel[92] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 17
		bodyModel[92].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[92].setRotationPoint(-48.0f, 4.0f, -14.5f);

		bodyModel[93] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 1
		bodyModel[93].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[93].setRotationPoint(-70.0f, 3.0f, -5.5f);

		bodyModel[94] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 3
		bodyModel[94].addBox(0, 0, 0, 7, 1, 12, 0f);
		bodyModel[94].setRotationPoint(-63.0f, 8.0f, -17.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 4
		bodyModel[95].addBox(0, 0, 0, 3, 2, 10, 0f);
		bodyModel[95].setRotationPoint(-61.0f, 5.0f, -16.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 5
		bodyModel[96].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[96].setRotationPoint(-70.0f, 3.0f, -17.5f);

		bodyModel[97] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 20
		bodyModel[97].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[97].setRotationPoint(-72.0f, 4.0f, -5.5f);

		bodyModel[98] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 21
		bodyModel[98].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[98].setRotationPoint(-72.0f, 4.0f, -17.5f);

		bodyModel[99] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 22
		bodyModel[99].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[99].setRotationPoint(-52.5f, 6.5f, -5.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 24
		bodyModel[100].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[100].setRotationPoint(-52.5f, 5.5f, -5.0f);

		bodyModel[101] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[101].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[101].setRotationPoint(-54.0f, 6.0f, -5.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 26
		bodyModel[102].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[102].setRotationPoint(-50.0f, 6.0f, -5.0f);

		bodyModel[103] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 29
		bodyModel[103].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[103].setRotationPoint(-63.0f, 6.0f, -5.0f);

		bodyModel[104] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 30
		bodyModel[104].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[104].setRotationPoint(-60.0f, 4.0f, -5.0f);

		bodyModel[105] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 31
		bodyModel[105].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[105].setRotationPoint(-68.5f, 6.5f, -5.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		bodyModel[106].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[106].setRotationPoint(-68.5f, 5.5f, -5.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 33
		bodyModel[107].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[107].setRotationPoint(-66.0f, 6.0f, -5.0f);

		bodyModel[108] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 34
		bodyModel[108].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[108].setRotationPoint(-70.0f, 6.0f, -5.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 37
		bodyModel[109].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[109].setRotationPoint(-52.5f, 6.5f, -18.0f);

		bodyModel[110] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 38
		bodyModel[110].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[110].setRotationPoint(-52.5f, 5.5f, -18.0f);

		bodyModel[111] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 39
		bodyModel[111].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[111].setRotationPoint(-54.0f, 6.0f, -18.0f);

		bodyModel[112] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 40
		bodyModel[112].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[112].setRotationPoint(-50.0f, 6.0f, -18.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 43
		bodyModel[113].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[113].setRotationPoint(-63.0f, 6.0f, -18.0f);

		bodyModel[114] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 44
		bodyModel[114].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[114].setRotationPoint(-60.0f, 4.0f, -18.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 45
		bodyModel[115].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[115].setRotationPoint(-68.5f, 6.5f, -18.0f);

		bodyModel[116] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 46
		bodyModel[116].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[116].setRotationPoint(-68.5f, 5.5f, -18.0f);

		bodyModel[117] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 47
		bodyModel[117].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[117].setRotationPoint(-66.0f, 6.0f, -18.0f);

		bodyModel[118] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 48
		bodyModel[118].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[118].setRotationPoint(-70.0f, 6.0f, -18.0f);

		bodyModel[119] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 51
		bodyModel[119].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[119].setRotationPoint(-64.0f, 6.0f, -18.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 52
		bodyModel[120].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[120].setRotationPoint(-56.0f, 6.0f, -18.0f);

		bodyModel[121] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 53
		bodyModel[121].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[121].setRotationPoint(-64.0f, 6.0f, -5.0f);

		bodyModel[122] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 54
		bodyModel[122].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[122].setRotationPoint(-56.0f, 6.0f, -5.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 75
		bodyModel[123].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[123].setRotationPoint(0.0f, 4.0f, -16.5f);

		bodyModel[124] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 76
		bodyModel[124].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[124].setRotationPoint(18.0f, 3.0f, -5.0f);

		bodyModel[125] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 77
		bodyModel[125].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[125].setRotationPoint(2.0f, 3.0f, -5.0f);

		bodyModel[126] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 78
		bodyModel[126].addBox(0, 0, 0, 3, 1, 12, 0f);
		bodyModel[126].setRotationPoint(12.0f, 3.0f, -17.0f);

		bodyModel[127] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 79
		bodyModel[127].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[127].setRotationPoint(18.0f, 3.0f, -17.0f);

		bodyModel[128] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 80
		bodyModel[128].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[128].setRotationPoint(2.0f, 3.0f, -17.0f);

		bodyModel[129] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 81
		bodyModel[129].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[129].setRotationPoint(5.0f, 6.0f, -17.0f);

		bodyModel[130] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 82
		bodyModel[130].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[130].setRotationPoint(21.0f, 6.0f, -17.0f);

		bodyModel[131] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 83
		bodyModel[131].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[131].setRotationPoint(0.0f, 4.0f, -7.5f);

		bodyModel[132] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 84
		bodyModel[132].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[132].setRotationPoint(25.0f, 4.0f, -14.5f);

		bodyModel[133] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 85
		bodyModel[133].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[133].setRotationPoint(0.0f, 4.0f, -14.5f);

		bodyModel[134] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 86
		bodyModel[134].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[134].setRotationPoint(3.0f, 3.0f, -5.5f);

		bodyModel[135] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 87
		bodyModel[135].addBox(0, 0, 0, 7, 1, 12, 0f);
		bodyModel[135].setRotationPoint(10.0f, 8.0f, -17.0f);

		bodyModel[136] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 88
		bodyModel[136].addBox(0, 0, 0, 3, 2, 10, 0f);
		bodyModel[136].setRotationPoint(12.0f, 5.0f, -16.0f);

		bodyModel[137] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 89
		bodyModel[137].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[137].setRotationPoint(3.0f, 3.0f, -17.5f);

		bodyModel[138] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 90
		bodyModel[138].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[138].setRotationPoint(1.0f, 4.0f, -5.5f);

		bodyModel[139] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 91
		bodyModel[139].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[139].setRotationPoint(1.0f, 4.0f, -17.5f);

		bodyModel[140] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 92
		bodyModel[140].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[140].setRotationPoint(4.5f, 6.5f, -5.0f);

		bodyModel[141] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 93
		bodyModel[141].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[141].setRotationPoint(4.5f, 5.5f, -5.0f);

		bodyModel[142] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 94
		bodyModel[142].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[142].setRotationPoint(7.0f, 6.0f, -5.0f);

		bodyModel[143] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 95
		bodyModel[143].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[143].setRotationPoint(3.0f, 6.0f, -5.0f);

		bodyModel[144] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 98
		bodyModel[144].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[144].setRotationPoint(10.0f, 6.0f, -5.0f);

		bodyModel[145] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 99
		bodyModel[145].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[145].setRotationPoint(13.0f, 4.0f, -5.0f);

		bodyModel[146] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 100
		bodyModel[146].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[146].setRotationPoint(20.5f, 6.5f, -5.0f);

		bodyModel[147] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 101
		bodyModel[147].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[147].setRotationPoint(20.5f, 5.5f, -5.0f);

		bodyModel[148] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 102
		bodyModel[148].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[148].setRotationPoint(19.0f, 6.0f, -5.0f);

		bodyModel[149] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 103
		bodyModel[149].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[149].setRotationPoint(23.0f, 6.0f, -5.0f);

		bodyModel[150] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 106
		bodyModel[150].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[150].setRotationPoint(4.5f, 6.5f, -18.0f);

		bodyModel[151] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 107
		bodyModel[151].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[151].setRotationPoint(4.5f, 5.5f, -18.0f);

		bodyModel[152] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 108
		bodyModel[152].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[152].setRotationPoint(7.0f, 6.0f, -18.0f);

		bodyModel[153] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 109
		bodyModel[153].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[153].setRotationPoint(3.0f, 6.0f, -18.0f);

		bodyModel[154] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 112
		bodyModel[154].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[154].setRotationPoint(10.0f, 6.0f, -18.0f);

		bodyModel[155] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 113
		bodyModel[155].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[155].setRotationPoint(13.0f, 4.0f, -18.0f);

		bodyModel[156] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 114
		bodyModel[156].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[156].setRotationPoint(20.5f, 6.5f, -18.0f);

		bodyModel[157] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 115
		bodyModel[157].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[157].setRotationPoint(20.5f, 5.5f, -18.0f);

		bodyModel[158] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 116
		bodyModel[158].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[158].setRotationPoint(19.0f, 6.0f, -18.0f);

		bodyModel[159] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 117
		bodyModel[159].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[159].setRotationPoint(23.0f, 6.0f, -18.0f);

		bodyModel[160] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 120
		bodyModel[160].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[160].setRotationPoint(17.0f, 6.0f, -18.0f);

		bodyModel[161] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 121
		bodyModel[161].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[161].setRotationPoint(9.0f, 6.0f, -18.0f);

		bodyModel[162] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 122
		bodyModel[162].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[162].setRotationPoint(17.0f, 6.0f, -5.0f);

		bodyModel[163] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 123
		bodyModel[163].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[163].setRotationPoint(9.0f, 6.0f, -5.0f);

		bodyModel[164] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 0
		bodyModel[164].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[164].setRotationPoint(-85.5f, 3.0f, -7.0f);

		bodyModel[165] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1
		bodyModel[165].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[165].setRotationPoint(-85.5f, 3.0f, -7.0f);

		bodyModel[166] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 10
		bodyModel[166].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[166].setRotationPoint(-85.5f, 3.0f, -8.0f);

		bodyModel[167] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 11
		bodyModel[167].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[167].setRotationPoint(-85.5f, 3.0f, -8.0f);

		bodyModel[168] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 13
		bodyModel[168].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[168].setRotationPoint(-85.5f, 3.0f, -16.0f);

		bodyModel[169] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 14
		bodyModel[169].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[169].setRotationPoint(-85.5f, 3.0f, -16.0f);

		bodyModel[170] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 16
		bodyModel[170].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[170].setRotationPoint(-85.5f, 3.0f, -14.0f);

		bodyModel[171] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 17
		bodyModel[171].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[171].setRotationPoint(-85.5f, 3.0f, -14.0f);

		bodyModel[172] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 19
		bodyModel[172].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[172].setRotationPoint(41.5f, 3.0f, -7.0f);

		bodyModel[173] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 20
		bodyModel[173].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[173].setRotationPoint(40.5f, 3.0f, -7.0f);

		bodyModel[174] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 21
		bodyModel[174].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[174].setRotationPoint(40.5f, 7.0f, -7.0f);

		bodyModel[175] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 22
		bodyModel[175].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[175].setRotationPoint(41.5f, 3.0f, -8.0f);

		bodyModel[176] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 23
		bodyModel[176].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[176].setRotationPoint(40.5f, 3.0f, -8.0f);

		bodyModel[177] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 24
		bodyModel[177].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[177].setRotationPoint(40.5f, 7.0f, -8.0f);

		bodyModel[178] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 25
		bodyModel[178].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[178].setRotationPoint(41.5f, 3.0f, -16.0f);

		bodyModel[179] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 26
		bodyModel[179].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[179].setRotationPoint(40.5f, 3.0f, -16.0f);

		bodyModel[180] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 27
		bodyModel[180].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[180].setRotationPoint(40.5f, 7.0f, -16.0f);

		bodyModel[181] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 28
		bodyModel[181].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[181].setRotationPoint(41.5f, 3.0f, -14.0f);

		bodyModel[182] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 29
		bodyModel[182].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[182].setRotationPoint(40.5f, 3.0f, -14.0f);

		bodyModel[183] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 30
		bodyModel[183].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[183].setRotationPoint(40.5f, 7.0f, -14.0f);

		bodyModel[184] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 31
		bodyModel[184].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[184].setRotationPoint(-71.0f, -9.0f, -22.5f);

		bodyModel[185] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 32
		bodyModel[185].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[185].setRotationPoint(-76.0f, -9.0f, -22.5f);

		bodyModel[186] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 33
		bodyModel[186].addBox(0f, 0f, 0f, 0, 10, 1.5f);
		bodyModel[186].setRotationPoint(-52.5f, -9.0f, -23.0f);

		bodyModel[187] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 34
		bodyModel[187].addBox(0, 0, 0, 0, 10, 1.5f);
		bodyModel[187].setRotationPoint(-52.5f, -9.0f, -1.5f);

		bodyModel[188] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 366
		bodyModel[188].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[188].setRotationPoint(15.0f, -14.0f, -0.75f);

		bodyModel[189] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 368
		bodyModel[189].addShapeBox(0, 0, 0, 34, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[189].setRotationPoint(-76.0f, -14.0f, -1.0f);

		bodyModel[190] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 370
		bodyModel[190].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[190].setRotationPoint(21.0f, -14.0f, -1.0f);

		bodyModel[191] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 371
		bodyModel[191].addShapeBox(0, 0, 0, 51, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[191].setRotationPoint(-36.0f, -14.0f, -22.0f);

		bodyModel[192] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 372
		bodyModel[192].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[192].setRotationPoint(-42.0f, -14.0f, -22.25f);

		bodyModel[193] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 373
		bodyModel[193].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[193].setRotationPoint(15.0f, -14.0f, -22.25f);

		bodyModel[194] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 375
		bodyModel[194].addShapeBox(0, 0, 0, 29, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[194].setRotationPoint(-71.0f, -14.0f, -22.0f);

		bodyModel[195] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 377
		bodyModel[195].addShapeBox(0, 0, 0, 10, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[195].setRotationPoint(21.0f, -14.0f, -22.0f);

		bodyModel[196] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 378
		bodyModel[196].addShapeBox(0, 0, 0, 5, 15.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[196].setRotationPoint(-76.0f, -14.0f, -22.0f);

		bodyModel[197] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 379
		bodyModel[197].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[197].setRotationPoint(23.0f, -14.0f, -21.5f);

		bodyModel[198] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 380
		bodyModel[198].addShapeBox(0, 0, 0, 4, 3, 5, 0, -1, 0, -4, 0, 0, -2, 0, 0, -3, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -4, -1, 0, -2);
		bodyModel[198].setRotationPoint(-85.0f, -17.0f, -21.0f);

		bodyModel[199] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 3
		bodyModel[199].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[199].setRotationPoint(3.0f, 7.0f, -18.5f);

		bodyModel[200] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 4
		bodyModel[200].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[200].setRotationPoint(19.0f, 7.0f, -18.5f);

		bodyModel[201] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 5
		bodyModel[201].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[201].setRotationPoint(19.0f, 7.0f, -5.0f);

		bodyModel[202] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 6
		bodyModel[202].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[202].setRotationPoint(3.0f, 7.0f, -5.0f);

		bodyModel[203] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 7
		bodyModel[203].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[203].setRotationPoint(-54.0f, 7.0f, -5.0f);

		bodyModel[204] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 8
		bodyModel[204].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[204].setRotationPoint(-70.0f, 7.0f, -5.0f);

		bodyModel[205] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 9
		bodyModel[205].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[205].setRotationPoint(-70.0f, 7.0f, -18.5f);

		bodyModel[206] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 10
		bodyModel[206].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[206].setRotationPoint(-54.0f, 7.0f, -18.5f);

		bodyModel[207] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 1
		bodyModel[207].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0);
		bodyModel[207].setRotationPoint(31.0f, -14.0f, -1.0f);

		bodyModel[208] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 2
		bodyModel[208].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0, 0, -0.5f);
		bodyModel[208].setRotationPoint(31.0f, -14.0f, -22.0f);

		bodyModel[209] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 0
		bodyModel[209].addShapeBox(0, 0, 0, 2, 16, 4, 0, 0, 0, -3.5f, -1.25f, 0, -2, -1, 0, -2, 0, 0, 0, 0, 0, -3.5f, -0.25f, 0, -2, 0, 0, -2, 0, 0, 0);
		bodyModel[209].setRotationPoint(39.0f, -14.0f, -7.0f);

		bodyModel[210] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 365
		bodyModel[210].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[210].setRotationPoint(-9.0f, -8.2f, -9.0f);

		bodyModel[211] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 366
		bodyModel[211].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[211].setRotationPoint(1.0f, -8.2f, -9.0f);

		bodyModel[212] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 367
		bodyModel[212].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[212].setRotationPoint(3.0f, -8.2f, -9.0f);

		bodyModel[213] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 368
		bodyModel[213].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[213].setRotationPoint(13.0f, -8.2f, -9.0f);

		bodyModel[214] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 369
		bodyModel[214].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[214].setRotationPoint(-8.0f, -8.0f, -9.0f);

		bodyModel[215] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 371
		bodyModel[215].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[215].setRotationPoint(-8.0f, -1.0f, -9.0f);

		bodyModel[216] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 372
		bodyModel[216].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[216].setRotationPoint(0.0f, -8.0f, -9.0f);

		bodyModel[217] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 374
		bodyModel[217].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[217].setRotationPoint(-2.0f, -1.0f, -9.0f);

		bodyModel[218] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 375
		bodyModel[218].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[218].setRotationPoint(4.0f, -8.0f, -9.0f);

		bodyModel[219] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 376
		bodyModel[219].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[219].setRotationPoint(4.0f, -1.0f, -9.0f);

		bodyModel[220] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 377
		bodyModel[220].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[220].setRotationPoint(12.0f, -8.0f, -9.0f);

		bodyModel[221] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 378
		bodyModel[221].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[221].setRotationPoint(10.0f, -1.0f, -9.0f);

		bodyModel[222] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 379
		bodyModel[222].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[222].setRotationPoint(-11.0f, -8.2f, -9.0f);

		bodyModel[223] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 380
		bodyModel[223].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[223].setRotationPoint(-10.0f, -8.2f, -9.0f);

		bodyModel[224] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 381
		bodyModel[224].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[224].setRotationPoint(0.0f, -8.2f, -9.0f);

		bodyModel[225] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 382
		bodyModel[225].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[225].setRotationPoint(2.0f, -8.2f, -9.0f);

		bodyModel[226] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 383
		bodyModel[226].addShapeBox(-23, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[226].setRotationPoint(-9.0f, -8.0f, -9.0f);

		bodyModel[227] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 384
		bodyModel[227].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[227].setRotationPoint(-9.0f, -1.0f, -9.0f);

		bodyModel[228] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 385
		bodyModel[228].addShapeBox(-23, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[228].setRotationPoint(-1.0f, -8.0f, -9.0f);

		bodyModel[229] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 386
		bodyModel[229].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[229].setRotationPoint(-3.0f, -1.0f, -9.0f);

		bodyModel[230] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 387
		bodyModel[230].addShapeBox(-23, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[230].setRotationPoint(3.0f, -8.0f, -9.0f);

		bodyModel[231] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 388
		bodyModel[231].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[231].setRotationPoint(3.0f, -1.0f, -9.0f);

		bodyModel[232] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 389
		bodyModel[232].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[232].setRotationPoint(-7.5f, 0.0f, -9.0f);

		bodyModel[233] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 390
		bodyModel[233].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[233].setRotationPoint(-1.5f, 0.0f, -9.0f);

		bodyModel[234] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 391
		bodyModel[234].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[234].setRotationPoint(4.5f, 0.0f, -9.0f);

		bodyModel[235] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 392
		bodyModel[235].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[235].setRotationPoint(10.5f, 0.0f, -9.0f);

		bodyModel[236] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 393
		bodyModel[236].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[236].setRotationPoint(-19.5f, 0.0f, -9.0f);

		bodyModel[237] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 394
		bodyModel[237].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[237].setRotationPoint(-25.5f, 0.0f, -9.0f);

		bodyModel[238] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 395
		bodyModel[238].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[238].setRotationPoint(-31.5f, 0.0f, -9.0f);

		bodyModel[239] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 396
		bodyModel[239].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[239].setRotationPoint(-12.0f, -8.0f, -21.0f);

		bodyModel[240] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 397
		bodyModel[240].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[240].setRotationPoint(-14.0f, -1.0f, -21.0f);

		bodyModel[241] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 398
		bodyModel[241].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[241].setRotationPoint(-13.5f, 0.0f, -21.0f);

		bodyModel[242] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 399
		bodyModel[242].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[242].setRotationPoint(-9.0f, -8.2f, -21.0f);

		bodyModel[243] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 400
		bodyModel[243].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[243].setRotationPoint(1.0f, -8.2f, -21.0f);

		bodyModel[244] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 401
		bodyModel[244].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[244].setRotationPoint(3.0f, -8.2f, -21.0f);

		bodyModel[245] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 402
		bodyModel[245].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[245].setRotationPoint(13.0f, -8.2f, -21.0f);

		bodyModel[246] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 403
		bodyModel[246].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[246].setRotationPoint(-8.0f, -8.0f, -21.0f);

		bodyModel[247] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 404
		bodyModel[247].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[247].setRotationPoint(-8.0f, -1.0f, -21.0f);

		bodyModel[248] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 405
		bodyModel[248].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[248].setRotationPoint(0.0f, -8.0f, -21.0f);

		bodyModel[249] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 406
		bodyModel[249].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[249].setRotationPoint(-2.0f, -1.0f, -21.0f);

		bodyModel[250] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 407
		bodyModel[250].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[250].setRotationPoint(4.0f, -8.0f, -21.0f);

		bodyModel[251] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 408
		bodyModel[251].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[251].setRotationPoint(4.0f, -1.0f, -21.0f);

		bodyModel[252] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 409
		bodyModel[252].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[252].setRotationPoint(12.0f, -8.0f, -21.0f);

		bodyModel[253] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 410
		bodyModel[253].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[253].setRotationPoint(10.0f, -1.0f, -21.0f);

		bodyModel[254] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 411
		bodyModel[254].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[254].setRotationPoint(-11.0f, -8.2f, -21.0f);

		bodyModel[255] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 412
		bodyModel[255].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[255].setRotationPoint(-10.0f, -8.2f, -21.0f);

		bodyModel[256] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 413
		bodyModel[256].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[256].setRotationPoint(0.0f, -8.2f, -21.0f);

		bodyModel[257] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 414
		bodyModel[257].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[257].setRotationPoint(2.0f, -8.2f, -21.0f);

		bodyModel[258] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 415
		bodyModel[258].addShapeBox(-23, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[258].setRotationPoint(-9.0f, -8.0f, -21.0f);

		bodyModel[259] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 416
		bodyModel[259].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[259].setRotationPoint(-9.0f, -1.0f, -21.0f);

		bodyModel[260] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 417
		bodyModel[260].addShapeBox(-23, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[260].setRotationPoint(-1.0f, -8.0f, -21.0f);

		bodyModel[261] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 418
		bodyModel[261].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[261].setRotationPoint(-3.0f, -1.0f, -21.0f);

		bodyModel[262] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 419
		bodyModel[262].addShapeBox(-23, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[262].setRotationPoint(3.0f, -8.0f, -21.0f);

		bodyModel[263] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 420
		bodyModel[263].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[263].setRotationPoint(3.0f, -1.0f, -21.0f);

		bodyModel[264] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 421
		bodyModel[264].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[264].setRotationPoint(-7.5f, 0.0f, -21.0f);

		bodyModel[265] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 422
		bodyModel[265].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[265].setRotationPoint(-1.5f, 0.0f, -21.0f);

		bodyModel[266] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 423
		bodyModel[266].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[266].setRotationPoint(4.5f, 0.0f, -21.0f);

		bodyModel[267] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 424
		bodyModel[267].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[267].setRotationPoint(10.5f, 0.0f, -21.0f);

		bodyModel[268] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 425
		bodyModel[268].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[268].setRotationPoint(-19.5f, 0.0f, -21.0f);

		bodyModel[269] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 426
		bodyModel[269].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[269].setRotationPoint(-25.5f, 0.0f, -21.0f);

		bodyModel[270] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 427
		bodyModel[270].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[270].setRotationPoint(-31.5f, 0.0f, -21.0f);

		bodyModel[271] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 428
		bodyModel[271].addShapeBox(0, 0, 0, 5, 15.5f, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[271].setRotationPoint(26.0f, -14.0f, -1.0f);

		bodyModel[272] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 429
		bodyModel[272].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[272].setRotationPoint(31.0f, -9.0f, -0.5f);

		bodyModel[273] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 430
		bodyModel[273].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[273].setRotationPoint(26.0f, -9.0f, -0.5f);

		bodyModel[274] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 9
		bodyModel[274].addShapeBox(0, 0, 0, 106, 4, 4, 0, 0, 0, 0, -1, 0, 0, -1, 0, -3, 0, 0, -3, 0, -1, -1, -1, -1, -1, -1, -1, -2, 0, -1, -2);
		bodyModel[274].setRotationPoint(-75.0f, 3.0f, -22.0f);

		bodyModel[275] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 11
		bodyModel[275].addShapeBox(0, 0, 0, 7, 4, 4, 0, 0, 0, -3, -1, 0, 0, -1, 0, -1, 0, 0, 0, 0, -1, -2, -1, 0, -1, -1, 0, -2, 0, -1, -1);
		bodyModel[275].setRotationPoint(30.0f, 3.0f, -4.0f);

		bodyModel[276] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 12
		bodyModel[276].addShapeBox(0, 0, 0, 106, 4, 4, 0, -1, 0, -3, 0, 0, -3, 0, 0, 0, -1, 0, 0, -1, -1, -2, 0, -1, -2, 0, -1, -1, -1, -1, -1);
		bodyModel[276].setRotationPoint(-76.0f, 3.0f, -4.0f);

		bodyModel[277] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 13
		bodyModel[277].addShapeBox(0, 0, 0, 4, 1, 8, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[277].setRotationPoint(-88.0f, 2.0f, -19.0f);

		bodyModel[278] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 14
		bodyModel[278].addShapeBox(0, 0, 0, 4, 1, 8, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[278].setRotationPoint(-85.0f, 2.0f, -21.0f);

		bodyModel[279] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 15
		bodyModel[279].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[279].setRotationPoint(-81.0f, 2.0f, -22.0f);

		bodyModel[280] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 16
		bodyModel[280].addShapeBox(0, 0, 0, 4, 4, 8, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[280].setRotationPoint(-88.0f, 3.0f, -19.0f);

		bodyModel[281] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 17
		bodyModel[281].addShapeBox(0, 0, 0, 4, 4, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3);
		bodyModel[281].setRotationPoint(-88.0f, 3.0f, -11.0f);

		bodyModel[282] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 18
		bodyModel[282].addShapeBox(0, 0, 0, 4, 4, 8, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -1, -3, 0, 0, -1, 0, 0);
		bodyModel[282].setRotationPoint(-85.0f, 3.0f, -21.0f);

		bodyModel[283] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 19
		bodyModel[283].addShapeBox(0, 0, 0, 4, 4, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, -3, 0, 0, 0, 0, -1, -1, 0, -2);
		bodyModel[283].setRotationPoint(-85.0f, 3.0f, -9.0f);

		bodyModel[284] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 20
		bodyModel[284].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[284].setRotationPoint(-81.0f, 2.0f, -8.0f);

		bodyModel[285] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 21
		bodyModel[285].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[285].setRotationPoint(-88.0f, 3.0f, -4.0f);

		bodyModel[286] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 23
		bodyModel[286].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[286].setRotationPoint(-88.0f, 3.0f, -19.0f);

		bodyModel[287] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 25
		bodyModel[287].addShapeBox(0, 0, 0, 7, 4, 4, 0, -1, 0, -1, 0, 0, 0, 0, 0, -3, -1, 0, 0, -1, 0, -2, 0, -1, -1, 0, -1, -2, -1, 0, -1);
		bodyModel[287].setRotationPoint(-82.0f, 3.0f, -22.0f);

		bodyModel[288] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 26
		bodyModel[288].addShapeBox(0, 0, 0, 4, 1, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2);
		bodyModel[288].setRotationPoint(-85.0f, 2.0f, -9.0f);

		bodyModel[289] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 27
		bodyModel[289].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[289].setRotationPoint(-90.0f, 3.0f, -12.0f);

		bodyModel[290] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 28
		bodyModel[290].addShapeBox(0, 0, 0, 4, 16, 3, 0, -1, 0, -2, 0, 0, 0, 0, 0, -2.5f, -1, 0, -0.5f, -1, 0, -2, 0, 0, 0, 0, 0, -2.5f, -1, 0, -0.5f);
		bodyModel[290].setRotationPoint(-85.0f, -14.0f, -21.0f);

		bodyModel[291] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 29
		bodyModel[291].addShapeBox(0, 0, 0, 2, 16, 4, 0, -1, 0, -2, 0, 0, 0, 0, 0, -3.5f, -1.25f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -3.5f, -0.25f, 0, -2);
		bodyModel[291].setRotationPoint(-86.0f, -14.0f, -19.0f);

		bodyModel[292] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 30
		bodyModel[292].addShapeBox(0, 0, 0, 1, 16, 12, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 1, 0, 0);
		bodyModel[292].setRotationPoint(-85.0f, -14.0f, -17.0f);

		bodyModel[293] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 31
		bodyModel[293].addShapeBox(0, 0, 0, 4, 16, 3, 0, -1, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, -1, 0, -2, -1, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, -1, 0, -2);
		bodyModel[293].setRotationPoint(-85.0f, -14.0f, -4.0f);

		bodyModel[294] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 32
		bodyModel[294].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[294].setRotationPoint(-86.5f, 3.0f, -7.0f);

		bodyModel[295] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 33
		bodyModel[295].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[295].setRotationPoint(-86.5f, 3.0f, -8.0f);

		bodyModel[296] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 34
		bodyModel[296].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[296].setRotationPoint(-86.5f, 3.0f, -16.0f);

		bodyModel[297] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 35
		bodyModel[297].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[297].setRotationPoint(-86.5f, 3.0f, -14.0f);

		bodyModel[298] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 36
		bodyModel[298].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1);
		bodyModel[298].setRotationPoint(-81.0f, -14.0f, -1.0f);

		bodyModel[299] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 37
		bodyModel[299].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f);
		bodyModel[299].setRotationPoint(-81.0f, -14.0f, -22.0f);

		bodyModel[300] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 38
		bodyModel[300].addShapeBox(0, 0, 0, 2, 16, 4, 0, -1.25f, 0, -2, 0, 0, -3.5f, 0, 0, 0, -1, 0, -2, -0.25f, 0, -2, 0, 0, -3.5f, 0, 0, 0, 0, 0, -2);
		bodyModel[300].setRotationPoint(-86.0f, -14.0f, -7.0f);

		bodyModel[301] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 39
		bodyModel[301].addShapeBox(0, 0, 0, 7, 4, 4, 0, -1, 0, 0, 0, 0, -3, 0, 0, 0, -1, 0, -1, -1, 0, -1, 0, -1, -2, 0, -1, -1, -1, 0, -2);
		bodyModel[301].setRotationPoint(-82.0f, 3.0f, -4.0f);

		bodyModel[302] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 41
		bodyModel[302].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[302].setRotationPoint(-86.5f, -18.0f, -15.0f);

		bodyModel[303] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 42
		bodyModel[303].addShapeBox(0, 0, 0, 1, 2, 1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[303].setRotationPoint(-86.5f, -20.0f, -9.0f);

		bodyModel[304] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 43
		bodyModel[304].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1);
		bodyModel[304].setRotationPoint(-86.5f, -18.0f, -9.0f);

		bodyModel[305] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 44
		bodyModel[305].addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, -1, 0, -1, -0.5f, 0, 0, 0, -0.5f);
		bodyModel[305].setRotationPoint(-85.5f, -20.0f, -9.0f);

		bodyModel[306] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 46
		bodyModel[306].addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1.5f, -1, 0, -1.5f, 0, 0, 0, 0);
		bodyModel[306].setRotationPoint(-85.5f, -18.0f, -15.0f);

		bodyModel[307] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 48
		bodyModel[307].addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, -1, 0, 0, -1);
		bodyModel[307].setRotationPoint(-85.5f, -18.0f, -9.0f);

		bodyModel[308] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 49
		bodyModel[308].addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, -0.5f, 0, -1, -1, 0, 0, 0, 0);
		bodyModel[308].setRotationPoint(-85.5f, -20.0f, -15.0f);

		bodyModel[309] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 50
		bodyModel[309].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[309].setRotationPoint(40.5f, -20.0f, -9.0f);

		bodyModel[310] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 51
		bodyModel[310].addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, 0);
		bodyModel[310].setRotationPoint(31.5f, -20.0f, -9.0f);

		bodyModel[311] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 52
		bodyModel[311].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[311].setRotationPoint(40.5f, -20.0f, -13.5f);

		bodyModel[312] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 53
		bodyModel[312].addShapeBox(0, 0, 0, 1, 2, 1.5f, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1);
		bodyModel[312].setRotationPoint(40.5f, -20.0f, -15.0f);

		bodyModel[313] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 54
		bodyModel[313].addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, 0, -1, -1, 0);
		bodyModel[313].setRotationPoint(31.5f, -20.0f, -15.0f);

		bodyModel[314] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 55
		bodyModel[314].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[314].setRotationPoint(40.5f, -18.0f, -15.0f);

		bodyModel[315] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 56
		bodyModel[315].addShapeBox(0, 0, 0, 9, 2, 2, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, -1.5f, -1, 0, 0, -1, 0, 0, 0, 0, -1.5f, 0);
		bodyModel[315].setRotationPoint(31.5f, -18.0f, -15.0f);

		bodyModel[316] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 57
		bodyModel[316].addShapeBox(0, 0, 0, 1.5f, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[316].setRotationPoint(39.5f, -16.5f, -14.0f);

		bodyModel[317] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 58
		bodyModel[317].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[317].setRotationPoint(40.5f, -18.5f, -12.0f);

		bodyModel[318] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 59
		bodyModel[318].addShapeBox(0, 0, 0, 9, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0);
		bodyModel[318].setRotationPoint(31.5f, -20.0f, -13.0f);

		bodyModel[319] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 60
		bodyModel[319].addShapeBox(0, 0, 0, 9, 2, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -1.5f, 0, 0, 0, 0, 0, 0, -1, 0, -1.5f, -1);
		bodyModel[319].setRotationPoint(31.5f, -18.0f, -9.0f);

		bodyModel[320] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 61
		bodyModel[320].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1);
		bodyModel[320].setRotationPoint(40.5f, -18.0f, -9.0f);

		bodyModel[321] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 62
		bodyModel[321].addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, -1, 0, -4, -1, 0, -4, -1, -4, 0, -1, -4, 0, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, 0);
		bodyModel[321].setRotationPoint(39.0f, -20.0f, -11.0f);

		bodyModel[322] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 63
		bodyModel[322].addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, -1, -4, -4, -1, -4, -4, -1, 0, 0, -1, 0, 0, 0, 0, -3, 0, -2, -3, 0, 0, 0, 0, 0);
		bodyModel[322].setRotationPoint(39.0f, -20.0f, -17.0f);

		bodyModel[323] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 333
		bodyModel[323].addShapeBox(0, 0, 0, 4, 1, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3);
		bodyModel[323].setRotationPoint(-88.0f, 2.0f, -11.0f);

		bodyModel[324] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 334
		bodyModel[324].addShapeBox(0, 0, 0, 1.5f, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[324].setRotationPoint(39.5f, -16.5f, -11.0f);

		bodyModel[325] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 335
		bodyModel[325].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0);
		bodyModel[325].setRotationPoint(-86.5f, -20.0f, -13.5f);

		bodyModel[326] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 336
		bodyModel[326].addShapeBox(0, 0, 0, 1.5f, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[326].setRotationPoint(-86.5f, -16.5f, -14.0f);

		bodyModel[327] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 337
		bodyModel[327].addShapeBox(0, 0, 0, 1.5f, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[327].setRotationPoint(-86.5f, -16.5f, -11.0f);

		bodyModel[328] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 338
		bodyModel[328].addBox(0, 0, 0, 3, 2, 2, 0f);
		bodyModel[328].setRotationPoint(38.0f, -1.5f, -19.0f);

		bodyModel[329] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 339
		bodyModel[329].addBox(0, 0, 0, 3, 2, 2, 0f);
		bodyModel[329].setRotationPoint(38.0f, -1.5f, -5.0f);

		bodyModel[330] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 340
		bodyModel[330].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[330].setRotationPoint(43.0f, 2.0f, -6.0f);

		bodyModel[331] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 341
		bodyModel[331].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[331].setRotationPoint(-88.0f, 2.0f, -6.0f);

		bodyModel[332] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 342
		bodyModel[332].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[332].setRotationPoint(-88.0f, 2.0f, -20.0f);

		bodyModel[333] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 343
		bodyModel[333].addBox(0, 0, 0, 3, 2, 2, 0f);
		bodyModel[333].setRotationPoint(-86.0f, -1.5f, -19.0f);

		bodyModel[334] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 344
		bodyModel[334].addBox(0, 0, 0, 3, 2, 2, 0f);
		bodyModel[334].setRotationPoint(-86.0f, -1.5f, -5.0f);

		bodyModel[335] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 337
		bodyModel[335].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[335].setRotationPoint(21.5f, -9.0f, -0.5f);

		bodyModel[336] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 338
		bodyModel[336].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[336].setRotationPoint(14.5f, -9.0f, -0.5f);

		bodyModel[337] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 339
		bodyModel[337].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[337].setRotationPoint(14.5f, -9.0f, -22.5f);

		bodyModel[338] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 340
		bodyModel[338].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[338].setRotationPoint(21.5f, -9.0f, -22.5f);

		bodyModel[339] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 341
		bodyModel[339].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[339].setRotationPoint(-42.5f, -9.0f, -22.5f);

		bodyModel[340] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 342
		bodyModel[340].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[340].setRotationPoint(-35.5f, -9.0f, -22.5f);

		bodyModel[341] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 343
		bodyModel[341].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[341].setRotationPoint(-35.5f, -9.0f, -0.5f);

		bodyModel[342] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 344
		bodyModel[342].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[342].setRotationPoint(-42.5f, -9.0f, -0.5f);

		bodyModel[343] = new ModelRendererTurbo(this, 464, 48, textureX, textureY); // Box 345
		bodyModel[343].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[343].setRotationPoint(-57.0f, -14.0f, -21.5f);

		bodyModel[344] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 346
		bodyModel[344].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[344].setRotationPoint(-57.0f, -17.0f, -21.0f);

		flipAll();
	}

}
