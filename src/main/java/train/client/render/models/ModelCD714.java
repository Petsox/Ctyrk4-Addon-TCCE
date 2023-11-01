//FMT-Marker DFM-1.0

package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCD714 extends ModelConverter {

	private int textureX = 1024;
	private int textureY = 1024;

	public ModelCD714(){
		bodyModel = new ModelRendererTurbo[126];
		initGroup_bodyModel();
		flipAll();
	}

	private final void initGroup_bodyModel(){
		bodyModel = new ModelRendererTurbo[126];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 56
		bodyModel[0].addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 7, -1, 0, 0, -1, 0);
		bodyModel[0].setRotationPoint(7.0f, 5.0f, 6.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 57
		bodyModel[1].addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, -1, 0, 7, -1, 0, 7, 0, 0, 0, 0, 0);
		bodyModel[1].setRotationPoint(7.0f, 5.0f, -8.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 61
		bodyModel[2].addShapeBox(0, 7, 0, 1, 1, 1, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(7.0f, -4.0f, 6.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 62
		bodyModel[3].addShapeBox(0, 7, 0, 1, 1, 1, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0);
		bodyModel[3].setRotationPoint(7.0f, -4.0f, -8.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 63
		bodyModel[4].addShapeBox(0, -1, 0, 1, 1, 1, 0, 1, 1, 8, 1, 1, 8, 1, 1, 6, 1, 1, 6, 0, 0, 8, 0, 0, 8, 0, 0, 6, 0, 0, 6);
		bodyModel[4].setRotationPoint(3.0f, 5.0f, 0.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 65
		bodyModel[5].addShapeBox(0, -1, 0, 3, 1, 1, 0, 4, 1, 9, 0, 1, 9, 0, 1, 7, 4, 1, 7, 4, 0, 9, 0, 0, 9, 0, 0, 7, 4, 0, 7);
		bodyModel[5].setRotationPoint(-3.0f, 5.0f, 0.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 102
		bodyModel[6].addShapeBox(0, -1, 0, 1, 1, 1, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 7, -1, 0, 0, -1, 0, 0, 0, 0, 7, 0, 0);
		bodyModel[6].setRotationPoint(-16.0f, 5.0f, -8.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 103
		bodyModel[7].addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 7, -1, 0, 0, -1, 0);
		bodyModel[7].setRotationPoint(-23.0f, 5.0f, 6.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 106
		bodyModel[8].addShapeBox(0, 7, 0, 1, 1, 1, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0);
		bodyModel[8].setRotationPoint(-16.0f, -4.0f, -8.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 107
		bodyModel[9].addShapeBox(0, 7, 0, 1, 1, 1, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0);
		bodyModel[9].setRotationPoint(-16.0f, -4.0f, 6.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 108
		bodyModel[10].addShapeBox(0, -1, 0, 1, 1, 1, 0, 1, 1, 8, 1, 1, 8, 1, 1, 6, 1, 1, 6, 0, 0, 8, 0, 0, 8, 0, 0, 6, 0, 0, 6);
		bodyModel[10].setRotationPoint(-11.0f, 5.0f, 0.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 87
		bodyModel[11].addShapeBox(16, 4, 7, 1, 1, 1, 0, 41, 1, 16, 0, 1, 16, 0, 1, 0, 41, 1, 0, 41, 0, 16, 0, 0, 16, 0, 0, 0, 41, 0, 0);
		bodyModel[11].setRotationPoint(0.0f, -2.0f, 0.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 88
		bodyModel[12].addShapeBox(0, -1, 0, 1, 1, 1, 0, 0, 0, 16, 9, 0, 16, 9, 0, 0, 0, 0, 0, 0, 0, 16, 9, 0, 16, 9, 0, 0, 0, 0, 0);
		bodyModel[12].setRotationPoint(-14.0f, 1.0f, 7.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 90
		bodyModel[13].addShapeBox(0, -1, 0, 1, 1, 1, 0, -2, 6, 12, 12, 6, 12, 12, 6, -4, -2, 6, -4, -2, 0, 12, 12, 0, 12, 12, 0, -4, -2, 0, -4);
		bodyModel[13].setRotationPoint(-27.0f, 1.0f, 7.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 91
		bodyModel[14].addShapeBox(0, -1, 0, 1, 1, 1, 0, -7, 6, 12, 27, 6, 12, 27, 6, -4, -7, 6, -4, -7, 0, 12, 27, 0, 12, 27, 0, -4, -7, 0, -4);
		bodyModel[14].setRotationPoint(-11.0f, 1.0f, 7.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 96
		bodyModel[15].addShapeBox(0, -1, 0, 1, 11, 1, 0, -1, -5, 9, 0, -5, 9, 0, -5, 7, -1, -5, 7, -1, 0, 9, 0, 0, 9, 0, 0, 7, -1, 0, 7);
		bodyModel[15].setRotationPoint(-15.0f, -10.0f, 0.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 99
		bodyModel[16].addShapeBox(0, -1, 0, 1, 11, 1, 0, -1, -5, 9, 0, -5, 9, 0, -5, 7, -1, -5, 7, -1, 0, 9, 0, 0, 9, 0, 0, 7, -1, 0, 7);
		bodyModel[16].setRotationPoint(-5.0f, -10.0f, 0.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 101
		bodyModel[17].addShapeBox(0, -1, 0, 1, 11, 1, 0, -1, -5, 8, 0, -5, 8, 0, -5, 6, -1, -5, 6, -1, 0, 9, 0, 0, 9, 0, 0, 7, -1, 0, 7);
		bodyModel[17].setRotationPoint(-5.0f, -16.0f, 0.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 102
		bodyModel[18].addShapeBox(0, -1, 0, 1, 11, 1, 0, -1, -5, 8, 0, -5, 8, 0, -5, 6, -1, -5, 6, -1, 0, 9, 0, 0, 9, 0, 0, 7, -1, 0, 7);
		bodyModel[18].setRotationPoint(-15.0f, -16.0f, 0.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 103
		bodyModel[19].addShapeBox(0, -1, 0, 1, 1, 1, 0, -2, -1, -1, 1, 0, -1, 1, 5, 1, 8, 5, 1, -2, 0, -1, 1, 0, -1, 1, 0, 0, 8, 0, 0);
		bodyModel[19].setRotationPoint(-6.0f, -6.0f, -10.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 104
		bodyModel[20].addShapeBox(0, -1, 0, 1, 1, 1, 0, -2, -1, -1, 1, 0, -1, 1, 5, 0, 8, 5, 0, -2, 0, -1, 1, 0, -1, 1, 0, 0, 8, 0, 0);
		bodyModel[20].setRotationPoint(-6.0f, 0.0f, -10.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 105
		bodyModel[21].addShapeBox(0, -1, 0, 1, 1, 1, 0, -2, -1, -1, 1, 0, -1, 1, 5, 0, 8, 5, 0, -2, 0, -1, 1, 0, -1, 1, 0, 0, 8, 0, 0);
		bodyModel[21].setRotationPoint(-6.0f, 0.0f, 7.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 106
		bodyModel[22].addShapeBox(0, -1, 0, 1, 1, 1, 0, -2, -1, -1, 1, 0, -1, 1, 5, -1, 8, 5, -1, -2, 0, -1, 1, 0, -1, 1, 0, 0, 8, 0, 0);
		bodyModel[22].setRotationPoint(-6.0f, -6.0f, 7.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 107
		bodyModel[23].addShapeBox(0, -1, 0, 1, 1, 1, 0, 1, 0, 14, 10, 0, 14, 10, 0, -2, 1, 0, -2, 0, 0, 15, 9, 0, 15, 9, 0, -1, 0, 0, -1);
		bodyModel[23].setRotationPoint(-14.0f, -12.0f, 7.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 110
		bodyModel[24].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[24].setRotationPoint(-26.0f, 3.0f, -9.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 119
		bodyModel[25].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[25].setRotationPoint(-28.0f, -1.0f, 4.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 120
		bodyModel[26].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[26].setRotationPoint(-28.0f, -1.0f, -6.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 121
		bodyModel[27].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1);
		bodyModel[27].setRotationPoint(-27.0f, 3.0f, 7.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 122
		bodyModel[28].addBox(0, 0, 0, 1, 0, 1, 0f);
		bodyModel[28].setRotationPoint(-27.0f, 5.0f, 7.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 123
		bodyModel[29].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[29].setRotationPoint(-27.0f, 4.0f, 7.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 124
		bodyModel[30].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[30].setRotationPoint(-27.0f, 3.0f, 7.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 125
		bodyModel[31].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[31].setRotationPoint(-27.0f, 4.0f, -9.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 126
		bodyModel[32].addBox(0, 0, 0, 1, 0, 1, 0f);
		bodyModel[32].setRotationPoint(-27.0f, 5.0f, -9.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 127
		bodyModel[33].addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[33].setRotationPoint(-27.0f, 3.0f, -9.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 129
		bodyModel[34].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[34].setRotationPoint(-27.0f, 3.0f, -9.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 111
		bodyModel[35].addBox(0, 0, 0, 1, 2, 17, 0f);
		bodyModel[35].setRotationPoint(-26.0f, 1.0f, -9.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 112
		bodyModel[36].addBox(0, 0, 0, 1, 2, 15, 0f);
		bodyModel[36].setRotationPoint(-27.0f, 1.0f, -8.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 113
		bodyModel[37].addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[37].setRotationPoint(-27.0f, 1.0f, -9.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 114
		bodyModel[38].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[38].setRotationPoint(-27.0f, 1.0f, 7.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 115
		bodyModel[39].addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[39].setRotationPoint(-28.0f, 1.0f, -8.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 116
		bodyModel[40].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[40].setRotationPoint(-27.0f, 3.0f, -1.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 117
		bodyModel[41].addShapeBox(0, 0, 0, 1, 2, 7, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[41].setRotationPoint(-27.0f, 3.0f, -8.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 118
		bodyModel[42].addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[42].setRotationPoint(-27.0f, 3.0f, 0.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 119
		bodyModel[43].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[43].setRotationPoint(-29.0f, 2.0f, 4.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 120
		bodyModel[44].addShapeBox(0, -1, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[44].setRotationPoint(-29.0f, 2.0f, 3.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 121
		bodyModel[45].addShapeBox(0, -1, 0, 0, 2, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[45].setRotationPoint(-29.0f, 2.0f, -7.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 122
		bodyModel[46].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[46].setRotationPoint(-29.0f, 2.0f, -6.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 123
		bodyModel[47].addBox(0, 0, 0, 1, 2, 17, 0f);
		bodyModel[47].setRotationPoint(17.0f, 1.0f, -9.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 124
		bodyModel[48].addBox(0, 0, 0, 1, 2, 15, 0f);
		bodyModel[48].setRotationPoint(18.0f, 1.0f, -8.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 125
		bodyModel[49].addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[49].setRotationPoint(19.0f, 1.0f, -8.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 126
		bodyModel[50].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[50].setRotationPoint(19.0f, -1.0f, -6.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 127
		bodyModel[51].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[51].setRotationPoint(19.0f, -1.0f, 4.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 128
		bodyModel[52].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[52].setRotationPoint(-26.0f, 3.0f, 7.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 129
		bodyModel[53].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[53].setRotationPoint(17.0f, 3.0f, 7.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 130
		bodyModel[54].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[54].setRotationPoint(17.0f, 3.0f, -9.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 135
		bodyModel[55].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0);
		bodyModel[55].setRotationPoint(18.0f, 3.0f, 7.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 136
		bodyModel[56].addBox(0, 0, 0, 1, 0, 1, 0f);
		bodyModel[56].setRotationPoint(18.0f, 5.0f, 7.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 137
		bodyModel[57].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[57].setRotationPoint(18.0f, 4.0f, 7.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 138
		bodyModel[58].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[58].setRotationPoint(19.0f, 4.0f, 7.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 139
		bodyModel[59].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[59].setRotationPoint(19.0f, 3.0f, 7.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 140
		bodyModel[60].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[60].setRotationPoint(18.0f, 1.0f, 7.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 141
		bodyModel[61].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[61].setRotationPoint(18.0f, 1.0f, -9.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 142
		bodyModel[62].addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[62].setRotationPoint(18.0f, 3.0f, 0.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 143
		bodyModel[63].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[63].setRotationPoint(18.0f, 3.0f, -1.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 144
		bodyModel[64].addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[64].setRotationPoint(18.0f, 3.0f, -8.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 145
		bodyModel[65].addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[65].setRotationPoint(18.0f, 3.0f, -9.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 146
		bodyModel[66].addBox(0, 0, 0, 1, 0, 1, 0f);
		bodyModel[66].setRotationPoint(18.0f, 5.0f, -9.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 147
		bodyModel[67].addBox(0, 0, 0, 0, 1, 1, 0f);
		bodyModel[67].setRotationPoint(19.0f, 4.0f, -9.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 148
		bodyModel[68].addShapeBox(0, 0, 0, 0, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[68].setRotationPoint(19.0f, 3.0f, -9.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 149
		bodyModel[69].addShapeBox(0, -1, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[69].setRotationPoint(21.0f, 2.0f, 3.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 150
		bodyModel[70].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[70].setRotationPoint(19.0f, 2.0f, 4.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 151
		bodyModel[71].addShapeBox(0, -1, 0, 0, 2, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[71].setRotationPoint(21.0f, 2.0f, -7.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 152
		bodyModel[72].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[72].setRotationPoint(19.0f, 2.0f, -6.0f);

		bodyModel[73] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 153
		bodyModel[73].addBox(0, 0, 0, 0, 4, 1, 0f);
		bodyModel[73].setRotationPoint(20.0f, -3.0f, -5.0f);

		bodyModel[74] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 154
		bodyModel[74].addBox(0, 0, 0, 0, 4, 1, 0f);
		bodyModel[74].setRotationPoint(20.0f, -3.0f, 6.0f);

		bodyModel[75] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 156
		bodyModel[75].addBox(0, 0, 0, 0, 4, 1, 0f);
		bodyModel[75].setRotationPoint(20.0f, -3.0f, -8.0f);

		bodyModel[76] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 157
		bodyModel[76].addBox(0, 0, 0, 0, 1, 15, 0f);
		bodyModel[76].setRotationPoint(20.0f, -4.0f, -8.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 158
		bodyModel[77].addBox(0, 0, 0, 0, 4, 1, 0f);
		bodyModel[77].setRotationPoint(20.0f, -3.0f, 3.0f);

		bodyModel[78] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 159
		bodyModel[78].addBox(0, 0, 0, 0, 4, 1, 0f);
		bodyModel[78].setRotationPoint(-28.0f, -3.0f, -8.0f);

		bodyModel[79] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 160
		bodyModel[79].addBox(0, 0, 0, 0, 1, 15, 0f);
		bodyModel[79].setRotationPoint(-28.0f, -4.0f, -8.0f);

		bodyModel[80] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 161
		bodyModel[80].addBox(0, 0, 0, 0, 4, 1, 0f);
		bodyModel[80].setRotationPoint(-28.0f, -3.0f, -5.0f);

		bodyModel[81] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 162
		bodyModel[81].addBox(0, 0, 0, 0, 4, 1, 0f);
		bodyModel[81].setRotationPoint(-28.0f, -3.0f, 3.0f);

		bodyModel[82] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 163
		bodyModel[82].addBox(0, 0, 0, 0, 4, 1, 0f);
		bodyModel[82].setRotationPoint(-28.0f, -3.0f, 6.0f);

		bodyModel[83] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 164
		bodyModel[83].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[83].setRotationPoint(-26.0f, -3.0f, 8.0f);

		bodyModel[84] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 165
		bodyModel[84].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[84].setRotationPoint(-15.0f, -3.0f, 8.0f);

		bodyModel[85] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 166
		bodyModel[85].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[85].setRotationPoint(-22.0f, -3.0f, 8.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 167
		bodyModel[86].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[86].setRotationPoint(-19.0f, -3.0f, 8.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 168
		bodyModel[87].addBox(0, 0, 0, 12, 1, 0, 0f);
		bodyModel[87].setRotationPoint(-26.0f, -4.0f, 8.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 169
		bodyModel[88].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[88].setRotationPoint(-15.0f, -3.0f, -9.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 170
		bodyModel[89].addBox(0, 0, 0, 12, 1, 0, 0f);
		bodyModel[89].setRotationPoint(-26.0f, -4.0f, -9.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 171
		bodyModel[90].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[90].setRotationPoint(-19.0f, -3.0f, -9.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 172
		bodyModel[91].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[91].setRotationPoint(-22.0f, -3.0f, -9.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 173
		bodyModel[92].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[92].setRotationPoint(-26.0f, -3.0f, -9.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 174
		bodyModel[93].addBox(0, 0, 0, 1, 8, 1, 0f);
		bodyModel[93].setRotationPoint(-2.0f, -14.0f, 2.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 175
		bodyModel[94].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[94].setRotationPoint(-4.0f, -3.0f, 8.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 178
		bodyModel[95].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[95].setRotationPoint(0.0f, -3.0f, 8.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 179
		bodyModel[96].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[96].setRotationPoint(4.0f, -3.0f, 8.0f);

		bodyModel[97] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 181
		bodyModel[97].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[97].setRotationPoint(17.0f, -3.0f, 8.0f);

		bodyModel[98] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 182
		bodyModel[98].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[98].setRotationPoint(13.0f, -3.0f, 8.0f);

		bodyModel[99] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 183
		bodyModel[99].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[99].setRotationPoint(9.0f, -3.0f, 8.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 177
		bodyModel[100].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[100].setRotationPoint(17.0f, -3.0f, -9.0f);

		bodyModel[101] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 178
		bodyModel[101].addBox(0, 0, 0, 22, 1, 0, 0f);
		bodyModel[101].setRotationPoint(-4.0f, -4.0f, -9.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 179
		bodyModel[102].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[102].setRotationPoint(13.0f, -3.0f, -9.0f);

		bodyModel[103] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 180
		bodyModel[103].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[103].setRotationPoint(9.0f, -3.0f, -9.0f);

		bodyModel[104] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 181
		bodyModel[104].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[104].setRotationPoint(4.0f, -3.0f, -9.0f);

		bodyModel[105] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 182
		bodyModel[105].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[105].setRotationPoint(0.0f, -3.0f, -9.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 183
		bodyModel[106].addBox(0, 0, 0, 1, 4, 0, 0f);
		bodyModel[106].setRotationPoint(-4.0f, -3.0f, -9.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 184
		bodyModel[107].addBox(0, 0, 0, 22, 1, 0, 0f);
		bodyModel[107].setRotationPoint(-4.0f, -4.0f, 8.0f);

		bodyModel[108] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 184
		bodyModel[108].addBox(0, 0, 0, 1, 6, 4, 0f);
		bodyModel[108].setRotationPoint(-5.0f, -6.0f, -9.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 185
		bodyModel[109].addBox(0, 0, 0, 2, 1, 4, 0f);
		bodyModel[109].setRotationPoint(-7.0f, -5.0f, -9.0f);

		bodyModel[110] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 186
		bodyModel[110].addBox(0, 0, 0, 2, 1, 4, 0f);
		bodyModel[110].setRotationPoint(-13.0f, -5.0f, 4.0f);

		bodyModel[111] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 187
		bodyModel[111].addBox(0, 0, 0, 1, 6, 4, 0f);
		bodyModel[111].setRotationPoint(-14.0f, -6.0f, 4.0f);

		bodyModel[112] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 188
		bodyModel[112].addBox(0, 0, 0, 2, 6, 6, 0f);
		bodyModel[112].setRotationPoint(-14.0f, -6.0f, -4.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 189
		bodyModel[113].addBox(0, 0, 0, 2, 6, 6, 0f);
		bodyModel[113].setRotationPoint(-6.0f, -6.0f, -3.0f);

		bodyModel[114] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 191
		bodyModel[114].addBox(0, 1, 0, 3, 3, 0, 0f);
		bodyModel[114].setRotationPoint(-17.0f, 2.0f, -7.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 192
		bodyModel[115].addBox(0, 1, 0, 3, 3, 0, 0f);
		bodyModel[115].setRotationPoint(-24.0f, 2.0f, -7.0f);

		bodyModel[116] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 193
		bodyModel[116].addBox(0, 1, 0, 3, 3, 0, 0f);
		bodyModel[116].setRotationPoint(-17.0f, 2.0f, 6.0f);

		bodyModel[117] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 194
		bodyModel[117].addBox(0, 1, 0, 3, 3, 0, 0f);
		bodyModel[117].setRotationPoint(-24.0f, 2.0f, 6.0f);

		bodyModel[118] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 195
		bodyModel[118].addBox(0, 1, 0, 3, 3, 0, 0f);
		bodyModel[118].setRotationPoint(13.0f, 2.0f, -7.0f);

		bodyModel[119] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 196
		bodyModel[119].addBox(0, 1, 0, 3, 3, 0, 0f);
		bodyModel[119].setRotationPoint(6.0f, 2.0f, -7.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 197
		bodyModel[120].addBox(0, 1, 0, 3, 3, 0, 0f);
		bodyModel[120].setRotationPoint(6.0f, 2.0f, 6.0f);

		bodyModel[121] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 198
		bodyModel[121].addBox(0, 1, 0, 3, 3, 0, 0f);
		bodyModel[121].setRotationPoint(13.0f, 2.0f, 6.0f);

		bodyModel[122] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 199
		bodyModel[122].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[122].setRotationPoint(14.0f, 4.0f, -7.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 200
		bodyModel[123].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[123].setRotationPoint(7.0f, 4.0f, -7.0f);

		bodyModel[124] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 201
		bodyModel[124].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[124].setRotationPoint(-23.0f, 4.0f, -7.0f);

		bodyModel[125] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 202
		bodyModel[125].addBox(0, 0, 0, 1, 1, 13, 0f);
		bodyModel[125].setRotationPoint(-16.0f, 4.0f, -7.0f);

		flipAll();
	}

}
