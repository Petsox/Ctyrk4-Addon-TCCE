//FMT-Marker DFM-1.0

package cz.ctyrkaten.train.client.render.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCD363 extends ModelConverter{

	private int textureX = 512;
	private int textureY = 512;
	public ModelCD363() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[68];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1(){
		bodyModel = new ModelRendererTurbo[68];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[0].addBox(0, 0, 0, 60, 20, 24, 0f);
		bodyModel[0].setRotationPoint(-30.0f, -17.0f, -12.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15
		bodyModel[1].addShapeBox(0, 0, 0, 14, 3, 22, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0);
		bodyModel[1].setRotationPoint(-44.0f, 0.0f, -11.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 15
		bodyModel[2].addShapeBox(0, 0, 0, 20, 5, 20, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(-10.0f, 3.0f, -10.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[3].addBox(0, 0, 0, 9, 1, 1, 0f);
		bodyModel[3].setRotationPoint(-26.0f, -23.0f, -0.5f);

		bodyModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 31
		bodyModel[4].addShapeBox(0, 0, 0, 11, 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0);
		bodyModel[4].setRotationPoint(-26.0f, -24.0f, -0.5f);

		bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 32
		bodyModel[5].addShapeBox(0, 0, 0, 11, 1, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0);
		bodyModel[5].setRotationPoint(-26.0f, -24.0f, 0.5f);

		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 33
		bodyModel[6].addBox(0, 0, 0, 1, 0, 8, 0f);
		bodyModel[6].setRotationPoint(-16.0f, -24.0f, -4.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 34
		bodyModel[7].addBox(0, 0, 0, 1, 1, 6, 0f);
		bodyModel[7].setRotationPoint(-17.0f, -23.0f, -3.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 35
		bodyModel[8].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[8].setRotationPoint(-26.0f, -22.0f, -0.5f);

		bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 36
		bodyModel[9].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[9].setRotationPoint(-17.0f, -22.0f, -3.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 37
		bodyModel[10].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[10].setRotationPoint(-17.0f, -22.0f, 2.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 38
		bodyModel[11].addBox(0, 0, 0, 1, 1, 1, 0f);
		bodyModel[11].setRotationPoint(25.0f, -22.0f, -0.5f);

		bodyModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 42
		bodyModel[12].addBox(-1, 0, 0, 1, 1, 6, 0f);
		bodyModel[12].setRotationPoint(17.0f, -23.0f, -3.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 43
		bodyModel[13].addBox(-1, 0, 0, 1, 1, 1, 0f);
		bodyModel[13].setRotationPoint(17.0f, -22.0f, -3.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 45
		bodyModel[14].addBox(-1, 0, 0, 1, 1, 1, 0f);
		bodyModel[14].setRotationPoint(17.0f, -22.0f, 2.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 46
		bodyModel[15].addBox(0, 0, 0, 9, 0, 1, 0f);
		bodyModel[15].setRotationPoint(17.0f, -22.0f, -0.5f);

		bodyModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 47
		bodyModel[16].addBox(0, 0, 0, 3, 1, 1, 0f);
		bodyModel[16].setRotationPoint(-47.0f, 1.5f, -8.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 48
		bodyModel[17].addBox(0, 0, 0, 3, 1, 1, 0f);
		bodyModel[17].setRotationPoint(-47.0f, 1.5f, 7.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 49
		bodyModel[18].addBox(0, 0, 0, 0, 2, 3, 0f);
		bodyModel[18].setRotationPoint(-47.0f, 1.0f, -9.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 50
		bodyModel[19].addBox(0, 0, 0, 0, 2, 3, 0f);
		bodyModel[19].setRotationPoint(-47.0f, 1.0f, 6.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 51
		bodyModel[20].addBox(0, 0, 0, 3, 1, 1, 0f);
		bodyModel[20].setRotationPoint(44.0f, 1.5f, 7.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 52
		bodyModel[21].addBox(0, 0, 0, 3, 1, 1, 0f);
		bodyModel[21].setRotationPoint(44.0f, 1.5f, -8.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 53
		bodyModel[22].addBox(0, 0, 0, 0, 2, 3, 0f);
		bodyModel[22].setRotationPoint(47.0f, 1.0f, -9.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 54
		bodyModel[23].addBox(0, 0, 0, 0, 2, 3, 0f);
		bodyModel[23].setRotationPoint(47.0f, 1.0f, 6.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 55
		bodyModel[24].addBox(0, 0, 0, 12, 3, 6, 0f);
		bodyModel[24].setRotationPoint(-42.0f, -21.5f, -3.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 56
		bodyModel[25].addBox(0, 0, 0, 12, 3, 6, 0f);
		bodyModel[25].setRotationPoint(30.0f, -21.5f, -3.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 51
		bodyModel[26].addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0);
		bodyModel[26].setRotationPoint(17.0f, -23.0f, -0.5f);

		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52
		bodyModel[27].addShapeBox(0, 0, 0, 11, 1, 0, 0, 0, 0, 0, -22, 3, -3, -22, 3, 3, 0, 0, 0, 0, 0, 0, -22, -3, -3, -22, -3, 3, 0, 0, 0);
		bodyModel[27].setRotationPoint(26.0f, -27.0f, 0.5f);

		bodyModel[28] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 53
		bodyModel[28].addShapeBox(0, 0, 0, 11, 1, 0, 0, 0, 0, 0, -22, 3, 3, -22, 3, -3, 0, 0, 0, 0, 0, 0, -22, -3, 3, -22, -3, -3, 0, 0, 0);
		bodyModel[28].setRotationPoint(26.0f, -27.0f, -0.5f);

		bodyModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 54
		bodyModel[29].addBox(1, 0, 0, 1, 0, 8, 0f);
		bodyModel[29].setRotationPoint(14.0f, -30.0f, -4.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 55
		bodyModel[30].addShapeBox(0, 0, 0, 14, 17, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[30].setRotationPoint(-44.0f, -17.0f, -12.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 56
		bodyModel[31].addShapeBox(0, 0, 0, 14, 17, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[31].setRotationPoint(-44.0f, -17.0f, 10.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 57
		bodyModel[32].addShapeBox(0, 0, 0, 2, 10, 22, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[32].setRotationPoint(-46.0f, -18.0f, -11.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 58
		bodyModel[33].addShapeBox(0, 0, 0, 6, 9, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[33].setRotationPoint(-46.0f, -8.0f, -11.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 59
		bodyModel[34].addShapeBox(0, 0, 0, 14, 1, 24, 0, 0, 0, -1, 0, 3, -4, 0, 3, -4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[34].setRotationPoint(-44.0f, -18.0f, -12.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 60
		bodyModel[35].addShapeBox(0, 0, 0, 19, 4, 24, 0, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[35].setRotationPoint(-30.0f, -21.0f, -12.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 61
		bodyModel[36].addShapeBox(0, 0, 0, 19, 4, 24, 0, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[36].setRotationPoint(11.0f, -21.0f, -12.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 62
		bodyModel[37].addShapeBox(0, 0, 0, 22, 4, 24, 0, 0, 1, -5, 0, 1, -5, 0, 3, -7, 0, 3, -7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[37].setRotationPoint(-11.0f, -21.0f, -12.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 63
		bodyModel[38].addShapeBox(0, 0, 0, 14, 17, 2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[38].setRotationPoint(30.0f, -17.0f, -12.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 64
		bodyModel[39].addShapeBox(0, 0, 0, 14, 17, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[39].setRotationPoint(30.0f, -17.0f, 10.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 65
		bodyModel[40].addShapeBox(0, 0, 0, 14, 1, 24, 0, 0, 3, -4, 0, 0, -1, 0, 0, -1, 0, 3, -4, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0);
		bodyModel[40].setRotationPoint(30.0f, -18.0f, -12.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 66
		bodyModel[41].addShapeBox(0, 0, 0, 14, 3, 22, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1);
		bodyModel[41].setRotationPoint(30.0f, 0.0f, -11.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 67
		bodyModel[42].addShapeBox(0, 0, 0, 2, 10, 22, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[42].setRotationPoint(44.0f, -18.0f, -11.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 69
		bodyModel[43].addShapeBox(0, 0, 0, 6, 9, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[43].setRotationPoint(40.0f, -8.0f, -11.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 70
		bodyModel[44].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[44].setRotationPoint(-21.0f, 3.0f, -6.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 71
		bodyModel[45].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[45].setRotationPoint(-21.0f, 3.0f, 6.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
		bodyModel[46].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[46].setRotationPoint(-34.0f, 3.0f, 6.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 73
		bodyModel[47].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[47].setRotationPoint(-34.0f, 3.0f, -6.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 74
		bodyModel[48].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[48].setRotationPoint(14.0f, 3.0f, -6.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 75
		bodyModel[49].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[49].setRotationPoint(14.0f, 3.0f, 6.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 76
		bodyModel[50].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[50].setRotationPoint(27.0f, 3.0f, 6.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 77
		bodyModel[51].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[51].setRotationPoint(27.0f, 3.0f, -6.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 78
		bodyModel[52].addBox(0, 0, 0, 18, 5, 11, 0f);
		bodyModel[52].setRotationPoint(-33.0f, 3.0f, -5.5f);

		bodyModel[53] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 79
		bodyModel[53].addBox(0, 0, 0, 18, 5, 11, 0f);
		bodyModel[53].setRotationPoint(15.0f, 3.0f, -5.5f);

		bodyModel[54] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 80
		bodyModel[54].addBox(0, 0, 0, 3, 3, 18, 0f);
		bodyModel[54].setRotationPoint(-41.0f, 4.0f, -9.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 81
		bodyModel[55].addBox(0, 0, 0, 2, 1, 14, 0f);
		bodyModel[55].setRotationPoint(-40.5f, 3.0f, -7.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 82
		bodyModel[56].addBox(0, 0, 0, 2, 1, 14, 0f);
		bodyModel[56].setRotationPoint(38.5f, 3.0f, -7.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 83
		bodyModel[57].addBox(0, 0, 0, 3, 3, 18, 0f);
		bodyModel[57].setRotationPoint(38.0f, 4.0f, -9.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 84
		bodyModel[58].addBox(0, 0, 0, 0, 5, 18, 0f);
		bodyModel[58].setRotationPoint(43.8f, 3.0f, -9.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 85
		bodyModel[59].addBox(0, 0, 0, 0, 5, 18, 0f);
		bodyModel[59].setRotationPoint(-43.8f, 3.0f, -9.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 86
		bodyModel[60].addBox(0, 0, 0, 2, 0, 22, 0f);
		bodyModel[60].setRotationPoint(-46.0f, 0.0f, -11.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 87
		bodyModel[61].addBox(0, 0, 0, 2, 0, 22, 0f);
		bodyModel[61].setRotationPoint(44.0f, 0.0f, -11.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 88
		bodyModel[62].addShapeBox(0, 0, 0, 0, 2, 10, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1);
		bodyModel[62].setRotationPoint(-44.0f, 3.0f, -5.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 90
		bodyModel[63].addShapeBox(0, 0, 0, 0, 2, 10, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1);
		bodyModel[63].setRotationPoint(44.0f, 3.0f, -5.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 91
		bodyModel[64].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[64].setRotationPoint(-37.0f, 3.0f, -11.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 92
		bodyModel[65].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[65].setRotationPoint(-37.0f, 3.0f, 11.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 93
		bodyModel[66].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[66].setRotationPoint(33.0f, 3.0f, 11.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 94
		bodyModel[67].addBox(0, 0, 0, 4, 4, 0, 0f);
		bodyModel[67].setRotationPoint(33.0f, 3.0f, -11.0f);

		flipAll();
	}

}
