//FMT-Marker DFM-1.0

package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;


/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCD451Coach extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public ModelCD451Coach(){

		bodyModel = new ModelRendererTurbo[406];

		initGroup_bodyModel();

		translateAll(0F, 1F, 0F);

		flipAll();

	}
		private final void initGroup_bodyModel(){
		bodyModel = new ModelRendererTurbo[72];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[0].addBox(0, 0, 0, 5, 5, 0, 0f);
		bodyModel[0].setRotationPoint(-15.0f, 5.0f, 9.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		bodyModel[1].addBox(0, 0, 0, 5, 5, 0, 0f);
		bodyModel[1].setRotationPoint(-28.0f, 5.0f, 9.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		bodyModel[2].addBox(0, 0, 0, 3, 2, 1, 0f);
		bodyModel[2].setRotationPoint(-27.0f, 5.0f, -8.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		bodyModel[3].addBox(0, 0, 0, 5, 5, 0, 0f);
		bodyModel[3].setRotationPoint(-15.0f, 5.0f, -7.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 9
		bodyModel[4].addBox(0, 0, 0, 71, 0, 20, 0f);
		bodyModel[4].setRotationPoint(-28.0f, 4.0f, -9.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
		bodyModel[5].addBox(0, 0, 0, 5, 5, 0, 0f);
		bodyModel[5].setRotationPoint(-28.0f, 5.0f, -7.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		bodyModel[6].addBox(0, 0, 0, 3, 2, 1, 0f);
		bodyModel[6].setRotationPoint(-14.0f, 5.0f, -8.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		bodyModel[7].addBox(0, 0, 0, 6, 2, 1, 0f);
		bodyModel[7].setRotationPoint(-22.0f, 7.0f, -8.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 13
		bodyModel[8].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[8].setRotationPoint(-24.0f, 5.0f, -8.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 14
		bodyModel[9].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[9].setRotationPoint(-16.0f, 5.0f, -8.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 15
		bodyModel[10].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[10].setRotationPoint(29.0f, 5.0f, 9.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 16
		bodyModel[11].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[11].setRotationPoint(-24.0f, 7.0f, -8.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 17
		bodyModel[12].addBox(0, 0, 0, 3, 2, 1, 0f);
		bodyModel[12].setRotationPoint(-14.0f, 5.0f, 9.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 18
		bodyModel[13].addBox(0, 0, 0, 3, 2, 1, 0f);
		bodyModel[13].setRotationPoint(-27.0f, 5.0f, 9.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
		bodyModel[14].addBox(0, 0, 0, 6, 2, 1, 0f);
		bodyModel[14].setRotationPoint(-22.0f, 7.0f, 9.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 20
		bodyModel[15].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(-24.0f, 5.0f, 9.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 21
		bodyModel[16].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[16].setRotationPoint(-24.0f, 7.0f, 9.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 22
		bodyModel[17].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(-16.0f, 7.0f, 9.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 23
		bodyModel[18].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[18].setRotationPoint(-16.0f, 5.0f, 9.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 24
		bodyModel[19].addBox(0, 0, 0, 71, 0, 20, 0f);
		bodyModel[19].setRotationPoint(-28.0f, 3.0f, -9.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[20].addBox(0, 0, 0, 71, 16, 0, 0f);
		bodyModel[20].setRotationPoint(-28.0f, -12.0f, -9.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 28
		bodyModel[21].addBox(0, 0, 0, 71, 16, 0, 0f);
		bodyModel[21].setRotationPoint(-28.0f, -12.0f, 10.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 49
		bodyModel[22].addBox(0, 0, 0, 71, 16, 0, 0f);
		bodyModel[22].setRotationPoint(-28.0f, -12.0f, 11.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 109
		bodyModel[23].addBox(0, 0, 0, 0, 16, 1, 0f);
		bodyModel[23].setRotationPoint(-28.0f, -12.0f, 10.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 110
		bodyModel[24].addBox(0, 0, 0, 0, 16, 1, 0f);
		bodyModel[24].setRotationPoint(-28.0f, -12.0f, -9.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 114
		bodyModel[25].addBox(0, 0, 0, 0, 16, 18, 0f);
		bodyModel[25].setRotationPoint(-18.5f, -12.0f, -8.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 116
		bodyModel[26].addShapeBox(0, 0, 0, 71, 1.5f, 6.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[26].setRotationPoint(-28.0f, -14.0f, -9.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 118
		bodyModel[27].addShapeBox(0, 0, 0, 71, 1.5f, 6.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(-28.0f, -14.0f, 5.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 126
		bodyModel[28].addBox(0, 0, 0, 0, 16, 20, 0f);
		bodyModel[28].setRotationPoint(43.0f, -12.0f, -9.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 127
		bodyModel[29].addBox(0, 0, 0, 29, 2, 20, 0f);
		bodyModel[29].setRotationPoint(-6.0f, 4.0f, -9.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 128
		bodyModel[30].addShapeBox(0, 0, 0, 3, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[30].setRotationPoint(-9.0f, 4.0f, -9.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 129
		bodyModel[31].addShapeBox(0, 0, 0, 3, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[31].setRotationPoint(23.0f, 4.0f, -9.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 130
		bodyModel[32].addBox(0, 0, 0, 19, 4, 13, 0f);
		bodyModel[32].setRotationPoint(-28.0f, 4.0f, -5.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 131
		bodyModel[33].addBox(0, 0, 0, 16, 4, 13, 0f);
		bodyModel[33].setRotationPoint(26.0f, 4.0f, -5.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 132
		bodyModel[34].addBox(0, 0, 0, 6, 2, 1, 0f);
		bodyModel[34].setRotationPoint(31.0f, 7.0f, -8.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 133
		bodyModel[35].addBox(0, 0, 0, 3, 2, 1, 0f);
		bodyModel[35].setRotationPoint(26.0f, 5.0f, -8.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 134
		bodyModel[36].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[36].setRotationPoint(37.0f, 5.0f, -8.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 135
		bodyModel[37].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[37].setRotationPoint(-16.0f, 7.0f, -8.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 136
		bodyModel[38].addBox(0, 0, 0, 5, 5, 0, 0f);
		bodyModel[38].setRotationPoint(38.0f, 5.0f, -7.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 137
		bodyModel[39].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[39].setRotationPoint(29.0f, 7.0f, -8.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 138
		bodyModel[40].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[40].setRotationPoint(37.0f, 7.0f, -8.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 139
		bodyModel[41].addBox(0, 0, 0, 3, 2, 1, 0f);
		bodyModel[41].setRotationPoint(39.0f, 5.0f, -8.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 140
		bodyModel[42].addBox(0, 0, 0, 5, 5, 0, 0f);
		bodyModel[42].setRotationPoint(25.0f, 5.0f, -7.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 142
		bodyModel[43].addBox(0, 0, 0, 3, 2, 1, 0f);
		bodyModel[43].setRotationPoint(39.0f, 5.0f, 9.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 143
		bodyModel[44].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[44].setRotationPoint(37.0f, 7.0f, 9.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 144
		bodyModel[45].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[45].setRotationPoint(37.0f, 5.0f, 9.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 145
		bodyModel[46].addBox(0, 0, 0, 6, 2, 1, 0f);
		bodyModel[46].setRotationPoint(31.0f, 7.0f, 9.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 146
		bodyModel[47].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[47].setRotationPoint(29.0f, 7.0f, 9.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 147
		bodyModel[48].addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[48].setRotationPoint(29.0f, 5.0f, -8.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 148
		bodyModel[49].addBox(0, 0, 0, 3, 2, 1, 0f);
		bodyModel[49].setRotationPoint(26.0f, 5.0f, 9.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 149
		bodyModel[50].addBox(0, 0, 0, 5, 5, 0, 0f);
		bodyModel[50].setRotationPoint(25.0f, 5.0f, 9.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 150
		bodyModel[51].addBox(0, 0, 0, 5, 5, 0, 0f);
		bodyModel[51].setRotationPoint(38.0f, 5.0f, 9.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 151
		bodyModel[52].addBox(0, 0, 0, 71, 1, 8, 0f);
		bodyModel[52].setRotationPoint(-28.0f, -14.0f, -3.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 164
		bodyModel[53].addBox(0, 0, 0, 1, 1, 6, 0f);
		bodyModel[53].setRotationPoint(43.0f, -11.0f, -2.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 165
		bodyModel[54].addBox(0, 0, 0, 1, 9, 1, 0f);
		bodyModel[54].setRotationPoint(43.0f, -10.0f, -3.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 166
		bodyModel[55].addBox(0, 0, 0, 1, 1, 6, 0f);
		bodyModel[55].setRotationPoint(43.0f, 0.0f, -2.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 167
		bodyModel[56].addBox(0, 0, 0, 1, 9, 1, 0f);
		bodyModel[56].setRotationPoint(43.0f, -10.0f, 4.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 168
		bodyModel[57].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(43.0f, -11.0f, 4.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 169
		bodyModel[58].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[58].setRotationPoint(43.0f, -11.0f, -3.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 170
		bodyModel[59].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[59].setRotationPoint(43.0f, 0.0f, -3.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 171
		bodyModel[60].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0);
		bodyModel[60].setRotationPoint(43.0f, 0.0f, 4.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 127
		bodyModel[61].addBox(0, 0, 0, 0, 16, 20, 0f);
		bodyModel[61].setRotationPoint(-28.0f, -12.0f, -9.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 128
		bodyModel[62].addBox(0, 0, 0, 1, 1, 6, 0f);
		bodyModel[62].setRotationPoint(-29.0f, 0.0f, -2.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 129
		bodyModel[63].addBox(0, 0, 0, 1, 9, 1, 0f);
		bodyModel[63].setRotationPoint(-29.0f, -10.0f, 4.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 130
		bodyModel[64].addBox(0, 0, 0, 1, 9, 1, 0f);
		bodyModel[64].setRotationPoint(-29.0f, -10.0f, -3.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 131
		bodyModel[65].addBox(0, 0, 0, 1, 1, 6, 0f);
		bodyModel[65].setRotationPoint(-29.0f, -11.0f, -2.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 132
		bodyModel[66].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[66].setRotationPoint(-29.0f, -11.0f, 4.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 133
		bodyModel[67].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[67].setRotationPoint(-29.0f, -11.0f, -3.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 134
		bodyModel[68].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[68].setRotationPoint(-29.0f, 0.0f, -3.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 135
		bodyModel[69].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0);
		bodyModel[69].setRotationPoint(-29.0f, 0.0f, 4.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 136
		bodyModel[70].addBox(0, 0, 0, 71, 16, 0, 0f);
		bodyModel[70].setRotationPoint(-28.0f, -12.0f, -8.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 137
		bodyModel[71].addBox(0, 0, 0, 0, 16, 18, 0f);
		bodyModel[71].setRotationPoint(-18.5f, -12.0f, -8.0f);

		flipAll();
	}

}
