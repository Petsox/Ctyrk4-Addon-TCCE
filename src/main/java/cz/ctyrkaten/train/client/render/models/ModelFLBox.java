//FMT-Marker DFM-1.0
//Creator: Unregistered Account

package cz.ctyrkaten.train.client.render.models;

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelFLBox extends ModelConverter {

	private int textureX = 512;
	private int textureY = 512;

	public ModelFLBox() //Same as Filename

	{
		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	public void initbodyModel_1(){
		bodyModel = new ModelRendererTurbo[30];
		model = new ModelRendererTurbo[146];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		bodyModel[0].addBox(0, 0, 0, 90, 1, 22, 0f);
		bodyModel[0].setRotationPoint(-45.0f, 0.0f, -11.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 434, 77, textureX, textureY);
		bodyModel[1].addBox(0, 0, 0, 7, 7, 0, 0f);
		bodyModel[1].setRotationPoint(-40.0f, 3.0f, -6.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 155, 60, textureX, textureY);
		bodyModel[2].addBox(0, 0, 0, 1, 1, 14, 0f);
		bodyModel[2].setRotationPoint(-37.0f, 6.0f, -7.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 0, 30, textureX, textureY);
		bodyModel[3].addBox(0, 0, 0, 90, 27, 0, 0f);
		bodyModel[3].setRotationPoint(-45.0f, -27.0f, -11.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 366, 28, textureX, textureY);
		bodyModel[4].addBox(0, 0, 0, 0, 27, 22, 0f);
		bodyModel[4].setRotationPoint(-45.0f, -27.0f, -11.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 214, 14, textureX, textureY);
		bodyModel[5].addShapeBox(0, 0, 0, 88, 2, 11, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[5].setRotationPoint(-43.0f, -29.0f, -11.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 124, 58, textureX, textureY);
		bodyModel[6].addBox(0, 0, 0, 14, 24, 1, 0f);
		bodyModel[6].setRotationPoint(-7.0f, -25.0f, 11.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 413, 24, textureX, textureY);
		bodyModel[7].addBox(0, 0, 0, 23, 2, 1, 0f);
		bodyModel[7].setRotationPoint(-16.0f, -27.0f, -12.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 31, 74, textureX, textureY);
		bodyModel[8].addShapeBox(0, 0, 0, 13, 26, 1, 0, -12, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -12, 0, 0, 0, -1, -0.5f, -12, 0, -0.5f, -12, 0, 0, 0, -1, 0);
		bodyModel[8].setRotationPoint(-44.0f, -26.0f, -12.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 87, 74, textureX, textureY);
		bodyModel[9].addShapeBox(0, 0, 0, 12, 26, 1, 0, 0, -1, -0.5f, -11, 0, -0.5f, -11, 0, 0, 0, -1, 0, -11, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -11, 0, 0);
		bodyModel[9].setRotationPoint(-30.0f, -26.0f, -12.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 155, 76, textureX, textureY);
		bodyModel[10].addShapeBox(0, 0, 0, 10, 26, 1, 0, 0, -1, -0.5f, -9, 0, -0.5f, -9, 0, 0, 0, -1, 0, -9, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -9, 0, 0);
		bodyModel[10].setRotationPoint(-17.0f, -26.0f, -12.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 315, 56, textureX, textureY);
		bodyModel[11].addShapeBox(0, 0, 0, 17, 26, 1, 0, -16, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -16, 0, 0, 0, -1, -0.5f, -16, 0, -0.5f, -16, 0, 0, 0, -1, 0);
		bodyModel[11].setRotationPoint(9.0f, -26.0f, -12.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 278, 56, textureX, textureY);
		bodyModel[12].addShapeBox(0, 0, 0, 17, 26, 1, 0, 0, -1, -0.5f, -16, 0, -0.5f, -16, 0, 0, 0, -1, 0, -16, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, -16, 0, 0);
		bodyModel[12].setRotationPoint(27.0f, -26.0f, -12.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 402, 21, textureX, textureY);
		bodyModel[13].addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		bodyModel[13].setRotationPoint(-45.0f, 0.0f, -12.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 411, 46, textureX, textureY);
		bodyModel[14].addShapeBox(0, 0, 0, 13, 26, 1, 0, 0, -1, 0, -12, 0, 0, -12, 0, -0.5f, 0, -1, -0.5f, -12, 0, 0, 0, -1, 0, 0, -1, -0.5f, -12, 0, -0.5f);
		bodyModel[14].setRotationPoint(31.0f, -26.0f, 11.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 60, 74, textureX, textureY);
		bodyModel[15].addShapeBox(0, 0, 0, 12, 26, 1, 0, -11, 0, 0, 0, -1, 0, 0, -1, -0.5f, -11, 0, -0.5f, 0, -1, 0, -11, 0, 0, -11, 0, -0.5f, 0, -1, -0.5f);
		bodyModel[15].setRotationPoint(18.0f, -26.0f, 11.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 411, 74, textureX, textureY);
		bodyModel[16].addShapeBox(0, 0, 0, 10, 26, 1, 0, 0, -1, 0, -9, 0, 0, -9, 0, -0.5f, 0, -1, -0.5f, -9, 0, 0, 0, -1, 0, 0, -1, -0.5f, -9, 0, -0.5f);
		bodyModel[16].setRotationPoint(7.0f, -26.0f, 11.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 241, 56, textureX, textureY);
		bodyModel[17].addShapeBox(0, 0, 0, 17, 26, 1, 0, 0, -1, 0, -16, 0, 0, -16, 0, -0.5f, 0, -1, -0.5f, -16, 0, 0, 0, -1, 0, 0, -1, -0.5f, -16, 0, -0.5f);
		bodyModel[17].setRotationPoint(-26.0f, -26.0f, 11.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 204, 56, textureX, textureY);
		bodyModel[18].addShapeBox(-1, 0, 0, 17, 26, 1, 0, 0, -1, 0, -16, 0, 0, -16, 0, -0.5f, 0, -1, -0.5f, -16, 0, 0, 0, -1, 0, 0, -1, -0.5f, -16, 0, -0.5f);
		bodyModel[18].setRotationPoint(-43.0f, -26.0f, 11.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 485, 66, textureX, textureY);
		bodyModel[19].addBox(0, 0, 0, 2, 1, 1, 0f);
		bodyModel[19].setRotationPoint(45.0f, -2.0f, 9.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 97, 63, textureX, textureY);
		bodyModel[20].addBox(0, 0, 0, 1, 1, 3, 0f);
		bodyModel[20].setRotationPoint(46.0f, -2.0f, 6.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 386, 78, textureX, textureY);
		bodyModel[21].addBox(-1, 0, 0, 1, 4, 1, 0f);
		bodyModel[21].setRotationPoint(-42.0f, -31.0f, -9.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 0, 16, textureX, textureY);
		bodyModel[22].addBox(0, 0, 0, 7, 2, 2, 0f);
		bodyModel[22].setRotationPoint(43.0f, 0.0f, -1.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 395, 40, textureX, textureY);
		bodyModel[23].addBox(0, 0, 0, 2, 0, 1, 0f);
		bodyModel[23].setRotationPoint(-45.0f, -31.0f, -9.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 440, 46, textureX, textureY);
		bodyModel[24].addShapeBox(0, 0, 0, 2, 0, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		bodyModel[24].setRotationPoint(-45.0f, -31.0f, -11.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 0, 24, textureX, textureY);
		bodyModel[25].addBox(0, 0, 0, 90, 3, 2, 0f);
		bodyModel[25].setRotationPoint(-45.0f, -30.0f, -1.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 485, 61, textureX, textureY);
		bodyModel[26].addShapeBox(0, 0, 0, 2, 3, 11, 0, 0, 0, 0, 0, 0, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		bodyModel[26].setRotationPoint(43.0f, -30.0f, 1.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 359, 73, textureX, textureY);
		bodyModel[27].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[27].setRotationPoint(-41.0f, 4.0f, -7.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 498, 38, textureX, textureY);
		bodyModel[28].addBox(0, 0, 0, 5, 2, 1, 0f);
		bodyModel[28].setRotationPoint(-39.0f, 4.0f, 6.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 461, 27, textureX, textureY);
		bodyModel[29].addBox(0, 0, 0, 21, 1, 1, 0f);
		bodyModel[29].setRotationPoint(-10.5f, 6.0f, -11.0f);

		model[0] = new ModelRendererTurbo(this, 485, 76, textureX, textureY);
		model[0].addBox(0, 0, 0, 7, 7, 0, 0f);
		model[0].setRotationPoint(-26.0f, 3.0f, -6.0f);

		model[1] = new ModelRendererTurbo(this, 178, 76, textureX, textureY);
		model[1].addBox(0, 0, 0, 7, 7, 0, 0f);
		model[1].setRotationPoint(-40.0f, 3.0f, 6.0f);

		model[2] = new ModelRendererTurbo(this, 186, 68, textureX, textureY);
		model[2].addBox(0, 0, 0, 7, 7, 0, 0f);
		model[2].setRotationPoint(-26.0f, 3.0f, 6.0f);

		model[3] = new ModelRendererTurbo(this, 187, 60, textureX, textureY);
		model[3].addBox(0, 0, 0, 7, 7, 0, 0f);
		model[3].setRotationPoint(33.0f, 3.0f, -6.0f);

		model[4] = new ModelRendererTurbo(this, 172, 60, textureX, textureY);
		model[4].addBox(0, 0, 0, 7, 7, 0, 0f);
		model[4].setRotationPoint(19.0f, 3.0f, -6.0f);

		model[5] = new ModelRendererTurbo(this, 366, 36, textureX, textureY);
		model[5].addBox(0, 0, 0, 7, 7, 0, 0f);
		model[5].setRotationPoint(19.0f, 3.0f, 6.0f);

		model[6] = new ModelRendererTurbo(this, 366, 28, textureX, textureY);
		model[6].addBox(0, 0, 0, 7, 7, 0, 0f);
		model[6].setRotationPoint(33.0f, 3.0f, 6.0f);

		model[7] = new ModelRendererTurbo(this, 93, 58, textureX, textureY);
		model[7].addBox(0, 0, 0, 1, 1, 14, 0f);
		model[7].setRotationPoint(-23.0f, 6.0f, -7.0f);

		model[8] = new ModelRendererTurbo(this, 62, 58, textureX, textureY);
		model[8].addBox(0, 0, 0, 1, 1, 14, 0f);
		model[8].setRotationPoint(22.0f, 6.0f, -7.0f);

		model[9] = new ModelRendererTurbo(this, 31, 58, textureX, textureY);
		model[9].addBox(0, 0, 0, 1, 1, 14, 0f);
		model[9].setRotationPoint(36.0f, 6.0f, -7.0f);

		model[10] = new ModelRendererTurbo(this, 185, 28, textureX, textureY);
		model[10].addBox(0, 0, 0, 90, 27, 0, 0f);
		model[10].setRotationPoint(-45.0f, -27.0f, 11.0f);

		model[11] = new ModelRendererTurbo(this, 440, 27, textureX, textureY);
		model[11].addBox(0, 0, 0, 0, 27, 22, 0f);
		model[11].setRotationPoint(45.0f, -27.0f, -11.0f);

		model[12] = new ModelRendererTurbo(this, 203, 0, textureX, textureY);
		model[12].addShapeBox(0, 0, 0, 88, 2, 11, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		model[12].setRotationPoint(-45.0f, -29.0f, 0.0f);

		model[13] = new ModelRendererTurbo(this, 0, 58, textureX, textureY);
		model[13].addBox(0, 0, 0, 14, 24, 1, 0f);
		model[13].setRotationPoint(-7.0f, -25.0f, -12.0f);

		model[14] = new ModelRendererTurbo(this, 463, 20, textureX, textureY);
		model[14].addBox(0, 0, 0, 23, 2, 1, 0f);
		model[14].setRotationPoint(-16.0f, -1.0f, -12.0f);

		model[15] = new ModelRendererTurbo(this, 463, 16, textureX, textureY);
		model[15].addBox(0, 0, 0, 23, 2, 1, 0f);
		model[15].setRotationPoint(-7.0f, -27.0f, 11.0f);

		model[16] = new ModelRendererTurbo(this, 463, 12, textureX, textureY);
		model[16].addBox(0, 0, 0, 23, 2, 1, 0f);
		model[16].setRotationPoint(-7.0f, -1.0f, 11.0f);

		model[17] = new ModelRendererTurbo(this, 402, 18, textureX, textureY);
		model[17].addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[17].setRotationPoint(-45.0f, -27.0f, -12.0f);

		model[18] = new ModelRendererTurbo(this, 381, 78, textureX, textureY);
		model[18].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[18].setRotationPoint(-45.0f, -26.0f, -12.0f);

		model[19] = new ModelRendererTurbo(this, 376, 78, textureX, textureY);
		model[19].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[19].setRotationPoint(-31.0f, -26.0f, -12.0f);

		model[20] = new ModelRendererTurbo(this, 371, 78, textureX, textureY);
		model[20].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[20].setRotationPoint(-18.0f, -26.0f, -12.0f);

		model[21] = new ModelRendererTurbo(this, 366, 78, textureX, textureY);
		model[21].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[21].setRotationPoint(8.0f, -26.0f, -12.0f);

		model[22] = new ModelRendererTurbo(this, 479, 77, textureX, textureY);
		model[22].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[22].setRotationPoint(26.0f, -26.0f, -12.0f);

		model[23] = new ModelRendererTurbo(this, 474, 77, textureX, textureY);
		model[23].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[23].setRotationPoint(44.0f, -26.0f, -12.0f);

		model[24] = new ModelRendererTurbo(this, 402, 9, textureX, textureY);
		model[24].addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[24].setRotationPoint(7.0f, 0.0f, -12.0f);

		model[25] = new ModelRendererTurbo(this, 391, 6, textureX, textureY);
		model[25].addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[25].setRotationPoint(7.0f, -27.0f, -12.0f);

		model[26] = new ModelRendererTurbo(this, 469, 77, textureX, textureY);
		model[26].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[26].setRotationPoint(44.0f, -26.0f, 11.0f);

		model[27] = new ModelRendererTurbo(this, 464, 77, textureX, textureY);
		model[27].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[27].setRotationPoint(30.0f, -26.0f, 11.0f);

		model[28] = new ModelRendererTurbo(this, 459, 77, textureX, textureY);
		model[28].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[28].setRotationPoint(17.0f, -26.0f, 11.0f);

		model[29] = new ModelRendererTurbo(this, 402, 15, textureX, textureY);
		model[29].addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[29].setRotationPoint(16.0f, -27.0f, 11.0f);

		model[30] = new ModelRendererTurbo(this, 402, 12, textureX, textureY);
		model[30].addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[30].setRotationPoint(16.0f, 0.0f, 11.0f);

		model[31] = new ModelRendererTurbo(this, 454, 77, textureX, textureY);
		model[31].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[31].setRotationPoint(-9.0f, -26.0f, 11.0f);

		model[32] = new ModelRendererTurbo(this, 449, 77, textureX, textureY);
		model[32].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[32].setRotationPoint(-27.0f, -26.0f, 11.0f);

		model[33] = new ModelRendererTurbo(this, 505, 76, textureX, textureY);
		model[33].addShapeBox(0, 0, 0, 1, 26, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[33].setRotationPoint(-45.0f, -26.0f, 11.0f);

		model[34] = new ModelRendererTurbo(this, 391, 3, textureX, textureY);
		model[34].addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[34].setRotationPoint(-45.0f, -27.0f, 11.0f);

		model[35] = new ModelRendererTurbo(this, 391, 0, textureX, textureY);
		model[35].addShapeBox(0, 0, 0, 38, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[35].setRotationPoint(-45.0f, 0.0f, 11.0f);

		model[36] = new ModelRendererTurbo(this, 86, 66, textureX, textureY);
		model[36].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[36].setRotationPoint(45.0f, -2.0f, 5.0f);

		model[37] = new ModelRendererTurbo(this, 79, 66, textureX, textureY);
		model[37].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[37].setRotationPoint(45.0f, -9.0f, 5.0f);

		model[38] = new ModelRendererTurbo(this, 69, 66, textureX, textureY);
		model[38].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[38].setRotationPoint(45.0f, -9.0f, 9.0f);

		model[39] = new ModelRendererTurbo(this, 62, 66, textureX, textureY);
		model[39].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[39].setRotationPoint(45.0f, -16.0f, 5.0f);

		model[40] = new ModelRendererTurbo(this, 55, 66, textureX, textureY);
		model[40].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[40].setRotationPoint(45.0f, -16.0f, 9.0f);

		model[41] = new ModelRendererTurbo(this, 48, 66, textureX, textureY);
		model[41].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[41].setRotationPoint(45.0f, -23.0f, 9.0f);

		model[42] = new ModelRendererTurbo(this, 37, 63, textureX, textureY);
		model[42].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[42].setRotationPoint(45.0f, -23.0f, 5.0f);

		model[43] = new ModelRendererTurbo(this, 31, 63, textureX, textureY);
		model[43].addBox(0, 0, 0, 1, 1, 3, 0f);
		model[43].setRotationPoint(46.0f, -9.0f, 6.0f);

		model[44] = new ModelRendererTurbo(this, 501, 61, textureX, textureY);
		model[44].addBox(0, 0, 0, 1, 1, 3, 0f);
		model[44].setRotationPoint(46.0f, -16.0f, 6.0f);

		model[45] = new ModelRendererTurbo(this, 485, 61, textureX, textureY);
		model[45].addBox(0, 0, 0, 1, 1, 3, 0f);
		model[45].setRotationPoint(46.0f, -23.0f, 6.0f);

		model[46] = new ModelRendererTurbo(this, 358, 61, textureX, textureY);
		model[46].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[46].setRotationPoint(-47.0f, -2.0f, -10.0f);

		model[47] = new ModelRendererTurbo(this, 352, 61, textureX, textureY);
		model[47].addBox(0, 0, 0, 1, 1, 3, 0f);
		model[47].setRotationPoint(-47.0f, -2.0f, -9.0f);

		model[48] = new ModelRendererTurbo(this, 116, 58, textureX, textureY);
		model[48].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[48].setRotationPoint(-47.0f, -2.0f, -6.0f);

		model[49] = new ModelRendererTurbo(this, 100, 58, textureX, textureY);
		model[49].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[49].setRotationPoint(-47.0f, -9.0f, -6.0f);

		model[50] = new ModelRendererTurbo(this, 37, 58, textureX, textureY);
		model[50].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[50].setRotationPoint(-47.0f, -9.0f, -10.0f);

		model[51] = new ModelRendererTurbo(this, 473, 46, textureX, textureY);
		model[51].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[51].setRotationPoint(-47.0f, -16.0f, -6.0f);

		model[52] = new ModelRendererTurbo(this, 466, 46, textureX, textureY);
		model[52].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[52].setRotationPoint(-47.0f, -16.0f, -10.0f);

		model[53] = new ModelRendererTurbo(this, 459, 46, textureX, textureY);
		model[53].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[53].setRotationPoint(-47.0f, -23.0f, -6.0f);

		model[54] = new ModelRendererTurbo(this, 452, 46, textureX, textureY);
		model[54].addBox(0, 0, 0, 2, 1, 1, 0f);
		model[54].setRotationPoint(-47.0f, -23.0f, -10.0f);

		model[55] = new ModelRendererTurbo(this, 155, 58, textureX, textureY);
		model[55].addBox(0, 0, 0, 1, 1, 3, 0f);
		model[55].setRotationPoint(-47.0f, -9.0f, -9.0f);

		model[56] = new ModelRendererTurbo(this, 110, 58, textureX, textureY);
		model[56].addBox(0, 0, 0, 1, 1, 3, 0f);
		model[56].setRotationPoint(-47.0f, -16.0f, -9.0f);

		model[57] = new ModelRendererTurbo(this, 31, 58, textureX, textureY);
		model[57].addBox(0, 0, 0, 1, 1, 3, 0f);
		model[57].setRotationPoint(-47.0f, -23.0f, -9.0f);

		model[58] = new ModelRendererTurbo(this, 500, 76, textureX, textureY);
		model[58].addBox(-1, 0, 0, 1, 4, 1, 0f);
		model[58].setRotationPoint(43.0f, -31.0f, 8.0f);

		model[59] = new ModelRendererTurbo(this, 481, 6, textureX, textureY);
		model[59].addBox(0, 0, 0, 7, 2, 2, 0f);
		model[59].setRotationPoint(-50.0f, 0.0f, -1.0f);

		model[60] = new ModelRendererTurbo(this, 389, 40, textureX, textureY);
		model[60].addBox(0, 0, 0, 2, 0, 1, 0f);
		model[60].setRotationPoint(-42.0f, -31.0f, -9.0f);

		model[61] = new ModelRendererTurbo(this, 447, 46, textureX, textureY);
		model[61].addBox(0, 0, 0, 1, 0, 2, 0f);
		model[61].setRotationPoint(-43.0f, -31.0f, -11.0f);

		model[62] = new ModelRendererTurbo(this, 378, 45, textureX, textureY);
		model[62].addBox(0, 0, 0, 1, 0, 2, 0f);
		model[62].setRotationPoint(-43.0f, -31.0f, -8.0f);

		model[63] = new ModelRendererTurbo(this, 403, 44, textureX, textureY);
		model[63].addShapeBox(0, 0, 0, 2, 0, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		model[63].setRotationPoint(-45.0f, -31.0f, -6.0f);
		model[63].rotateAngleY = 1.5707964f;

		model[64] = new ModelRendererTurbo(this, 396, 44, textureX, textureY);
		model[64].addShapeBox(0, 0, 0, 2, 0, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		model[64].setRotationPoint(-40.0f, -31.0f, -6.0f);
		model[64].rotateAngleY = 3.1415927f;

		model[65] = new ModelRendererTurbo(this, 389, 44, textureX, textureY);
		model[65].addShapeBox(0, 0, 0, 2, 0, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		model[65].setRotationPoint(-40.0f, -31.0f, -11.0f);
		model[65].rotateAngleY = 4.712389f;

		model[66] = new ModelRendererTurbo(this, 505, 25, textureX, textureY);
		model[66].addBox(0, 0, 0, 1, 0, 2, 0f);
		model[66].setRotationPoint(42.0f, -31.0f, 6.0f);

		model[67] = new ModelRendererTurbo(this, 505, 9, textureX, textureY);
		model[67].addBox(0, 0, 0, 1, 0, 2, 0f);
		model[67].setRotationPoint(42.0f, -31.0f, 9.0f);

		model[68] = new ModelRendererTurbo(this, 450, 28, textureX, textureY);
		model[68].addBox(0, 0, 0, 2, 0, 1, 0f);
		model[68].setRotationPoint(40.0f, -31.0f, 8.0f);

		model[69] = new ModelRendererTurbo(this, 391, 9, textureX, textureY);
		model[69].addBox(0, 0, 0, 2, 0, 1, 0f);
		model[69].setRotationPoint(43.0f, -31.0f, 8.0f);

		model[70] = new ModelRendererTurbo(this, 485, 46, textureX, textureY);
		model[70].addShapeBox(0, 0, 0, 2, 3, 11, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[70].setRotationPoint(-45.0f, -30.0f, -12.0f);

		model[71] = new ModelRendererTurbo(this, 373, 44, textureX, textureY);
		model[71].addShapeBox(0, 0, 0, 2, 0, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		model[71].setRotationPoint(45.0f, -31.0f, 11.0f);
		model[71].rotateAngleY = 3.1415927f;

		model[72] = new ModelRendererTurbo(this, 366, 44, textureX, textureY);
		model[72].addShapeBox(0, 0, 0, 2, 0, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		model[72].setRotationPoint(45.0f, -31.0f, 6.0f);
		model[72].rotateAngleY = 4.712389f;

		model[73] = new ModelRendererTurbo(this, 500, 8, textureX, textureY);
		model[73].addShapeBox(0, 0, 0, 2, 0, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		model[73].setRotationPoint(40.0f, -31.0f, 11.0f);
		model[73].rotateAngleY = 1.5707964f;

		model[74] = new ModelRendererTurbo(this, 470, 6, textureX, textureY);
		model[74].addShapeBox(0, 0, 0, 2, 0, 2, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
		model[74].setRotationPoint(40.0f, -31.0f, 6.0f);

		model[75] = new ModelRendererTurbo(this, 53, 69, textureX, textureY);
		model[75].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[75].setRotationPoint(-44.0f, -1.0f, -12.0f);

		model[76] = new ModelRendererTurbo(this, 48, 69, textureX, textureY);
		model[76].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0);
		model[76].setRotationPoint(-32.0f, -26.0f, -12.0f);

		model[77] = new ModelRendererTurbo(this, 491, 68, textureX, textureY);
		model[77].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0);
		model[77].setRotationPoint(-30.0f, -26.0f, -12.0f);

		model[78] = new ModelRendererTurbo(this, 177, 68, textureX, textureY);
		model[78].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[78].setRotationPoint(-19.0f, -1.0f, -12.0f);

		model[79] = new ModelRendererTurbo(this, 172, 68, textureX, textureY);
		model[79].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0);
		model[79].setRotationPoint(-17.0f, -26.0f, -12.0f);

		model[80] = new ModelRendererTurbo(this, 98, 68, textureX, textureY);
		model[80].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[80].setRotationPoint(9.0f, -1.0f, -12.0f);

		model[81] = new ModelRendererTurbo(this, 36, 68, textureX, textureY);
		model[81].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0);
		model[81].setRotationPoint(25.0f, -26.0f, -12.0f);

		model[82] = new ModelRendererTurbo(this, 31, 68, textureX, textureY);
		model[82].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0);
		model[82].setRotationPoint(27.0f, -26.0f, -12.0f);

		model[83] = new ModelRendererTurbo(this, 93, 67, textureX, textureY);
		model[83].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0);
		model[83].setRotationPoint(43.0f, -1.0f, -12.0f);

		model[84] = new ModelRendererTurbo(this, 506, 66, textureX, textureY);
		model[84].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[84].setRotationPoint(43.0f, -1.0f, 11.0f);

		model[85] = new ModelRendererTurbo(this, 501, 66, textureX, textureY);
		model[85].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, -1, -0.5f, 0, 0, -0.5f);
		model[85].setRotationPoint(31.0f, -26.0f, 11.0f);

		model[86] = new ModelRendererTurbo(this, 40, 66, textureX, textureY);
		model[86].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f);
		model[86].setRotationPoint(29.0f, -26.0f, 11.0f);

		model[87] = new ModelRendererTurbo(this, 507, 61, textureX, textureY);
		model[87].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[87].setRotationPoint(18.0f, -1.0f, 11.0f);

		model[88] = new ModelRendererTurbo(this, 491, 61, textureX, textureY);
		model[88].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[88].setRotationPoint(16.0f, -1.0f, 11.0f);

		model[89] = new ModelRendererTurbo(this, 164, 60, textureX, textureY);
		model[89].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[89].setRotationPoint(-10.0f, -1.0f, 11.0f);

		model[90] = new ModelRendererTurbo(this, 361, 56, textureX, textureY);
		model[90].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, -1, -0.5f, 0, 0, -0.5f);
		model[90].setRotationPoint(-26.0f, -26.0f, 11.0f);

		model[91] = new ModelRendererTurbo(this, 480, 46, textureX, textureY);
		model[91].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f);
		model[91].setRotationPoint(-28.0f, -1.0f, 11.0f);

		model[92] = new ModelRendererTurbo(this, 381, 42, textureX, textureY);
		model[92].addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, -1, -0.5f, 0, 0, -0.5f);
		model[92].setRotationPoint(-44.0f, -26.0f, 11.0f);

		model[93] = new ModelRendererTurbo(this, 470, 3, textureX, textureY);
		model[93].addBox(0, 0, 0, 13, 1, 1, 0f);
		model[93].setRotationPoint(-36.0f, 6.0f, -0.5f);

		model[94] = new ModelRendererTurbo(this, 470, 0, textureX, textureY);
		model[94].addBox(0, 0, 0, 13, 1, 1, 0f);
		model[94].setRotationPoint(23.0f, 6.0f, -0.5f);

		model[95] = new ModelRendererTurbo(this, 198, 76, textureX, textureY);
		model[95].addBox(0, 0, 0, 1, 5, 1, 0f);
		model[95].setRotationPoint(-30.0f, 1.0f, -0.5f);

		model[96] = new ModelRendererTurbo(this, 193, 76, textureX, textureY);
		model[96].addBox(0, 0, 0, 1, 5, 1, 0f);
		model[96].setRotationPoint(29.0f, 1.0f, -0.5f);

		model[97] = new ModelRendererTurbo(this, 352, 56, textureX, textureY);
		model[97].addBox(0, 0, 0, 3, 3, 1, 0f);
		model[97].setRotationPoint(-38.0f, 5.0f, -8.0f);

		model[98] = new ModelRendererTurbo(this, 501, 52, textureX, textureY);
		model[98].addBox(0, 0, 0, 3, 3, 1, 0f);
		model[98].setRotationPoint(-24.0f, 5.0f, -8.0f);

		model[99] = new ModelRendererTurbo(this, 352, 73, textureX, textureY);
		model[99].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		model[99].setRotationPoint(-20.0f, 4.0f, -7.0f);

		model[100] = new ModelRendererTurbo(this, 359, 66, textureX, textureY);
		model[100].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		model[100].setRotationPoint(-41.0f, 4.0f, 6.0f);

		model[101] = new ModelRendererTurbo(this, 352, 66, textureX, textureY);
		model[101].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		model[101].setRotationPoint(-20.0f, 4.0f, 6.0f);

		model[102] = new ModelRendererTurbo(this, 485, 38, textureX, textureY);
		model[102].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[102].setRotationPoint(-39.0f, 7.0f, -7.0f);

		model[103] = new ModelRendererTurbo(this, 467, 38, textureX, textureY);
		model[103].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[103].setRotationPoint(-25.0f, 7.0f, -7.0f);

		model[104] = new ModelRendererTurbo(this, 454, 38, textureX, textureY);
		model[104].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[104].setRotationPoint(-25.0f, 4.0f, -7.0f);

		model[105] = new ModelRendererTurbo(this, 437, 36, textureX, textureY);
		model[105].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[105].setRotationPoint(-39.0f, 4.0f, -7.0f);

		model[106] = new ModelRendererTurbo(this, 419, 36, textureX, textureY);
		model[106].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[106].setRotationPoint(-39.0f, 7.0f, 6.0f);

		model[107] = new ModelRendererTurbo(this, 406, 36, textureX, textureY);
		model[107].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[107].setRotationPoint(-25.0f, 7.0f, 6.0f);

		model[108] = new ModelRendererTurbo(this, 389, 36, textureX, textureY);
		model[108].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[108].setRotationPoint(-25.0f, 4.0f, 6.0f);

		model[109] = new ModelRendererTurbo(this, 485, 51, textureX, textureY);
		model[109].addBox(0, 0, 0, 3, 3, 1, 0f);
		model[109].setRotationPoint(-38.0f, 5.0f, 7.0f);

		model[110] = new ModelRendererTurbo(this, 501, 47, textureX, textureY);
		model[110].addBox(0, 0, 0, 3, 3, 1, 0f);
		model[110].setRotationPoint(-24.0f, 5.0f, 7.0f);

		model[111] = new ModelRendererTurbo(this, 162, 63, textureX, textureY);
		model[111].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		model[111].setRotationPoint(39.0f, 4.0f, -7.0f);

		model[112] = new ModelRendererTurbo(this, 155, 63, textureX, textureY);
		model[112].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		model[112].setRotationPoint(39.0f, 4.0f, 6.0f);

		model[113] = new ModelRendererTurbo(this, 117, 63, textureX, textureY);
		model[113].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		model[113].setRotationPoint(18.0f, 4.0f, 6.0f);

		model[114] = new ModelRendererTurbo(this, 110, 63, textureX, textureY);
		model[114].addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		model[114].setRotationPoint(18.0f, 4.0f, -7.0f);

		model[115] = new ModelRendererTurbo(this, 437, 32, textureX, textureY);
		model[115].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[115].setRotationPoint(34.0f, 7.0f, 6.0f);

		model[116] = new ModelRendererTurbo(this, 389, 32, textureX, textureY);
		model[116].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[116].setRotationPoint(34.0f, 4.0f, 6.0f);

		model[117] = new ModelRendererTurbo(this, 437, 28, textureX, textureY);
		model[117].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[117].setRotationPoint(34.0f, 4.0f, -7.0f);

		model[118] = new ModelRendererTurbo(this, 389, 28, textureX, textureY);
		model[118].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[118].setRotationPoint(34.0f, 7.0f, -7.0f);

		model[119] = new ModelRendererTurbo(this, 198, 24, textureX, textureY);
		model[119].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[119].setRotationPoint(20.0f, 4.0f, -7.0f);

		model[120] = new ModelRendererTurbo(this, 185, 24, textureX, textureY);
		model[120].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[120].setRotationPoint(20.0f, 7.0f, -7.0f);

		model[121] = new ModelRendererTurbo(this, 485, 46, textureX, textureY);
		model[121].addBox(0, 0, 0, 3, 3, 1, 0f);
		model[121].setRotationPoint(21.0f, 5.0f, -8.0f);

		model[122] = new ModelRendererTurbo(this, 501, 42, textureX, textureY);
		model[122].addBox(0, 0, 0, 3, 3, 1, 0f);
		model[122].setRotationPoint(35.0f, 5.0f, -8.0f);

		model[123] = new ModelRendererTurbo(this, 203, 5, textureX, textureY);
		model[123].addBox(0, 0, 0, 3, 3, 1, 0f);
		model[123].setRotationPoint(35.0f, 5.0f, 7.0f);

		model[124] = new ModelRendererTurbo(this, 203, 0, textureX, textureY);
		model[124].addBox(0, 0, 0, 3, 3, 1, 0f);
		model[124].setRotationPoint(21.0f, 5.0f, 7.0f);

		model[125] = new ModelRendererTurbo(this, 499, 4, textureX, textureY);
		model[125].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[125].setRotationPoint(20.0f, 4.0f, 6.0f);

		model[126] = new ModelRendererTurbo(this, 499, 0, textureX, textureY);
		model[126].addBox(0, 0, 0, 5, 2, 1, 0f);
		model[126].setRotationPoint(20.0f, 7.0f, 6.0f);

		model[127] = new ModelRendererTurbo(this, 79, 58, textureX, textureY);
		model[127].addBox(0, 0, 0, 9, 6, 1, 0f);
		model[127].setRotationPoint(-34.0f, 3.5f, -7.0f);

		model[128] = new ModelRendererTurbo(this, 203, 14, textureX, textureY);
		model[128].addBox(0, 0, 0, 9, 6, 1, 0f);
		model[128].setRotationPoint(-34.0f, 3.5f, 6.0f);

		model[129] = new ModelRendererTurbo(this, 0, 8, textureX, textureY);
		model[129].addBox(0, 0, 0, 9, 6, 1, 0f);
		model[129].setRotationPoint(25.0f, 3.5f, 6.0f);

		model[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		model[130].addBox(0, 0, 0, 9, 6, 1, 0f);
		model[130].setRotationPoint(25.0f, 3.5f, -7.0f);

		model[131] = new ModelRendererTurbo(this, 468, 30, textureX, textureY);
		model[131].addBox(0, 0, 0, 1, 1, 14, 0f);
		model[131].setRotationPoint(41.0f, 6.0f, -7.0f);

		model[132] = new ModelRendererTurbo(this, 437, 30, textureX, textureY);
		model[132].addBox(0, 0, 0, 1, 1, 14, 0f);
		model[132].setRotationPoint(17.0f, 6.0f, -7.0f);

		model[133] = new ModelRendererTurbo(this, 420, 28, textureX, textureY);
		model[133].addBox(0, 0, 0, 1, 1, 14, 0f);
		model[133].setRotationPoint(-18.0f, 6.0f, -7.0f);

		model[134] = new ModelRendererTurbo(this, 389, 28, textureX, textureY);
		model[134].addBox(0, 0, 0, 1, 1, 14, 0f);
		model[134].setRotationPoint(-42.0f, 6.0f, -7.0f);

		model[135] = new ModelRendererTurbo(this, 462, 24, textureX, textureY);
		model[135].addBox(0, 0, 0, 21, 1, 1, 0f);
		model[135].setRotationPoint(-10.5f, 6.0f, 10.0f);

		model[136] = new ModelRendererTurbo(this, 119, 74, textureX, textureY);
		model[136].addBox(0, 0, 0, 1, 5, 1, 0f);
		model[136].setRotationPoint(-7.0f, 1.0f, 10.0f);

		model[137] = new ModelRendererTurbo(this, 114, 74, textureX, textureY);
		model[137].addBox(0, 0, 0, 1, 5, 1, 0f);
		model[137].setRotationPoint(6.0f, 1.0f, 10.0f);

		model[138] = new ModelRendererTurbo(this, 381, 35, textureX, textureY);
		model[138].addBox(0, 0, 0, 1, 5, 1, 0f);
		model[138].setRotationPoint(6.0f, 1.0f, -11.0f);

		model[139] = new ModelRendererTurbo(this, 381, 28, textureX, textureY);
		model[139].addBox(0, 0, 0, 1, 5, 1, 0f);
		model[139].setRotationPoint(-7.0f, 1.0f, -11.0f);

		model[140] = new ModelRendererTurbo(this, 161, 38, textureX, textureY);
		model[140].addBox(0, 0, 0, 1, 1, 20, 0f);
		model[140].setRotationPoint(4.0f, 6.0f, -10.0f);

		model[141] = new ModelRendererTurbo(this, 366, 28, textureX, textureY);
		model[141].addBox(0, 0, 0, 1, 1, 20, 0f);
		model[141].setRotationPoint(-5.0f, 6.0f, -10.0f);

		model[142] = new ModelRendererTurbo(this, 48, 58, textureX, textureY);
		model[142].addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, -5, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, -5, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0);
		model[142].setRotationPoint(10.5f, 1.0f, 10.0f);

		model[143] = new ModelRendererTurbo(this, 485, 30, textureX, textureY);
		model[143].addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, -5, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, -5, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0);
		model[143].setRotationPoint(10.5f, 1.0f, -11.0f);

		model[144] = new ModelRendererTurbo(this, 454, 30, textureX, textureY);
		model[144].addShapeBox(0, 0, 0, 11, 6, 1, 0, -1.75f, 0, 0, 0, -5, 0, 0, -5, 0, -1.75f, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0);
		model[144].setRotationPoint(-21.5f, 1.0f, 10.0f);

		model[145] = new ModelRendererTurbo(this, 406, 28, textureX, textureY);
		model[145].addShapeBox(0, 0, 0, 11, 6, 1, 0, -1.75f, 0, 0, 0, -5, 0, 0, -5, 0, -1.75f, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0);
		model[145].setRotationPoint(-21.5f, 1.0f, -11.0f);

		flipAll();
	}

}