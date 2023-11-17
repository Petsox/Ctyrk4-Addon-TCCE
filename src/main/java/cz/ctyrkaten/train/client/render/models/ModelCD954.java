package cz.ctyrkaten.train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelCD954 extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public ModelCD954() //Same as Filename
	{
		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	public void initbodyModel_1(){
		bodyModel = new ModelRendererTurbo[281];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[0].addBox(0, 0, 0, 99, 1, 22, 0f);
		bodyModel[0].setRotationPoint(-75.0f, 2.0f, -22.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 32, 240, textureX, textureY); // Box 12
		bodyModel[1].addShapeBox(0, 0, 0, 100, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[1].setRotationPoint(-76.0f, -17.0f, -2.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 7, 213, textureX, textureY); // Box 15
		bodyModel[2].addShapeBox(0, 0, 0, 100, 4, 18, 0, 0, -1, -5, 0, -1, -5, 0, -1, -5, 0, -1, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(-76.0f, -21.0f, -20.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 99
		bodyModel[3].addShapeBox(0, 0, 0, 100, 3, 2, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1);
		bodyModel[3].setRotationPoint(-76.0f, -17.0f, -22.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 81
		bodyModel[4].addShapeBox(0, 0, 0, 3, 1, 8, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[4].setRotationPoint(-87.0f, 2.0f, -19.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 82
		bodyModel[5].addShapeBox(0, 0, 0, 4, 1, 8, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[5].setRotationPoint(-85.0f, 2.0f, -21.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 83
		bodyModel[6].addShapeBox(0, 0, 0, 3, 1, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3);
		bodyModel[6].setRotationPoint(-87.0f, 2.0f, -11.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 84
		bodyModel[7].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[7].setRotationPoint(-81.0f, 2.0f, -22.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 86
		bodyModel[8].addShapeBox(0, 0, 0, 4, 3, 4, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0);
		bodyModel[8].setRotationPoint(-86.0f, -3.0f, -20.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 91
		bodyModel[9].addShapeBox(0, 0, 0, 4, 3, 8, 0, -3, 0, -4, 0, 0, -2, 0, 0, 0, -3, 0, 0, -3, 0, -2, 0, 0, 0, -1, 0, 0, -3, 0, 0);
		bodyModel[9].setRotationPoint(-88.0f, -17.0f, -19.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 92
		bodyModel[10].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -5, 0, -0.75f, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[10].setRotationPoint(-81.0f, -20.0f, -11.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 93
		bodyModel[11].addShapeBox(0, 0, 0, 4, 3, 5, 0, -1, 0, 0, 0, 0, -3, 0, 0, -2, -1, 0, -4, -1, 0, -2, 0, 0, -4, 0, 0, 0, -1, 0, -2);
		bodyModel[11].setRotationPoint(-85.0f, -17.0f, -6.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 94
		bodyModel[12].addShapeBox(0, 0, 0, 4, 3, 8, 0, -1, -1, 0, 0, -0.5f, 0, 0, -0.75f, -4, -1, -1, -6, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2);
		bodyModel[12].setRotationPoint(-85.0f, -20.0f, -11.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 95
		bodyModel[13].addShapeBox(0, 0, 0, 4, 3, 6, 0, -4, -1, -4, 0, -1, -4, 0, -1, 0, -4, -1, 0, -3, 0, -2, 0, 0, 0, 0, 0, 0, -3, 0, 0);
		bodyModel[13].setRotationPoint(-88.0f, -20.0f, -17.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 96
		bodyModel[14].addShapeBox(0, 0, 0, 4, 3, 6, 0, -4, -1, 0, 0, -1, 0, 0, -1, -4, -4, -1, -4, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, -2);
		bodyModel[14].setRotationPoint(-88.0f, -20.0f, -11.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 97
		bodyModel[15].addShapeBox(0, 0, 0, 9, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(-85.5f, -20.0f, -13.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 98
		bodyModel[16].addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0);
		bodyModel[16].setRotationPoint(-85.5f, -20.0f, -15.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 99
		bodyModel[17].addShapeBox(0, 0, 0, 9, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0);
		bodyModel[17].setRotationPoint(-85.5f, -20.0f, -9.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 100
		bodyModel[18].addShapeBox(0, 0, 0, 4, 3, 8, 0, -3, 0, 0, 0, 0, 0, 0, 0, -2, -3, 0, -4, -3, 0, 0, -1, 0, 0, 0, 0, 0, -3, 0, -2);
		bodyModel[18].setRotationPoint(-88.0f, -17.0f, -11.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 101
		bodyModel[19].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[19].setRotationPoint(-86.5f, -18.5f, -12.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 102
		bodyModel[20].addShapeBox(0, 0, 0, 4, 5, 8, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[20].setRotationPoint(-87.0f, 3.0f, -19.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 103
		bodyModel[21].addShapeBox(0, 0, 0, 4, 5, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3);
		bodyModel[21].setRotationPoint(-87.0f, 3.0f, -11.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 104
		bodyModel[22].addShapeBox(0, 0, 0, 4, 5, 8, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -1, -3, 0, 0, -1, 0, 0);
		bodyModel[22].setRotationPoint(-84.0f, 3.0f, -21.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 105
		bodyModel[23].addShapeBox(0, 0, 0, 4, 5, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, -3, 0, 0, 0, 0, -1, -1, 0, -2);
		bodyModel[23].setRotationPoint(-84.0f, 3.0f, -9.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 106
		bodyModel[24].addShapeBox(0, 0, 0, 7, 5, 4, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, -1, -1, 0, -1, 0, -4.5f, -1, 0, -4.5f, -1, -1, 0, -2);
		bodyModel[24].setRotationPoint(-81.0f, 3.0f, -4.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 107
		bodyModel[25].addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1);
		bodyModel[25].setRotationPoint(-81.0f, 2.0f, -8.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 108
		bodyModel[26].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[26].setRotationPoint(-87.0f, 3.0f, -4.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 109
		bodyModel[27].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(-87.0f, 2.0f, -6.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 110
		bodyModel[28].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[28].setRotationPoint(-87.0f, 3.0f, -19.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 111
		bodyModel[29].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[29].setRotationPoint(-87.0f, 2.0f, -20.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 112
		bodyModel[30].addShapeBox(0, 0, 0, 7, 5, 4, 0, -1, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, -2, 0, -4.5f, -1, 0, -4.5f, -1, -1, 0, -1);
		bodyModel[30].setRotationPoint(-81.0f, 3.0f, -22.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 113
		bodyModel[31].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f);
		bodyModel[31].setRotationPoint(-81.0f, -14.0f, -22.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 118
		bodyModel[32].addShapeBox(0, 0, 0, 4, 3, 4, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[32].setRotationPoint(-86.0f, -3.0f, -6.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 119
		bodyModel[33].addBox(0, 0, 0, 6, 1, 6, 0f);
		bodyModel[33].setRotationPoint(-81.0f, 2.0f, -14.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 120
		bodyModel[34].addShapeBox(0, 0, 0, 4, 1, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2);
		bodyModel[34].setRotationPoint(-85.0f, 2.0f, -9.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 121
		bodyModel[35].addBox(0, 0, 0, 3, 1, 4, 0f);
		bodyModel[35].setRotationPoint(-84.0f, 2.0f, -13.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 122
		bodyModel[36].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -1, 0, 0, -2, 0, 0, -2, 0, 0, -3, 0, 0, -2, 0, 0, -3, 0, 0, 0, 0, 0, -1);
		bodyModel[36].setRotationPoint(-81.0f, -17.0f, -4.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 123
		bodyModel[37].addShapeBox(0, 0, 0, 5, 3, 9, 0, 0, -0.75f, -5, 0, 0, -5, 0, 0, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[37].setRotationPoint(-81.0f, -20.0f, -20.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 124
		bodyModel[38].addShapeBox(0, 0, 0, 4, 3, 8, 0, -1, -1, -6, 0, -0.75f, -4, 0, -0.5f, 0, -1, -1, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[38].setRotationPoint(-85.0f, -20.0f, -19.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 126
		bodyModel[39].addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -3, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -3, 0, 0, -2);
		bodyModel[39].setRotationPoint(-81.0f, -17.0f, -22.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 151
		bodyModel[40].addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -1, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0);
		bodyModel[40].setRotationPoint(-86.5f, -20.0f, -9.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 152
		bodyModel[41].addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1);
		bodyModel[41].setRotationPoint(-86.5f, -20.0f, -15.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 153
		bodyModel[42].addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0);
		bodyModel[42].setRotationPoint(-86.5f, -20.0f, -13.5f);

		bodyModel[43] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 158
		bodyModel[43].addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[43].setRotationPoint(-85.5f, -16.5f, -15.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 168
		bodyModel[44].addBox(0, 0, 0, 8, 3, 18, 0f);
		bodyModel[44].setRotationPoint(-16.0f, 3.0f, -20.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 169
		bodyModel[45].addBox(0, 0, 0, 8, 2, 20, 0f);
		bodyModel[45].setRotationPoint(-31.0f, 3.0f, -21.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 171
		bodyModel[46].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[46].setRotationPoint(-33.0f, -14.0f, -21.5f);

		bodyModel[47] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 174
		bodyModel[47].addBox(0, 0, 0, 1, 16, 21, 0f);
		bodyModel[47].setRotationPoint(23.0f, -14.0f, -21.5f);

		bodyModel[48] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 177
		bodyModel[48].addBox(0, 0, 0, 1, 16, 20, 0f);
		bodyModel[48].setRotationPoint(-69.0f, -14.0f, -21.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 340, 224, textureX, textureY); // Box 260
		bodyModel[49].addShapeBox(0, 0, 0, 1, 7, 6, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[49].setRotationPoint(-73.0f, -8.0f, -9.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 359, 226, textureX, textureY); // Box 261
		bodyModel[50].addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[50].setRotationPoint(-77.0f, -1.0f, -9.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 339, 248, textureX, textureY); // Box 262
		bodyModel[51].addShapeBox(0, 0, 0, 3, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[51].setRotationPoint(-76.5f, 0.0f, -9.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 263
		bodyModel[52].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[52].setRotationPoint(-88.0f, 3.0f, -12.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 265
		bodyModel[53].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[53].setRotationPoint(23.0f, -17.0f, -21.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 267
		bodyModel[54].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[54].setRotationPoint(-34.0f, -17.0f, -21.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 269
		bodyModel[55].addShapeBox(0, 0, 0, 56, 0, 7, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[55].setRotationPoint(-33.0f, -12.2f, -9.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 270
		bodyModel[56].addShapeBox(0, 0, 0, 56, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0);
		bodyModel[56].setRotationPoint(-33.0f, -12.2f, -21.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 271
		bodyModel[57].addBox(0, 0, 0, 6, 7, 12, 0f);
		bodyModel[57].setRotationPoint(-84.5f, -5.0f, -17.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 272
		bodyModel[58].addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[58].setRotationPoint(-83.5f, -7.0f, -9.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 279
		bodyModel[59].addShapeBox(0, 0, 0, 4, 1, 6, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -3, 0, 0, 0, 0, 0, 0, -2, 0, 0);
		bodyModel[59].setRotationPoint(-87.5f, 8.0f, -19.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 9
		bodyModel[60].addShapeBox(0, 0, 0, 4, 16, 3, 0, -1, 0, -2, 0, 0, 0, 0, 0, -2.5f, -1, 0, -0.5f, -1, 0, -2, 0, 0, 0, 0, 0, -2.5f, -1, 0, -0.5f);
		bodyModel[60].setRotationPoint(-85.0f, -14.0f, -21.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 10
		bodyModel[61].addShapeBox(0, 0, 0, 2, 16, 4, 0, -1, 0, -2, 0, 0, 0, 0, 0, -3.5f, -1.25f, 0, -2, -1, 0, -2, 0, 0, 0, 0, 0, -3.5f, -1.25f, 0, -2);
		bodyModel[61].setRotationPoint(-86.0f, -14.0f, -19.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 11
		bodyModel[62].addShapeBox(0, 0, 0, 1, 16, 12, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0);
		bodyModel[62].setRotationPoint(-85.0f, -14.0f, -17.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 0
		bodyModel[63].addShapeBox(0, 0, 0, 4, 16, 3, 0, -1, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, -1, 0, -2, -1, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, -1, 0, -2);
		bodyModel[63].setRotationPoint(-85.0f, -14.0f, -4.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 1
		bodyModel[64].addShapeBox(0, 0, 0, 2, 16, 4, 0, -1.25f, 0, -2, 0, 0, -3.5f, 0, 0, 0, -1, 0, -2, -1.25f, 0, -2, 0, 0, -3.5f, 0, 0, 0, -1, 0, -2);
		bodyModel[64].setRotationPoint(-86.0f, -14.0f, -7.0f);

		bodyModel[65] = new ModelRendererTurbo(this, 271, 118, textureX, textureY); // Box 9
		bodyModel[65].addShapeBox(0, 0, 0, 58, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[65].setRotationPoint(-34.0f, -14.0f, -1.0f);

		bodyModel[66] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 1
		bodyModel[66].addShapeBox(0, 0, 0, 6, 7, 2, 0, -0.75f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[66].setRotationPoint(-84.5f, -5.0f, -19.0f);

		bodyModel[67] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 2
		bodyModel[67].addShapeBox(0, 0, 0, 6, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, -0.5f);
		bodyModel[67].setRotationPoint(-84.5f, -5.0f, -5.0f);

		bodyModel[68] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 0
		bodyModel[68].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[68].setRotationPoint(-69.0f, -17.0f, -21.0f);

		bodyModel[69] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // 40
		bodyModel[69].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[69].setRotationPoint(-73.0f, 4.0f, -16.5f);

		bodyModel[70] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 23
		bodyModel[70].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[70].setRotationPoint(-71.0f, 3.0f, -5.0f);

		bodyModel[71] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 27
		bodyModel[71].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[71].setRotationPoint(-55.0f, 3.0f, -5.0f);

		bodyModel[72] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 28
		bodyModel[72].addBox(0, 0, 0, 3, 1, 12, 0f);
		bodyModel[72].setRotationPoint(-61.0f, 3.0f, -17.0f);

		bodyModel[73] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 77
		bodyModel[73].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[73].setRotationPoint(-71.0f, 3.0f, -17.0f);

		bodyModel[74] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 81
		bodyModel[74].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[74].setRotationPoint(-55.0f, 3.0f, -17.0f);

		bodyModel[75] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 12
		bodyModel[75].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[75].setRotationPoint(-52.0f, 6.0f, -17.0f);

		bodyModel[76] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 14
		bodyModel[76].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[76].setRotationPoint(-68.0f, 6.0f, -17.0f);

		bodyModel[77] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 15
		bodyModel[77].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[77].setRotationPoint(-73.0f, 4.0f, -7.5f);

		bodyModel[78] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 16
		bodyModel[78].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[78].setRotationPoint(-73.0f, 4.0f, -14.5f);

		bodyModel[79] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 17
		bodyModel[79].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[79].setRotationPoint(-48.0f, 4.0f, -14.5f);

		bodyModel[80] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 1
		bodyModel[80].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[80].setRotationPoint(-70.0f, 3.0f, -5.5f);

		bodyModel[81] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 3
		bodyModel[81].addBox(0, 0, 0, 7, 1, 12, 0f);
		bodyModel[81].setRotationPoint(-63.0f, 8.0f, -17.0f);

		bodyModel[82] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 4
		bodyModel[82].addBox(0, 0, 0, 3, 2, 10, 0f);
		bodyModel[82].setRotationPoint(-61.0f, 5.0f, -16.0f);

		bodyModel[83] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 5
		bodyModel[83].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[83].setRotationPoint(-70.0f, 3.0f, -17.5f);

		bodyModel[84] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 20
		bodyModel[84].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[84].setRotationPoint(-72.0f, 4.0f, -5.5f);

		bodyModel[85] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 21
		bodyModel[85].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[85].setRotationPoint(-72.0f, 4.0f, -17.5f);

		bodyModel[86] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		bodyModel[86].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[86].setRotationPoint(-52.5f, 6.5f, -5.0f);

		bodyModel[87] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 24
		bodyModel[87].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[87].setRotationPoint(-52.5f, 5.5f, -5.0f);

		bodyModel[88] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 25
		bodyModel[88].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[88].setRotationPoint(-54.0f, 6.0f, -5.0f);

		bodyModel[89] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 26
		bodyModel[89].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[89].setRotationPoint(-50.0f, 6.0f, -5.0f);

		bodyModel[90] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 29
		bodyModel[90].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[90].setRotationPoint(-63.0f, 6.0f, -5.0f);

		bodyModel[91] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 30
		bodyModel[91].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[91].setRotationPoint(-60.0f, 4.0f, -5.0f);

		bodyModel[92] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 31
		bodyModel[92].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[92].setRotationPoint(-68.5f, 6.5f, -5.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 32
		bodyModel[93].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[93].setRotationPoint(-68.5f, 5.5f, -5.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 33
		bodyModel[94].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[94].setRotationPoint(-66.0f, 6.0f, -5.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 34
		bodyModel[95].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[95].setRotationPoint(-70.0f, 6.0f, -5.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 37
		bodyModel[96].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[96].setRotationPoint(-52.5f, 6.5f, -18.0f);

		bodyModel[97] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 38
		bodyModel[97].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[97].setRotationPoint(-52.5f, 5.5f, -18.0f);

		bodyModel[98] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 39
		bodyModel[98].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[98].setRotationPoint(-54.0f, 6.0f, -18.0f);

		bodyModel[99] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 40
		bodyModel[99].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[99].setRotationPoint(-50.0f, 6.0f, -18.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 43
		bodyModel[100].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[100].setRotationPoint(-63.0f, 6.0f, -18.0f);

		bodyModel[101] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 44
		bodyModel[101].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[101].setRotationPoint(-60.0f, 4.0f, -18.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 45
		bodyModel[102].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[102].setRotationPoint(-68.5f, 6.5f, -18.0f);

		bodyModel[103] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 46
		bodyModel[103].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[103].setRotationPoint(-68.5f, 5.5f, -18.0f);

		bodyModel[104] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 47
		bodyModel[104].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[104].setRotationPoint(-66.0f, 6.0f, -18.0f);

		bodyModel[105] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 48
		bodyModel[105].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[105].setRotationPoint(-70.0f, 6.0f, -18.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 51
		bodyModel[106].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[106].setRotationPoint(-64.0f, 6.0f, -18.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 52
		bodyModel[107].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[107].setRotationPoint(-56.0f, 6.0f, -18.0f);

		bodyModel[108] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 53
		bodyModel[108].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[108].setRotationPoint(-64.0f, 6.0f, -5.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 54
		bodyModel[109].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[109].setRotationPoint(-56.0f, 6.0f, -5.0f);

		bodyModel[110] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 75
		bodyModel[110].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[110].setRotationPoint(-4.0f, 4.0f, -16.5f);

		bodyModel[111] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 76
		bodyModel[111].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[111].setRotationPoint(14.0f, 3.0f, -5.0f);

		bodyModel[112] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 77
		bodyModel[112].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[112].setRotationPoint(-2.0f, 3.0f, -5.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 78
		bodyModel[113].addBox(0, 0, 0, 3, 1, 12, 0f);
		bodyModel[113].setRotationPoint(8.0f, 3.0f, -17.0f);

		bodyModel[114] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 79
		bodyModel[114].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[114].setRotationPoint(14.0f, 3.0f, -17.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 80
		bodyModel[115].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[115].setRotationPoint(-2.0f, 3.0f, -17.0f);

		bodyModel[116] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 81
		bodyModel[116].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[116].setRotationPoint(1.0f, 6.0f, -17.0f);

		bodyModel[117] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 82
		bodyModel[117].addBox(0, 0, 0, 1, 1, 12, 0f);
		bodyModel[117].setRotationPoint(17.0f, 6.0f, -17.0f);

		bodyModel[118] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 83
		bodyModel[118].addShapeBox(0, 0, 0, 27, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[118].setRotationPoint(-4.0f, 4.0f, -7.5f);

		bodyModel[119] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 84
		bodyModel[119].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[119].setRotationPoint(21.0f, 4.0f, -14.5f);

		bodyModel[120] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 85
		bodyModel[120].addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[120].setRotationPoint(-4.0f, 4.0f, -14.5f);

		bodyModel[121] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 86
		bodyModel[121].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[121].setRotationPoint(-1.0f, 3.0f, -5.5f);

		bodyModel[122] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 87
		bodyModel[122].addBox(0, 0, 0, 7, 1, 12, 0f);
		bodyModel[122].setRotationPoint(6.0f, 8.0f, -17.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 88
		bodyModel[123].addBox(0, 0, 0, 3, 2, 10, 0f);
		bodyModel[123].setRotationPoint(8.0f, 5.0f, -16.0f);

		bodyModel[124] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 89
		bodyModel[124].addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[124].setRotationPoint(-1.0f, 3.0f, -17.5f);

		bodyModel[125] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 90
		bodyModel[125].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[125].setRotationPoint(-3.0f, 4.0f, -5.5f);

		bodyModel[126] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 91
		bodyModel[126].addShapeBox(0, 0, 0, 25, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[126].setRotationPoint(-3.0f, 4.0f, -17.5f);

		bodyModel[127] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 92
		bodyModel[127].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[127].setRotationPoint(0.5f, 6.5f, -5.0f);

		bodyModel[128] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 93
		bodyModel[128].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[128].setRotationPoint(0.5f, 5.5f, -5.0f);

		bodyModel[129] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 94
		bodyModel[129].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[129].setRotationPoint(3.0f, 6.0f, -5.0f);

		bodyModel[130] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 95
		bodyModel[130].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[130].setRotationPoint(-1.0f, 6.0f, -5.0f);

		bodyModel[131] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 98
		bodyModel[131].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[131].setRotationPoint(6.0f, 6.0f, -5.0f);

		bodyModel[132] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 99
		bodyModel[132].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[132].setRotationPoint(9.0f, 4.0f, -5.0f);

		bodyModel[133] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 100
		bodyModel[133].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[133].setRotationPoint(16.5f, 6.5f, -5.0f);

		bodyModel[134] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 101
		bodyModel[134].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[134].setRotationPoint(16.5f, 5.5f, -5.0f);

		bodyModel[135] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 102
		bodyModel[135].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[135].setRotationPoint(15.0f, 6.0f, -5.0f);

		bodyModel[136] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 103
		bodyModel[136].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[136].setRotationPoint(19.0f, 6.0f, -5.0f);

		bodyModel[137] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 106
		bodyModel[137].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[137].setRotationPoint(0.5f, 6.5f, -18.0f);

		bodyModel[138] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 107
		bodyModel[138].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[138].setRotationPoint(0.5f, 5.5f, -18.0f);

		bodyModel[139] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 108
		bodyModel[139].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[139].setRotationPoint(3.0f, 6.0f, -18.0f);

		bodyModel[140] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 109
		bodyModel[140].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[140].setRotationPoint(-1.0f, 6.0f, -18.0f);

		bodyModel[141] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 112
		bodyModel[141].addBox(0, 0, 0, 7, 2, 1, 0f);
		bodyModel[141].setRotationPoint(6.0f, 6.0f, -18.0f);

		bodyModel[142] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 113
		bodyModel[142].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[142].setRotationPoint(9.0f, 4.0f, -18.0f);

		bodyModel[143] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 114
		bodyModel[143].addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[143].setRotationPoint(16.5f, 6.5f, -18.0f);

		bodyModel[144] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 115
		bodyModel[144].addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[144].setRotationPoint(16.5f, 5.5f, -18.0f);

		bodyModel[145] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 116
		bodyModel[145].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[145].setRotationPoint(15.0f, 6.0f, -18.0f);

		bodyModel[146] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 117
		bodyModel[146].addBox(0, 0, 0, 1, 2, 1, 0f);
		bodyModel[146].setRotationPoint(19.0f, 6.0f, -18.0f);

		bodyModel[147] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 120
		bodyModel[147].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[147].setRotationPoint(13.0f, 6.0f, -18.0f);

		bodyModel[148] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 121
		bodyModel[148].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[148].setRotationPoint(5.0f, 6.0f, -18.0f);

		bodyModel[149] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 122
		bodyModel[149].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[149].setRotationPoint(13.0f, 6.0f, -5.0f);

		bodyModel[150] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 123
		bodyModel[150].addBox(0, 0, 0, 1, 3, 1, 0f);
		bodyModel[150].setRotationPoint(5.0f, 6.0f, -5.0f);

		bodyModel[151] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 124
		bodyModel[151].addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0.5f);
		bodyModel[151].setRotationPoint(25.0f, 5.0f, -1.0f);

		bodyModel[152] = new ModelRendererTurbo(this, 206, 132, textureX, textureY); // Box 133
		bodyModel[152].addBox(0, 0, 0, 12, 3, 0, 0f);
		bodyModel[152].setRotationPoint(-46.0f, 3.0f, -22.0f);

		bodyModel[153] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 0
		bodyModel[153].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[153].setRotationPoint(-85.5f, 3.0f, -7.0f);

		bodyModel[154] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1
		bodyModel[154].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[154].setRotationPoint(-85.5f, 3.0f, -7.0f);

		bodyModel[155] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 2
		bodyModel[155].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[155].setRotationPoint(-85.5f, 7.0f, -7.0f);

		bodyModel[156] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 3
		bodyModel[156].addShapeBox(0, 0, 0, 4, 1, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -3);
		bodyModel[156].setRotationPoint(-87.5f, 8.0f, -9.0f);

		bodyModel[157] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 4
		bodyModel[157].addShapeBox(0, 0, 0, 4, 1, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2, -0.5f, 0);
		bodyModel[157].setRotationPoint(-87.5f, 8.0f, -13.0f);

		bodyModel[158] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 10
		bodyModel[158].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[158].setRotationPoint(-85.5f, 3.0f, -8.0f);

		bodyModel[159] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 11
		bodyModel[159].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[159].setRotationPoint(-85.5f, 3.0f, -8.0f);

		bodyModel[160] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 12
		bodyModel[160].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[160].setRotationPoint(-85.5f, 7.0f, -8.0f);

		bodyModel[161] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 13
		bodyModel[161].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[161].setRotationPoint(-85.5f, 3.0f, -16.0f);

		bodyModel[162] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 14
		bodyModel[162].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[162].setRotationPoint(-85.5f, 3.0f, -16.0f);

		bodyModel[163] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 15
		bodyModel[163].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[163].setRotationPoint(-85.5f, 7.0f, -16.0f);

		bodyModel[164] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 16
		bodyModel[164].addShapeBox(0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[164].setRotationPoint(-85.5f, 3.0f, -14.0f);

		bodyModel[165] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 17
		bodyModel[165].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[165].setRotationPoint(-85.5f, 3.0f, -14.0f);

		bodyModel[166] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 18
		bodyModel[166].addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[166].setRotationPoint(-85.5f, 7.0f, -14.0f);

		bodyModel[167] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 31
		bodyModel[167].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[167].setRotationPoint(-71.0f, -9.0f, -22.5f);

		bodyModel[168] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 32
		bodyModel[168].addBox(0, 0, 0, 0, 10, 1, 0f);
		bodyModel[168].setRotationPoint(-76.0f, -9.0f, -22.5f);

		bodyModel[169] = new ModelRendererTurbo(this, 447, 189, textureX, textureY); // Box 368
		bodyModel[169].addShapeBox(0, 0, 0, 30, 16, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[169].setRotationPoint(-76.0f, -14.0f, -1.0f);

		bodyModel[170] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 371
		bodyModel[170].addShapeBox(0, 0, 0, 59, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[170].setRotationPoint(-35.0f, -14.0f, -22.0f);

		bodyModel[171] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 375
		bodyModel[171].addShapeBox(0, 0, 0, 25, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[171].setRotationPoint(-71.0f, -14.0f, -22.0f);

		bodyModel[172] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 378
		bodyModel[172].addShapeBox(0, 0, 0, 5, 15.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[172].setRotationPoint(-76.0f, -14.0f, -22.0f);

		bodyModel[173] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 380
		bodyModel[173].addShapeBox(0, 0, 0, 4, 3, 5, 0, -1, 0, -4, 0, 0, -2, 0, 0, -3, -1, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -4, -1, 0, -2);
		bodyModel[173].setRotationPoint(-85.0f, -17.0f, -21.0f);

		bodyModel[174] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 3
		bodyModel[174].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[174].setRotationPoint(-1.0f, 7.0f, -18.5f);

		bodyModel[175] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 4
		bodyModel[175].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[175].setRotationPoint(15.0f, 7.0f, -18.5f);

		bodyModel[176] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 5
		bodyModel[176].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[176].setRotationPoint(15.0f, 7.0f, -5.0f);

		bodyModel[177] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 6
		bodyModel[177].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[177].setRotationPoint(-1.0f, 7.0f, -5.0f);

		bodyModel[178] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 7
		bodyModel[178].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[178].setRotationPoint(-54.0f, 7.0f, -5.0f);

		bodyModel[179] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 8
		bodyModel[179].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[179].setRotationPoint(-70.0f, 7.0f, -5.0f);

		bodyModel[180] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 9
		bodyModel[180].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[180].setRotationPoint(-70.0f, 7.0f, -18.5f);

		bodyModel[181] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 10
		bodyModel[181].addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[181].setRotationPoint(-54.0f, 7.0f, -18.5f);

		bodyModel[182] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 0
		bodyModel[182].addShapeBox(0, 0, 0, 5, 16, 1, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1);
		bodyModel[182].setRotationPoint(-81.0f, -14.0f, -1.0f);

		bodyModel[183] = new ModelRendererTurbo(this, 44, 269, textureX, textureY); // Box 181
		bodyModel[183].addBox(0, 0, 0, 1, 3, 14, 0f);
		bodyModel[183].setRotationPoint(32.0f, -17.0f, -18.0f);

		bodyModel[184] = new ModelRendererTurbo(this, 448, 218, textureX, textureY); // Box 182
		bodyModel[184].addBox(0, 0, 0, 1, 19, 20, 0f);
		bodyModel[184].setRotationPoint(32.0f, -14.0f, -21.0f);

		bodyModel[185] = new ModelRendererTurbo(this, 437, 215, textureX, textureY); // Box 184
		bodyModel[185].addShapeBox(0, 0, 0, 8, 16, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0);
		bodyModel[185].setRotationPoint(24.0f, -14.0f, -22.0f);

		bodyModel[186] = new ModelRendererTurbo(this, 8, 270, textureX, textureY); // Box 185
		bodyModel[186].addShapeBox(0, 0, 0, 9, 3, 2, 0, 0, 0, -2, 0, 0, -3, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 2, 0, 0, -1);
		bodyModel[186].setRotationPoint(24.0f, -17.0f, -22.0f);

		bodyModel[187] = new ModelRendererTurbo(this, 77, 253, textureX, textureY); // Box 186
		bodyModel[187].addShapeBox(0, 0, 0, 9, 3, 2, 0, 0, 0, 0, 0, 0, 2, 0, 0, -3, 0, 0, -2, 0, 0, -1, 0, 0, 2, 0, 0, -1, 0, 0, 0);
		bodyModel[187].setRotationPoint(24.0f, -17.0f, -2.0f);

		bodyModel[188] = new ModelRendererTurbo(this, 128, 252, textureX, textureY); // Box 187
		bodyModel[188].addShapeBox(0, 0, 0, 9, 4, 18, 0, 0, -1, -5, 0, -1, -6, 0, -1, -6, 0, -1, -5, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0);
		bodyModel[188].setRotationPoint(24.0f, -21.0f, -20.0f);

		bodyModel[189] = new ModelRendererTurbo(this, 1, 18, textureX, textureY); // Box 193
		bodyModel[189].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[189].setRotationPoint(33.0f, -2.0f, -20.0f);

		bodyModel[190] = new ModelRendererTurbo(this, 14, 18, textureX, textureY); // Box 194
		bodyModel[190].addBox(0, 0, 0, 1, 2, 2, 0f);
		bodyModel[190].setRotationPoint(33.0f, -2.0f, -4.0f);

		bodyModel[191] = new ModelRendererTurbo(this, 416, 215, textureX, textureY); // Box 14
		bodyModel[191].addShapeBox(0, 0, 0, 8, 16, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0);
		bodyModel[191].setRotationPoint(24.0f, -14.0f, -1.0f);

		bodyModel[192] = new ModelRendererTurbo(this, 224, 117, textureX, textureY); // Box 15
		bodyModel[192].addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0);
		bodyModel[192].setRotationPoint(24.0f, 2.0f, -1.0f);

		bodyModel[193] = new ModelRendererTurbo(this, 279, 244, textureX, textureY); // Box 16
		bodyModel[193].addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0);
		bodyModel[193].setRotationPoint(24.0f, 2.0f, -22.0f);

		bodyModel[194] = new ModelRendererTurbo(this, 14, 213, textureX, textureY); // Box 23
		bodyModel[194].addBox(0, 0, 0, 1, 17, 1, 0f);
		bodyModel[194].setRotationPoint(33.0f, -14.0f, -17.0f);

		bodyModel[195] = new ModelRendererTurbo(this, 6, 243, textureX, textureY); // Box 24
		bodyModel[195].addBox(0, 0, 0, 1, 17, 1, 0f);
		bodyModel[195].setRotationPoint(33.0f, -14.0f, -6.0f);

		bodyModel[196] = new ModelRendererTurbo(this, 47, 249, textureX, textureY); // Box 25
		bodyModel[196].addBox(0, 0, 0, 1, 2, 10, 0f);
		bodyModel[196].setRotationPoint(33.0f, 1.0f, -16.0f);

		bodyModel[197] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 27
		bodyModel[197].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[197].setRotationPoint(31.0f, 3.0f, -4.0f);

		bodyModel[198] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 28
		bodyModel[198].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[198].setRotationPoint(35.0f, 2.0f, -6.0f);

		bodyModel[199] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 29
		bodyModel[199].addBox(0, 0, 0, 4, 1, 1, 0f);
		bodyModel[199].setRotationPoint(31.0f, 3.0f, -19.0f);

		bodyModel[200] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 30
		bodyModel[200].addShapeBox(0, 0, 0, 0, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[200].setRotationPoint(35.0f, 2.0f, -20.0f);

		bodyModel[201] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 31
		bodyModel[201].addBox(0, 0, 0, 5, 2, 2, 0f);
		bodyModel[201].setRotationPoint(31.0f, 3.0f, -12.0f);

		bodyModel[202] = new ModelRendererTurbo(this, 15, 242, textureX, textureY); // Box 32
		bodyModel[202].addBox(0, 0, 0, 1, 2, 12, 0f);
		bodyModel[202].setRotationPoint(33.0f, -16.0f, -17.0f);

		bodyModel[203] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 34
		bodyModel[203].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[203].setRotationPoint(-46.0f, -14.0f, -22.5f);

		bodyModel[204] = new ModelRendererTurbo(this, 382, 216, textureX, textureY); // Box 35
		bodyModel[204].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[204].setRotationPoint(-40.0f, -14.0f, -22.5f);

		bodyModel[205] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 36
		bodyModel[205].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[205].setRotationPoint(-46.0f, -14.0f, -0.5f);

		bodyModel[206] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 37
		bodyModel[206].addShapeBox(0, 0, 0, 6, 17, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[206].setRotationPoint(-40.0f, -14.0f, -0.5f);

		bodyModel[207] = new ModelRendererTurbo(this, 235, 133, textureX, textureY); // Box 38
		bodyModel[207].addBox(0, 0, 0, 12, 3, 0, 0f);
		bodyModel[207].setRotationPoint(-46.0f, 3.0f, 0.0f);

		bodyModel[208] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 39
		bodyModel[208].addShapeBox(0, 0, 0, 6, 2, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -0.5f);
		bodyModel[208].setRotationPoint(25.0f, 5.0f, -21.0f);

		bodyModel[209] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[209].addShapeBox(0, 0, 0, 8, 1, 20, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0);
		bodyModel[209].setRotationPoint(24.0f, 2.0f, -21.0f);

		bodyModel[210] = new ModelRendererTurbo(this, 376, 261, textureX, textureY); // Box 278
		bodyModel[210].addBox(0, 0, 0, 10, 16, 8, 0f);
		bodyModel[210].setRotationPoint(-56.0f, -14.5f, -8.5f);

		bodyModel[211] = new ModelRendererTurbo(this, 305, 231, textureX, textureY); // Box 280
		bodyModel[211].addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[211].setRotationPoint(-58.0f, -1.0f, -21.0f);

		bodyModel[212] = new ModelRendererTurbo(this, 305, 231, textureX, textureY); // Box 280
		bodyModel[212].addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[212].setRotationPoint(-52.0f, -1.0f, -21.0f);

		bodyModel[213] = new ModelRendererTurbo(this, 306, 230, textureX, textureY); // Box 287
		bodyModel[213].addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.2f, 1.5f, 0, -0.2f, 1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1);
		bodyModel[213].setRotationPoint(-58.0f, -5.0f, -20.25f);

		bodyModel[214] = new ModelRendererTurbo(this, 308, 230, textureX, textureY); // Box 288
		bodyModel[214].addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.2f, 1.5f, 0, -0.2f, 1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1);
		bodyModel[214].setRotationPoint(-64.0f, -5.0f, -20.25f);

		bodyModel[215] = new ModelRendererTurbo(this, 305, 232, textureX, textureY); // Box 289
		bodyModel[215].addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[215].setRotationPoint(-64.0f, -1.0f, -21.0f);

		bodyModel[216] = new ModelRendererTurbo(this, 306, 230, textureX, textureY); // Box 290
		bodyModel[216].addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, -0.2f, 1.5f, 0, -0.2f, 1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1);
		bodyModel[216].setRotationPoint(-52.0f, -5.0f, -20.25f);

		bodyModel[217] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[217].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[217].setRotationPoint(8.0f, -8.2f, -21.0f);

		bodyModel[218] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[218].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[218].setRotationPoint(7.0f, -8.0f, -21.0f);

		bodyModel[219] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[219].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[219].setRotationPoint(5.0f, -1.0f, -21.0f);

		bodyModel[220] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[220].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[220].setRotationPoint(5.5f, 0.0f, -21.0f);

		bodyModel[221] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 225
		bodyModel[221].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[221].setRotationPoint(-3.0f, -8.2f, -21.0f);

		bodyModel[222] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 226
		bodyModel[222].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[222].setRotationPoint(-2.0f, -8.0f, -21.0f);

		bodyModel[223] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 227
		bodyModel[223].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[223].setRotationPoint(-2.0f, -1.0f, -21.0f);

		bodyModel[224] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 228
		bodyModel[224].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[224].setRotationPoint(-1.5f, 0.0f, -21.0f);

		bodyModel[225] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[225].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[225].setRotationPoint(-18.0f, -8.2f, -21.0f);

		bodyModel[226] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[226].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[226].setRotationPoint(-19.0f, -8.0f, -21.0f);

		bodyModel[227] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[227].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[227].setRotationPoint(-21.0f, -1.0f, -21.0f);

		bodyModel[228] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[228].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[228].setRotationPoint(-20.5f, 0.0f, -21.0f);

		bodyModel[229] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 225
		bodyModel[229].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[229].setRotationPoint(-30.0f, -8.2f, -21.0f);

		bodyModel[230] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 226
		bodyModel[230].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[230].setRotationPoint(-29.0f, -8.0f, -21.0f);

		bodyModel[231] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 227
		bodyModel[231].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[231].setRotationPoint(-29.0f, -1.0f, -21.0f);

		bodyModel[232] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 228
		bodyModel[232].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[232].setRotationPoint(-28.5f, 0.0f, -21.0f);

		bodyModel[233] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[233].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[233].setRotationPoint(21.0f, -8.2f, -21.0f);

		bodyModel[234] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[234].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[234].setRotationPoint(20.0f, -8.0f, -21.0f);

		bodyModel[235] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[235].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[235].setRotationPoint(18.0f, -1.0f, -21.0f);

		bodyModel[236] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[236].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[236].setRotationPoint(18.5f, 0.0f, -21.0f);

		bodyModel[237] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 225
		bodyModel[237].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[237].setRotationPoint(10.0f, -8.2f, -21.0f);

		bodyModel[238] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 226
		bodyModel[238].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[238].setRotationPoint(11.0f, -8.0f, -21.0f);

		bodyModel[239] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 227
		bodyModel[239].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[239].setRotationPoint(11.0f, -1.0f, -21.0f);

		bodyModel[240] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 228
		bodyModel[240].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[240].setRotationPoint(11.5f, 0.0f, -21.0f);

		bodyModel[241] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[241].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[241].setRotationPoint(-5.0f, -8.2f, -21.0f);

		bodyModel[242] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[242].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[242].setRotationPoint(-6.0f, -8.0f, -21.0f);

		bodyModel[243] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[243].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[243].setRotationPoint(-8.0f, -1.0f, -21.0f);

		bodyModel[244] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[244].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[244].setRotationPoint(-7.5f, 0.0f, -21.0f);

		bodyModel[245] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 225
		bodyModel[245].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[245].setRotationPoint(-16.0f, -8.2f, -21.0f);

		bodyModel[246] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 226
		bodyModel[246].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[246].setRotationPoint(-15.0f, -8.0f, -21.0f);

		bodyModel[247] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 227
		bodyModel[247].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[247].setRotationPoint(-15.0f, -1.0f, -21.0f);

		bodyModel[248] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 228
		bodyModel[248].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[248].setRotationPoint(-14.5f, 0.0f, -21.0f);

		bodyModel[249] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[249].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[249].setRotationPoint(8.0f, -8.2f, -9.0f);

		bodyModel[250] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[250].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[250].setRotationPoint(7.0f, -8.0f, -9.0f);

		bodyModel[251] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[251].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[251].setRotationPoint(5.0f, -1.0f, -9.0f);

		bodyModel[252] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[252].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[252].setRotationPoint(5.5f, 0.0f, -9.0f);

		bodyModel[253] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 225
		bodyModel[253].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[253].setRotationPoint(-3.0f, -8.2f, -9.0f);

		bodyModel[254] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 226
		bodyModel[254].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[254].setRotationPoint(-2.0f, -8.0f, -9.0f);

		bodyModel[255] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 227
		bodyModel[255].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[255].setRotationPoint(-2.0f, -1.0f, -9.0f);

		bodyModel[256] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 228
		bodyModel[256].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[256].setRotationPoint(-1.5f, 0.0f, -9.0f);

		bodyModel[257] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[257].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[257].setRotationPoint(-18.0f, -8.2f, -9.0f);

		bodyModel[258] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[258].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[258].setRotationPoint(-19.0f, -8.0f, -9.0f);

		bodyModel[259] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[259].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[259].setRotationPoint(-21.0f, -1.0f, -9.0f);

		bodyModel[260] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[260].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[260].setRotationPoint(-20.5f, 0.0f, -9.0f);

		bodyModel[261] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 225
		bodyModel[261].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[261].setRotationPoint(-29.0f, -8.2f, -9.0f);

		bodyModel[262] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 226
		bodyModel[262].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[262].setRotationPoint(-28.0f, -8.0f, -9.0f);

		bodyModel[263] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 227
		bodyModel[263].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[263].setRotationPoint(-28.0f, -1.0f, -9.0f);

		bodyModel[264] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 228
		bodyModel[264].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[264].setRotationPoint(-27.5f, 0.0f, -9.0f);

		bodyModel[265] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[265].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[265].setRotationPoint(21.0f, -8.2f, -9.0f);

		bodyModel[266] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[266].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[266].setRotationPoint(20.0f, -8.0f, -9.0f);

		bodyModel[267] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[267].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[267].setRotationPoint(18.0f, -1.0f, -9.0f);

		bodyModel[268] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[268].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[268].setRotationPoint(18.5f, 0.0f, -9.0f);

		bodyModel[269] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 225
		bodyModel[269].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[269].setRotationPoint(10.0f, -8.2f, -9.0f);

		bodyModel[270] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 226
		bodyModel[270].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[270].setRotationPoint(11.0f, -8.0f, -9.0f);

		bodyModel[271] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 227
		bodyModel[271].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[271].setRotationPoint(11.0f, -1.0f, -9.0f);

		bodyModel[272] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 228
		bodyModel[272].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[272].setRotationPoint(11.5f, 0.0f, -9.0f);

		bodyModel[273] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 368
		bodyModel[273].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[273].setRotationPoint(-5.0f, -8.2f, -9.0f);

		bodyModel[274] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 377
		bodyModel[274].addShapeBox(0, 0, 0, 1, 7, 8, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[274].setRotationPoint(-6.0f, -8.0f, -9.0f);

		bodyModel[275] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 378
		bodyModel[275].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[275].setRotationPoint(-8.0f, -1.0f, -9.0f);

		bodyModel[276] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 392
		bodyModel[276].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[276].setRotationPoint(-7.5f, 0.0f, -9.0f);

		bodyModel[277] = new ModelRendererTurbo(this, 267, 226, textureX, textureY); // Box 225
		bodyModel[277].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[277].setRotationPoint(-16.0f, -8.2f, -9.0f);

		bodyModel[278] = new ModelRendererTurbo(this, 304, 221, textureX, textureY); // Box 226
		bodyModel[278].addShapeBox(0, 0, 0, 1, 7, 8, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[278].setRotationPoint(-15.0f, -8.0f, -9.0f);

		bodyModel[279] = new ModelRendererTurbo(this, 280, 223, textureX, textureY); // Box 227
		bodyModel[279].addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0);
		bodyModel[279].setRotationPoint(-15.0f, -1.0f, -9.0f);

		bodyModel[280] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 228
		bodyModel[280].addShapeBox(0, 0, 0, 2, 2, 8, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[280].setRotationPoint(-14.5f, 0.0f, -9.0f);

		flipAll();
	}

}
