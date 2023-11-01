//FMT-Marker DFM-1.0
//Creator: Ondar

package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.library.Ctyrk4AddonInfo;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelZSSK350 extends ModelConverter {

	private int textureX = 512;
	private int textureY = 256;

	public ModelZSSK350() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[60];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelCD151Bogie bogie = new ModelCD151Bogie();
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale){
		for (ModelRendererTurbo mrt : bodyModel){
			if(mrt.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				mrt.render(scale,false);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				mrt.render(scale,false);
			}
		}

		Tessellator.bindTexture(new ResourceLocation(Ctyrk4AddonInfo.resourceLocation, Ctyrk4AddonInfo.trainsPrefix +"cd151_front_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(-2.15f,0.3f,-0.4f);
		bogie.render(entity, f0, f1, f2, f3, f4, scale);
		GL11.glTranslatef(3.1f,0f,0);
		bogie.render(entity, f0, f1, f2, f3, f4, scale);
		GL11.glPopMatrix();
	}

	private void initbodyModel_1(){
		bodyModel = new ModelRendererTurbo[58];
		//
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[0].addBox(0, 0, 0, 53, 24, 22, 0f);
		bodyModel[0].setRotationPoint(-27.0f, -20.0f, -11.0f);

		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 1
		bodyModel[1].addShapeBox(0, 0, 0, 53, 3, 22, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[1].setRotationPoint(-27.0f, -23.0f, -11.0f);

		bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 2
		bodyModel[2].addShapeBox(0, 0, 0, 19, 6, 22, 0, 0, 1, -4, 0, 1, -4, 0, 1, -4, 0, 1, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[2].setRotationPoint(-10.0f, -26.0f, -11.0f);

		bodyModel[3] = new ModelRendererTurbo(this, 363, 59, textureX, textureY); // Box 3
		bodyModel[3].addBox(0, 0, 0, 12, 2, 22, 0f);
		bodyModel[3].setRotationPoint(-6.5f, 4.0f, -11.0f);

		bodyModel[4] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 4
		bodyModel[4].addShapeBox(0, 0, 0, 10, 3, 22, 0, 0, 0, -3, 1, -2, 0, 1, -2, 0, 0, 0, -3, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0);
		bodyModel[4].setRotationPoint(26.0f, -23.0f, -11.0f);

		bodyModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 5
		bodyModel[5].addBox(0, 0, 0, 8, 2, 10, 0f);
		bodyModel[5].setRotationPoint(18.0f, -25.0f, -5.0f);

		bodyModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		bodyModel[6].addBox(0, 0, 0, 8, 2, 10, 0f);
		bodyModel[6].setRotationPoint(-27.0f, -25.0f, -5.0f);

		bodyModel[7] = new ModelRendererTurbo(this, 373, 5, textureX, textureY); // Box 7
		bodyModel[7].addBox(0, 0, 0, 4, 4, 8, 0f);
		bodyModel[7].setRotationPoint(28.0f, -8.0f, -4.0f);

		bodyModel[8] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 8
		bodyModel[8].addShapeBox(0, 0, 0, 10, 3, 22, 0, 1, -2, -1, 0, 0, -3, 0, 0, -3, 1, -2, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0);
		bodyModel[8].setRotationPoint(-37.0f, -23.0f, -11.0f);

		bodyModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 9
		bodyModel[9].addBox(0, 0, 0, 12, 16, 1, 0f);
		bodyModel[9].setRotationPoint(26.0f, -20.0f, 10.0f);

		bodyModel[10] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 10
		bodyModel[10].addShapeBox(0, -3, 0, 5, 9, 20, 0, 0, -1, 0, 0, -4, 0, 0, -4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[10].setRotationPoint(-42.0f, -10.0f, -10.0f);

		bodyModel[11] = new ModelRendererTurbo(this, 373, 5, textureX, textureY); // Box 11
		bodyModel[11].addBox(0, 0, 0, 4, 4, 8, 0f);
		bodyModel[11].setRotationPoint(-33.0f, -8.0f, -4.0f);

		bodyModel[12] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 12
		bodyModel[12].addBox(0, 0, 0, 12, 8, 22, 0f);
		bodyModel[12].setRotationPoint(26.0f, -4.0f, -11.0f);

		bodyModel[13] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 13
		bodyModel[13].addBox(0, 0, 0, 12, 16, 1, 0f);
		bodyModel[13].setRotationPoint(26.0f, -20.0f, -11.0f);

		bodyModel[14] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 14
		bodyModel[14].addShapeBox(0, 0, 0, 0, 5, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0);
		bodyModel[14].setRotationPoint(38.0f, 4.0f, -11.0f);

		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[15].addShapeBox(0, 0, 0, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[15].setRotationPoint(29.0f, 4.0f, 11.0f);

		bodyModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 16
		bodyModel[16].addShapeBox(0, 0, 0, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[16].setRotationPoint(29.0f, 4.0f, -11.0f);

		bodyModel[17] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 18
		bodyModel[17].addBox(0, 0, 0, 12, 16, 1, 0f);
		bodyModel[17].setRotationPoint(-39.0f, -20.0f, -11.0f);

		bodyModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 19
		bodyModel[18].addBox(0, 0, 0, 12, 8, 22, 0f);
		bodyModel[18].setRotationPoint(-39.0f, -4.0f, -11.0f);

		bodyModel[19] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 20
		bodyModel[19].addBox(0, 0, 0, 12, 16, 1, 0f);
		bodyModel[19].setRotationPoint(-39.0f, -20.0f, 10.0f);

		bodyModel[20] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 21
		bodyModel[20].addShapeBox(0, 0, 0, 0, 5, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0);
		bodyModel[20].setRotationPoint(-39.0f, 4.0f, -11.0f);

		bodyModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
		bodyModel[21].addShapeBox(0, 0, 0, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[21].setRotationPoint(-35.0f, 4.0f, -11.0f);

		bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 23
		bodyModel[22].addShapeBox(0, 0, 0, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[22].setRotationPoint(-35.0f, 4.0f, 11.0f);

		bodyModel[23] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 24
		bodyModel[23].addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0);
		bodyModel[23].setRotationPoint(-27.0f, -25.0f, -1.0f);

		bodyModel[24] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 25
		bodyModel[24].addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0);
		bodyModel[24].setRotationPoint(-27.0f, -28.0f, -1.0f);

		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 26
		bodyModel[25].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[25].setRotationPoint(25.0f, -33.0f, -4.0f);

		bodyModel[26] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 27
		bodyModel[26].addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0);
		bodyModel[26].setRotationPoint(17.0f, -28.5f, -1.0f);

		bodyModel[27] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 28
		bodyModel[27].addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0);
		bodyModel[27].setRotationPoint(17.0f, -28.7f, -1.0f);

		bodyModel[28] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 29
		bodyModel[28].addBox(0, 0, 0, 1, 2, 8, 0f);
		bodyModel[28].setRotationPoint(-28.0f, -29.0f, -4.0f);

		bodyModel[29] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 30
		bodyModel[29].addShapeBox(0, -3, 0, 5, 9, 20, 0, 0, -4, 0, 0, -1, 0, 0, -1, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[29].setRotationPoint(36.0f, -10.0f, -10.0f);

		bodyModel[30] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 31
		bodyModel[30].addBox(0, 0, 0, 6, 14, 1, 0f);
		bodyModel[30].setRotationPoint(-36.0f, -18.0f, 10.0f);

		bodyModel[31] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 32
		bodyModel[31].addBox(0, 0, 0, 6, 14, 1, 0f);
		bodyModel[31].setRotationPoint(29.0f, -18.0f, 10.0f);

		bodyModel[32] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 33
		bodyModel[32].addBox(0, 0, 0, 6, 14, 1, 0f);
		bodyModel[32].setRotationPoint(-36.0f, -18.0f, -11.0f);

		bodyModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		bodyModel[33].addBox(0, 0, 0, 6, 14, 1, 0f);
		bodyModel[33].setRotationPoint(29.0f, -18.0f, -11.0f);

		bodyModel[34] = new ModelRendererTurbo(this, 153, 28, textureX, textureY); // Box 35
		bodyModel[34].addBox(0, 0, 0, 5, 2, 0, 0f);
		bodyModel[34].setRotationPoint(-3.0f, -8.0f, -11.0f);

		bodyModel[35] = new ModelRendererTurbo(this, 153, 28, textureX, textureY); // Box 36
		bodyModel[35].addBox(0, 0, 0, 5, 2, 0, 0f);
		bodyModel[35].setRotationPoint(-3.0f, -8.0f, 11.0f);

		bodyModel[36] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 37
		bodyModel[36].addShapeBox(0, 0, 0, 1, 8, 22, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, -4, 0, 0, -4, 0, 0, 3, 0, 0);
		bodyModel[36].setRotationPoint(41.0f, -4.0f, -11.0f);

		bodyModel[37] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 38
		bodyModel[37].addShapeBox(0, 0, 0, 1, 8, 22, 0, 3, 0, 0, -4, 0, 0, -4, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[37].setRotationPoint(41.0f, -20.0f, -11.0f);

		bodyModel[38] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 39
		bodyModel[38].addShapeBox(0, 0, 0, 1, 8, 22, 0, -4, 0, 0, 3, 0, 0, 3, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[38].setRotationPoint(-43.0f, -20.0f, -11.0f);

		bodyModel[39] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 40
		bodyModel[39].addBox(0, 0, 0, 1, 8, 22, 0f);
		bodyModel[39].setRotationPoint(41.0f, -12.0f, -11.0f);

		bodyModel[40] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 41
		bodyModel[40].addBox(0, 0, 0, 1, 8, 22, 0f);
		bodyModel[40].setRotationPoint(-43.0f, -12.0f, -11.0f);

		bodyModel[41] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 42
		bodyModel[41].addShapeBox(0, 0, 0, 1, 8, 22, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, -4, 0, 0, 3, 0, 0, 3, 0, 0, -4, 0, 0);
		bodyModel[41].setRotationPoint(-43.0f, -4.0f, -11.0f);

		bodyModel[42] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 43
		bodyModel[42].addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[42].setRotationPoint(38.0f, -20.0f, 10.0f);

		bodyModel[43] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 44
		bodyModel[43].addShapeBox(0, 0, 0, 3, 8, 1, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[43].setRotationPoint(38.0f, -20.0f, -11.0f);

		bodyModel[44] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 45
		bodyModel[44].addShapeBox(0, 0, 0, 3, 8, 1, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[44].setRotationPoint(-42.0f, -20.0f, 10.0f);

		bodyModel[45] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 46
		bodyModel[45].addShapeBox(0, 0, 0, 3, 8, 1, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		bodyModel[45].setRotationPoint(-42.0f, -20.0f, -11.0f);

		bodyModel[46] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // lamp
		bodyModel[46].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, 1, 0.3f, 0, 1, 0.3f, 0, -0.9f, 0, 0);
		bodyModel[46].setRotationPoint(-42.2f, -2.0f, 5.0f);

		bodyModel[47] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // lamp
		bodyModel[47].addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, 1, 0.3f, 0, 1, 0.3f, 0, -0.9f, 0, 0);
		bodyModel[47].setRotationPoint(-42.2f, -2.0f, -7.0f);

		bodyModel[48] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 49
		bodyModel[48].addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0.3f, 0, 1, 0.3f, 0, 1, 0.3f, 0, -1.2f, 0.3f, 0);
		bodyModel[48].setRotationPoint(-42.2f, -2.0f, -3.0f);

		bodyModel[49] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 50
		bodyModel[49].addShapeBox(-1, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0.3f, 0, -1, 0.3f, 0, -1, 0.3f, 0, 1.2f, 0.3f, 0);
		bodyModel[49].setRotationPoint(41.2f, -2.0f, -3.0f);

		bodyModel[50] = new ModelRendererTurbo(this, 369, 39, textureX, textureY); // Box 52
		bodyModel[50].addBox(0, 0, 0, 6, 2, 4, 0f);
		bodyModel[50].setRotationPoint(38.0f, 2.0f, -2.0f);

		bodyModel[51] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 53
		bodyModel[51].addBox(0, 0, 0, 6, 2, 4, 0f);
		bodyModel[51].setRotationPoint(-45.0f, 2.0f, -2.0f);

		bodyModel[52] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 54
		bodyModel[52].addBox(0, 0, 0, 3, 8, 1, 0f);
		bodyModel[52].setRotationPoint(38.0f, -12.0f, 10.0f);

		bodyModel[53] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 55
		bodyModel[53].addBox(0, 0, 0, 3, 8, 1, 0f);
		bodyModel[53].setRotationPoint(38.0f, -12.0f, -11.0f);

		bodyModel[54] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 56
		bodyModel[54].addBox(0, 0, 0, 3, 8, 1, 0f);
		bodyModel[54].setRotationPoint(-42.0f, -12.0f, 10.0f);

		bodyModel[55] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 57
		bodyModel[55].addBox(0, 0, 0, 3, 8, 1, 0f);
		bodyModel[55].setRotationPoint(-42.0f, -12.0f, -11.0f);

		bodyModel[56] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 58
		bodyModel[56].addShapeBox(0, 0, 0, 4, 2, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0);
		bodyModel[56].setRotationPoint(-10.5f, 4.0f, -11.0f);

		bodyModel[57] = new ModelRendererTurbo(this, 413, 52, textureX, textureY); // Box 59
		bodyModel[57].addShapeBox(0, 0, 0, 4, 2, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0);
		bodyModel[57].setRotationPoint(5.5f, 4.0f, -11.0f);

		flipAll();
	}

}
