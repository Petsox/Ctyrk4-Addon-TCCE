//FMT-Marker DFM-1.0
//Creator: Unregistered Account

package cz.ctyrkaten.train.client.render.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class U57LocoModel extends ModelConverter {

	private int textureX = 256;
	private int textureY = 256;

	public U57LocoModel(){
		bodyModel = new ModelRendererTurbo[55];
				initGroup_bodyModel();
				flipAll();
	}
	private final void initGroup_bodyModel(){


		//
		bodyModel[0] = new ModelRendererTurbo(this, 25, 205, textureX, textureY); // Box 3
		bodyModel[0].addBox(-1, 0, 0, 1, 2, 46, 0f);
		bodyModel[0].setRotationPoint(8.0f, 2.0f, 4.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 225, 230, textureX, textureY); // Box 5
		bodyModel[1].addBox(0, 0, 0, 5, 15, 10, 0f);
		bodyModel[1].setRotationPoint(-6.0f, 2.0f, 67.0f);
		bodyModel[1].rotateAngleY = -3.1415927f;

		bodyModel[2] = new ModelRendererTurbo(this, 39, 219, textureX, textureY); // Box 7
		bodyModel[2].addBox(0, 0, 0, 1, 2, 32, 0f);
		bodyModel[2].setRotationPoint(-8.0f, 2.0f, 28.0f);
		bodyModel[2].rotateAngleX = -0.19198622f;

		bodyModel[3] = new ModelRendererTurbo(this, 225, 230, textureX, textureY); // Box 8
		bodyModel[3].addBox(-5, 0, 0, 5, 15, 10, 0f);
		bodyModel[3].setRotationPoint(11.0f, 2.0f, 57.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 39, 219, textureX, textureY); // Box 9
		bodyModel[4].addBox(-1, 0, 0, 1, 2, 32, 0f);
		bodyModel[4].setRotationPoint(8.0f, 2.0f, 28.0f);
		bodyModel[4].rotateAngleX = -0.19198622f;

		bodyModel[5] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 10
		bodyModel[5].addBox(0, 0, 0, 6, 6, 67, 0f);
		bodyModel[5].setRotationPoint(-3.0f, 16.01f, 2.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 11
		bodyModel[6].addBox(0, 0, 0, 6, 6, 67, 0f);
		bodyModel[6].setRotationPoint(-3.0f, 16.0f, 2.0f);
		bodyModel[6].rotateAngleZ = -0.7853982f;

		bodyModel[7] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 12
		bodyModel[7].addBox(-6, 0, 0, 6, 6, 67, 0f);
		bodyModel[7].setRotationPoint(3.0f, 16.0f, 2.0f);
		bodyModel[7].rotateAngleZ = -5.497787f;

		bodyModel[8] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 13
		bodyModel[8].addBox(0, 0, 0, 6, 6, 67, 0f);
		bodyModel[8].setRotationPoint(-7.0f, 20.0f, 2.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 14
		bodyModel[9].addBox(0, -5, -5, 1, 10, 10, 0f);
		bodyModel[9].setRotationPoint(-7.0f, 6.0f, 40.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 15
		bodyModel[10].addBox(-6, 0, 0, 6, 6, 67, 0f);
		bodyModel[10].setRotationPoint(7.0f, 20.0f, 2.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 16
		bodyModel[11].addBox(0, -6, 0, 6, 6, 67, 0f);
		bodyModel[11].setRotationPoint(-7.0f, 26.0f, 2.0f);
		bodyModel[11].rotateAngleZ = 5.497787f;

		bodyModel[12] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 18
		bodyModel[12].addBox(0, -4, 0, 6, 6, 67, 0f);
		bodyModel[12].setRotationPoint(-3.0f, 28.0f, 2.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 77, 177, textureX, textureY); // Box 19
		bodyModel[13].addBox(-6, -6, 0, 6, 6, 67, 0f);
		bodyModel[13].setRotationPoint(7.0f, 26.0f, 2.0f);
		bodyModel[13].rotateAngleZ = 0.7853982f;

		bodyModel[14] = new ModelRendererTurbo(this, 25, 240, textureX, textureY); // Box 18
		bodyModel[14].addBox(-4, -5, 0, 8, 8, 1, 0f);
		bodyModel[14].setRotationPoint(0.0f, 24.0f, 69.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 99, 117, textureX, textureY); // Box 19
		bodyModel[15].addBox(0, 0, 0, 22, 1, 55, 0f);
		bodyModel[15].setRotationPoint(-11.0f, 16.0f, 2.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 79, 92, textureX, textureY); // Box 20
		bodyModel[16].addBox(0, 0, 0, 12, 4, 10, 0f);
		bodyModel[16].setRotationPoint(-6.0f, 13.0f, 57.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 160, 237, textureX, textureY); // Box 21
		bodyModel[17].addBox(0, 0, 0, 22, 4, 1, 0f);
		bodyModel[17].setRotationPoint(-11.0f, 10.0f, 74.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 208, 231, textureX, textureY); // Box 22
		bodyModel[18].addBox(0, 0, 0, 6, 10, 1, 0f);
		bodyModel[18].setRotationPoint(-4.0f, 3.0f, 74.0f);
		bodyModel[18].rotateAngleZ = -0.7853982f;

		bodyModel[19] = new ModelRendererTurbo(this, 208, 231, textureX, textureY); // Box 24
		bodyModel[19].addBox(-6, 0, 0, 6, 10, 1, 0f);
		bodyModel[19].setRotationPoint(4.0f, 3.0f, 74.0f);
		bodyModel[19].rotateAngleZ = -5.497787f;

		bodyModel[20] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 25
		bodyModel[20].addBox(0, -5, -5, 1, 10, 10, 0f);
		bodyModel[20].setRotationPoint(-7.0f, 6.0f, 51.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 79, 234, textureX, textureY); // Box 26
		bodyModel[21].addBox(0, 0, 0, 22, 1, 8, 0f);
		bodyModel[21].setRotationPoint(-11.0f, 13.0f, 67.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 45, 236, textureX, textureY); // Box 27
		bodyModel[22].addBox(0, 0, 0, 4, 4, 8, 0f);
		bodyModel[22].setRotationPoint(-2.0f, 6.0f, 72.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 160, 230, textureX, textureY); // Box 28
		bodyModel[23].addBox(0, 0, 0, 4, 4, 2, 0f);
		bodyModel[23].setRotationPoint(-8.0f, 14.0f, 74.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 160, 230, textureX, textureY); // Box 29
		bodyModel[24].addBox(-4, 0, 0, 4, 4, 2, 0f);
		bodyModel[24].setRotationPoint(8.0f, 14.0f, 74.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 3, 208, textureX, textureY); // Box 30
		bodyModel[25].addBox(0, 0, 0, 22, 21, 1, 0f);
		bodyModel[25].setRotationPoint(-11.0f, 12.0f, 1.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 179, 210, textureX, textureY); // Box 31
		bodyModel[26].addBox(0, 0, 0, 22, 1, 15, 0f);
		bodyModel[26].setRotationPoint(-11.0f, 12.0f, -13.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 87, 101, textureX, textureY); // Box 32
		bodyModel[27].addBox(0, 0, 0, 12, 3, 1, 0f);
		bodyModel[27].setRotationPoint(-6.0f, 13.0f, 18.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 108, 203, textureX, textureY); // Box 33
		bodyModel[28].addBox(0, 0, 0, 1, 12, 13, 0f);
		bodyModel[28].setRotationPoint(10.0f, 13.0f, -12.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 78, 203, textureX, textureY); // Box 34
		bodyModel[29].addBox(0, 0, 0, 1, 12, 13, 0f);
		bodyModel[29].setRotationPoint(-11.0f, 13.0f, -12.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		bodyModel[30].addBox(0, 0, 0, 4, 4, 4, 0f);
		bodyModel[30].setRotationPoint(-2.0f, 6.0f, -16.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 49, 240, textureX, textureY); // Box 35
		bodyModel[31].addBox(0, 0, 0, 4, 4, 4, 0f);
		bodyModel[31].setRotationPoint(-2.0f, 6.0f, -16.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 25, 205, textureX, textureY); // Box 36
		bodyModel[32].addBox(0, 0, 0, 1, 2, 46, 0f);
		bodyModel[32].setRotationPoint(-8.0f, 2.0f, 4.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 3, 180, textureX, textureY); // Box 37
		bodyModel[33].addBox(0, 0, 0, 2, 7, 16, 0f);
		bodyModel[33].setRotationPoint(8.0f, 37.0f, -13.0f);
		bodyModel[33].rotateAngleZ = 2.3561945f;

		bodyModel[34] = new ModelRendererTurbo(this, 3, 180, textureX, textureY); // Box 38
		bodyModel[34].addBox(-2, 0, 0, 2, 7, 16, 0f);
		bodyModel[34].setRotationPoint(-8.0f, 37.0f, -13.0f);
		bodyModel[34].rotateAngleZ = 3.9269907f;

		bodyModel[35] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 39
		bodyModel[35].addBox(0, 0, 0, 16, 1, 16, 0f);
		bodyModel[35].setRotationPoint(-8.0f, 36.0f, -13.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 7, 211, textureX, textureY); // Box 40
		bodyModel[36].addBox(0, 0, 0, 18, 3, 1, 0f);
		bodyModel[36].setRotationPoint(-9.0f, 33.0f, 1.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 40, 180, textureX, textureY); // Box 41
		bodyModel[37].addBox(0, 0, 0, 4, 4, 16, 0f);
		bodyModel[37].setRotationPoint(-11.0f, 17.0f, 5.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 40, 180, textureX, textureY); // Box 42
		bodyModel[38].addBox(0, 0, 0, 4, 4, 16, 0f);
		bodyModel[38].setRotationPoint(-11.0f, 17.0f, 23.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 93, 188, textureX, textureY); // Box 43
		bodyModel[39].addBox(0, 0, 0, 6, 4, 6, 0f);
		bodyModel[39].setRotationPoint(-3.0f, 29.0f, 59.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 160, 230, textureX, textureY); // Box 44
		bodyModel[40].addBox(-2, 0, 0, 4, 4, 2, 0f);
		bodyModel[40].setRotationPoint(0.0f, 29.0f, 68.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 86, 184, textureX, textureY); // Box 45
		bodyModel[41].addBox(0, 0, 0, 10, 5, 10, 0f);
		bodyModel[41].setRotationPoint(-5.0f, 32.0f, 57.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 214, 190, textureX, textureY); // Box 46
		bodyModel[42].addBox(0, 0, 0, 10, 8, 10, 0f);
		bodyModel[42].setRotationPoint(-5.0f, 28.0f, 35.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 87, 101, textureX, textureY); // Box 48
		bodyModel[43].addBox(0, 0, 0, 12, 3, 1, 0f);
		bodyModel[43].setRotationPoint(-6.0f, 13.0f, 39.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 49
		bodyModel[44].addBox(0, 0, 0, 1, 9, 1, 0f);
		bodyModel[44].setRotationPoint(-11.0f, 25.0f, -12.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 50
		bodyModel[45].addBox(0, 0, 0, 1, 9, 1, 0f);
		bodyModel[45].setRotationPoint(-11.0f, 25.0f, -6.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 51
		bodyModel[46].addBox(0, 0, 0, 1, 9, 1, 0f);
		bodyModel[46].setRotationPoint(10.0f, 25.0f, -12.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 52
		bodyModel[47].addBox(0, 0, 0, 1, 9, 1, 0f);
		bodyModel[47].setRotationPoint(10.0f, 25.0f, -6.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 96, 135, textureX, textureY); // Box 53
		bodyModel[48].addBox(0, 0, 0, 16, 13, 1, 0f);
		bodyModel[48].setRotationPoint(-8.0f, 13.0f, 0.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 58, 154, textureX, textureY); // Box 55
		bodyModel[49].addBox(0, 0, 0, 4, 4, 13, 0f);
		bodyModel[49].setRotationPoint(6.0f, 14.0f, 39.0f);
		bodyModel[49].rotateAngleY = -1.5707964f;
		bodyModel[49].rotateAngleZ = -0.7853982f;

		bodyModel[50] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 62
		bodyModel[50].addBox(-1, -5, -5, 1, 10, 10, 0f);
		bodyModel[50].setRotationPoint(7.0f, 6.0f, 51.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 160, 237, textureX, textureY); // Box 63
		bodyModel[51].addBox(0, 0, 0, 22, 4, 1, 0f);
		bodyModel[51].setRotationPoint(-11.0f, 8.0f, -13.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 67
		bodyModel[52].addBox(0, 0, 0, 8, 7, 8, 0f);
		bodyModel[52].setRotationPoint(-4.0f, 28.0f, 18.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 3, 12, textureX, textureY); // Box 78
		bodyModel[53].addBox(-6, 3, 4, 12, 10, 86, 0f);
		bodyModel[53].setRotationPoint(0.0f, -0.01f, -16.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 3, 12, textureX, textureY); // Box 80
		bodyModel[54].addBox(-6, 3, 4, 12, 7, 7, 0f);
		bodyModel[54].setRotationPoint(0.0f, 3.0f, 63.0f);

		bodyModel[0] = new ModelRendererTurbo(this, 58, 154, textureX, textureY); // Box 55cp
		bodyModel[0].addBox(0, 0, 0, 4, 4, 13, 0f);
		bodyModel[0].setRotationPoint(6.0f, 14.0f, 34.0f);
		bodyModel[0].rotateAngleY = -1.5707964f;
		bodyModel[0].rotateAngleZ = -0.7853982f;

		bodyModel[1] = new ModelRendererTurbo(this, 58, 154, textureX, textureY); // Box 55cp
		bodyModel[1].addBox(0, 0, 0, 4, 4, 13, 0f);
		bodyModel[1].setRotationPoint(-11.0f, 7.0f, -12.0f);
		bodyModel[1].rotateAngleZ = -0.7853982f;

		bodyModel[2] = new ModelRendererTurbo(this, 57, 237, textureX, textureY); // Box 36cp
		bodyModel[2].addBox(0, 0, 0, 1, 2, 14, 0f);
		bodyModel[2].setRotationPoint(-8.0f, 8.0f, 57.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 57, 237, textureX, textureY); // Box 36cp
		bodyModel[3].addBox(0, 0, 0, 1, 2, 14, 0f);
		bodyModel[3].setRotationPoint(7.0f, 8.0f, 57.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 14cp
		bodyModel[4].addBox(0, -5, -5, 1, 10, 10, 0f);
		bodyModel[4].setRotationPoint(-7.0f, 6.0f, 29.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 14cp
		bodyModel[5].addBox(0, -5, -5, 1, 10, 10, 0f);
		bodyModel[5].setRotationPoint(-7.0f, 6.0f, 18.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 14cp
		bodyModel[6].addBox(0, -5, -5, 1, 10, 10, 0f);
		bodyModel[6].setRotationPoint(-7.0f, 6.0f, 7.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 62cp
		bodyModel[7].addBox(-1, -5, -5, 1, 10, 10, 0f);
		bodyModel[7].setRotationPoint(7.0f, 6.0f, 40.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 62cp
		bodyModel[8].addBox(-1, -5, -5, 1, 10, 10, 0f);
		bodyModel[8].setRotationPoint(7.0f, 6.0f, 29.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 62cp
		bodyModel[9].addBox(-1, -5, -5, 1, 10, 10, 0f);
		bodyModel[9].setRotationPoint(7.0f, 6.0f, 18.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 62cp
		bodyModel[10].addBox(-1, -5, -5, 1, 10, 10, 0f);
		bodyModel[10].setRotationPoint(7.0f, 6.0f, 7.0f);

		flipAll();
	}

}
