package train.client.render.models;

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2023 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class U57TenderModel extends ModelConverter {

    private int textureX = 256;
    private int textureY = 128;

    public U57TenderModel(){
        bodyModel = new ModelRendererTurbo[55];
        initGroup_bodyModel();
        flipAll();
    }

    private final void initGroup_bodyModel(){
        bodyModel = new ModelRendererTurbo[1];
        bodyModel = new ModelRendererTurbo[25];
        //
        bodyModel[0] = new ModelRendererTurbo(this, 1, 106, textureX, textureY);
        bodyModel[0].addBox(0, -5, -5, 1, 10, 10, 0f);
        bodyModel[0].setRotationPoint(-7.0f, 6.0f, 13.0f);

        bodyModel[0] = new ModelRendererTurbo(this, 1, 106, textureX, textureY);
        bodyModel[0].addBox(0, -5, -5, 1, 10, 10, 0f);
        bodyModel[0].setRotationPoint(-7.0f, 6.0f, -13.0f);

        bodyModel[1] = new ModelRendererTurbo(this, 1, 106, textureX, textureY);
        bodyModel[1].addBox(-1, -5, -5, 1, 10, 10, 0f);
        bodyModel[1].setRotationPoint(7.0f, 6.0f, 13.0f);

        bodyModel[2] = new ModelRendererTurbo(this, 28, 117, textureX, textureY);
        bodyModel[2].addBox(0, 0, 0, 4, 4, 5, 0f);
        bodyModel[2].setRotationPoint(-2.0f, 6.0f, 19.0f);

        bodyModel[3] = new ModelRendererTurbo(this, 52, 76, textureX, textureY);
        bodyModel[3].addBox(-6, 3, -12, 16, 10, 40, 0f);
        bodyModel[3].setRotationPoint(-2.0f, -0.01f, -8.0f);

        bodyModel[4] = new ModelRendererTurbo(this, 71, 86, textureX, textureY);
        bodyModel[4].addBox(0, 0, 0, 1, 13, 5, 0f);
        bodyModel[4].setRotationPoint(10.0f, 13.0f, 18.0f);

        bodyModel[5] = new ModelRendererTurbo(this, 71, 86, textureX, textureY);
        bodyModel[5].addBox(0, 0, 0, 1, 13, 5, 0f);
        bodyModel[5].setRotationPoint(-11.0f, 13.0f, 18.0f);

        bodyModel[6] = new ModelRendererTurbo(this, 176, 77, textureX, textureY);
        bodyModel[6].addBox(0, 0, 0, 1, 7, 25, 0f);
        bodyModel[6].setRotationPoint(-11.0f, 28.0f, -10.0f);

        bodyModel[7] = new ModelRendererTurbo(this, 43, 98, textureX, textureY);
        bodyModel[7].addBox(-4, 0, -2, 4, 4, 2, 0f);
        bodyModel[7].setRotationPoint(-8.0f, 13.0f, -26.0f);
        bodyModel[7].rotateAngleY = -3.1415927f;

        bodyModel[8] = new ModelRendererTurbo(this, 43, 98, textureX, textureY);
        bodyModel[8].addBox(0, 0, -2, 4, 4, 2, 0f);
        bodyModel[8].setRotationPoint(8.0f, 13.0f, -26.0f);
        bodyModel[8].rotateAngleY = -3.1415927f;

        bodyModel[9] = new ModelRendererTurbo(this, 127, 102, textureX, textureY);
        bodyModel[9].addBox(0, 0, 0, 20, 7, 1, 0f);
        bodyModel[9].setRotationPoint(-10.0f, 28.0f, -10.0f);

        bodyModel[10] = new ModelRendererTurbo(this, 174, 77, textureX, textureY);
        bodyModel[10].addBox(0, 0, 0, 1, 7, 25, 0f);
        bodyModel[10].setRotationPoint(10.0f, 28.0f, -10.0f);

        bodyModel[11] = new ModelRendererTurbo(this, 127, 102, textureX, textureY);
        bodyModel[11].addBox(0, 0, 0, 20, 7, 1, 0f);
        bodyModel[11].setRotationPoint(-10.0f, 28.0f, 14.0f);

        bodyModel[12] = new ModelRendererTurbo(this, 1, 106, textureX, textureY);
        bodyModel[12].addBox(-1, -5, -5, 1, 10, 10, 0f);
        bodyModel[12].setRotationPoint(7.0f, 6.0f, -13.0f);

        bodyModel[13] = new ModelRendererTurbo(this, 65, 20, textureX, textureY);
        bodyModel[13].addBox(0, 0, 0, 20, 1, 23, 0f);
        bodyModel[13].setRotationPoint(-10.0f, 30.0f, -9.0f);

        bodyModel[14] = new ModelRendererTurbo(this, 131, 73, textureX, textureY);
        bodyModel[14].addBox(0, 0, 0, 1, 18, 4, 0f);
        bodyModel[14].setRotationPoint(-4.0f, 13.0f, -18.0f);
        bodyModel[14].rotateAngleY = 1.5707964f;

        bodyModel[15] = new ModelRendererTurbo(this, 170, 113, textureX, textureY);
        bodyModel[15].addBox(0, 0, 0, 22, 4, 9, 0f);
        bodyModel[15].setRotationPoint(-11.0f, 9.0f, -25.0f);

        bodyModel[16] = new ModelRendererTurbo(this, 137, 18, textureX, textureY);
        bodyModel[16].addBox(0, 0, 0, 22, 15, 35, 0f);
        bodyModel[16].setRotationPoint(-11.0f, 13.0f, -17.0f);

        bodyModel[17] = new ModelRendererTurbo(this, 24, 113, textureX, textureY);
        bodyModel[17].addBox(0, 0, 0, 4, 4, 9, 0f);
        bodyModel[17].setRotationPoint(-2.0f, 6.0f, -28.0f);

        bodyModel[18] = new ModelRendererTurbo(this, 204, 85, textureX, textureY);
        bodyModel[18].addBox(0, 0, 0, 18, 4, 4, 0f);
        bodyModel[18].setRotationPoint(-9.0f, 4.0f, -15.0f);

        bodyModel[19] = new ModelRendererTurbo(this, 43, 98, textureX, textureY);
        bodyModel[19].addBox(-2, 0, -2, 4, 4, 2, 0f);
        bodyModel[19].setRotationPoint(0.0f, 29.0f, -12.0f);
        bodyModel[19].rotateAngleY = -3.1415927f;

        bodyModel[20] = new ModelRendererTurbo(this, 1, 106, textureX, textureY);
        bodyModel[20].addBox(-1, -5, -5, 1, 10, 10, 0f);
        bodyModel[20].setRotationPoint(7.0f, 6.0f, 0.0f);

        bodyModel[21] = new ModelRendererTurbo(this, 1, 106, textureX, textureY);
        bodyModel[21].addBox(0, -5, -5, 1, 10, 10, 0f);
        bodyModel[21].setRotationPoint(-7.0f, 6.0f, 0.0f);

        bodyModel[22] = new ModelRendererTurbo(this, 204, 85, textureX, textureY);
        bodyModel[22].addBox(0, 0, 0, 18, 4, 4, 0f);
        bodyModel[22].setRotationPoint(-9.0f, 4.0f, -2.0f);

        bodyModel[23] = new ModelRendererTurbo(this, 170, 113, textureX, textureY);
        bodyModel[23].addBox(0, 0, 0, 22, 4, 9, 0f);
        bodyModel[23].setRotationPoint(-11.0f, 9.0f, 16.0f);

        bodyModel[24] = new ModelRendererTurbo(this, 204, 85, textureX, textureY);
        bodyModel[24].addBox(0, 0, 0, 18, 4, 4, 0f);
        bodyModel[24].setRotationPoint(-9.0f, 4.0f, 11.0f);

        flipAll();
    }

}
