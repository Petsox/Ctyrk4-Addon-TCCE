package cz.ctyrkaten.train.common.library;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cz.ctyrkaten.train.client.render.Ctyrk4RenderEnum;
import train.common.api.TrainRecord;
import train.common.api.TrainRenderRecord;
import train.common.api.TrainSoundRecord;
import train.common.Traincraft;

public class Ctyrk4Registry {

    public void registerTrainRecords() {
        for (TrainRecord train : Ctyrk4EnumTrains.trains()) {
            Traincraft.instance.traincraftRegistry.registerTrainRecord(train);
        }
    }

    public void registerRenderRecords() {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT) {
            for (TrainRenderRecord render : Ctyrk4RenderEnum.values()) {
                Traincraft.instance.traincraftRegistry.registerTrainRenderRecord(render);
            }
        }
    }

    public void registerSoundRecords() {
        for (TrainSoundRecord sound : Ctyrk4EnumSounds.values()) {
            Traincraft.instance.traincraftRegistry.registerTrainSoundRecord(sound);
        }
    }
}
