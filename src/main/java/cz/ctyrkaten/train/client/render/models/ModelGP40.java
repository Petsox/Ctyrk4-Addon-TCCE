package cz.ctyrkaten.train.client.render.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

import java.util.List;

public class ModelGP40 extends ModelConverter {
	int textureX = 512;
	int textureY = 512;

	public ModelGP40() {
		bodyModel = new ModelRendererTurbo[352];

        bodyModel[0] = new ModelRendererTurbo(this, 20, 47, textureX, textureY);
		bodyModel[0].addBox(0F, 0F, 0F, 8, 2, 0);
		bodyModel[0].setRotationPoint(-9F, 9F, 11F);
		bodyModel[0].rotateAngleX = 0.0349066F;

		bodyModel[1] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[1].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[1].setRotationPoint(8F, -0.5F, -6.6F);
		bodyModel[1].rotateAngleX = -2.792527F;

        bodyModel[2] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[2].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[2].setRotationPoint(8F, 1.5F, -6.6F);
		bodyModel[2].rotateAngleX = -2.792527F;

        bodyModel[3] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[3].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[3].setRotationPoint(8F, 0.5F, -6.6F);
		bodyModel[3].rotateAngleX = -2.792527F;

        bodyModel[4] = new ModelRendererTurbo(this, 200, 0, textureX, textureY);
		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 14);
		bodyModel[4].setRotationPoint(-13F, 20F, -7F);

        bodyModel[5] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[5].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[5].setRotationPoint(8F, -1.5F, -6.6F);
		bodyModel[5].rotateAngleX = -2.792527F;

        bodyModel[6] = new ModelRendererTurbo(this, 243, 479, textureX, textureY);
		bodyModel[6].addBox(0F, 0F, 0F, 3, 5, 22);
		bodyModel[6].setRotationPoint(-23F, 14F, -11F);

        bodyModel[7] = new ModelRendererTurbo(this, 200, 52, textureX, textureY);
		bodyModel[7].addBox(0F, 0F, 0F, 6, 3, 1);
		bodyModel[7].setRotationPoint(-15F, 19F, -9F);

        bodyModel[8] = new ModelRendererTurbo(this, 200, 30, textureX, textureY);
		bodyModel[8].addBox(0F, 0F, 0F, 6, 6, 0);
		bodyModel[8].setRotationPoint(28F, 18F, -7F);

        bodyModel[9] = new ModelRendererTurbo(this, 200, 40, textureX, textureY);
		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 2);
		bodyModel[9].setRotationPoint(30F, 17F, -1F);

		bodyModel[10] = new ModelRendererTurbo(this, 200, 0, textureX, textureY);
		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 14);
		bodyModel[10].setRotationPoint(19F, 20F, -7F);

		bodyModel[11] = new ModelRendererTurbo(this, 200, 0, textureX, textureY);
		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 14);
		bodyModel[11].setRotationPoint(30F, 20F, -7F);

		bodyModel[12] = new ModelRendererTurbo(this, 243, 479, textureX, textureY);
		bodyModel[12].addBox(0F, 0F, 0F, 3, 5, 22);
		bodyModel[12].setRotationPoint(38F, 14F, -11F);

		bodyModel[13] = new ModelRendererTurbo(this, 300, 486, textureX, textureY);
		bodyModel[13].addBox(0F, 0F, 0F, 4, 3, 16);
		bodyModel[13].setRotationPoint(34F, 14F, -8F);

		bodyModel[14] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[14].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[14].setRotationPoint(8F, 1F, -6.6F);
		bodyModel[14].rotateAngleX = -2.792527F;

		bodyModel[15] = new ModelRendererTurbo(this, 300, 486, textureX, textureY);
		bodyModel[15].addBox(0F, 0F, 0F, 4, 3, 16);
		bodyModel[15].setRotationPoint(-20F, 14F, -8F);

		bodyModel[16] = new ModelRendererTurbo(this, 200, 40, textureX, textureY);
		bodyModel[16].addBox(0F, 0F, 0F, 2, 3, 2);
		bodyModel[16].setRotationPoint(19F, 17F, -1F);

		bodyModel[17] = new ModelRendererTurbo(this, 200, 30, textureX, textureY);
		bodyModel[17].addBox(0F, 0F, 0F, 6, 6, 0);
		bodyModel[17].setRotationPoint(-15F, 18F, 7F);

		bodyModel[18] = new ModelRendererTurbo(this, 200, 30, textureX, textureY);
		bodyModel[18].addBox(0F, 0F, 0F, 6, 6, 0);
		bodyModel[18].setRotationPoint(-4F, 18F, -7F);

		bodyModel[19] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[19].setRotationPoint(8F, -2F, -6.6F);
		bodyModel[19].rotateAngleX = -2.792527F;

		bodyModel[20] = new ModelRendererTurbo(this, 347, 480, textureX, textureY);
		bodyModel[20].addBox(0F, 0F, 0F, 50, 3, 22);
		bodyModel[20].setRotationPoint(-16F, 14F, -11F);

		bodyModel[21] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[21].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[21].setRotationPoint(8F, -1F, -6.6F);
		bodyModel[21].rotateAngleX = -2.792527F;

		bodyModel[22] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[22].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[22].setRotationPoint(4F, 1.5F, -6.6F);
		bodyModel[22].rotateAngleX = -2.792527F;

		bodyModel[23] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[23].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[23].setRotationPoint(4F, -1.5F, -6.6F);
		bodyModel[23].rotateAngleX = -2.792527F;

		bodyModel[24] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[24].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[24].setRotationPoint(4F, 0F, -6.6F);
		bodyModel[24].rotateAngleX = -2.792527F;

		bodyModel[25] = new ModelRendererTurbo(this, 200, 52, textureX, textureY);
		bodyModel[25].addBox(0F, 0F, 0F, 6, 3, 1);
		bodyModel[25].setRotationPoint(-4F, 19F, 8F);

		bodyModel[26] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[26].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[26].setRotationPoint(4F, -0.5F, -6.6F);
		bodyModel[26].rotateAngleX = -2.792527F;

		bodyModel[27] = new ModelRendererTurbo(this, 100, 7, textureX, textureY);
		bodyModel[27].addBox(0F, 0F, 0F, 11, 4, 0);
		bodyModel[27].setRotationPoint(4F, 18F, -10F);

		bodyModel[28] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[28].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[28].setRotationPoint(-19F, 1.5F, -6.6F);
		bodyModel[28].rotateAngleX = -2.792527F;

		bodyModel[29] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[29].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[29].setRotationPoint(-19F, -2F, -6.6F);
		bodyModel[29].rotateAngleX = -2.792527F;

		bodyModel[30] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[30].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[30].setRotationPoint(8F, -0.5F, 6.6F);
		bodyModel[30].rotateAngleX = -0.3490659F;

		bodyModel[31] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[31].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[31].setRotationPoint(-15F, 1F, -6.6F);
		bodyModel[31].rotateAngleX = -2.792527F;

		bodyModel[32] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[32].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[32].setRotationPoint(-15F, 1.5F, -6.6F);
		bodyModel[32].rotateAngleX = -2.792527F;

		bodyModel[33] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[33].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[33].setRotationPoint(-15F, -1.5F, -6.6F);
		bodyModel[33].rotateAngleX = -2.792527F;

		bodyModel[34] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[34].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[34].setRotationPoint(-15F, 0.5F, -6.6F);
		bodyModel[34].rotateAngleX = -2.792527F;

		bodyModel[35] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[35].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[35].setRotationPoint(-19F, 1F, -6.6F);
		bodyModel[35].rotateAngleX = -2.792527F;

		bodyModel[36] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[36].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[36].setRotationPoint(-19F, 0.5F, -6.6F);
		bodyModel[36].rotateAngleX = -2.792527F;

		bodyModel[37] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[37].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[37].setRotationPoint(-19F, -0.5F, 6.6F);
		bodyModel[37].rotateAngleX = -0.3490659F;

		bodyModel[38] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[38].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[38].setRotationPoint(-19F, 1.5F, 6.6F);
		bodyModel[38].rotateAngleX = -0.3490659F;

		bodyModel[39] = new ModelRendererTurbo(this, 200, 0, textureX, textureY);
		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 14);
		bodyModel[39].setRotationPoint(-2F, 20F, -7F);

		bodyModel[40] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[40].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[40].setRotationPoint(-19F, 1F, 6.6F);
		bodyModel[40].rotateAngleX = -0.3490659F;

		bodyModel[41] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[41].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[41].setRotationPoint(-19F, -1.5F, 6.6F);
		bodyModel[41].rotateAngleX = -0.3490659F;

		bodyModel[42] = new ModelRendererTurbo(this, 200, 21, textureX, textureY);
		bodyModel[42].addBox(0F, 0F, 0F, 9, 2, 2);
		bodyModel[42].setRotationPoint(-11F, 20F, -1F);

		bodyModel[43] = new ModelRendererTurbo(this, 200, 30, textureX, textureY);
		bodyModel[43].addBox(0F, 0F, 0F, 6, 6, 0);
		bodyModel[43].setRotationPoint(-15F, 18F, -7F);

		bodyModel[44] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[44].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[44].setRotationPoint(-15F, -2F, -6.6F);
		bodyModel[44].rotateAngleX = -2.792527F;

		bodyModel[45] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[45].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[45].setRotationPoint(-15F, 0F, -6.6F);
		bodyModel[45].rotateAngleX = -2.792527F;

		bodyModel[46] = new ModelRendererTurbo(this, 200, 30, textureX, textureY);
		bodyModel[46].addBox(0F, 0F, 0F, 6, 6, 0);
		bodyModel[46].setRotationPoint(-4F, 18F, 7F);

		bodyModel[47] = new ModelRendererTurbo(this, 200, 40, textureX, textureY);
		bodyModel[47].addBox(0F, 0F, 0F, 2, 3, 2);
		bodyModel[47].setRotationPoint(-2F, 17F, -1F);

		bodyModel[48] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[48].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[48].setRotationPoint(-19F, 0F, -6.6F);
		bodyModel[48].rotateAngleX = -2.792527F;

		bodyModel[49] = new ModelRendererTurbo(this, 200, 30, textureX, textureY);
		bodyModel[49].addBox(0F, 0F, 0F, 6, 6, 0);
		bodyModel[49].setRotationPoint(28F, 18F, 7F);

		bodyModel[50] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[50].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[50].setRotationPoint(4F, -2F, -6.6F);
		bodyModel[50].rotateAngleX = -2.792527F;

		bodyModel[51] = new ModelRendererTurbo(this, 200, 52, textureX, textureY);
		bodyModel[51].addBox(0F, 0F, 0F, 6, 3, 1);
		bodyModel[51].setRotationPoint(-4F, 19F, -9F);

		bodyModel[52] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[52].setRotationPoint(4F, 0.5F, -6.6F);
		bodyModel[52].rotateAngleX = -2.792527F;

		bodyModel[53] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[53].setRotationPoint(-15F, 0.5F, 6.6F);
		bodyModel[53].rotateAngleX = -0.3490659F;

		bodyModel[54] = new ModelRendererTurbo(this, 200, 52, textureX, textureY);
		bodyModel[54].addBox(0F, 0F, 0F, 6, 3, 1);
		bodyModel[54].setRotationPoint(28F, 19F, 8F);

		bodyModel[55] = new ModelRendererTurbo(this, 200, 52, textureX, textureY);
		bodyModel[55].addBox(0F, 0F, 0F, 6, 3, 1);
		bodyModel[55].setRotationPoint(17F, 19F, 8F);

		bodyModel[56] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[56].setRotationPoint(-19F, -2F, 6.6F);
		bodyModel[56].rotateAngleX = -0.3490659F;

		bodyModel[57] = new ModelRendererTurbo(this, 140, 0, textureX, textureY);
		bodyModel[57].addBox(0F, 0F, 0F, 1, 3, 22);
		bodyModel[57].setRotationPoint(33F, 17F, -11F);

		bodyModel[58] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[58].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[58].setRotationPoint(-19F, 0.5F, 6.6F);
		bodyModel[58].rotateAngleX = -0.3490659F;

		bodyModel[59] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[59].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[59].setRotationPoint(34F, 15F, 8F);

		bodyModel[60] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[60].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[60].setRotationPoint(-15F, -0.5F, -6.6F);
		bodyModel[60].rotateAngleX = -2.792527F;

		bodyModel[61] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[61].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[61].setRotationPoint(-19F, -0.5F, -6.6F);
		bodyModel[61].rotateAngleX = -2.792527F;

		bodyModel[62] = new ModelRendererTurbo(this, 200, 61, textureX, textureY);
		bodyModel[62].addBox(0F, 0F, 0F, 15, 1, 1);
		bodyModel[62].setRotationPoint(18F, 19F, 9F);

		bodyModel[63] = new ModelRendererTurbo(this, 200, 40, textureX, textureY);
		bodyModel[63].addBox(0F, 0F, 0F, 2, 3, 2);
		bodyModel[63].setRotationPoint(-13F, 17F, -1F);

		bodyModel[64] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[64].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[64].setRotationPoint(8F, 0F, -6.6F);
		bodyModel[64].rotateAngleX = -2.792527F;

		bodyModel[65] = new ModelRendererTurbo(this, 200, 21, textureX, textureY);
		bodyModel[65].addBox(0F, 0F, 0F, 9, 2, 2);
		bodyModel[65].setRotationPoint(21F, 20F, -1F);

		bodyModel[66] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[66].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[66].setRotationPoint(35F, -0.5F, 6.6F);
		bodyModel[66].rotateAngleX = -0.3490659F;

		bodyModel[67] = new ModelRendererTurbo(this, 200, 30, textureX, textureY);
		bodyModel[67].addBox(0F, 0F, 0F, 6, 6, 0);
		bodyModel[67].setRotationPoint(17F, 18F, -7F);

		bodyModel[68] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[68].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[68].setRotationPoint(35F, 1.5F, 6.6F);
		bodyModel[68].rotateAngleX = -0.3490659F;

		bodyModel[69] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[69].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[69].setRotationPoint(-15F, -1F, 6.6F);
		bodyModel[69].rotateAngleX = -0.3490659F;

		bodyModel[70] = new ModelRendererTurbo(this, 200, 30, textureX, textureY);
		bodyModel[70].addBox(0F, 0F, 0F, 6, 6, 0);
		bodyModel[70].setRotationPoint(17F, 18F, 7F);

		bodyModel[71] = new ModelRendererTurbo(this, 200, 52, textureX, textureY);
		bodyModel[71].addBox(0F, 0F, 0F, 6, 3, 1);
		bodyModel[71].setRotationPoint(28F, 19F, -9F);

		bodyModel[72] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[72].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[72].setRotationPoint(-15F, 1F, 6.6F);
		bodyModel[72].rotateAngleX = -0.3490659F;

		bodyModel[73] = new ModelRendererTurbo(this, 200, 52, textureX, textureY);
		bodyModel[73].addBox(0F, 0F, 0F, 6, 3, 1);
		bodyModel[73].setRotationPoint(17F, 19F, -9F);

		bodyModel[74] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[74].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[74].setRotationPoint(-15F, -0.5F, 6.6F);
		bodyModel[74].rotateAngleX = -0.3490659F;

		bodyModel[75] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[75].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[75].setRotationPoint(-19F, -1F, 6.6F);
		bodyModel[75].rotateAngleX = -0.3490659F;

		bodyModel[76] = new ModelRendererTurbo(this, 200, 52, textureX, textureY);
		bodyModel[76].addBox(0F, 0F, 0F, 6, 3, 1);
		bodyModel[76].setRotationPoint(-15F, 19F, 8F);

		bodyModel[77] = new ModelRendererTurbo(this, 200, 61, textureX, textureY);
		bodyModel[77].addBox(0F, 0F, 0F, 15, 1, 1);
		bodyModel[77].setRotationPoint(-14F, 19F, -10F);

		bodyModel[78] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[78].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[78].setRotationPoint(4F, -1F, -6.6F);
		bodyModel[78].rotateAngleX = -2.792527F;

		bodyModel[79] = new ModelRendererTurbo(this, 200, 68, textureX, textureY);
		bodyModel[79].addBox(0F, 0F, 0F, 13, 2, 0);
		bodyModel[79].setRotationPoint(19F, 20F, -10F);

		bodyModel[80] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[80].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[80].setRotationPoint(4F, 1F, -6.6F);
		bodyModel[80].rotateAngleX = -2.792527F;

		bodyModel[81] = new ModelRendererTurbo(this, 140, 0, textureX, textureY);
		bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 22);
		bodyModel[81].setRotationPoint(-21F, 19F, -11F);

		bodyModel[82] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[82].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[82].setRotationPoint(4F, -0.5F, 6.6F);
		bodyModel[82].rotateAngleX = -0.3490659F;

		bodyModel[83] = new ModelRendererTurbo(this, 59, 0, textureX, textureY);
		bodyModel[83].addBox(0F, 0F, 0F, 0, 6, 8);
		bodyModel[83].setRotationPoint(15F, 17F, 0.3F);

		bodyModel[84] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[84].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[84].setRotationPoint(4F, 1.5F, 6.6F);
		bodyModel[84].rotateAngleX = -0.3490659F;

		bodyModel[85] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[85].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[85].setRotationPoint(35F, -1F, 6.6F);
		bodyModel[85].rotateAngleX = -0.3490659F;

		bodyModel[86] = new ModelRendererTurbo(this, 0, 265, textureX, textureY);
		bodyModel[86].addBox(0F, 0F, 0F, 11, 19, 0);
		bodyModel[86].setRotationPoint(-11F, -5F, -11F);

		bodyModel[87] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[87].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[87].setRotationPoint(35F, 0F, 6.6F);
		bodyModel[87].rotateAngleX = -0.3490659F;

		bodyModel[88] = new ModelRendererTurbo(this, 200, 61, textureX, textureY);
		bodyModel[88].addBox(0F, 0F, 0F, 15, 1, 1);
		bodyModel[88].setRotationPoint(-14F, 19F, 9F);

		bodyModel[89] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[89].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[89].setRotationPoint(35F, 0.5F, 6.6F);
		bodyModel[89].rotateAngleX = -0.3490659F;

		bodyModel[90] = new ModelRendererTurbo(this, 200, 61, textureX, textureY);
		bodyModel[90].addBox(0F, 0F, 0F, 15, 1, 1);
		bodyModel[90].setRotationPoint(18F, 19F, -10F);

		bodyModel[91] = new ModelRendererTurbo(this, 200, 68, textureX, textureY);
		bodyModel[91].addBox(0F, 0F, 0F, 13, 2, 0);
		bodyModel[91].setRotationPoint(19F, 20F, 10F);

		bodyModel[92] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[92].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[92].setRotationPoint(-15F, 0F, 6.6F);
		bodyModel[92].rotateAngleX = -0.3490659F;

		bodyModel[93] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[93].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[93].setRotationPoint(-15F, -1.5F, 6.6F);
		bodyModel[93].rotateAngleX = -0.3490659F;

		bodyModel[94] = new ModelRendererTurbo(this, 200, 68, textureX, textureY);
		bodyModel[94].addBox(0F, 0F, 0F, 13, 2, 0);
		bodyModel[94].setRotationPoint(-13F, 20F, -10F);

		bodyModel[95] = new ModelRendererTurbo(this, 200, 68, textureX, textureY);
		bodyModel[95].addBox(0F, 0F, 0F, 13, 2, 0);
		bodyModel[95].setRotationPoint(-13F, 20F, 10F);

		bodyModel[96] = new ModelRendererTurbo(this, 20, 47, textureX, textureY);
		bodyModel[96].addBox(0F, 0F, 0F, 8, 2, 0);
		bodyModel[96].setRotationPoint(-9F, 9F, -11F);
		bodyModel[96].rotateAngleX = -0.0349066F;

		bodyModel[97] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[97].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[97].setRotationPoint(-15F, -1F, -6.6F);
		bodyModel[97].rotateAngleX = -2.792527F;

		bodyModel[98] = new ModelRendererTurbo(this, 140, 0, textureX, textureY);
		bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 22);
		bodyModel[98].setRotationPoint(38F, 19F, -11F);

		bodyModel[99] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[99].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[99].setRotationPoint(-19F, -1.5F, -6.6F);
		bodyModel[99].rotateAngleX = -2.792527F;

		bodyModel[100] = new ModelRendererTurbo(this, 140, 30, textureX, textureY);
		bodyModel[100].addBox(0F, 0F, 0F, 0, 3, 22);
		bodyModel[100].setRotationPoint(38.9F, 20.9F, -11F);
		bodyModel[100].rotateAngleZ = -0.5585054F;

		bodyModel[101] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[101].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[101].setRotationPoint(8F, -1.5F, 6.6F);
		bodyModel[101].rotateAngleX = -0.3490659F;

		bodyModel[102] = new ModelRendererTurbo(this, 140, 30, textureX, textureY);
		bodyModel[102].addBox(0F, 0F, 0F, 0, 3, 22);
		bodyModel[102].setRotationPoint(-20.9F, 20.9F, -11F);
		bodyModel[102].rotateAngleZ = 0.5585054F;

		bodyModel[103] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[103].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[103].setRotationPoint(8F, 1.5F, 6.6F);
		bodyModel[103].rotateAngleX = -0.3490659F;

		bodyModel[104] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[104].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[104].setRotationPoint(4F, 0F, 6.6F);
		bodyModel[104].rotateAngleX = -0.3490659F;

		bodyModel[105] = new ModelRendererTurbo(this, 140, 0, textureX, textureY);
		bodyModel[105].addBox(0F, 0F, 0F, 1, 3, 22);
		bodyModel[105].setRotationPoint(-16F, 17F, -11F);

		bodyModel[106] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[106].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[106].setRotationPoint(-20F, 17F, -10F);

		bodyModel[107] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[107].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[107].setRotationPoint(4F, -1.5F, 6.6F);
		bodyModel[107].rotateAngleX = -0.3490659F;

		bodyModel[108] = new ModelRendererTurbo(this, 100, 0, textureX, textureY);
		bodyModel[108].addBox(0F, 0F, 0F, 11, 2, 0);
		bodyModel[108].setRotationPoint(4F, 17F, -8.3F);
		bodyModel[108].rotateAngleX = -1.047198F;

		bodyModel[109] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[109].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[109].setRotationPoint(35F, -2F, 6.6F);
		bodyModel[109].rotateAngleX = -0.3490659F;

		bodyModel[110] = new ModelRendererTurbo(this, 100, 16, textureX, textureY);
		bodyModel[110].addBox(0F, 0F, 0F, 11, 2, 0);
		bodyModel[110].setRotationPoint(4F, 22F, -10F);
		bodyModel[110].rotateAngleX = 1.047198F;

		bodyModel[111] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[111].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[111].setRotationPoint(35F, -1.5F, 6.6F);
		bodyModel[111].rotateAngleX = -0.3490659F;

		bodyModel[112] = new ModelRendererTurbo(this, 94, 25, textureX, textureY);
		bodyModel[112].addBox(0F, 0F, 0F, 11, 0, 9);
		bodyModel[112].setRotationPoint(4F, 23F, -8.3F);

		bodyModel[113] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[113].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[113].setRotationPoint(-15F, 1.5F, 6.6F);
		bodyModel[113].rotateAngleX = -0.3490659F;

		bodyModel[114] = new ModelRendererTurbo(this, 100, 7, textureX, textureY);
		bodyModel[114].addBox(0F, 0F, 0F, 11, 4, 0);
		bodyModel[114].setRotationPoint(4F, 18F, 10F);

		bodyModel[115] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[115].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[115].setRotationPoint(-19F, 0F, 6.6F);
		bodyModel[115].rotateAngleX = -0.3490659F;

		bodyModel[116] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[116].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[116].setRotationPoint(8F, 0F, 6.6F);
		bodyModel[116].rotateAngleX = -0.3490659F;

		bodyModel[117] = new ModelRendererTurbo(this, 100, 0, textureX, textureY);
		bodyModel[117].addBox(0F, 0F, 0F, 11, 2, 0);
		bodyModel[117].setRotationPoint(4F, 17F, 8.3F);
		bodyModel[117].rotateAngleX = 1.047198F;

		bodyModel[118] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[118].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[118].setRotationPoint(-20F, 15F, 8F);

		bodyModel[119] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[119].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[119].setRotationPoint(8F, 1F, 6.6F);
		bodyModel[119].rotateAngleX = -0.3490659F;

		bodyModel[120] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[120].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[120].setRotationPoint(8F, 0.5F, 6.6F);
		bodyModel[120].rotateAngleX = -0.3490659F;

		bodyModel[121] = new ModelRendererTurbo(this, 27, 268, textureX, textureY);
		bodyModel[121].addBox(0F, 0F, 0F, 0, 19, 4);
		bodyModel[121].setRotationPoint(0F, -5F, -11F);

		bodyModel[122] = new ModelRendererTurbo(this, 94, 25, textureX, textureY);
		bodyModel[122].addBox(0F, 0F, 0F, 11, 0, 8);
		bodyModel[122].setRotationPoint(4F, 23F, 0.3F);

		bodyModel[123] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[123].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[123].setRotationPoint(4F, -2F, 6.6F);
		bodyModel[123].rotateAngleX = -0.3490659F;

		bodyModel[124] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[124].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[124].setRotationPoint(12F, 1F, 6.6F);
		bodyModel[124].rotateAngleX = -0.3490659F;

		bodyModel[125] = new ModelRendererTurbo(this, 91, 0, textureX, textureY);
		bodyModel[125].addBox(0F, 0F, 0F, 0, 2, 2);
		bodyModel[125].setRotationPoint(4F, 22F, 10F);
		bodyModel[125].rotateAngleX = -2.617994F;

		bodyModel[126] = new ModelRendererTurbo(this, 91, 0, textureX, textureY);
		bodyModel[126].addBox(0F, 0F, 0F, 0, 2, 2);
		bodyModel[126].setRotationPoint(15F, 22F, 10F);
		bodyModel[126].rotateAngleX = -2.617994F;

		bodyModel[127] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[127].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[127].setRotationPoint(12F, -1.5F, 6.6F);
		bodyModel[127].rotateAngleX = -0.3490659F;

		bodyModel[128] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[128].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[128].setRotationPoint(12F, 0.5F, 6.6F);
		bodyModel[128].rotateAngleX = -0.3490659F;

		bodyModel[129] = new ModelRendererTurbo(this, 91, 0, textureX, textureY);
		bodyModel[129].addBox(0F, 0F, 0F, 0, 2, 2);
		bodyModel[129].setRotationPoint(4F, 18F, -10F);
		bodyModel[129].rotateAngleX = 0.5235988F;

		bodyModel[130] = new ModelRendererTurbo(this, 83, 0, textureX, textureY);
		bodyModel[130].addBox(0F, 0F, 0F, 0, 4, 2);
		bodyModel[130].setRotationPoint(4F, 18F, 8F);

		bodyModel[131] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[131].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[131].setRotationPoint(8F, -1F, 6.6F);
		bodyModel[131].rotateAngleX = -0.3490659F;

		bodyModel[132] = new ModelRendererTurbo(this, 83, 0, textureX, textureY);
		bodyModel[132].addBox(0F, 0F, 0F, 0, 4, 2);
		bodyModel[132].setRotationPoint(15F, 18F, 8F);

		bodyModel[133] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[133].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[133].setRotationPoint(4F, 1F, 6.6F);
		bodyModel[133].rotateAngleX = -0.3490659F;

		bodyModel[134] = new ModelRendererTurbo(this, 59, 0, textureX, textureY);
		bodyModel[134].addBox(0F, 0F, 0F, 0, 6, 9);
		bodyModel[134].setRotationPoint(4F, 17F, -8.3F);

		bodyModel[135] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[135].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[135].setRotationPoint(35F, 1F, 6.6F);
		bodyModel[135].rotateAngleX = -0.3490659F;

		bodyModel[136] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[136].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[136].setRotationPoint(-19F, -1F, -6.6F);
		bodyModel[136].rotateAngleX = -2.792527F;

		bodyModel[137] = new ModelRendererTurbo(this, 59, 0, textureX, textureY);
		bodyModel[137].addBox(0F, 0F, 0F, 0, 6, 8);
		bodyModel[137].setRotationPoint(4F, 17F, 0.3F);

		bodyModel[138] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[138].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[138].setRotationPoint(-20F, 15F, -10F);

		bodyModel[139] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[139].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[139].setRotationPoint(16F, 0F, 6.6F);
		bodyModel[139].rotateAngleX = -0.3490659F;

		bodyModel[140] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[140].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[140].setRotationPoint(16F, 0.5F, 6.6F);
		bodyModel[140].rotateAngleX = -0.3490659F;

		bodyModel[141] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[141].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[141].setRotationPoint(-20F, 19F, -11F);

		bodyModel[142] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[142].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[142].setRotationPoint(12F, -2F, 6.6F);
		bodyModel[142].rotateAngleX = -0.3490659F;

		bodyModel[143] = new ModelRendererTurbo(this, 100, 16, textureX, textureY);
		bodyModel[143].addBox(0F, 0F, 0F, 11, 2, 0);
		bodyModel[143].setRotationPoint(4F, 22F, 10F);
		bodyModel[143].rotateAngleX = -1.047198F;

		bodyModel[144] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[144].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[144].setRotationPoint(8F, -2F, 6.6F);
		bodyModel[144].rotateAngleX = -0.3490659F;

		bodyModel[145] = new ModelRendererTurbo(this, 91, 0, textureX, textureY);
		bodyModel[145].addBox(0F, 0F, 0F, 0, 2, 2);
		bodyModel[145].setRotationPoint(4F, 17F, 8.3F);
		bodyModel[145].rotateAngleX = -0.5235988F;

		bodyModel[146] = new ModelRendererTurbo(this, 91, 0, textureX, textureY);
		bodyModel[146].addBox(0F, 0F, 0F, 0, 2, 2);
		bodyModel[146].setRotationPoint(15F, 17F, 8.3F);
		bodyModel[146].rotateAngleX = -0.5235988F;

		bodyModel[147] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[147].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[147].setRotationPoint(12F, 1.5F, 6.6F);
		bodyModel[147].rotateAngleX = -0.3490659F;

		bodyModel[148] = new ModelRendererTurbo(this, 40, 70, textureX, textureY);
		bodyModel[148].addBox(0F, 0F, 0F, 0, 2, 2);
		bodyModel[148].setRotationPoint(15F, 18F, -10F);
		bodyModel[148].rotateAngleX = 0.5235988F;

		bodyModel[149] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[149].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[149].setRotationPoint(20F, -0.5F, 6.6F);
		bodyModel[149].rotateAngleX = -0.3490659F;

		bodyModel[150] = new ModelRendererTurbo(this, 91, 0, textureX, textureY);
		bodyModel[150].addBox(0F, 0F, 0F, 0, 2, 2);
		bodyModel[150].setRotationPoint(4F, 23F, -8.3F);
		bodyModel[150].rotateAngleX = 2.617994F;

		bodyModel[151] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[151].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[151].setRotationPoint(20F, 1.5F, 6.6F);
		bodyModel[151].rotateAngleX = -0.3490659F;

		bodyModel[152] = new ModelRendererTurbo(this, 91, 0, textureX, textureY);
		bodyModel[152].addBox(0F, 0F, 0F, 0, 2, 2);
		bodyModel[152].setRotationPoint(15F, 23F, -8.3F);
		bodyModel[152].rotateAngleX = 2.617994F;

		bodyModel[153] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[153].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[153].setRotationPoint(16F, -1F, 6.6F);
		bodyModel[153].rotateAngleX = -0.3490659F;

		bodyModel[154] = new ModelRendererTurbo(this, 83, 0, textureX, textureY);
		bodyModel[154].addBox(0F, 0F, 0F, 0, 4, 2);
		bodyModel[154].setRotationPoint(15F, 18F, -10F);

		bodyModel[155] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[155].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[155].setRotationPoint(16F, 1.5F, 6.6F);
		bodyModel[155].rotateAngleX = -0.3490659F;

		bodyModel[156] = new ModelRendererTurbo(this, 83, 0, textureX, textureY);
		bodyModel[156].addBox(0F, 0F, 0F, 0, 4, 2);
		bodyModel[156].setRotationPoint(4F, 18F, -10F);

		bodyModel[157] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[157].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[157].setRotationPoint(12F, -0.5F, 6.6F);
		bodyModel[157].rotateAngleX = -0.3490659F;

		bodyModel[158] = new ModelRendererTurbo(this, 59, 0, textureX, textureY);
		bodyModel[158].addBox(0F, 0F, 0F, 0, 6, 9);
		bodyModel[158].setRotationPoint(15F, 17F, -8.3F);

		bodyModel[159] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[159].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[159].setRotationPoint(4F, -1F, 6.6F);
		bodyModel[159].rotateAngleX = -0.3490659F;

		bodyModel[160] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[160].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[160].setRotationPoint(34F, 17F, -10F);

		bodyModel[161] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[161].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[161].setRotationPoint(4F, 0.5F, 6.6F);
		bodyModel[161].rotateAngleX = -0.3490659F;

		bodyModel[162] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[162].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[162].setRotationPoint(34F, 17F, 8F);

		bodyModel[163] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[163].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[163].setRotationPoint(-15F, -2F, 6.6F);
		bodyModel[163].rotateAngleX = -0.3490659F;

		bodyModel[164] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[164].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[164].setRotationPoint(34F, 19F, 9F);

		bodyModel[165] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[165].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[165].setRotationPoint(20F, -2F, 6.6F);
		bodyModel[165].rotateAngleX = -0.3490659F;

		bodyModel[166] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[166].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[166].setRotationPoint(20F, -1F, 6.6F);
		bodyModel[166].rotateAngleX = -0.3490659F;

		bodyModel[167] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[167].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[167].setRotationPoint(34F, 19F, -11F);

		bodyModel[168] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[168].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[168].setRotationPoint(20F, 1F, 6.6F);
		bodyModel[168].rotateAngleX = -0.3490659F;

		bodyModel[169] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
		bodyModel[169].addBox(0F, 0F, 0F, 0, 5, 14);
		bodyModel[169].setRotationPoint(-11F, 9F, -7F);

		bodyModel[170] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[170].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[170].setRotationPoint(16F, 1F, 6.6F);
		bodyModel[170].rotateAngleX = -0.3490659F;

		bodyModel[171] = new ModelRendererTurbo(this, 0, 424, textureX, textureY);
		bodyModel[171].addBox(0F, 0F, 0F, 0, 5, 14);
		bodyModel[171].setRotationPoint(-11F, 9F, -7F);
		bodyModel[171].rotateAngleZ = 1.919862F;

		bodyModel[172] = new ModelRendererTurbo(this, 11, 320, textureX, textureY);
		bodyModel[172].addBox(0F, 0F, 0F, 0, 2, 5);
		bodyModel[172].setRotationPoint(0F, -5F, -11F);
		bodyModel[172].rotateAngleX = 0.418879F;

		bodyModel[173] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[173].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[173].setRotationPoint(20F, 0F, 6.6F);
		bodyModel[173].rotateAngleX = -0.3490659F;

		bodyModel[174] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[174].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[174].setRotationPoint(20F, 0.5F, 6.6F);
		bodyModel[174].rotateAngleX = -0.3490659F;

		bodyModel[175] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[175].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[175].setRotationPoint(34F, 15F, -10F);

		bodyModel[176] = new ModelRendererTurbo(this, 0, 59, textureX, textureY, "lamp");
		bodyModel[176].addBox(0F, 0F, 0F, 1, 4, 4);
		bodyModel[176].setRotationPoint(38.4F, -8F, -2F);

		bodyModel[177] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[177].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[177].setRotationPoint(-20F, 17F, 8F);

		bodyModel[178] = new ModelRendererTurbo(this, 15, 75, textureX, textureY, "lamp");
		bodyModel[178].addBox(0F, 0F, 0F, 1, 2, 2);
		bodyModel[178].setRotationPoint(-21.4F, 7F, -5F);

		bodyModel[179] = new ModelRendererTurbo(this, 74, 22, textureX, textureY);
		bodyModel[179].addBox(0F, 0F, 0F, 4, 1, 2);
		bodyModel[179].setRotationPoint(-20F, 19F, 9F);

		bodyModel[180] = new ModelRendererTurbo(this, 34, 200, textureX, textureY);
		bodyModel[180].addBox(0F, 0F, 0F, 0, 21, 14);
		bodyModel[180].setRotationPoint(-21F, -7F, -7F);

		bodyModel[181] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[181].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[181].setRotationPoint(16F, -2F, 6.6F);
		bodyModel[181].rotateAngleX = -0.3490659F;

		bodyModel[182] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		bodyModel[182].addBox(0F, 0F, 0F, 0, 21, 14);
		bodyModel[182].setRotationPoint(39F, -7F, -7F);

		bodyModel[183] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[183].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[183].setRotationPoint(12F, -1F, 6.6F);
		bodyModel[183].rotateAngleX = -0.3490659F;

		bodyModel[184] = new ModelRendererTurbo(this, 0, 75, textureX, textureY, "lamp");
		bodyModel[184].addBox(0F, 0F, 0F, 1, 2, 2);
		bodyModel[184].setRotationPoint(38.4F, 10F, -5F);

		bodyModel[185] = new ModelRendererTurbo(this, 0, 238, textureX, textureY);
		bodyModel[185].addBox(0F, 0F, 0F, 10, 21, 0);
		bodyModel[185].setRotationPoint(-21F, -7F, -7F);

		bodyModel[186] = new ModelRendererTurbo(this, 0, 117, textureX, textureY);
		bodyModel[186].addBox(0F, 0F, 0F, 5, 1, 0);
		bodyModel[186].setRotationPoint(-16F, 5F, -11F);

		bodyModel[187] = new ModelRendererTurbo(this, 0, 238, textureX, textureY);
		bodyModel[187].addBox(0F, 0F, 0F, 10, 21, 0);
		bodyModel[187].setRotationPoint(-21F, -7F, 7F);

		bodyModel[188] = new ModelRendererTurbo(this, 0, 117, textureX, textureY);
		bodyModel[188].addBox(0F, 0F, 0F, 5, 1, 0);
		bodyModel[188].setRotationPoint(-16F, 5F, 11F);

		bodyModel[189] = new ModelRendererTurbo(this, 27, 238, textureX, textureY);
		bodyModel[189].addBox(0F, 0F, 0F, 0, 19, 4);
		bodyModel[189].setRotationPoint(-11F, -5F, -11F);

		bodyModel[190] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[190].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[190].setRotationPoint(12F, 1F, 6.6F);
		bodyModel[190].rotateAngleX = -0.3490659F;

		bodyModel[191] = new ModelRendererTurbo(this, 41, 238, textureX, textureY);
		bodyModel[191].addBox(0F, 0F, 0F, 0, 19, 4);
		bodyModel[191].setRotationPoint(-11F, -5F, 7F);

		bodyModel[192] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[192].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[192].setRotationPoint(16F, -0.5F, 6.6F);
		bodyModel[192].rotateAngleX = -0.3490659F;

		bodyModel[193] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
		bodyModel[193].addBox(0F, 0F, 0F, 0, 5, 14);
		bodyModel[193].setRotationPoint(0F, 9F, -7F);

		bodyModel[194] = new ModelRendererTurbo(this, 0, 300, textureX, textureY);
		bodyModel[194].addBox(0F, 0F, 0F, 4, 0, 14);
		bodyModel[194].setRotationPoint(0F, -5F, -7F);

		bodyModel[195] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[195].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[195].setRotationPoint(16F, -1.5F, 6.6F);
		bodyModel[195].rotateAngleX = -0.3490659F;

		bodyModel[196] = new ModelRendererTurbo(this, 0, 59, textureX, textureY, "lamp");
		bodyModel[196].addBox(0F, 0F, 0F, 1, 4, 4);
		bodyModel[196].setRotationPoint(-21.4F, -8F, -2F);

		bodyModel[197] = new ModelRendererTurbo(this, 0, 300, textureX, textureY);
		bodyModel[197].addBox(0F, 0F, 0F, 4, 0, 14);
		bodyModel[197].setRotationPoint(-15F, -5F, -7F);

		bodyModel[198] = new ModelRendererTurbo(this, 0, 164, textureX, textureY);
		bodyModel[198].addBox(0F, 0F, 0F, 11, 0, 22);
		bodyModel[198].setRotationPoint(-11F, -5F, -11F);

		bodyModel[199] = new ModelRendererTurbo(this, 15, 75, textureX, textureY, "lamp");
		bodyModel[199].addBox(0F, 0F, 0F, 1, 2, 2);
		bodyModel[199].setRotationPoint(-21.4F, 7F, 3F);

		bodyModel[200] = new ModelRendererTurbo(this, 0, 334, textureX, textureY);
		bodyModel[200].addBox(0F, 0F, 0F, 11, 0, 5);
		bodyModel[200].setRotationPoint(-11F, -5F, 11F);
		bodyModel[200].rotateAngleX = 2.722714F;

        bodyModel[201] = new ModelRendererTurbo(this, 11, 102, textureX, textureY);
        bodyModel[201].addBox(0F, 0F, 0F, 8, 1, 1);
        bodyModel[201].setRotationPoint(25F, 4F, -7.7F);

		bodyModel[202] = new ModelRendererTurbo(this, 15, 75, textureX, textureY, "lamp");
		bodyModel[202].addBox(0F, 0F, 0F, 1, 2, 2);
		bodyModel[202].setRotationPoint(38.4F, 7F, -5F);

		bodyModel[203] = new ModelRendererTurbo(this, 100, 306, textureX, textureY);
		bodyModel[203].addBox(0F, 0F, 0F, 0, 2, 3);
		bodyModel[203].setRotationPoint(-21F, -7F, -7F);
		bodyModel[203].rotateAngleX = 0.7853982F;

        bodyModel[204] = new ModelRendererTurbo(this, 0, 75, textureX, textureY, "lamp");
		bodyModel[204].addBox(0F, 0F, 0F, 1, 2, 2);
		bodyModel[204].setRotationPoint(-21.4F, 10F, 3F);

        bodyModel[205] = new ModelRendererTurbo(this, 0, 75, textureX, textureY, "lamp");
		bodyModel[205].addBox(0F, 0F, 0F, 1, 2, 2);
		bodyModel[205].setRotationPoint(-21.4F, 10F, -5F);

		bodyModel[206] = new ModelRendererTurbo(this, 11, 100, textureX, textureY);
		bodyModel[206].addBox(0F, 0F, 0F, 8, 1, 1);
		bodyModel[206].setRotationPoint(25F, -3F, -7.7F);

		bodyModel[207] = new ModelRendererTurbo(this, 0, 87, textureX, textureY);
		bodyModel[207].addBox(0F, 0F, 0F, 34, 1, 0);
		bodyModel[207].setRotationPoint(0F, 5F, -11F);

		bodyModel[208] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[208].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[208].setRotationPoint(25F, 0.5F, 6.7F);
		bodyModel[208].rotateAngleX = -0.3490659F;

		bodyModel[209] = new ModelRendererTurbo(this, 0, 265, textureX, textureY);
		bodyModel[209].addBox(0F, 0F, 0F, 11, 19, 0);
		bodyModel[209].setRotationPoint(-11F, -5F, 11F);

		bodyModel[210] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[210].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[210].setRotationPoint(-16F, 6F, -11F);

		bodyModel[211] = new ModelRendererTurbo(this, 0, 367, textureX, textureY);
		bodyModel[211].addBox(0F, 0F, 0F, 0, 14, 14);
		bodyModel[211].setRotationPoint(-15F, -5F, -7F);

		bodyModel[212] = new ModelRendererTurbo(this, 35, 100, textureX, textureY);
		bodyModel[212].addBox(0F, 0F, 0F, 0, 1, 5);
		bodyModel[212].setRotationPoint(-23F, 6F, 8.7F);
		bodyModel[212].rotateAngleX = -2.635447F;

		bodyModel[213] = new ModelRendererTurbo(this, 100, 250, textureX, textureY);
		bodyModel[213].addBox(0F, 0F, 0F, 39, 21, 0);
		bodyModel[213].setRotationPoint(0F, -7F, -7F);

		bodyModel[214] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[214].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[214].setRotationPoint(4F, 1F, 6.6F);
		bodyModel[214].rotateAngleX = -0.3490659F;

		bodyModel[215] = new ModelRendererTurbo(this, 0, 424, textureX, textureY);
		bodyModel[215].addBox(0F, 0F, 0F, 0, 5, 14);
		bodyModel[215].setRotationPoint(0F, 9F, -7F);
		bodyModel[215].rotateAngleZ = -1.919862F;

		bodyModel[216] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[216].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[216].setRotationPoint(20F, -1.5F, 6.6F);
		bodyModel[216].rotateAngleX = -0.3490659F;

		bodyModel[217] = new ModelRendererTurbo(this, 33, 367, textureX, textureY);
		bodyModel[217].addBox(0F, 0F, 0F, 0, 14, 14);
		bodyModel[217].setRotationPoint(4F, -5F, -7F);

		bodyModel[218] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[218].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[218].setRotationPoint(-16F, 6F, 11F);

		bodyModel[219] = new ModelRendererTurbo(this, 41, 268, textureX, textureY);
		bodyModel[219].addBox(0F, 0F, 0F, 0, 19, 4);
		bodyModel[219].setRotationPoint(0F, -5F, 7F);

		bodyModel[220] = new ModelRendererTurbo(this, 10, 146, textureX, textureY);
		bodyModel[220].addBox(0F, 0F, 0F, 0, 9, 1);
		bodyModel[220].setRotationPoint(-23F, 7.5F, 4F);

		bodyModel[221] = new ModelRendererTurbo(this, 20, 146, textureX, textureY);
		bodyModel[221].addBox(0F, 0F, 0F, 0, 7, 1);
		bodyModel[221].setRotationPoint(-23F, 7.5F, -5F);

		bodyModel[222] = new ModelRendererTurbo(this, 100, 288, textureX, textureY);
		bodyModel[222].addBox(0F, 0F, 0F, 0, 2, 10);
		bodyModel[222].setRotationPoint(-21F, -9F, -5F);

		bodyModel[223] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[223].addBox(0F, 0F, 0F, 4, 1, 0);
		bodyModel[223].setRotationPoint(-23F, 5F, 8F);
		bodyModel[223].rotateAngleY = -0.7853982F;

		bodyModel[224] = new ModelRendererTurbo(this, 0, 100, textureX, textureY);
		bodyModel[224].addBox(0F, 0F, 0F, 1, 8, 1);
		bodyModel[224].setRotationPoint(33F, -3F, 6.7F);

		bodyModel[225] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[225].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[225].setRotationPoint(25F, -1.5F, 6.7F);
		bodyModel[225].rotateAngleX = -0.3490659F;

		bodyModel[226] = new ModelRendererTurbo(this, 35, 100, textureX, textureY);
		bodyModel[226].addBox(0F, 0F, 0F, 0, 1, 5);
		bodyModel[226].setRotationPoint(41F, 5F, -8.3F);
		bodyModel[226].rotateAngleX = -0.5061455F;

		bodyModel[227] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		bodyModel[227].addBox(0F, 0F, 0F, 0, 6, 1);
		bodyModel[227].setRotationPoint(29F, -2F, 6.7F);

		bodyModel[228] = new ModelRendererTurbo(this, 10, 146, textureX, textureY);
		bodyModel[228].addBox(0F, 0F, 0F, 0, 9, 1);
		bodyModel[228].setRotationPoint(41F, 7.5F, 4F);

		bodyModel[229] = new ModelRendererTurbo(this, 20, 146, textureX, textureY);
		bodyModel[229].addBox(0F, 0F, 0F, 0, 7, 1);
		bodyModel[229].setRotationPoint(41F, 7.5F, -5F);

		bodyModel[230] = new ModelRendererTurbo(this, 100, 250, textureX, textureY);
		bodyModel[230].addBox(0F, 0F, 0F, 39, 21, 0);
		bodyModel[230].setRotationPoint(0F, -7F, 7F);

		bodyModel[231] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
		bodyModel[231].addBox(0F, 0F, 0F, 0, 5, 2);
		bodyModel[231].setRotationPoint(0F, -5F, 11F);
		bodyModel[231].rotateAngleX = -2.024582F;
        
		bodyModel[232] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[232].addBox(0F, 0F, 0F, 4, 1, 0);
		bodyModel[232].setRotationPoint(38F, 5F, -11F);
		bodyModel[232].rotateAngleY = -0.7853982F;

		bodyModel[233] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
		bodyModel[233].addBox(0F, 0F, 0F, 0, 5, 2);
		bodyModel[233].setRotationPoint(-11F, -5F, 11F);
		bodyModel[233].rotateAngleX = -2.024582F;

		bodyModel[234] = new ModelRendererTurbo(this, 0, 146, textureX, textureY);
		bodyModel[234].addBox(0F, 0F, 0F, 0, 8, 1);
		bodyModel[234].setRotationPoint(41F, 6F, -8F);

		bodyModel[235] = new ModelRendererTurbo(this, 11, 320, textureX, textureY);
		bodyModel[235].addBox(0F, 0F, 0F, 0, 2, 5);
		bodyModel[235].setRotationPoint(-11F, -5F, -11F);
		bodyModel[235].rotateAngleX = 0.418879F;

		bodyModel[236] = new ModelRendererTurbo(this, 9, 131, textureX, textureY);
		bodyModel[236].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[236].setRotationPoint(38F, 6F, 11F);
		bodyModel[236].rotateAngleY = 0.7853982F;

		bodyModel[237] = new ModelRendererTurbo(this, 0, 334, textureX, textureY);
		bodyModel[237].addBox(0F, 0F, 0F, 11, 0, 5);
		bodyModel[237].setRotationPoint(-11F, -5F, -11F);
		bodyModel[237].rotateAngleX = 0.418879F;

		bodyModel[238] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[238].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[238].setRotationPoint(38F, 6F, -11F);
		bodyModel[238].rotateAngleY = -0.7853982F;

		bodyModel[239] = new ModelRendererTurbo(this, 0, 75, textureX, textureY, "lamp");
		bodyModel[239].addBox(0F, 0F, 0F, 1, 2, 2);
		bodyModel[239].setRotationPoint(38.4F, 10F, 3F);

		bodyModel[240] = new ModelRendererTurbo(this, 89, 278, textureX, textureY);
		bodyModel[240].addBox(0F, 0F, 0F, 60, 3, 0);
		bodyModel[240].setRotationPoint(-21F, -7F, -7F);
		bodyModel[240].rotateAngleX = 2.356194F;

		bodyModel[241] = new ModelRendererTurbo(this, 89, 278, textureX, textureY);
		bodyModel[241].addBox(0F, 0F, 0F, 60, 3, 0);
		bodyModel[241].setRotationPoint(-21F, -7F, 7F);
		bodyModel[241].rotateAngleX = -2.356194F;

		bodyModel[242] = new ModelRendererTurbo(this, 0, 87, textureX, textureY);
		bodyModel[242].addBox(0F, 0F, 0F, 34, 1, 0);
		bodyModel[242].setRotationPoint(0F, 5F, 11F);

		bodyModel[243] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[243].addBox(0F, 0F, 0F, 4, 1, 0);
		bodyModel[243].setRotationPoint(-23F, 5F, -8F);
		bodyModel[243].rotateAngleY = 0.7853982F;

		bodyModel[244] = new ModelRendererTurbo(this, 0, 100, textureX, textureY);
		bodyModel[244].addBox(0F, 0F, 0F, 1, 8, 1);
		bodyModel[244].setRotationPoint(33F, -3F, -7.7F);

		bodyModel[245] = new ModelRendererTurbo(this, 10, 146, textureX, textureY);
		bodyModel[245].addBox(0F, 0F, 0F, 0, 8, 1);
		bodyModel[245].setRotationPoint(-20F, 6F, -11F);
		bodyModel[245].rotateAngleY = -0.7853982F;

		bodyModel[246] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[246].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[246].setRotationPoint(25F, -1F, 6.7F);
		bodyModel[246].rotateAngleX = -0.3490659F;

		bodyModel[247] = new ModelRendererTurbo(this, 0, 26, textureX, textureY);
		bodyModel[247].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[247].setRotationPoint(12F, 0F, 6.6F);
		bodyModel[247].rotateAngleX = -0.3490659F;

		bodyModel[248] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[248].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[248].setRotationPoint(25F, 2F, 6.7F);
		bodyModel[248].rotateAngleX = -0.3490659F;

		bodyModel[249] = new ModelRendererTurbo(this, 35, 100, textureX, textureY);
		bodyModel[249].addBox(0F, 0F, 0F, 0, 1, 5);
		bodyModel[249].setRotationPoint(41F, 6F, 8.7F);
		bodyModel[249].rotateAngleX = -2.635447F;

		bodyModel[250] = new ModelRendererTurbo(this, 100, 316, textureX, textureY);
		bodyModel[250].addBox(0F, 0F, 0F, 0, 3, 2);
		bodyModel[250].setRotationPoint(39F, -7F, 7F);
		bodyModel[250].rotateAngleX = -2.356194F;

		bodyModel[251] = new ModelRendererTurbo(this, 0, 146, textureX, textureY);
		bodyModel[251].addBox(0F, 0F, 0F, 0, 8, 1);
		bodyModel[251].setRotationPoint(-23F, 6F, -8F);

		bodyModel[252] = new ModelRendererTurbo(this, 100, 288, textureX, textureY);
		bodyModel[252].addBox(0F, 0F, 0F, 0, 2, 10);
		bodyModel[252].setRotationPoint(39F, -9F, -5F);

		bodyModel[253] = new ModelRendererTurbo(this, 15, 75, textureX, textureY, "lamp");
		bodyModel[253].addBox(0F, 0F, 0F, 1, 2, 2);
		bodyModel[253].setRotationPoint(38.4F, 7F, 3F);

		bodyModel[254] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[254].addBox(0F, 0F, 0F, 4, 1, 0);
		bodyModel[254].setRotationPoint(38F, 5F, 11F);
		bodyModel[254].rotateAngleY = 0.7853982F;

		bodyModel[255] = new ModelRendererTurbo(this, 0, 100, textureX, textureY);
		bodyModel[255].addBox(0F, 0F, 0F, 1, 8, 1);
		bodyModel[255].setRotationPoint(24F, -3F, 6.7F);

		bodyModel[256] = new ModelRendererTurbo(this, 11, 102, textureX, textureY);
		bodyModel[256].addBox(0F, 0F, 0F, 8, 1, 1);
		bodyModel[256].setRotationPoint(25F, 4F, 6.7F);

		bodyModel[257] = new ModelRendererTurbo(this, 35, 100, textureX, textureY);
		bodyModel[257].addBox(0F, 0F, 0F, 0, 1, 5);
		bodyModel[257].setRotationPoint(-23F, 5F, -8.3F);
		bodyModel[257].rotateAngleX = -0.5061455F;

		bodyModel[258] = new ModelRendererTurbo(this, 0, 100, textureX, textureY);
		bodyModel[258].addBox(0F, 0F, 0F, 1, 8, 1);
		bodyModel[258].setRotationPoint(24F, -3F, -6.7F);

		bodyModel[259] = new ModelRendererTurbo(this, 0, 146, textureX, textureY);
		bodyModel[259].addBox(0F, 0F, 0F, 0, 8, 1);
		bodyModel[259].setRotationPoint(41F, 6F, 7F);

		bodyModel[260] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[260].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[260].setRotationPoint(25F, -2F, 6.7F);
		bodyModel[260].rotateAngleX = -0.3490659F;

		bodyModel[261] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[261].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[261].setRotationPoint(33F, 6F, -11F);

		bodyModel[262] = new ModelRendererTurbo(this, 0, 10, textureX, textureY);
		bodyModel[262].addBox(0F, 0F, 0F, 0, 6, 1);
		bodyModel[262].setRotationPoint(29F, -2F, -7.7F);

		bodyModel[263] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[263].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[263].setRotationPoint(25F, 1.5F, 6.7F);
		bodyModel[263].rotateAngleX = -0.3490659F;

		bodyModel[264] = new ModelRendererTurbo(this, 100, 306, textureX, textureY);
		bodyModel[264].addBox(0F, 0F, 0F, 0, 2, 3);
		bodyModel[264].setRotationPoint(39F, -7F, -7F);
		bodyModel[264].rotateAngleX = 0.7853982F;

		bodyModel[265] = new ModelRendererTurbo(this, 0, 146, textureX, textureY);
		bodyModel[265].addBox(0F, 0F, 0F, 0, 8, 1);
		bodyModel[265].setRotationPoint(-23F, 6F, 7F);

		bodyModel[266] = new ModelRendererTurbo(this, 100, 233, textureX, textureY);
		bodyModel[266].addBox(0F, 0F, 0F, 60, 0, 10);
		bodyModel[266].setRotationPoint(-21F, -9F, -5F);

		bodyModel[267] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[267].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[267].setRotationPoint(17F, 6F, -11F);

		bodyModel[268] = new ModelRendererTurbo(this, 11, 100, textureX, textureY);
		bodyModel[268].addBox(0F, 0F, 0F, 8, 1, 1);
		bodyModel[268].setRotationPoint(25F, -3F, 6.7F);

		bodyModel[269] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[269].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[269].setRotationPoint(25F, 6F, 11F);

		bodyModel[270] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[270].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[270].setRotationPoint(25F, 1F, 6.7F);
		bodyModel[270].rotateAngleX = -0.3490659F;

		bodyModel[271] = new ModelRendererTurbo(this, 10, 146, textureX, textureY);
		bodyModel[271].addBox(0F, 0F, 0F, 0, 8, 1);
		bodyModel[271].setRotationPoint(-20F, 6F, 11F);
		bodyModel[271].rotateAngleY = -2.356194F;

		bodyModel[272] = new ModelRendererTurbo(this, 100, 316, textureX, textureY);
		bodyModel[272].addBox(0F, 0F, 0F, 0, 3, 2);
		bodyModel[272].setRotationPoint(-21F, -7F, 7F);
		bodyModel[272].rotateAngleX = -2.356194F;

		bodyModel[273] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[273].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[273].setRotationPoint(1F, 6F, 11F);

		bodyModel[274] = new ModelRendererTurbo(this, 67, 200, textureX, textureY);
		bodyModel[274].addBox(0F, 0F, 0F, 4, 2, 6);
		bodyModel[274].setRotationPoint(7F, -10.5F, -3F);

		bodyModel[275] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[275].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[275].setRotationPoint(25F, -0.5F, 6.7F);
		bodyModel[275].rotateAngleX = -0.3490659F;

		bodyModel[276] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[276].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[276].setRotationPoint(25F, 0F, -6.7F);
		bodyModel[276].rotateAngleX = -2.792527F;

		bodyModel[277] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[277].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[277].setRotationPoint(25F, 3F, -6.7F);
		bodyModel[277].rotateAngleX = -2.792527F;

		bodyModel[278] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[278].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[278].setRotationPoint(25F, 2F, -6.7F);
		bodyModel[278].rotateAngleX = -2.792527F;

		bodyModel[279] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[279].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[279].setRotationPoint(25F, -1F, -6.7F);
		bodyModel[279].rotateAngleX = -2.792527F;

		bodyModel[280] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[280].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[280].setRotationPoint(25F, 1F, -6.7F);
		bodyModel[280].rotateAngleX = -2.792527F;

		bodyModel[281] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[281].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[281].setRotationPoint(25F, 1.5F, -6.7F);
		bodyModel[281].rotateAngleX = -2.792527F;

		bodyModel[282] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[282].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[282].setRotationPoint(33F, 6F, 11F);

		bodyModel[283] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[283].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[283].setRotationPoint(25F, -0.5F, -6.7F);
		bodyModel[283].rotateAngleX = -2.792527F;

		bodyModel[284] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[284].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[284].setRotationPoint(25F, -1.5F, -6.7F);
		bodyModel[284].rotateAngleX = -2.792527F;

		bodyModel[285] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[285].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[285].setRotationPoint(25F, 0F, 6.7F);
		bodyModel[285].rotateAngleX = -0.3490659F;

		bodyModel[286] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[286].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[286].setRotationPoint(25F, 2.5F, 6.7F);
		bodyModel[286].rotateAngleX = -0.3490659F;

		bodyModel[287] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[287].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[287].setRotationPoint(25F, 3.5F, 6.7F);
		bodyModel[287].rotateAngleX = -0.3490659F;

		bodyModel[288] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[288].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[288].setRotationPoint(25F, 3F, 6.7F);
		bodyModel[288].rotateAngleX = -0.3490659F;

		bodyModel[289] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[289].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[289].setRotationPoint(25F, -2F, -6.7F);
		bodyModel[289].rotateAngleX = -2.792527F;

		bodyModel[290] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[290].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[290].setRotationPoint(25F, 0.5F, -6.7F);
		bodyModel[290].rotateAngleX = -2.792527F;

		bodyModel[291] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[291].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[291].setRotationPoint(9F, 6F, -11F);

		bodyModel[292] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[292].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[292].setRotationPoint(17F, 6F, 11F);

		bodyModel[293] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[293].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[293].setRotationPoint(1F, 6F, -11F);

		bodyModel[294] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[294].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[294].setRotationPoint(25F, 2.5F, -6.7F);
		bodyModel[294].rotateAngleX = -2.792527F;

		bodyModel[295] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[295].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[295].setRotationPoint(25F, 6F, -11F);

		bodyModel[296] = new ModelRendererTurbo(this, 0, 131, textureX, textureY);
		bodyModel[296].addBox(0F, 0F, 0F, 1, 8, 0);
		bodyModel[296].setRotationPoint(9F, 6F, 11F);

		bodyModel[297] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[297].addBox(0F, 0F, 0F, 8, 0, 1);
		bodyModel[297].setRotationPoint(25F, 3.5F, -6.7F);
		bodyModel[297].rotateAngleX = -2.792527F;

		bodyModel[298] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[298].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[298].setRotationPoint(12F, -1F, -6.6F);
		bodyModel[298].rotateAngleX = -2.792527F;

		bodyModel[299] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[299].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[299].setRotationPoint(12F, -2F, -6.6F);
		bodyModel[299].rotateAngleX = -2.792527F;

		bodyModel[300] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[300].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[300].setRotationPoint(12F, 0F, -6.6F);
		bodyModel[300].rotateAngleX = -2.792527F;

		bodyModel[301] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[301].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[301].setRotationPoint(12F, 1F, -6.6F);
		bodyModel[301].rotateAngleX = -2.792527F;

		bodyModel[302] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[302].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[302].setRotationPoint(12F, -1.5F, -6.6F);
		bodyModel[302].rotateAngleX = -2.792527F;

		bodyModel[303] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[303].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[303].setRotationPoint(12F, -0.5F, -6.6F);
		bodyModel[303].rotateAngleX = -2.792527F;

		bodyModel[304] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[304].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[304].setRotationPoint(12F, 1.5F, -6.6F);
		bodyModel[304].rotateAngleX = -2.792527F;

		bodyModel[305] = new ModelRendererTurbo(this, 0, 33, textureX, textureY);
		bodyModel[305].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[305].setRotationPoint(12F, 0.5F, -6.6F);
		bodyModel[305].rotateAngleX = -2.792527F;

		bodyModel[306] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[306].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[306].setRotationPoint(16F, -2F, -6.6F);
		bodyModel[306].rotateAngleX = -2.792527F;

		bodyModel[307] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[307].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[307].setRotationPoint(16F, -1F, -6.6F);
		bodyModel[307].rotateAngleX = -2.792527F;

		bodyModel[308] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[308].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[308].setRotationPoint(16F, 0F, -6.6F);
		bodyModel[308].rotateAngleX = -2.792527F;

		bodyModel[309] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[309].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[309].setRotationPoint(16F, 1F, -6.6F);
		bodyModel[309].rotateAngleX = -2.792527F;

		bodyModel[310] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[310].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[310].setRotationPoint(16F, -1.5F, -6.6F);
		bodyModel[310].rotateAngleX = -2.792527F;

		bodyModel[311] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[311].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[311].setRotationPoint(16F, -0.5F, -6.6F);
		bodyModel[311].rotateAngleX = -2.792527F;

		bodyModel[312] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[312].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[312].setRotationPoint(16F, 0.5F, -6.6F);
		bodyModel[312].rotateAngleX = -2.792527F;

		bodyModel[313] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[313].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[313].setRotationPoint(16F, 1.5F, -6.6F);
		bodyModel[313].rotateAngleX = -2.792527F;

		bodyModel[314] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[314].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[314].setRotationPoint(20F, -2F, -6.6F);
		bodyModel[314].rotateAngleX = -2.792527F;

		bodyModel[315] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[315].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[315].setRotationPoint(20F, -1F, -6.6F);
		bodyModel[315].rotateAngleX = -2.792527F;

		bodyModel[316] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[316].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[316].setRotationPoint(20F, 0F, -6.6F);
		bodyModel[316].rotateAngleX = -2.792527F;

		bodyModel[317] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[317].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[317].setRotationPoint(20F, 1F, -6.6F);
		bodyModel[317].rotateAngleX = -2.792527F;

		bodyModel[318] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[318].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[318].setRotationPoint(20F, -1.5F, -6.6F);
		bodyModel[318].rotateAngleX = -2.792527F;

		bodyModel[319] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[319].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[319].setRotationPoint(20F, -0.5F, -6.6F);
		bodyModel[319].rotateAngleX = -2.792527F;

		bodyModel[320] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[320].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[320].setRotationPoint(20F, 0.5F, -6.6F);
		bodyModel[320].rotateAngleX = -2.792527F;

		bodyModel[321] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[321].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[321].setRotationPoint(20F, 1.5F, -6.6F);
		bodyModel[321].rotateAngleX = -2.792527F;

		bodyModel[322] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[322].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[322].setRotationPoint(35F, -2F, -6.6F);
		bodyModel[322].rotateAngleX = -2.792527F;

		bodyModel[323] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[323].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[323].setRotationPoint(35F, -1F, -6.6F);
		bodyModel[323].rotateAngleX = -2.792527F;

		bodyModel[324] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[324].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[324].setRotationPoint(35F, 0F, -6.6F);
		bodyModel[324].rotateAngleX = -2.792527F;

		bodyModel[325] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[325].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[325].setRotationPoint(35F, 1F, -6.6F);
		bodyModel[325].rotateAngleX = -2.792527F;

		bodyModel[326] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[326].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[326].setRotationPoint(35F, -1.5F, -6.6F);
		bodyModel[326].rotateAngleX = -2.792527F;

		bodyModel[327] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[327].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[327].setRotationPoint(35F, -0.5F, -6.6F);
		bodyModel[327].rotateAngleX = -2.792527F;

		bodyModel[328] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[328].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[328].setRotationPoint(35F, 0.5F, -6.6F);
		bodyModel[328].rotateAngleX = -2.792527F;

		bodyModel[329] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[329].addBox(0F, 0F, 0F, 3, 0, 1);
		bodyModel[329].setRotationPoint(35F, 1.5F, -6.6F);
		bodyModel[329].rotateAngleX = -2.792527F;

		bodyModel[330] = new ModelRendererTurbo(this, 50, 50, textureX, textureY);
		bodyModel[330].addBox(0F, 0F, 0F, 4, 2, 2);
		bodyModel[330].setRotationPoint(-27F, 16F, 6F);

		bodyModel[331] = new ModelRendererTurbo(this, 50, 50, textureX, textureY);
		bodyModel[331].addBox(0F, 0F, 0F, 4, 2, 2);
		bodyModel[331].setRotationPoint(-27F, 16F, -8F);

		bodyModel[332] = new ModelRendererTurbo(this, 50, 50, textureX, textureY);
		bodyModel[332].addBox(0F, 0F, 0F, 4, 2, 2);
		bodyModel[332].setRotationPoint(41F, 16F, -8F);

		bodyModel[333] = new ModelRendererTurbo(this, 50, 50, textureX, textureY);
		bodyModel[333].addBox(0F, 0F, 0F, 4, 2, 2);
		bodyModel[333].setRotationPoint(41F, 16F, 6F);

		bodyModel[334] = new ModelRendererTurbo(this, 50, 61, textureX, textureY);
		bodyModel[334].addBox(0F, 0F, 0F, 1, 4, 4);
		bodyModel[334].setRotationPoint(45F, 15F, 5F);

		bodyModel[335] = new ModelRendererTurbo(this, 50, 61, textureX, textureY);
		bodyModel[335].addBox(0F, 0F, 0F, 1, 4, 4);
		bodyModel[335].setRotationPoint(45F, 15F, -9F);

		bodyModel[336] = new ModelRendererTurbo(this, 50, 61, textureX, textureY);
		bodyModel[336].addBox(0F, 0F, 0F, 1, 4, 4);
		bodyModel[336].setRotationPoint(-28F, 15F, -9F);

		bodyModel[337] = new ModelRendererTurbo(this, 50, 61, textureX, textureY);
		bodyModel[337].addBox(0F, 0F, 0F, 1, 4, 4);
		bodyModel[337].setRotationPoint(-28F, 15F, 5F);

		bodyModel[338] = new ModelRendererTurbo(this, 70, 50, textureX, textureY);
		bodyModel[338].addBox(0F, 0F, 0F, 1, 3, 1);
		bodyModel[338].setRotationPoint(40F, 16F, -2F);
		bodyModel[338].rotateAngleZ = -0.7853982F;

		bodyModel[339] = new ModelRendererTurbo(this, 70, 50, textureX, textureY);
		bodyModel[339].addBox(0F, 0F, 0F, 1, 3, 1);
		bodyModel[339].setRotationPoint(40F, 16F, 1F);
		bodyModel[339].rotateAngleZ = -0.7853982F;

		bodyModel[340] = new ModelRendererTurbo(this, 70, 62, textureX, textureY);
		bodyModel[340].addBox(0F, 0F, 0F, 1, 3, 1);
		bodyModel[340].setRotationPoint(-23F, 16F, -2F);
		bodyModel[340].rotateAngleZ = 0.7853982F;

		bodyModel[341] = new ModelRendererTurbo(this, 70, 62, textureX, textureY);
		bodyModel[341].addBox(0F, 0F, 0F, 1, 3, 1);
		bodyModel[341].setRotationPoint(-23F, 16F, 1F);
		bodyModel[341].rotateAngleZ = 0.7853982F;

		bodyModel[342] = new ModelRendererTurbo(this, 70, 75, textureX, textureY);
		bodyModel[342].addBox(0F, 0F, 0F, 1, 4, 2);
		bodyModel[342].setRotationPoint(-25F, 18F, -1F);
		bodyModel[342].rotateAngleZ = -1.047198F;

		bodyModel[343] = new ModelRendererTurbo(this, 83, 75, textureX, textureY);
		bodyModel[343].addBox(0F, 0F, 0F, 1, 4, 2);
		bodyModel[343].setRotationPoint(42.5F, 17F, -1F);
		bodyModel[343].rotateAngleZ = 1.047198F;

        bodyModel[344] = new ModelRendererTurbo(this, 59, 100, textureX, textureY);
		bodyModel[344].addBox(0F, 0F, 0F, 12, 3, 12);
		bodyModel[344].setRotationPoint(21F, -10F, -6F);

		bodyModel[345] = new ModelRendererTurbo(this, 33, 0, textureX, textureY);
		bodyModel[345].addBox(0F, 0F, 0F, 0, 1, 6);
		bodyModel[345].setRotationPoint(7F, -10.5F, -3F);
		bodyModel[345].rotateAngleZ = 2.617994F;

		bodyModel[346] = new ModelRendererTurbo(this, 33, 0, textureX, textureY);
		bodyModel[346].addBox(0F, 0F, 0F, 0, 1, 6);
		bodyModel[346].setRotationPoint(11F, -10.5F, -3F);
		bodyModel[346].rotateAngleZ = -2.617994F;

		bodyModel[347] = new ModelRendererTurbo(this, 29, 18, textureX, textureY);
		bodyModel[347].addBox(0F, 0F, 0F, 4, 1, 0);
		bodyModel[347].setRotationPoint(7F, -10.5F, -3F);
		bodyModel[347].rotateAngleX = -2.617994F;

		bodyModel[348] = new ModelRendererTurbo(this, 29, 18, textureX, textureY);
		bodyModel[348].addBox(0F, 0F, 0F, 4, 1, 0);
		bodyModel[348].setRotationPoint(7F, -10.5F, 3F);
		bodyModel[348].rotateAngleX = 2.617994F;

		bodyModel[349] = new ModelRendererTurbo(this, 10, 10, textureX, textureY);
		bodyModel[349].addBox(0F, 0F, 0F, 1, 2, 1);
		bodyModel[349].setRotationPoint(-8F, -11F, 0F);

		bodyModel[350] = new ModelRendererTurbo(this, 20, 28, textureX, textureY);
		bodyModel[350].addBox(0F, 0F, 0F, 1, 2, 8);
		bodyModel[350].setRotationPoint(40.1F, 14.1F, -4F);

		bodyModel[351] = new ModelRendererTurbo(this, 20, 28, textureX, textureY);
		bodyModel[351].addBox(0F, 0F, 0F, 1, 2, 8);
		bodyModel[351].setRotationPoint(-23.1F, 14.1F, -4F);
		//fixRotation(bodyModel, true, true, true);
		flipAll();
		translateAll(0F, 0F, 0F);
		//flipAll();

	}
}