//FMT-Marker DFM-1.0

package cz.ctyrkaten.train.client.render.models;


import cz.ctyrkaten.train.common.library.Ctyrk4AddonInfo;
import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.ModelRheingoldBogie;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelComfortJet extends ModelConverter {

	private int textureX = 512;
	private int textureY = 256;

	public ModelComfortJet(){
		bodyModel = new ModelRendererTurbo[179];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[0].addBox(0, 0, 0, 117, 18, 1, 0f);
		bodyModel[0].setRotationPoint(-87.0f, -16.0f, -1.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[1].addBox(0, 0, -1, 5, 17, 1, 0f);
		bodyModel[1].setRotationPoint(-92.0f, -15.0f, 0.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[2].addBox(0, 0, 0, 133, 1, 22, 0f);
		bodyModel[2].setRotationPoint(-95.0f, 2.0f, -22.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		bodyModel[3].addBox(-5, 0, -1, 5, 17, 1, 0f);
		bodyModel[3].setRotationPoint(35.0f, -15.0f, 0.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 4
		bodyModel[4].addBox(0, 0, 0, 3, 18, 1, 0f);
		bodyModel[4].setRotationPoint(35.0f, -16.0f, -1.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 5
		bodyModel[5].addBox(0, 0, 0, 3, 18, 1, 0f);
		bodyModel[5].setRotationPoint(-95.0f, -16.0f, -1.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
		bodyModel[6].addBox(0, 0, 0, 5, 1, 1, 0f);
		bodyModel[6].setRotationPoint(-92.0f, -16.0f, -1.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 7
		bodyModel[7].addBox(0, 0, 0, 5, 1, 1, 0f);
		bodyModel[7].setRotationPoint(30.0f, -16.0f, -1.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		bodyModel[8].addShapeBox(0, 0, 0, 131, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[8].setRotationPoint(-94.0f, -19.0f, -2.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 104, 65, textureX, textureY); // Box 13
		bodyModel[9].addShapeBox(0, 0, 0, 5, 4, 4, 0, -5, -1, -4, 0, -1, -4, 0, -1, 0, -5, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[9].setRotationPoint(-95.0f, -23.0f, -20.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 79, 106, textureX, textureY); // Box 15
		bodyModel[10].addShapeBox(0, 0, 0, 123, 4, 18, 0, 0, -1, -4, 0, -1, -4, 0, -1, -4, 0, -1, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[10].setRotationPoint(-90.0f, -23.0f, -20.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 16
		bodyModel[11].addShapeBox(0, 0, 0, 131, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0);
		bodyModel[11].setRotationPoint(37.0f, -19.0f, -20.0f);
		bodyModel[11].rotateAngleY = 3.1415927f;

		bodyModel[12] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 18
		bodyModel[12].addBox(0, 0, 0, 1, 3, 18, 0f);
		bodyModel[12].setRotationPoint(-95.0f, -19.0f, -20.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19
		bodyModel[13].addBox(0, 0, 0, 1, 3, 18, 0f);
		bodyModel[13].setRotationPoint(37.0f, -19.0f, -20.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 21
		bodyModel[14].addBox(0, 0, 0, 3, 0, 12, 0f);
		bodyModel[14].setRotationPoint(-98.0f, 2.0f, -17.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 23
		bodyModel[15].addShapeBox(0, 0, 0, 3, 2, 14, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(-98.0f, -17.0f, -18.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 24
		bodyModel[16].addBox(0, 0, 0, 3, 17, 1, 0f);
		bodyModel[16].setRotationPoint(-98.0f, -15.0f, -5.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 25
		bodyModel[17].addBox(0, 0, 0, 3, 17, 1, 0f);
		bodyModel[17].setRotationPoint(-98.0f, -15.0f, -18.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 26
		bodyModel[18].addBox(0, 0, 0, 1, 18, 20, 0f);
		bodyModel[18].setRotationPoint(-95.0f, -16.0f, -21.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 28
		bodyModel[19].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[19].setRotationPoint(-97.0f, 2.0f, -3.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 29
		bodyModel[20].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[20].setRotationPoint(-97.0f, 2.0f, -20.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		bodyModel[21].addBox(0, 0, 0, 3, 18, 1, 0f);
		bodyModel[21].setRotationPoint(-95.0f, -16.0f, -22.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 31
		bodyModel[22].addBox(0, 0, 0, 5, 1, 1, 0f);
		bodyModel[22].setRotationPoint(-92.0f, -16.0f, -22.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 32
		bodyModel[23].addBox(0, 0, 0, 5, 17, 1, 0f);
		bodyModel[23].setRotationPoint(-92.0f, -15.0f, -22.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 33
		bodyModel[24].addBox(0, 0, 0, 117, 18, 1, 0f);
		bodyModel[24].setRotationPoint(-87.0f, -16.0f, -22.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 35
		bodyModel[25].addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f);
		bodyModel[25].setRotationPoint(-98.0f, 1.0f, -21.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
		bodyModel[26].addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f);
		bodyModel[26].setRotationPoint(-98.0f, 1.0f, -4.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 37
		bodyModel[27].addShapeBox(0, 0, 0, 5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[27].setRotationPoint(30.0f, 2.0f, 0.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 40
		bodyModel[28].addBox(0, 0, 0, 47, 5, 22, 0f);
		bodyModel[28].setRotationPoint(-52.0f, 3.0f, -22.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 41
		bodyModel[29].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[29].setRotationPoint(-95.0f, -19.0f, -2.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 42
		bodyModel[30].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[30].setRotationPoint(37.0f, -19.0f, -2.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 43
		bodyModel[31].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[31].setRotationPoint(38.0f, -19.0f, -20.0f);
		bodyModel[31].rotateAngleY = 3.1415927f;

		bodyModel[32] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 44
		bodyModel[32].addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[32].setRotationPoint(-94.0f, -19.0f, -20.0f);
		bodyModel[32].rotateAngleY = 3.1415927f;

		bodyModel[33] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 47
		bodyModel[33].addBox(0, 0, 0, 5, 1, 1, 0f);
		bodyModel[33].setRotationPoint(30.0f, -16.0f, -22.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 48
		bodyModel[34].addBox(-5, 0, 0, 5, 17, 1, 0f);
		bodyModel[34].setRotationPoint(35.0f, -15.0f, -22.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 49
		bodyModel[35].addBox(0, 0, 0, 3, 18, 1, 0f);
		bodyModel[35].setRotationPoint(35.0f, -16.0f, -22.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 50
		bodyModel[36].addBox(0, 0, 0, 1, 18, 20, 0f);
		bodyModel[36].setRotationPoint(37.0f, -16.0f, -21.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 51
		bodyModel[37].addBox(0, 0, 0, 3, 0, 12, 0f);
		bodyModel[37].setRotationPoint(38.0f, 2.0f, -17.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 52
		bodyModel[38].addBox(0, 0, 0, 3, 17, 1, 0f);
		bodyModel[38].setRotationPoint(38.0f, -15.0f, -5.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 53
		bodyModel[39].addShapeBox(0, 0, 0, 3, 2, 14, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[39].setRotationPoint(38.0f, -17.0f, -18.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 54
		bodyModel[40].addBox(0, 0, 0, 3, 17, 1, 0f);
		bodyModel[40].setRotationPoint(38.0f, -15.0f, -18.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 55
		bodyModel[41].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[41].setRotationPoint(38.0f, 2.0f, -20.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 56
		bodyModel[42].addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f);
		bodyModel[42].setRotationPoint(39.5f, 1.0f, -21.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 57
		bodyModel[43].addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f);
		bodyModel[43].setRotationPoint(39.5f, 1.0f, -4.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 58
		bodyModel[44].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[44].setRotationPoint(38.0f, 2.0f, -3.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 59
		bodyModel[45].addShapeBox(0, 0, 0, 5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[45].setRotationPoint(-92.0f, 2.0f, 0.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 60
		bodyModel[46].addShapeBox(0, 0, 0, 5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[46].setRotationPoint(-87.0f, 2.0f, -22.0f);
		bodyModel[46].rotateAngleY = 3.1415927f;

		bodyModel[47] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 61
		bodyModel[47].addShapeBox(0, 0, 0, 5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[47].setRotationPoint(35.0f, 2.0f, -22.0f);
		bodyModel[47].rotateAngleY = 3.1415927f;

		bodyModel[48] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 54
		bodyModel[48].addBox(0, 0, 0, 3, 1, 2, 0f);
		bodyModel[48].setRotationPoint(12.0f, 3.0f, -12.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 55
		bodyModel[49].addBox(0, 0, 0, 3, 1, 2, 0f);
		bodyModel[49].setRotationPoint(-73.0f, 3.0f, -12.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 5, 120, textureX, textureY); // Box 59
		bodyModel[50].addBox(0, 0, 0, 1, 18, 5, 0f);
		bodyModel[50].setRotationPoint(13.0f, -16.0f, -21.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 22, 120, textureX, textureY); // Box 60
		bodyModel[51].addBox(0, 0, 0, 1, 18, 10, 0f);
		bodyModel[51].setRotationPoint(13.0f, -16.0f, -11.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 49, 91, textureX, textureY); // Box 61
		bodyModel[52].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[52].setRotationPoint(13.0f, -19.0f, -21.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 22, 89, textureX, textureY); // Box 62
		bodyModel[53].addBox(0, 0, 0, 1, 18, 10, 0f);
		bodyModel[53].setRotationPoint(-71.0f, -16.0f, -11.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 5, 94, textureX, textureY); // Box 63
		bodyModel[54].addBox(0, 0, 0, 1, 18, 5, 0f);
		bodyModel[54].setRotationPoint(-71.0f, -16.0f, -21.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 48, 122, textureX, textureY); // Box 64
		bodyModel[55].addShapeBox(0, 0, 0, 1, 3, 20, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[55].setRotationPoint(-71.0f, -19.0f, -21.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 67
		bodyModel[56].addBox(0, 0, 0, 14, 0, 7, 0f);
		bodyModel[56].setRotationPoint(14.0f, -5.01f, -8.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 68
		bodyModel[57].addBox(0, 0, 0, 14, 0, 7, 0f);
		bodyModel[57].setRotationPoint(-85.0f, -5.01f, -8.0f);

		bodyModel[58] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 69
		bodyModel[58].addBox(0, 0, 0, 1, 7, 1, 0f);
		bodyModel[58].setRotationPoint(27.0f, -5.0f, -8.0f);

		bodyModel[59] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 70
		bodyModel[59].addBox(0, 0, 0, 1, 7, 1, 0f);
		bodyModel[59].setRotationPoint(14.0f, -5.0f, -8.0f);

		bodyModel[60] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 71
		bodyModel[60].addBox(0, 0, 0, 1, 7, 1, 0f);
		bodyModel[60].setRotationPoint(-72.0f, -5.0f, -8.0f);

		bodyModel[61] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 72
		bodyModel[61].addBox(0, 0, 0, 1, 7, 1, 0f);
		bodyModel[61].setRotationPoint(-85.0f, -5.0f, -8.0f);

		bodyModel[62] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 73
		bodyModel[62].addBox(0, 0, 0, 1, 7, 1, 0f);
		bodyModel[62].setRotationPoint(-85.0f, -5.0f, -2.0f);

		bodyModel[63] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 74
		bodyModel[63].addBox(0, 0, 0, 1, 7, 1, 0f);
		bodyModel[63].setRotationPoint(27.0f, -5.0f, -2.0f);

		bodyModel[64] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[64].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[64].setRotationPoint(-68.0f, -8.2f, -2.0f);
		bodyModel[64].rotateAngleY = 3.1415927f;

		bodyModel[65] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[65].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[65].setRotationPoint(-63.55f, -3.0f, -10.0f);
		bodyModel[65].rotateAngleY = 3.1415927f;

		bodyModel[66] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
		bodyModel[66].addShapeBox(0, 0, 0, 1, 7, 10, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[66].setRotationPoint(-67.0f, -8.0f, -1.0f);
		bodyModel[66].rotateAngleY = 3.1415927f;

		bodyModel[67] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[67].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[67].setRotationPoint(-68.0f, -8.2f, -7.0f);
		bodyModel[67].rotateAngleY = 3.1415927f;

		bodyModel[68] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
		bodyModel[68].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[68].setRotationPoint(-63.0f, -1.0f, -1.0f);
		bodyModel[68].rotateAngleY = 3.1415927f;

		bodyModel[69] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[69].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[69].setRotationPoint(-67.55f, -3.0f, -2.0f);
		bodyModel[69].rotateAngleY = 6.2831855f;

		bodyModel[70] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
		bodyModel[70].addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[70].setRotationPoint(-63.5f, 0.0f, -1.0f);
		bodyModel[70].rotateAngleY = 3.1415927f;

		bodyModel[71] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[71].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[71].setRotationPoint(-58.0f, -8.2f, -2.0f);
		bodyModel[71].rotateAngleY = 3.1415927f;

		bodyModel[72] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[72].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[72].setRotationPoint(-53.55f, -3.0f, -10.0f);
		bodyModel[72].rotateAngleY = 3.1415927f;

		bodyModel[73] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
		bodyModel[73].addShapeBox(0, 0, 0, 1, 7, 10, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[73].setRotationPoint(-57.0f, -8.0f, -1.0f);
		bodyModel[73].rotateAngleY = 3.1415927f;

		bodyModel[74] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[74].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[74].setRotationPoint(-58.0f, -8.2f, -7.0f);
		bodyModel[74].rotateAngleY = 3.1415927f;

		bodyModel[75] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
		bodyModel[75].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[75].setRotationPoint(-53.0f, -1.0f, -1.0f);
		bodyModel[75].rotateAngleY = 3.1415927f;

		bodyModel[76] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[76].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[76].setRotationPoint(-57.55f, -3.0f, -2.0f);
		bodyModel[76].rotateAngleY = 6.2831855f;

		bodyModel[77] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
		bodyModel[77].addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[77].setRotationPoint(-53.5f, 0.0f, -1.0f);
		bodyModel[77].rotateAngleY = 3.1415927f;

		bodyModel[78] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[78].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[78].setRotationPoint(-48.0f, -8.2f, -2.0f);
		bodyModel[78].rotateAngleY = 3.1415927f;

		bodyModel[79] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[79].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[79].setRotationPoint(-43.55f, -3.0f, -10.0f);
		bodyModel[79].rotateAngleY = 3.1415927f;

		bodyModel[80] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
		bodyModel[80].addShapeBox(0, 0, 0, 1, 7, 10, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[80].setRotationPoint(-47.0f, -8.0f, -1.0f);
		bodyModel[80].rotateAngleY = 3.1415927f;

		bodyModel[81] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[81].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[81].setRotationPoint(-48.0f, -8.2f, -7.0f);
		bodyModel[81].rotateAngleY = 3.1415927f;

		bodyModel[82] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
		bodyModel[82].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[82].setRotationPoint(-43.0f, -1.0f, -1.0f);
		bodyModel[82].rotateAngleY = 3.1415927f;

		bodyModel[83] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[83].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[83].setRotationPoint(-47.55f, -3.0f, -2.0f);
		bodyModel[83].rotateAngleY = 6.2831855f;

		bodyModel[84] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
		bodyModel[84].addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[84].setRotationPoint(-43.5f, 0.0f, -1.0f);
		bodyModel[84].rotateAngleY = 3.1415927f;

		bodyModel[85] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[85].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[85].setRotationPoint(-38.0f, -8.2f, -2.0f);
		bodyModel[85].rotateAngleY = 3.1415927f;

		bodyModel[86] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[86].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[86].setRotationPoint(-33.55f, -3.0f, -10.0f);
		bodyModel[86].rotateAngleY = 3.1415927f;

		bodyModel[87] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
		bodyModel[87].addShapeBox(0, 0, 0, 1, 7, 10, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[87].setRotationPoint(-37.0f, -8.0f, -1.0f);
		bodyModel[87].rotateAngleY = 3.1415927f;

		bodyModel[88] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[88].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[88].setRotationPoint(-38.0f, -8.2f, -7.0f);
		bodyModel[88].rotateAngleY = 3.1415927f;

		bodyModel[89] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
		bodyModel[89].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[89].setRotationPoint(-33.0f, -1.0f, -1.0f);
		bodyModel[89].rotateAngleY = 3.1415927f;

		bodyModel[90] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[90].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[90].setRotationPoint(-37.55f, -3.0f, -2.0f);
		bodyModel[90].rotateAngleY = 6.2831855f;

		bodyModel[91] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
		bodyModel[91].addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[91].setRotationPoint(-33.5f, 0.0f, -1.0f);
		bodyModel[91].rotateAngleY = 3.1415927f;

		bodyModel[92] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[92].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[92].setRotationPoint(-19.0f, -8.2f, -5.0f);

		bodyModel[93] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[93].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[93].setRotationPoint(-23.55f, -3.0f, -2.0f);

		bodyModel[94] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
		bodyModel[94].addShapeBox(0, 0, 0, 1, 7, 10, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[94].setRotationPoint(-20.0f, -8.0f, -11.0f);

		bodyModel[95] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[95].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[95].setRotationPoint(-19.0f, -8.2f, -10.0f);

		bodyModel[96] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
		bodyModel[96].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[96].setRotationPoint(-24.0f, -1.0f, -11.0f);

		bodyModel[97] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[97].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[97].setRotationPoint(-19.55f, -3.0f, -10.0f);
		bodyModel[97].rotateAngleY = 3.1415927f;

		bodyModel[98] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
		bodyModel[98].addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[98].setRotationPoint(-23.5f, 0.0f, -11.0f);

		bodyModel[99] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[99].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[99].setRotationPoint(-9.0f, -8.2f, -5.0f);

		bodyModel[100] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[100].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[100].setRotationPoint(-13.55f, -3.0f, -2.0f);

		bodyModel[101] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
		bodyModel[101].addShapeBox(0, 0, 0, 1, 7, 10, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[101].setRotationPoint(-10.0f, -8.0f, -11.0f);

		bodyModel[102] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[102].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[102].setRotationPoint(-9.0f, -8.2f, -10.0f);

		bodyModel[103] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
		bodyModel[103].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[103].setRotationPoint(-14.0f, -1.0f, -11.0f);

		bodyModel[104] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[104].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[104].setRotationPoint(-9.55f, -3.0f, -10.0f);
		bodyModel[104].rotateAngleY = 3.1415927f;

		bodyModel[105] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
		bodyModel[105].addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[105].setRotationPoint(-13.5f, 0.0f, -11.0f);

		bodyModel[106] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[106].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[106].setRotationPoint(1.0f, -8.2f, -5.0f);

		bodyModel[107] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[107].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[107].setRotationPoint(-3.55f, -3.0f, -2.0f);

		bodyModel[108] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
		bodyModel[108].addShapeBox(0, 0, 0, 1, 7, 10, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[108].setRotationPoint(0.0f, -8.0f, -11.0f);

		bodyModel[109] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[109].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[109].setRotationPoint(1.0f, -8.2f, -10.0f);

		bodyModel[110] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
		bodyModel[110].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[110].setRotationPoint(-4.0f, -1.0f, -11.0f);

		bodyModel[111] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[111].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[111].setRotationPoint(0.45f, -3.0f, -10.0f);
		bodyModel[111].rotateAngleY = 3.1415927f;

		bodyModel[112] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
		bodyModel[112].addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[112].setRotationPoint(-3.5f, 0.0f, -11.0f);

		bodyModel[113] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[113].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[113].setRotationPoint(11.0f, -8.2f, -5.0f);

		bodyModel[114] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[114].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[114].setRotationPoint(6.45f, -3.0f, -2.0f);

		bodyModel[115] = new ModelRendererTurbo(this, 462, 102, textureX, textureY); // Box 163
		bodyModel[115].addShapeBox(0, 0, 0, 1, 7, 10, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[115].setRotationPoint(10.0f, -8.0f, -11.0f);

		bodyModel[116] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[116].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[116].setRotationPoint(11.0f, -8.2f, -10.0f);

		bodyModel[117] = new ModelRendererTurbo(this, 439, 111, textureX, textureY); // Box 165
		bodyModel[117].addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[117].setRotationPoint(6.0f, -1.0f, -11.0f);

		bodyModel[118] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[118].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[118].setRotationPoint(10.45f, -3.0f, -10.0f);
		bodyModel[118].rotateAngleY = 3.1415927f;

		bodyModel[119] = new ModelRendererTurbo(this, 449, 83, textureX, textureY); // Box 9
		bodyModel[119].addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[119].setRotationPoint(6.5f, 0.0f, -11.0f);

		bodyModel[120] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
		bodyModel[120].addShapeBox(0, 0, 0, 1, 7, 5, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[120].setRotationPoint(10.0f, -8.0f, -21.0f);

		bodyModel[121] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[121].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[121].setRotationPoint(11.0f, -8.2f, -20.0f);

		bodyModel[122] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
		bodyModel[122].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[122].setRotationPoint(6.0f, -1.0f, -21.0f);

		bodyModel[123] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[123].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[123].setRotationPoint(10.45f, -3.0f, -20.0f);
		bodyModel[123].rotateAngleY = 3.1415927f;

		bodyModel[124] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[124].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[124].setRotationPoint(6.45f, -3.0f, -17.0f);

		bodyModel[125] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
		bodyModel[125].addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[125].setRotationPoint(6.5f, 0.0f, -21.0f);

		bodyModel[126] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
		bodyModel[126].addShapeBox(0, 0, 0, 1, 7, 5, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[126].setRotationPoint(0.0f, -8.0f, -21.0f);

		bodyModel[127] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[127].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[127].setRotationPoint(1.0f, -8.2f, -20.0f);

		bodyModel[128] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
		bodyModel[128].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[128].setRotationPoint(-4.0f, -1.0f, -21.0f);

		bodyModel[129] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[129].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[129].setRotationPoint(0.45f, -3.0f, -20.0f);
		bodyModel[129].rotateAngleY = 3.1415927f;

		bodyModel[130] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[130].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[130].setRotationPoint(-3.55f, -3.0f, -17.0f);

		bodyModel[131] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
		bodyModel[131].addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[131].setRotationPoint(-3.5f, 0.0f, -21.0f);

		bodyModel[132] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
		bodyModel[132].addShapeBox(0, 0, 0, 1, 7, 5, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[132].setRotationPoint(-10.0f, -8.0f, -21.0f);

		bodyModel[133] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[133].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[133].setRotationPoint(-9.0f, -8.2f, -20.0f);

		bodyModel[134] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
		bodyModel[134].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[134].setRotationPoint(-14.0f, -1.0f, -21.0f);

		bodyModel[135] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[135].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[135].setRotationPoint(-9.55f, -3.0f, -20.0f);
		bodyModel[135].rotateAngleY = 3.1415927f;

		bodyModel[136] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[136].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[136].setRotationPoint(-13.55f, -3.0f, -17.0f);

		bodyModel[137] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
		bodyModel[137].addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[137].setRotationPoint(-13.5f, 0.0f, -21.0f);

		bodyModel[138] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
		bodyModel[138].addShapeBox(0, 0, 0, 1, 7, 5, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[138].setRotationPoint(-20.0f, -8.0f, -21.0f);

		bodyModel[139] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[139].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[139].setRotationPoint(-19.0f, -8.2f, -20.0f);

		bodyModel[140] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
		bodyModel[140].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[140].setRotationPoint(-24.0f, -1.0f, -21.0f);

		bodyModel[141] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[141].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[141].setRotationPoint(-19.55f, -3.0f, -20.0f);
		bodyModel[141].rotateAngleY = 3.1415927f;

		bodyModel[142] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[142].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[142].setRotationPoint(-23.55f, -3.0f, -17.0f);

		bodyModel[143] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
		bodyModel[143].addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[143].setRotationPoint(-23.5f, 0.0f, -21.0f);

		bodyModel[144] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
		bodyModel[144].addShapeBox(0, 0, 0, 1, 7, 5, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[144].setRotationPoint(-67.0f, -8.0f, -16.0f);
		bodyModel[144].rotateAngleY = 3.1415927f;

		bodyModel[145] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[145].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[145].setRotationPoint(-68.0f, -8.2f, -17.0f);
		bodyModel[145].rotateAngleY = 3.1415927f;

		bodyModel[146] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
		bodyModel[146].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[146].setRotationPoint(-63.0f, -1.0f, -16.0f);
		bodyModel[146].rotateAngleY = 3.1415927f;

		bodyModel[147] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[147].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[147].setRotationPoint(-67.55f, -3.0f, -17.0f);
		bodyModel[147].rotateAngleY = 6.2831855f;

		bodyModel[148] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[148].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[148].setRotationPoint(-63.55f, -3.0f, -20.0f);
		bodyModel[148].rotateAngleY = 3.1415927f;

		bodyModel[149] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
		bodyModel[149].addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[149].setRotationPoint(-63.5f, 0.0f, -16.0f);
		bodyModel[149].rotateAngleY = 3.1415927f;

		bodyModel[150] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
		bodyModel[150].addShapeBox(0, 0, 0, 1, 7, 5, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[150].setRotationPoint(-57.0f, -8.0f, -16.0f);
		bodyModel[150].rotateAngleY = 3.1415927f;

		bodyModel[151] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[151].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[151].setRotationPoint(-58.0f, -8.2f, -17.0f);
		bodyModel[151].rotateAngleY = 3.1415927f;

		bodyModel[152] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
		bodyModel[152].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[152].setRotationPoint(-53.0f, -1.0f, -16.0f);
		bodyModel[152].rotateAngleY = 3.1415927f;

		bodyModel[153] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[153].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[153].setRotationPoint(-57.55f, -3.0f, -17.0f);
		bodyModel[153].rotateAngleY = 6.2831855f;

		bodyModel[154] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[154].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[154].setRotationPoint(-53.55f, -3.0f, -20.0f);
		bodyModel[154].rotateAngleY = 3.1415927f;

		bodyModel[155] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
		bodyModel[155].addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[155].setRotationPoint(-53.5f, 0.0f, -16.0f);
		bodyModel[155].rotateAngleY = 3.1415927f;

		bodyModel[156] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
		bodyModel[156].addShapeBox(0, 0, 0, 1, 7, 5, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[156].setRotationPoint(-47.0f, -8.0f, -16.0f);
		bodyModel[156].rotateAngleY = 3.1415927f;

		bodyModel[157] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[157].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[157].setRotationPoint(-48.0f, -8.2f, -17.0f);
		bodyModel[157].rotateAngleY = 3.1415927f;

		bodyModel[158] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
		bodyModel[158].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[158].setRotationPoint(-43.0f, -1.0f, -16.0f);
		bodyModel[158].rotateAngleY = 3.1415927f;

		bodyModel[159] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[159].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[159].setRotationPoint(-47.55f, -3.0f, -17.0f);
		bodyModel[159].rotateAngleY = 6.2831855f;

		bodyModel[160] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[160].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[160].setRotationPoint(-43.55f, -3.0f, -20.0f);
		bodyModel[160].rotateAngleY = 3.1415927f;

		bodyModel[161] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
		bodyModel[161].addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[161].setRotationPoint(-43.5f, 0.0f, -16.0f);
		bodyModel[161].rotateAngleY = 3.1415927f;

		bodyModel[162] = new ModelRendererTurbo(this, 479, 79, textureX, textureY); // Box 163
		bodyModel[162].addShapeBox(0, 0, 0, 1, 7, 5, 0, -1.5f, 0, 0, 1.5f, -0.2f, 0, 1.5f, -0.2f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[162].setRotationPoint(-37.0f, -8.0f, -16.0f);
		bodyModel[162].rotateAngleY = 3.1415927f;

		bodyModel[163] = new ModelRendererTurbo(this, 460, 98, textureX, textureY); // Box 164
		bodyModel[163].addBox(0, 0, 0, 1, 2, 3, 0f);
		bodyModel[163].setRotationPoint(-38.0f, -8.2f, -17.0f);
		bodyModel[163].rotateAngleY = 3.1415927f;

		bodyModel[164] = new ModelRendererTurbo(this, 475, 102, textureX, textureY); // Box 165
		bodyModel[164].addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0);
		bodyModel[164].setRotationPoint(-33.0f, -1.0f, -16.0f);
		bodyModel[164].rotateAngleY = 3.1415927f;

		bodyModel[165] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 6
		bodyModel[165].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[165].setRotationPoint(-37.55f, -3.0f, -17.0f);
		bodyModel[165].rotateAngleY = 6.2831855f;

		bodyModel[166] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 7
		bodyModel[166].addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0);
		bodyModel[166].setRotationPoint(-33.55f, -3.0f, -20.0f);
		bodyModel[166].rotateAngleY = 3.1415927f;

		bodyModel[167] = new ModelRendererTurbo(this, 477, 93, textureX, textureY); // Box 9
		bodyModel[167].addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[167].setRotationPoint(-33.5f, 0.0f, -16.0f);
		bodyModel[167].rotateAngleY = 3.1415927f;

		bodyModel[168] = new ModelRendererTurbo(this, 185, 59, textureX, textureY); // Box 173
		bodyModel[168].addShapeBox(0, 0, 0, 5, 4, 10, 0, -5, -1, 0, 0, -1, 0, 0, -1, 0, -5, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[168].setRotationPoint(-95.0f, -23.0f, -16.0f);

		bodyModel[169] = new ModelRendererTurbo(this, 124, 65, textureX, textureY); // Box 177
		bodyModel[169].addShapeBox(0, 0, 0, 5, 4, 4, 0, -5, -1, 0, 0, -1, 0, 0, -1, -4, -5, -1, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[169].setRotationPoint(-95.0f, -23.0f, -6.0f);

		bodyModel[170] = new ModelRendererTurbo(this, 104, 65, textureX, textureY); // Box 178
		bodyModel[170].addShapeBox(0, 0, 0, 5, 4, 4, 0, 0, -1, 0, -5, -1, 0, -5, -1, -4, 0, -1, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[170].setRotationPoint(33.0f, -23.0f, -6.0f);

		bodyModel[171] = new ModelRendererTurbo(this, 185, 59, textureX, textureY); // Box 179
		bodyModel[171].addShapeBox(0, 0, 0, 5, 4, 10, 0, 0, -1, 0, -5, -1, 0, -5, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[171].setRotationPoint(33.0f, -23.0f, -16.0f);

		bodyModel[172] = new ModelRendererTurbo(this, 124, 65, textureX, textureY); // Box 180
		bodyModel[172].addShapeBox(0, 0, 0, 5, 4, 4, 0, 0, -1, -4, -5, -1, -4, -5, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[172].setRotationPoint(33.0f, -23.0f, -20.0f);

		bodyModel[173] = new ModelRendererTurbo(this, 157, 63, textureX, textureY); // Box 177
		bodyModel[173].addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[173].setRotationPoint(-84.0f, -5.0f, -23.0f);

		bodyModel[174] = new ModelRendererTurbo(this, 157, 63, textureX, textureY); // Box 178
		bodyModel[174].addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[174].setRotationPoint(-84.0f, -5.0f, 0.0f);

		bodyModel[175] = new ModelRendererTurbo(this, 157, 63, textureX, textureY); // Box 179
		bodyModel[175].addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f);
		bodyModel[175].setRotationPoint(21.0f, -5.0f, 0.0f);

		bodyModel[176] = new ModelRendererTurbo(this, 157, 63, textureX, textureY); // Box 180
		bodyModel[176].addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0);
		bodyModel[176].setRotationPoint(21.0f, -5.0f, -23.0f);

		bodyModel[177] = new ModelRendererTurbo(this, 419, 26, textureX, textureY); // Box 181
		bodyModel[177].addBox(0, 0, 0, 4, 2, 2, 0f);
		bodyModel[177].setRotationPoint(38.0f, 2.1f, -12.0f);

		bodyModel[178] = new ModelRendererTurbo(this, 419, 26, textureX, textureY); // Box 182
		bodyModel[178].addBox(0, 0, 0, 4, 2, 2, 0f);
		bodyModel[178].setRotationPoint(-99.0f, 2.1f, -12.0f);

		flipAll();
	}
	private ModelRheingoldBogie bogie1 = new ModelRheingoldBogie();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);

		Tessellator.bindTexture(new ResourceLocation(Ctyrk4AddonInfo.resourceLocation, "textures/trains/Generic_CD_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-4.625,0.20,-1.045);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(5.32,0, 0);
		bogie1.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
}
