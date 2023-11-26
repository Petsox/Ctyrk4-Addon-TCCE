package cz.ctyrkaten.train.client.render.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelCD854 extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public ModelCD854() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[346];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	public void initbodyModel_1(){
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
		bodyModel[4].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(39.0f, 2.0f, -19.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 95
		bodyModel[5].addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(36.0f, 2.0f, -21.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 97
		bodyModel[6].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0);
		bodyModel[6].setRotationPoint(39.0f, 2.0f, -11.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 99
		bodyModel[7].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[7].setRotationPoint(30.0f, 2.0f, -22.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		bodyModel[8].addShapeBox(0, 0, 0, 4, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[8].setRotationPoint(37.0f, -3.0f, -20.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 90
		bodyModel[9].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.75f, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[9].setRotationPoint(31.0f, -20.0f, -11.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 91
		bodyModel[10].addShapeBox(0, 0, 0, 4, 3, 5, 0, 0, 0, -3, -1, 0, 0, -1, 0, -4, 0, 0, -2, 0, 0, -4, -1, 0, -2, -1, 0, -2, 0, 0, 0);
		bodyModel[10].setRotationPoint(36.0f, -17.0f, -6.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 97
		bodyModel[11].addShapeBox(0, 0, 0, 4, 3, 8, 0, 0, -0.5f, 0, -1, -1, 0, -1, -1, -6, 0, -0.75f, -4, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0);
		bodyModel[11].setRotationPoint(36.0f, -20.0f, -11.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 98
		bodyModel[12].addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, -1, -4, -4, -1, -4, -4, -1, 0, 0, -1, 0, 0, 0, 0, -3, 0, -2, -3, 0, 0, 0, 0, 0);
		bodyModel[12].setRotationPoint(39.0f, -20.0f, -17.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 100
		bodyModel[13].addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, -1, 0, -4, -1, 0, -4, -1, -4, 0, -1, -4, 0, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, 0);
		bodyModel[13].setRotationPoint(39.0f, -20.0f, -11.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 109
		bodyModel[14].addShapeBox(0, 0, 0, 4, 5, 8, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0);
		bodyModel[14].setRotationPoint(38.0f, 3.0f, -19.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 110
		bodyModel[15].addShapeBox(0, 0, 0, 4, 5, 8, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0);
		bodyModel[15].setRotationPoint(38.0f, 3.0f, -11.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 111
		bodyModel[16].addShapeBox(0, 0, 0, 4, 5, 8, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -2, -1, 0, 0, -3, 0, 0);
		bodyModel[16].setRotationPoint(35.0f, 3.0f, -21.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 112
		bodyModel[17].addShapeBox(0, 0, 0, 4, 5, 8, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, -3, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -1);
		bodyModel[17].setRotationPoint(35.0f, 3.0f, -9.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 114
		bodyModel[18].addShapeBox(0, 0, 0, 7, 5, 4, 0, 0, 0, -1, -1, 0, 0, -1, 0, -1, 0, 0, 0, 0, -4.5f, -1, -1, 0, -1, -1, 0, -2, 0, -4.5f, -1);
		bodyModel[18].setRotationPoint(29.0f, 3.0f, -4.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 109
		bodyModel[19].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0);
		bodyModel[19].setRotationPoint(30.0f, 2.0f, -8.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 114
		bodyModel[20].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[20].setRotationPoint(38.0f, 3.0f, -4.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 115
		bodyModel[21].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[21].setRotationPoint(42.0f, 2.0f, -6.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 116
		bodyModel[22].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[22].setRotationPoint(38.0f, 3.0f, -19.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 117
		bodyModel[23].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[23].setRotationPoint(42.0f, 2.0f, -20.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 119
		bodyModel[24].addShapeBox(0, 0, 0, 7, 5, 4, 0, 0, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, -1, 0, -4.5f, -1, -1, 0, -2, -1, 0, -1, 0, -4.5f, -1);
		bodyModel[24].setRotationPoint(29.0f, 3.0f, -22.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 125
		bodyModel[25].addShapeBox(0, 0, 0, 4, 3, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[25].setRotationPoint(37.0f, -3.0f, -6.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 126
		bodyModel[26].addBox(0, 0, 0, 6, 1, 6, 0f);
		bodyModel[26].setRotationPoint(30.0f, 2.0f, -14.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 127
		bodyModel[27].addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0);
		bodyModel[27].setRotationPoint(36.0f, 2.0f, -9.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 128
		bodyModel[28].addBox(0, 0, 0, 3, 1, 4, 0f);
		bodyModel[28].setRotationPoint(36.0f, 2.0f, -13.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 129
		bodyModel[29].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -2, 0, 0, -1, 0, 0, -3, 0, 0, -2, 0, 0, -3, 0, 0, -2, 0, 0, -1, 0, 0, 0);
		bodyModel[29].setRotationPoint(31.0f, -17.0f, -4.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 130
		bodyModel[30].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, 0, -5, 0, -0.75f, -5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[30].setRotationPoint(31.0f, -20.0f, -20.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 131
		bodyModel[31].addShapeBox(0, 0, 0, 4, 3, 8, 0, 0, -0.75f, -4, -1, -1, -6, -1, -1, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0);
		bodyModel[31].setRotationPoint(36.0f, -20.0f, -19.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 132
		bodyModel[32].addShapeBox(0, 0, 0, 4, 3, 5, 0, 0, 0, -2, -1, 0, -4, -1, 0, 0, 0, 0, -3, 0, 0, 0, -1, 0, -2, -1, 0, -2, 0, 0, -4);
		bodyModel[32].setRotationPoint(36.0f, -17.0f, -21.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 133
		bodyModel[33].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -2, 0, 0, -3, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, -3);
		bodyModel[33].setRotationPoint(31.0f, -17.0f, -22.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 81
		bodyModel[34].addShapeBox(0, 0, 0, 3, 1, 8, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[34].setRotationPoint(-87.0f, 2.0f, -19.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 82
		bodyModel[35].addShapeBox(0, 0, 0, 4, 1, 8, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[35].setRotationPoint(-85.0f, 2.0f, -21.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 83
		bodyModel[36].addShapeBox(0, 0, 0, 3, 1, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3);
		bodyModel[36].setRotationPoint(-87.0f, 2.0f, -11.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 84
		bodyModel[37].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[37].setRotationPoint(-81.0f, 2.0f, -22.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 86
		bodyModel[38].addShapeBox(0, 0, 0, 4, 3, 4, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[38].setRotationPoint(-86.0f, -3.0f, -20.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 91
		bodyModel[39].addShapeBox(0, 0, 0, 4, 3, 8, 0, -3, 0, -4, 0, 0, -2, 0, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, 0, -1, 0, 0, -3, 0, 0);
		bodyModel[39].setRotationPoint(-88.0f, -17.0f, -19.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 92
		bodyModel[40].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -5, 0, -0.75f, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[40].setRotationPoint(-81.0f, -20.0f, -11.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 93
		bodyModel[41].addShapeBox(0, 0, 0, 4, 3, 5, 0, -1, 0, 0, 0, 0, -3, 0, 0, -2, -1, 0, -4, -1, 0, -2, 0, 0, -4, 0, 0, 0, -1, 0, -2);
		bodyModel[41].setRotationPoint(-85.0f, -17.0f, -6.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 94
		bodyModel[42].addShapeBox(0, 0, 0, 4, 3, 8, 0, -1, -1, 0, 0, -0.5f, 0, 0, -0.75f, -4, -1, -1, -6, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2);
		bodyModel[42].setRotationPoint(-85.0f, -20.0f, -11.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 95
		bodyModel[43].addShapeBox(0, 0, 0, 4, 3, 6, 0, -4, -1, -4, 0, -1, -4, 0, -1, 0, -4, -1, 0, -3, 0, -2, 0, 0, 0, 0, 0, 0, -3, 0, 0);
		bodyModel[43].setRotationPoint(-88.0f, -20.0f, -17.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 96
		bodyModel[44].addShapeBox(0, 0, 0, 4, 3, 6, 0, -4, -1, 0, 0, -1, 0, 0, -1, -4, -4, -1, -4, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, -2);
		bodyModel[44].setRotationPoint(-88.0f, -20.0f, -11.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 97
		bodyModel[45].addShapeBox(0, 0, 0, 9, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0);
		bodyModel[45].setRotationPoint(-85.5f, -20.0f, -13.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 98
		bodyModel[46].addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0);
		bodyModel[46].setRotationPoint(-85.5f, -20.0f, -15.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 99
		bodyModel[47].addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0);
		bodyModel[47].setRotationPoint(-85.5f, -20.0f, -9.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 100
		bodyModel[48].addShapeBox(0, 0, 0, 4, 3, 8, 0, -3, 0, 0, 0, 0, 0, 0, 0, -2, -3, 0, -4, -3, 0, 0, -1, 0, 0, 0, 0, 0, -3, 0, -2);
		bodyModel[48].setRotationPoint(-88.0f, -17.0f, -11.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 101
		bodyModel[49].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[49].setRotationPoint(-86.5f, -18.5f, -12.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 102
		bodyModel[50].addShapeBox(0, 0, 0, 4, 5, 8, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[50].setRotationPoint(-87.0f, 3.0f, -19.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 103
		bodyModel[51].addShapeBox(0, 0, 0, 4, 5, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3);
		bodyModel[51].setRotationPoint(-87.0f, 3.0f, -11.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 104
		bodyModel[52].addShapeBox(0, 0, 0, 4, 5, 8, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -1, -3, 0, 0, -1, 0, 0);
		bodyModel[52].setRotationPoint(-84.0f, 3.0f, -21.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 105
		bodyModel[53].addShapeBox(0, 0, 0, 4, 5, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, -3, 0, 0, 0, 0, -1, -1, 0, -2);
		bodyModel[53].setRotationPoint(-84.0f, 3.0f, -9.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 106
		bodyModel[54].addShapeBox(0, 0, 0, 7, 5, 4, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, -1, -1, 0, -1, 0, -4.5f, -1, 0, -4.5f, -1, -1, 0, -2);
		bodyModel[54].setRotationPoint(-81.0f, 3.0f, -4.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 107
		bodyModel[55].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[55].setRotationPoint(-81.0f, 2.0f, -8.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 108
		bodyModel[56].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[56].setRotationPoint(-87.0f, 3.0f, -4.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 109
		bodyModel[57].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(-87.0f, 2.0f, -6.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 110
		bodyModel[58].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[58].setRotationPoint(-87.0f, 3.0f, -19.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 111
		bodyModel[59].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[59].setRotationPoint(-87.0f, 2.0f, -20.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 112
		bodyModel[60].addShapeBox(0, 0, 0, 7, 5, 4, 0, -1, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, -2, 0, -4.5f, -1, 0, -4.5f, -1, -1, 0, -1);
		bodyModel[60].setRotationPoint(-81.0f, 3.0f, -22.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 113
		bodyModel[61].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f);
		bodyModel[61].setRotationPoint(-81.0f, -14.0f, -22.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 118
		bodyModel[62].addShapeBox(0, 0, 0, 4, 3, 4, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[62].setRotationPoint(-86.0f, -3.0f, -6.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 119
		bodyModel[63].addBox(0, 0, 0, 6, 1, 6, 0f);
		bodyModel[63].setRotationPoint(-81.0f, 2.0f, -14.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 120
		bodyModel[64].addShapeBox(0, 0, 0, 4, 1, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2);
		bodyModel[64].setRotationPoint(-85.0f, 2.0f, -9.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 121
		bodyModel[65].addBox(0, 0, 0, 3, 1, 4, 0f);
		bodyModel[65].setRotationPoint(-84.0f, 2.0f, -13.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 122
		bodyModel[66].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -1, 0, 0, -2, 0, 0, -2, 0, 0, -3, 0, 0, -2, 0, 0, -3, 0, 0, 0, 0, 0, -1);
		bodyModel[66].setRotationPoint(-81.0f, -17.0f, -4.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 123
		bodyModel[67].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, -0.75f, -5, 0, 0, -5, 0, 0, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[67].setRotationPoint(-81.0f, -20.0f, -20.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 124
		bodyModel[68].addShapeBox(0, 0, 0, 4, 3, 8, 0, -1, -1, -6, 0, -0.75f, -4, 0, -0.5f, 0, -1, -1, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[68].setRotationPoint(-85.0f, -20.0f, -19.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 126
		bodyModel[69].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -3, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -3, 0, 0, -2);
		bodyModel[69].setRotationPoint(-81.0f, -17.0f, -22.0f);

		bodyModel[70] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 147
		bodyModel[70].addShapeBox(0, 0, 0, 1, 3, 8, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[70].setRotationPoint(40.0f, -1.0f, -15.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 151
		bodyModel[71].addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -1, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0);
		bodyModel[71].setRotationPoint(-86.5f, -20.0f, -9.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 152
		bodyModel[72].addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1);
		bodyModel[72].setRotationPoint(-86.5f, -20.0f, -15.0f);

		bodyModel[73] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 153
		bodyModel[73].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[73].setRotationPoint(-86.5f, -20.0f, -13.5f);

		bodyModel[74] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 158
		bodyModel[74].addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[74].setRotationPoint(-85.5f, -16.5f, -15.0f);

		bodyModel[75] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 168
		bodyModel[75].addBox(0, 0, 0, 8, 3, 18, 0f);
		bodyModel[75].setRotationPoint(-16.0f, 3.0f, -20.0f);

		bodyModel[76] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 169
		bodyModel[76].addBox(0, 0, 0, 8, 2, 20, 0f);
		bodyModel[76].setRotationPoint(-31.0f, 3.0f, -21.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 171
		bodyModel[77].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[77].setRotationPoint(-34.0f, -14.0f, -21.5f);

		bodyModel[78] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 173
		bodyModel[78].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[78].setRotationPoint(-43.0f, -14.0f, -21.5f);

		bodyModel[79] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 174
		bodyModel[79].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[79].setRotationPoint(14.0f, -14.0f, -21.5f);

		bodyModel[80] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 176
		bodyModel[80].addBox(0, 0, 0, 1, 16, 20, 0f);
		bodyModel[80].setRotationPoint(23.0f, -14.0f, -21.0f);

		bodyModel[81] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 177
		bodyModel[81].addBox(0, 0, 0, 1, 16, 20, 0f);
		bodyModel[81].setRotationPoint(-69.0f, -14.0f, -21.0f);

		bodyModel[82] = new ModelRendererTurbo(this, 340, 224, textureX, textureY); // Box 260
		bodyModel[82].addShapeBox(0, 0, 0, 1, 7, 6, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[82].setRotationPoint(-73.0f, -8.0f, -9.0f);

		bodyModel[83] = new ModelRendererTurbo(this, 359, 226, textureX, textureY); // Box 261
		bodyModel[83].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[83].setRotationPoint(-77.0f, -1.0f, -9.0f);

		bodyModel[84] = new ModelRendererTurbo(this, 339, 248, textureX, textureY); // Box 262
		bodyModel[84].addShapeBox(0, 0, 0, 3, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[84].setRotationPoint(-76.5f, 0.0f, -9.0f);

		bodyModel[85] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 263
		bodyModel[85].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[85].setRotationPoint(-88.0f, 3.0f, -12.0f);

		bodyModel[86] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 264
		bodyModel[86].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[86].setRotationPoint(39.0f, 3.0f, -12.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 265
		bodyModel[87].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[87].setRotationPoint(14.0f, -17.0f, -21.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 266
		bodyModel[88].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[88].setRotationPoint(23.0f, -17.0f, -21.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 267
		bodyModel[89].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[89].setRotationPoint(-34.0f, -17.0f, -21.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 268
		bodyModel[90].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[90].setRotationPoint(-43.0f, -17.0f, -21.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 269
		bodyModel[91].addShapeBox(0, 0, 0, 47, 0, 7, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[91].setRotationPoint(-33.0f, -12.2f, -9.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 270
		bodyModel[92].addShapeBox(0, 0, 0, 47, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0);
		bodyModel[92].setRotationPoint(-33.0f, -12.2f, -21.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 271
		bodyModel[93].addBox(0, 0, 0, 6, 7, 12, 0f);
		bodyModel[93].setRotationPoint(-84.5f, -5.0f, -17.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 272
		bodyModel[94].addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[94].setRotationPoint(-83.5f, -7.0f, -9.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 273
		bodyModel[95].addShapeBox(0, 0, 0, 1, 7, 6, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[95].setRotationPoint(27.0f, -8.0f, -18.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 274
		bodyModel[96].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[96].setRotationPoint(27.0f, -1.0f, -18.0f);

		bodyModel[97] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 275
		bodyModel[97].addShapeBox(0, 0, 0, 3, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[97].setRotationPoint(28.5f, 0.0f, -18.0f);

		bodyModel[98] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 277
		bodyModel[98].addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[98].setRotationPoint(37.5f, -7.0f, -18.0f);

		bodyModel[99] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 279
		bodyModel[99].addShapeBox(0, 0, 0, 4, 1, 6, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[99].setRotationPoint(-87.5f, 8.0f, -19.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 0
		bodyModel[100].addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[100].setRotationPoint(40.0f, -14.0f, -12.0f);

		bodyModel[101] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 0
		bodyModel[101].addShapeBox(0, 0, 0, 2, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[101].setRotationPoint(40.0f, -16.0f, -16.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 9
		bodyModel[102].addShapeBox(0, 0, 0, 4, 16, 3, 0, -1, 0, -2, 0, 0, 0, 0, 0, -2.5f, -1, 0, -0.5f, -1, 0, -2, 0, 0, 0, 0, 0, -2.5f, -1, 0, -0.5f);
		bodyModel[102].setRotationPoint(-85.0f, -14.0f, -21.0f);

		bodyModel[103] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 10
		bodyModel[103].addShapeBox(0, 0, 0, 2, 16, 4, 0, -1, 0, -2, 0, 0, 0, 0, 0, -3.5f, -1.25f, 0, -2, -1, 0, -2, 0, 0, 0, 0, 0, -3.5f, -1.25f, 0, -2);
		bodyModel[103].setRotationPoint(-86.0f, -14.0f, -19.0f);

		bodyModel[104] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 11
		bodyModel[104].addShapeBox(0, 0, 0, 1, 16, 12, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[104].setRotationPoint(-85.0f, -14.0f, -17.0f);

		bodyModel[105] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 0
		bodyModel[105].addShapeBox(0, 0, 0, 4, 16, 3, 0, -1, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, -1, 0, -2, -1, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, -1, 0, -2);
		bodyModel[105].setRotationPoint(-85.0f, -14.0f, -4.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 1
		bodyModel[106].addShapeBox(0, 0, 0, 2, 16, 4, 0, -1.25f, 0, -2, 0, 0, -3.5f, 0, 0, 0, -1, 0, -2, -1.25f, 0, -2, 0, 0, -3.5f, 0, 0, 0, -1, 0, -2);
		bodyModel[106].setRotationPoint(-86.0f, -14.0f, -7.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 9
		bodyModel[107].addShapeBox(0, 0, 0, 51, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[107].setRotationPoint(-36.0f, -14.0f, -1.0f);

		bodyModel[108] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 241
		bodyModel[108].addShapeBox(0, 0, 0, 4, 3, 8, 0, 0, 0, -2, -3, 0, -4, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, -2, -3, 0, 0, -1, 0, 0);
		bodyModel[108].setRotationPoint(39.0f, -17.0f, -19.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 242
		bodyModel[109].addShapeBox(0, 0, 0, 4, 3, 8, 0, 0, 0, 0, -3, 0, 0, -3, 0, -4, 0, 0, -2, -1, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, 0);
		bodyModel[109].setRotationPoint(39.0f, -17.0f, -11.0f);

		bodyModel[110] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 1
		bodyModel[110].addShapeBox(0, 0, 0, 6, 7, 2, 0, -0.75f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[110].setRotationPoint(-84.5f, -5.0f, -19.0f);

		bodyModel[111] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 2
		bodyModel[111].addShapeBox(0, 0, 0, 6, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -0.5f);
		bodyModel[111].setRotationPoint(-84.5f, -5.0f, -5.0f);

		bodyModel[112] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 3
		bodyModel[112].addBox(0, 0, 0, 6, 7, 12, 0f);
		bodyModel[112].setRotationPoint(33.5f, -5.0f, -17.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 4
		bodyModel[113].addShapeBox(0, 0, 0, 4, 16, 3, 0, 0, 0, 0, -1, 0, -2, -1, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, -1, 0, -2, -1, 0, -0.5f, 0, 0, -2.5f);
		bodyModel[113].setRotationPoint(36.0f, -14.0f, -21.0f);

		bodyModel[114] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 5
		bodyModel[114].addShapeBox(0, 0, 0, 2, 16, 4, 0, 0, 0, 0, -1, 0, -2, -1.25f, 0, -2, 0, 0, -3.5f, 0, 0, 0, -1, 0, -2, -1.25f, 0, -2, 0, 0, -3.5f);
		bodyModel[114].setRotationPoint(39.0f, -14.0f, -19.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 6
		bodyModel[115].addShapeBox(0, 0, 0, 1, 16, 12, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0);
		bodyModel[115].setRotationPoint(39.0f, -14.0f, -17.0f);

		bodyModel[116] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 7
		bodyModel[116].addShapeBox(0, 0, 0, 4, 16, 3, 0, 0, 0, -2.5f, -1, 0, -0.5f, -1, 0, -2, 0, 0, 0, 0, 0, -2.5f, -1, 0, -0.5f, -1, 0, -2, 0, 0, 0);
		bodyModel[116].setRotationPoint(36.0f, -14.0f, -4.0f);

		bodyModel[117] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 9
		bodyModel[117].addShapeBox(0, 0, 0, 6, 7, 2, 0, 0, 0, 0, -0.75f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[117].setRotationPoint(33.5f, -5.0f, -19.0f);

		bodyModel[118] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 10
		bodyModel[118].addShapeBox(0, 0, 0, 6, 7, 2, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -0.5f, 0, 0, 0);
		bodyModel[118].setRotationPoint(33.5f, -5.0f, -5.0f);

		bodyModel[119] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 0
		bodyModel[119].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[119].setRotationPoint(-69.0f, -17.0f, -21.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 7
		bodyModel[120].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[120].setRotationPoint(-12.0f, -8.0f, -9.0f);

		bodyModel[121] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 9
		bodyModel[121].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[121].setRotationPoint(-14.0f, -1.0f, -9.0f);

		bodyModel[122] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 10
		bodyModel[122].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[122].setRotationPoint(-13.5f, 0.0f, -9.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 36
		bodyModel[123].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[123].setRotationPoint(-42.0f, -14.0f, -0.5f);

		bodyModel[124] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // 40
		bodyModel[124].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[124].setRotationPoint(-73.0f, 4.0f, -16.5f);

		bodyModel[125] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 23
		bodyModel[125].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[125].setRotationPoint(-71.0f, 3.0f, -5.0f);

		bodyModel[126] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 27
		bodyModel[126].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[126].setRotationPoint(-55.0f, 3.0f, -5.0f);

		bodyModel[127] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 28
		bodyModel[127].addBox(0, 0, 0, 3, 1, 12, 0f);
		bodyModel[127].setRotationPoint(-61.0f, 3.0f, -17.0f);

		bodyModel[128] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 77
		bodyModel[128].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[128].setRotationPoint(-71.0f, 3.0f, -17.0f);

		bodyModel[129] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 81
		bodyModel[129].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[129].setRotationPoint(-55.0f, 3.0f, -17.0f);

		bodyModel[130] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 12
		bodyModel[130].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[130].setRotationPoint(-52.0f, 6.0f, -17.0f);

		bodyModel[131] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 14
		bodyModel[131].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[131].setRotationPoint(-68.0f, 6.0f, -17.0f);

		bodyModel[132] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 15
		bodyModel[132].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[132].setRotationPoint(-73.0f, 4.0f, -7.5f);

		bodyModel[133] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 16
		bodyModel[133].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[133].setRotationPoint(-73.0f, 4.0f, -14.5f);

		bodyModel[134] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 17
		bodyModel[134].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[134].setRotationPoint(-48.0f, 4.0f, -14.5f);

		bodyModel[135] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 1
		bodyModel[135].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[135].setRotationPoint(-70.0f, 3.0f, -5.5f);

		bodyModel[136] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 3
		bodyModel[136].addBox(0, 0, 0, 7, 1, 12, 0f);
		bodyModel[136].setRotationPoint(-63.0f, 8.0f, -17.0f);

		bodyModel[137] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 4
		bodyModel[137].addBox(0, 0, 0, 3, 2, 10, 0f);
		bodyModel[137].setRotationPoint(-61.0f, 5.0f, -16.0f);

		bodyModel[138] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 5
		bodyModel[138].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[138].setRotationPoint(-70.0f, 3.0f, -17.5f);

		bodyModel[139] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 20
		bodyModel[139].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[139].setRotationPoint(-72.0f, 4.0f, -5.5f);

		bodyModel[140] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 21
		bodyModel[140].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[140].setRotationPoint(-72.0f, 4.0f, -17.5f);

		bodyModel[141] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		bodyModel[141].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[141].setRotationPoint(-52.5f, 6.5f, -5.0f);

		bodyModel[142] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 24
		bodyModel[142].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[142].setRotationPoint(-52.5f, 5.5f, -5.0f);

		bodyModel[143] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 25
		bodyModel[143].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[143].setRotationPoint(-54.0f, 6.0f, -5.0f);

		bodyModel[144] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 26
		bodyModel[144].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[144].setRotationPoint(-50.0f, 6.0f, -5.0f);

		bodyModel[145] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 29
		bodyModel[145].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[145].setRotationPoint(-63.0f, 6.0f, -5.0f);

		bodyModel[146] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 30
		bodyModel[146].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[146].setRotationPoint(-60.0f, 4.0f, -5.0f);

		bodyModel[147] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 31
		bodyModel[147].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[147].setRotationPoint(-68.5f, 6.5f, -5.0f);

		bodyModel[148] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 32
		bodyModel[148].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[148].setRotationPoint(-68.5f, 5.5f, -5.0f);

		bodyModel[149] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 33
		bodyModel[149].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[149].setRotationPoint(-66.0f, 6.0f, -5.0f);

		bodyModel[150] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 34
		bodyModel[150].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[150].setRotationPoint(-70.0f, 6.0f, -5.0f);

		bodyModel[151] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 37
		bodyModel[151].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[151].setRotationPoint(-52.5f, 6.5f, -18.0f);

		bodyModel[152] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 38
		bodyModel[152].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[152].setRotationPoint(-52.5f, 5.5f, -18.0f);

		bodyModel[153] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 39
		bodyModel[153].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[153].setRotationPoint(-54.0f, 6.0f, -18.0f);

		bodyModel[154] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 40
		bodyModel[154].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[154].setRotationPoint(-50.0f, 6.0f, -18.0f);

		bodyModel[155] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 43
		bodyModel[155].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[155].setRotationPoint(-63.0f, 6.0f, -18.0f);

		bodyModel[156] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 44
		bodyModel[156].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[156].setRotationPoint(-60.0f, 4.0f, -18.0f);

		bodyModel[157] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 45
		bodyModel[157].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[157].setRotationPoint(-68.5f, 6.5f, -18.0f);

		bodyModel[158] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 46
		bodyModel[158].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[158].setRotationPoint(-68.5f, 5.5f, -18.0f);

		bodyModel[159] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 47
		bodyModel[159].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[159].setRotationPoint(-66.0f, 6.0f, -18.0f);

		bodyModel[160] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 48
		bodyModel[160].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[160].setRotationPoint(-70.0f, 6.0f, -18.0f);

		bodyModel[161] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 51
		bodyModel[161].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[161].setRotationPoint(-64.0f, 6.0f, -18.0f);

		bodyModel[162] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 52
		bodyModel[162].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[162].setRotationPoint(-56.0f, 6.0f, -18.0f);

		bodyModel[163] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 53
		bodyModel[163].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[163].setRotationPoint(-64.0f, 6.0f, -5.0f);

		bodyModel[164] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 54
		bodyModel[164].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[164].setRotationPoint(-56.0f, 6.0f, -5.0f);

		bodyModel[165] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 75
		bodyModel[165].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[165].setRotationPoint(0.0f, 4.0f, -16.5f);

		bodyModel[166] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 76
		bodyModel[166].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[166].setRotationPoint(18.0f, 3.0f, -5.0f);

		bodyModel[167] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 77
		bodyModel[167].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[167].setRotationPoint(2.0f, 3.0f, -5.0f);

		bodyModel[168] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 78
		bodyModel[168].addBox(0, 0, 0, 3, 1, 12, 0f);
		bodyModel[168].setRotationPoint(12.0f, 3.0f, -17.0f);

		bodyModel[169] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 79
		bodyModel[169].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[169].setRotationPoint(18.0f, 3.0f, -17.0f);

		bodyModel[170] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 80
		bodyModel[170].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[170].setRotationPoint(2.0f, 3.0f, -17.0f);

		bodyModel[171] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 81
		bodyModel[171].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[171].setRotationPoint(5.0f, 6.0f, -17.0f);

		bodyModel[172] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 82
		bodyModel[172].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[172].setRotationPoint(21.0f, 6.0f, -17.0f);

		bodyModel[173] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 83
		bodyModel[173].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[173].setRotationPoint(0.0f, 4.0f, -7.5f);

		bodyModel[174] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 84
		bodyModel[174].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[174].setRotationPoint(25.0f, 4.0f, -14.5f);

		bodyModel[175] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 85
		bodyModel[175].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[175].setRotationPoint(0.0f, 4.0f, -14.5f);

		bodyModel[176] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 86
		bodyModel[176].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[176].setRotationPoint(3.0f, 3.0f, -5.5f);

		bodyModel[177] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 87
		bodyModel[177].addBox(0, 0, 0, 7, 1, 12, 0f);
		bodyModel[177].setRotationPoint(10.0f, 8.0f, -17.0f);

		bodyModel[178] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 88
		bodyModel[178].addBox(0, 0, 0, 3, 2, 10, 0f);
		bodyModel[178].setRotationPoint(12.0f, 5.0f, -16.0f);

		bodyModel[179] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 89
		bodyModel[179].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[179].setRotationPoint(3.0f, 3.0f, -17.5f);

		bodyModel[180] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 90
		bodyModel[180].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[180].setRotationPoint(1.0f, 4.0f, -5.5f);

		bodyModel[181] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 91
		bodyModel[181].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[181].setRotationPoint(1.0f, 4.0f, -17.5f);

		bodyModel[182] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 92
		bodyModel[182].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[182].setRotationPoint(4.5f, 6.5f, -5.0f);

		bodyModel[183] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 93
		bodyModel[183].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[183].setRotationPoint(4.5f, 5.5f, -5.0f);

		bodyModel[184] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 94
		bodyModel[184].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[184].setRotationPoint(7.0f, 6.0f, -5.0f);

		bodyModel[185] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 95
		bodyModel[185].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[185].setRotationPoint(3.0f, 6.0f, -5.0f);

		bodyModel[186] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 98
		bodyModel[186].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[186].setRotationPoint(10.0f, 6.0f, -5.0f);

		bodyModel[187] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 99
		bodyModel[187].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[187].setRotationPoint(13.0f, 4.0f, -5.0f);

		bodyModel[188] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 100
		bodyModel[188].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[188].setRotationPoint(20.5f, 6.5f, -5.0f);

		bodyModel[189] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 101
		bodyModel[189].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[189].setRotationPoint(20.5f, 5.5f, -5.0f);

		bodyModel[190] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 102
		bodyModel[190].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[190].setRotationPoint(19.0f, 6.0f, -5.0f);

		bodyModel[191] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 103
		bodyModel[191].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[191].setRotationPoint(23.0f, 6.0f, -5.0f);

		bodyModel[192] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 106
		bodyModel[192].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[192].setRotationPoint(4.5f, 6.5f, -18.0f);

		bodyModel[193] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 107
		bodyModel[193].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[193].setRotationPoint(4.5f, 5.5f, -18.0f);

		bodyModel[194] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 108
		bodyModel[194].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[194].setRotationPoint(7.0f, 6.0f, -18.0f);

		bodyModel[195] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 109
		bodyModel[195].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[195].setRotationPoint(3.0f, 6.0f, -18.0f);

		bodyModel[196] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 112
		bodyModel[196].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[196].setRotationPoint(10.0f, 6.0f, -18.0f);

		bodyModel[197] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 113
		bodyModel[197].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[197].setRotationPoint(13.0f, 4.0f, -18.0f);

		bodyModel[198] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 114
		bodyModel[198].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[198].setRotationPoint(20.5f, 6.5f, -18.0f);

		bodyModel[199] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 115
		bodyModel[199].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[199].setRotationPoint(20.5f, 5.5f, -18.0f);

		bodyModel[200] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 116
		bodyModel[200].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[200].setRotationPoint(19.0f, 6.0f, -18.0f);

		bodyModel[201] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 117
		bodyModel[201].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[201].setRotationPoint(23.0f, 6.0f, -18.0f);

		bodyModel[202] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 120
		bodyModel[202].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[202].setRotationPoint(17.0f, 6.0f, -18.0f);

		bodyModel[203] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 121
		bodyModel[203].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[203].setRotationPoint(9.0f, 6.0f, -18.0f);

		bodyModel[204] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 122
		bodyModel[204].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[204].setRotationPoint(17.0f, 6.0f, -5.0f);

		bodyModel[205] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 123
		bodyModel[205].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[205].setRotationPoint(9.0f, 6.0f, -5.0f);

		bodyModel[206] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 124
		bodyModel[206].addBox(0, 0, 0, 6, 2, 0, 0f);
		bodyModel[206].setRotationPoint(15.0f, 3.0f, 0.0f);

		bodyModel[207] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 125
		bodyModel[207].addBox(0, 0, 0, 6, 2, 0, 0f);
		bodyModel[207].setRotationPoint(-42.0f, 3.0f, 0.0f);

		bodyModel[208] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 126
		bodyModel[208].addBox(0, 0, 0, 6, 2, 0, 0f);
		bodyModel[208].setRotationPoint(-42.0f, 3.0f, -22.0f);

		bodyModel[209] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 127
		bodyModel[209].addBox(0, 0, 0, 6, 2, 0, 0f);
		bodyModel[209].setRotationPoint(15.0f, 3.0f, -22.0f);

		bodyModel[210] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 129
		bodyModel[210].addBox(0, 0, 0, 7, 3, 0, 0f);
		bodyModel[210].setRotationPoint(-56.0f, 3.0f, 0.0f);

		bodyModel[211] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 133
		bodyModel[211].addBox(0, 0, 0, 7, 3, 0, 0f);
		bodyModel[211].setRotationPoint(-56.0f, 3.0f, -22.0f);

		bodyModel[212] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 0
		bodyModel[212].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[212].setRotationPoint(-85.5f, 3.0f, -7.0f);

		bodyModel[213] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1
		bodyModel[213].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[213].setRotationPoint(-85.5f, 3.0f, -7.0f);

		bodyModel[214] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 2
		bodyModel[214].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[214].setRotationPoint(-85.5f, 7.0f, -7.0f);

		bodyModel[215] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 3
		bodyModel[215].addShapeBox(0, 0, 0, 4, 1, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3);
		bodyModel[215].setRotationPoint(-87.5f, 8.0f, -9.0f);

		bodyModel[216] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 4
		bodyModel[216].addShapeBox(0, 0, 0, 4, 1, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2, -0.5f, 0);
		bodyModel[216].setRotationPoint(-87.5f, 8.0f, -13.0f);

		bodyModel[217] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 5
		bodyModel[217].addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0);
		bodyModel[217].setRotationPoint(38.5f, 8.0f, -19.0f);

		bodyModel[218] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 6
		bodyModel[218].addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0);
		bodyModel[218].setRotationPoint(38.5f, 8.0f, -9.0f);

		bodyModel[219] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 7
		bodyModel[219].addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, -0.5f, 0, -2, -0.5f, 0, -2, -0.5f, 0, 0, -0.5f, 0);
		bodyModel[219].setRotationPoint(38.5f, 8.0f, -13.0f);

		bodyModel[220] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 10
		bodyModel[220].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[220].setRotationPoint(-85.5f, 3.0f, -8.0f);

		bodyModel[221] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 11
		bodyModel[221].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[221].setRotationPoint(-85.5f, 3.0f, -8.0f);

		bodyModel[222] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 12
		bodyModel[222].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[222].setRotationPoint(-85.5f, 7.0f, -8.0f);

		bodyModel[223] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 13
		bodyModel[223].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[223].setRotationPoint(-85.5f, 3.0f, -16.0f);

		bodyModel[224] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 14
		bodyModel[224].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[224].setRotationPoint(-85.5f, 3.0f, -16.0f);

		bodyModel[225] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 15
		bodyModel[225].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[225].setRotationPoint(-85.5f, 7.0f, -16.0f);

		bodyModel[226] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 16
		bodyModel[226].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[226].setRotationPoint(-85.5f, 3.0f, -14.0f);

		bodyModel[227] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 17
		bodyModel[227].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[227].setRotationPoint(-85.5f, 3.0f, -14.0f);

		bodyModel[228] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 18
		bodyModel[228].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[228].setRotationPoint(-85.5f, 7.0f, -14.0f);

		bodyModel[229] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 19
		bodyModel[229].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[229].setRotationPoint(40.5f, 3.0f, -7.0f);

		bodyModel[230] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 20
		bodyModel[230].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[230].setRotationPoint(39.5f, 3.0f, -7.0f);

		bodyModel[231] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 21
		bodyModel[231].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[231].setRotationPoint(39.5f, 7.0f, -7.0f);

		bodyModel[232] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 22
		bodyModel[232].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[232].setRotationPoint(40.5f, 3.0f, -8.0f);

		bodyModel[233] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 23
		bodyModel[233].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[233].setRotationPoint(39.5f, 3.0f, -8.0f);

		bodyModel[234] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 24
		bodyModel[234].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[234].setRotationPoint(39.5f, 7.0f, -8.0f);

		bodyModel[235] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 25
		bodyModel[235].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[235].setRotationPoint(40.5f, 3.0f, -16.0f);

		bodyModel[236] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 26
		bodyModel[236].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[236].setRotationPoint(39.5f, 3.0f, -16.0f);

		bodyModel[237] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 27
		bodyModel[237].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[237].setRotationPoint(39.5f, 7.0f, -16.0f);

		bodyModel[238] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 28
		bodyModel[238].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[238].setRotationPoint(40.5f, 3.0f, -14.0f);

		bodyModel[239] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 29
		bodyModel[239].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[239].setRotationPoint(39.5f, 3.0f, -14.0f);

		bodyModel[240] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 30
		bodyModel[240].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[240].setRotationPoint(39.5f, 7.0f, -14.0f);

		bodyModel[241] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 31
		bodyModel[241].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[241].setRotationPoint(-71.0f, -9.0f, -22.5f);

		bodyModel[242] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 32
		bodyModel[242].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[242].setRotationPoint(-76.0f, -9.0f, -22.5f);

		bodyModel[243] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 33
		bodyModel[243].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[243].setRotationPoint(-52.5f, -9.0f, -23.0f);

		bodyModel[244] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 34
		bodyModel[244].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[244].setRotationPoint(-52.5f, -9.0f, -1.5f);

		bodyModel[245] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 35
		bodyModel[245].addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[245].setRotationPoint(40.0f, -14.0f, -11.0f);

		bodyModel[246] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 36
		bodyModel[246].addShapeBox(0, 0, 0, 9, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0);
		bodyModel[246].setRotationPoint(31.5f, -20.0f, -13.0f);

		bodyModel[247] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 37
		bodyModel[247].addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0);
		bodyModel[247].setRotationPoint(31.5f, -20.0f, -15.0f);

		bodyModel[248] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 38
		bodyModel[248].addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0);
		bodyModel[248].setRotationPoint(31.5f, -20.0f, -9.0f);

		bodyModel[249] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 39
		bodyModel[249].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[249].setRotationPoint(40.0f, -18.5f, -12.0f);

		bodyModel[250] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 40
		bodyModel[250].addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0);
		bodyModel[250].setRotationPoint(40.5f, -20.0f, -9.0f);

		bodyModel[251] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 41
		bodyModel[251].addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0);
		bodyModel[251].setRotationPoint(40.5f, -20.0f, -13.5f);

		bodyModel[252] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 42
		bodyModel[252].addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[252].setRotationPoint(39.5f, -16.5f, -15.0f);

		bodyModel[253] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 43
		bodyModel[253].addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0);
		bodyModel[253].setRotationPoint(40.5f, -20.0f, -9.0f);

		bodyModel[254] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 44
		bodyModel[254].addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1);
		bodyModel[254].setRotationPoint(40.5f, -20.0f, -15.0f);

		bodyModel[255] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 366
		bodyModel[255].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[255].setRotationPoint(15.0f, -14.0f, -0.5f);

		bodyModel[256] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 367
		bodyModel[256].addShapeBox(0, 0, 0, 7, 15.5f, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[256].setRotationPoint(-56.0f, -14.0f, -1.0f);

		bodyModel[257] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 368
		bodyModel[257].addShapeBox(0, 0, 0, 20, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[257].setRotationPoint(-76.0f, -14.0f, -1.0f);

		bodyModel[258] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 369
		bodyModel[258].addShapeBox(0, 0, 0, 7, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[258].setRotationPoint(-49.0f, -14.0f, -1.0f);

		bodyModel[259] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 370
		bodyModel[259].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[259].setRotationPoint(21.0f, -14.0f, -1.0f);

		bodyModel[260] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 371
		bodyModel[260].addShapeBox(0, 0, 0, 51, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[260].setRotationPoint(-36.0f, -14.0f, -22.0f);

		bodyModel[261] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 372
		bodyModel[261].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[261].setRotationPoint(-42.0f, -14.0f, -22.5f);

		bodyModel[262] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 373
		bodyModel[262].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[262].setRotationPoint(15.0f, -14.0f, -22.5f);

		bodyModel[263] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 374
		bodyModel[263].addShapeBox(0, 0, 0, 7, 15.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[263].setRotationPoint(-56.0f, -14.0f, -22.0f);

		bodyModel[264] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 375
		bodyModel[264].addShapeBox(0, 0, 0, 15, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[264].setRotationPoint(-71.0f, -14.0f, -22.0f);

		bodyModel[265] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 376
		bodyModel[265].addShapeBox(0, 0, 0, 7, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[265].setRotationPoint(-49.0f, -14.0f, -22.0f);

		bodyModel[266] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 377
		bodyModel[266].addShapeBox(0, 0, 0, 10, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[266].setRotationPoint(21.0f, -14.0f, -22.0f);

		bodyModel[267] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 378
		bodyModel[267].addShapeBox(0, 0, 0, 5, 15.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[267].setRotationPoint(-76.0f, -14.0f, -22.0f);

		bodyModel[268] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 379
		bodyModel[268].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[268].setRotationPoint(23.0f, -14.0f, -21.5f);

		bodyModel[269] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 380
		bodyModel[269].addShapeBox(0, 0, 0, 4, 3, 5, 0, -1, 0, -4, 0, 0, -2, 0, 0, -3, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -4, -1, 0, -2);
		bodyModel[269].setRotationPoint(-85.0f, -17.0f, -21.0f);

		bodyModel[270] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 3
		bodyModel[270].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[270].setRotationPoint(3.0f, 7.0f, -18.5f);

		bodyModel[271] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 4
		bodyModel[271].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[271].setRotationPoint(19.0f, 7.0f, -18.5f);

		bodyModel[272] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 5
		bodyModel[272].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[272].setRotationPoint(19.0f, 7.0f, -5.0f);

		bodyModel[273] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 6
		bodyModel[273].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[273].setRotationPoint(3.0f, 7.0f, -5.0f);

		bodyModel[274] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 7
		bodyModel[274].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[274].setRotationPoint(-54.0f, 7.0f, -5.0f);

		bodyModel[275] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 8
		bodyModel[275].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[275].setRotationPoint(-70.0f, 7.0f, -5.0f);

		bodyModel[276] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 9
		bodyModel[276].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[276].setRotationPoint(-70.0f, 7.0f, -18.5f);

		bodyModel[277] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 10
		bodyModel[277].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[277].setRotationPoint(-54.0f, 7.0f, -18.5f);

		bodyModel[278] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 0
		bodyModel[278].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1);
		bodyModel[278].setRotationPoint(-81.0f, -14.0f, -1.0f);

		bodyModel[279] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 1
		bodyModel[279].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0);
		bodyModel[279].setRotationPoint(31.0f, -14.0f, -1.0f);

		bodyModel[280] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 2
		bodyModel[280].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0, 0, -0.5f);
		bodyModel[280].setRotationPoint(31.0f, -14.0f, -22.0f);

		bodyModel[281] = new ModelRendererTurbo(this, 395, 214, textureX, textureY); // Box 0
		bodyModel[281].addShapeBox(0, 0, 0, 2, 16, 4, 0, 0, 0, -3.5f, -1.25f, 0, -2, -1, 0, -2, 0, 0, 0, 0, 0, -3.5f, -1.25f, 0, -2, -1, 0, -2, 0, 0, 0);
		bodyModel[281].setRotationPoint(39.0f, -14.0f, -7.0f);

		bodyModel[282] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 365
		bodyModel[282].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[282].setRotationPoint(-9.0f, -8.2f, -9.0f);

		bodyModel[283] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 366
		bodyModel[283].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[283].setRotationPoint(1.0f, -8.2f, -9.0f);

		bodyModel[284] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 367
		bodyModel[284].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[284].setRotationPoint(3.0f, -8.2f, -9.0f);

		bodyModel[285] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[285].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[285].setRotationPoint(13.0f, -8.2f, -9.0f);

		bodyModel[286] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 369
		bodyModel[286].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[286].setRotationPoint(-8.0f, -8.0f, -9.0f);

		bodyModel[287] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 371
		bodyModel[287].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[287].setRotationPoint(-8.0f, -1.0f, -9.0f);

		bodyModel[288] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 372
		bodyModel[288].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[288].setRotationPoint(0.0f, -8.0f, -9.0f);

		bodyModel[289] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 374
		bodyModel[289].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[289].setRotationPoint(-2.0f, -1.0f, -9.0f);

		bodyModel[290] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 375
		bodyModel[290].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[290].setRotationPoint(4.0f, -8.0f, -9.0f);

		bodyModel[291] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 376
		bodyModel[291].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[291].setRotationPoint(4.0f, -1.0f, -9.0f);

		bodyModel[292] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[292].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[292].setRotationPoint(12.0f, -8.0f, -9.0f);

		bodyModel[293] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[293].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[293].setRotationPoint(10.0f, -1.0f, -9.0f);

		bodyModel[294] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 379
		bodyModel[294].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[294].setRotationPoint(-11.0f, -8.2f, -9.0f);

		bodyModel[295] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 380
		bodyModel[295].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[295].setRotationPoint(-10.0f, -8.2f, -9.0f);

		bodyModel[296] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 381
		bodyModel[296].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[296].setRotationPoint(0.0f, -8.2f, -9.0f);

		bodyModel[297] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 382
		bodyModel[297].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[297].setRotationPoint(2.0f, -8.2f, -9.0f);

		bodyModel[298] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 383
		bodyModel[298].addShapeBox(-23, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[298].setRotationPoint(-9.0f, -8.0f, -9.0f);

		bodyModel[299] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 384
		bodyModel[299].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[299].setRotationPoint(-9.0f, -1.0f, -9.0f);

		bodyModel[300] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 385
		bodyModel[300].addShapeBox(-23, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[300].setRotationPoint(-1.0f, -8.0f, -9.0f);

		bodyModel[301] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 386
		bodyModel[301].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[301].setRotationPoint(-3.0f, -1.0f, -9.0f);

		bodyModel[302] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 387
		bodyModel[302].addShapeBox(-23, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[302].setRotationPoint(3.0f, -8.0f, -9.0f);

		bodyModel[303] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 388
		bodyModel[303].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[303].setRotationPoint(3.0f, -1.0f, -9.0f);

		bodyModel[304] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 389
		bodyModel[304].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[304].setRotationPoint(-7.5f, 0.0f, -9.0f);

		bodyModel[305] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 390
		bodyModel[305].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[305].setRotationPoint(-1.5f, 0.0f, -9.0f);

		bodyModel[306] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 391
		bodyModel[306].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[306].setRotationPoint(4.5f, 0.0f, -9.0f);

		bodyModel[307] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[307].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[307].setRotationPoint(10.5f, 0.0f, -9.0f);

		bodyModel[308] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 393
		bodyModel[308].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[308].setRotationPoint(-19.5f, 0.0f, -9.0f);

		bodyModel[309] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 394
		bodyModel[309].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[309].setRotationPoint(-25.5f, 0.0f, -9.0f);

		bodyModel[310] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 395
		bodyModel[310].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[310].setRotationPoint(-31.5f, 0.0f, -9.0f);

		bodyModel[311] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 396
		bodyModel[311].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[311].setRotationPoint(-12.0f, -8.0f, -21.0f);

		bodyModel[312] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 397
		bodyModel[312].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[312].setRotationPoint(-14.0f, -1.0f, -21.0f);

		bodyModel[313] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 398
		bodyModel[313].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[313].setRotationPoint(-13.5f, 0.0f, -21.0f);

		bodyModel[314] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 399
		bodyModel[314].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[314].setRotationPoint(-9.0f, -8.2f, -21.0f);

		bodyModel[315] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 400
		bodyModel[315].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[315].setRotationPoint(1.0f, -8.2f, -21.0f);

		bodyModel[316] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 401
		bodyModel[316].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[316].setRotationPoint(3.0f, -8.2f, -21.0f);

		bodyModel[317] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 402
		bodyModel[317].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[317].setRotationPoint(13.0f, -8.2f, -21.0f);

		bodyModel[318] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 403
		bodyModel[318].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[318].setRotationPoint(-8.0f, -8.0f, -21.0f);

		bodyModel[319] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 404
		bodyModel[319].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[319].setRotationPoint(-8.0f, -1.0f, -21.0f);

		bodyModel[320] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 405
		bodyModel[320].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[320].setRotationPoint(0.0f, -8.0f, -21.0f);

		bodyModel[321] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 406
		bodyModel[321].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[321].setRotationPoint(-2.0f, -1.0f, -21.0f);

		bodyModel[322] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 407
		bodyModel[322].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[322].setRotationPoint(4.0f, -8.0f, -21.0f);

		bodyModel[323] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 408
		bodyModel[323].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[323].setRotationPoint(4.0f, -1.0f, -21.0f);

		bodyModel[324] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 409
		bodyModel[324].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[324].setRotationPoint(12.0f, -8.0f, -21.0f);

		bodyModel[325] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 410
		bodyModel[325].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[325].setRotationPoint(10.0f, -1.0f, -21.0f);

		bodyModel[326] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 411
		bodyModel[326].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[326].setRotationPoint(-11.0f, -8.2f, -21.0f);

		bodyModel[327] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 412
		bodyModel[327].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[327].setRotationPoint(-10.0f, -8.2f, -21.0f);

		bodyModel[328] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 413
		bodyModel[328].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[328].setRotationPoint(0.0f, -8.2f, -21.0f);

		bodyModel[329] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 414
		bodyModel[329].addBox(-23, 0, 0, 1, 2, 8, 0f);
		bodyModel[329].setRotationPoint(2.0f, -8.2f, -21.0f);

		bodyModel[330] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 415
		bodyModel[330].addShapeBox(-23, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[330].setRotationPoint(-9.0f, -8.0f, -21.0f);

		bodyModel[331] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 416
		bodyModel[331].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[331].setRotationPoint(-9.0f, -1.0f, -21.0f);

		bodyModel[332] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 417
		bodyModel[332].addShapeBox(-23, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[332].setRotationPoint(-1.0f, -8.0f, -21.0f);

		bodyModel[333] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 418
		bodyModel[333].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[333].setRotationPoint(-3.0f, -1.0f, -21.0f);

		bodyModel[334] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 419
		bodyModel[334].addShapeBox(-23, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[334].setRotationPoint(3.0f, -8.0f, -21.0f);

		bodyModel[335] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 420
		bodyModel[335].addShapeBox(-23, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[335].setRotationPoint(3.0f, -1.0f, -21.0f);

		bodyModel[336] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 421
		bodyModel[336].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[336].setRotationPoint(-7.5f, 0.0f, -21.0f);

		bodyModel[337] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 422
		bodyModel[337].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[337].setRotationPoint(-1.5f, 0.0f, -21.0f);

		bodyModel[338] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 423
		bodyModel[338].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[338].setRotationPoint(4.5f, 0.0f, -21.0f);

		bodyModel[339] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 424
		bodyModel[339].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[339].setRotationPoint(10.5f, 0.0f, -21.0f);

		bodyModel[340] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 425
		bodyModel[340].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[340].setRotationPoint(-19.5f, 0.0f, -21.0f);

		bodyModel[341] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 426
		bodyModel[341].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[341].setRotationPoint(-25.5f, 0.0f, -21.0f);

		bodyModel[342] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 427
		bodyModel[342].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[342].setRotationPoint(-31.5f, 0.0f, -21.0f);

		bodyModel[343] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 428
		bodyModel[343].addShapeBox(0, 0, 0, 5, 15.5f, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[343].setRotationPoint(26.0f, -14.0f, -1.0f);

		bodyModel[344] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 429
		bodyModel[344].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[344].setRotationPoint(31.0f, -9.0f, -0.5f);

		bodyModel[345] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 430
		bodyModel[345].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[345].setRotationPoint(26.0f, -9.0f, -0.5f);

		flipAll();
	}

}
