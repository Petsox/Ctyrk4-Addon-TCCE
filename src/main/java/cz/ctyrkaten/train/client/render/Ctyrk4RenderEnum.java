package cz.ctyrkaten.train.client.render;

import cz.ctyrkaten.train.client.render.models.*;
import cz.ctyrkaten.train.common.entity.rollingStock.*;
import cz.ctyrkaten.train.common.library.Ctyrk4AddonInfo;
import train.client.render.models.ModelDuewagGT6ZRLoco;
import train.common.api.EntityRollingStock;
import train.common.api.TrainRenderRecord;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;

public enum Ctyrk4RenderEnum implements TrainRenderRecord {
	//Ctyrk4 Pack
	PropagandaCzech(Ctyrk4EntityPropagandaCzech.class, new train.client.render.models.ModelPropagandaCar(), "propaganda_Czech_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaCtyrk4(Ctyrk4EntityPropaganda.class, new train.client.render.models.ModelPropagandaCar(), "propaganda_Ctyrk4_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD127(Ctyrk4EntityLocoElectricCD127.class, new ModelCD127(), "CD_127_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CD127Motor(Ctyrk4EntityCD127Motor.class, new ModelCD127Motor(),"CD_127_Motor_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ARR845(Ctyrk4EntityLocoDieselARR845.class, new train.client.render.models.ModelClass175(), "ARR845_", true, new float[]{-2.25f,-0.127f,0}, new float[] {0, 180, 180}, null , "smoke", 1,  null, "", null, 0, false),
	passengerCSDBP920(Ctyrk4EntityPassengerCSDBP920.class, new train.client.render.models.ModelGS4Passenger(), "BP920",false, new float[] { 0.0F, 0.03F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerCDBDMTEEO(Ctyrk4EntityPassengerCDBDMTEEO.class, new train.client.render.models.ModelGS4Passenger(), "CD_Bdmteeo_",true, new float[] { 0.0F, 0.03F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerCDA149(Ctyrk4EntityPassengerCDA149.class, new ModelCDA149(), "CD_A149_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDB249(Ctyrk4EntityPassengerCDB249.class, new ModelCDB249(), "CD_B249_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDBDs(Ctyrk4EntityPassengerCDBDS.class, new ModelCDBDS(), "CD_BDs_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDDS(Ctyrk4EntityFreightCDDS.class, new ModelCDDS(), "CD_Ds_", true, new float[] { -1.0F, 0.15F, -0.05F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDWRMZ(Ctyrk4EntityPassengerCDWRMZ.class, new ModelCDWRMZ(), "CD_WRMz_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerMVZSV2(Ctyrk4EntityPassengerMVZSV2.class, new ModelMVZSV2(), "MVZSV2_", true, new float[] { 0.05F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDBDTN( Ctyrk4EntityPassengerCDBDTN.class, new train.client.render.models.ModelBR_MK2F_Coach(), "CD_Bdtn_", true, new float[] {0.5F,0F,0F}, new float[] {0F, 180F, 180F}, new float[] {1.4F,1F,1F}, "",0,null, "", null, 0, false),
	locoGP40(Ctyrk4EntityLocoDieselCD742.class, new ModelGP40(), "cd742_", true, new float[] { -0.8F, 0.75F, 0.0F }, new float[] { 180F, 180F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.25D, 1.15D, 0.0D });
		}
	}, "", null, 0, false),
	locoCD720(Ctyrk4EntityLocoDieselCD720.class,  new ModelCD720(), "CD720_", true,new float[] {-1.1F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.9D, 1.45D, -0.16D});
			add(new double[]{1.9D, 1.45D, 0.16D});
		}
	}, "", null, 0, false),
	locoCD242(Ctyrk4EntityLocoElectricCD242.class, new ModelCD242(), "CD_242_", true, new float[] { -1.7F, 0.05F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.9f}, "",0,null, "", null, 0, false),
	locoCD100(Ctyrk4EntityLocoElectricCD100.class, new ModelCD100(), "CD_100_", true, new float[] { -1.7F, 0.05F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.9f}, "",0,null, "", null, 0, false),
	locoCD140(Ctyrk4EntityLocoElectricCD140.class, new ModelCD140(), "CD_140_", true, new float[] { -1.7F, 0.05F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.9f}, "",0,null, "", null, 0, false),

	locoZSSK131(Ctyrk4EntityLocoElectricZSSK131.class, new ModelZSSK131(), "ZSSK131_", true, new float[] { -1.2F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoZSSKC131(Ctyrk4EntityLocoElectricZSSKC131.class, new ModelZSSKC131(), "ZSSKC131_", true, new float[] { -1.8F, 0.05F, 0.0F }, new float[] { 180F, 0F, 0F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	locoCD151(Ctyrk4EntityLocoElectricCD151.class, new ModelLocoCD151(), "CD151_", true, new float[]{-2,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoZSSK350(Ctyrk4EntityLocoElectricZSSK350.class, new ModelZSSK350(), "ZSSK350_", true, new float[]{-2,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoCD362(Ctyrk4EntityLocoElectricCD362.class, new ModelCD362(), "CD362_", true, new float[]{-2.125F,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoCD363(Ctyrk4EntityLocoElectricCD363.class, new ModelCD363(), "CD363_", true, new float[]{-2.125F,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoZSSK361(Ctyrk4EntityLocoElectricZSSK361.class, new ModelZSSK362(), "ZSSK361_", true, new float[]{-2.125F,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoZSSK362(Ctyrk4EntityLocoElectricZSSK362.class, new ModelCD362(), "ZSSK362_", true, new float[]{-2.125F,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoZSSK363(Ctyrk4EntityLocoElectricZSSK363.class, new ModelZSSK363(), "ZSSK363_", true, new float[]{-2.125F,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoCD751(Ctyrk4EntityLocoDieselCD751.class, new ModelCD751(), "CD_751_", true, new float[] { -3.1F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.42D, 1.45D, 0.0D });
		}
	}, "", null, 0, false),
	locoCD754(Ctyrk4EntityLocoDieselCD754.class, new ModelCD754(), "CD_754_", true, new float[] { -3.1F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.42D, 1.45D, 0.0D });
		}
	}, "", null, 0, false),
	locoCD451(Ctyrk4EntityLocoElectricCD451Motor.class, new ModelCD451(), "CD451", false, new float[] { -1.65F, 0.1F, 0.05F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoElectricCD471Motor(Ctyrk4EntityLocoElectricCD471Motor.class, new ModelCD471Loco(), "CD471_loco_", true, new float[] { -2.1F, 0.1F, 0.0F },   new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	locoElectricCD471Tail(Ctyrk4EntityLocoElectricCD471Tail.class, new ModelCD471Tail(), "CD471_passenger_", true, new float[] { -2.1F, 0.1F, 0.0F },   new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCD471Coach(Ctyrk4EntityPassengerCD471Coach.class, new ModelCD471Coach(), "CD471_passenger_", true, new float[] { -0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoElectricCD470Motor(Ctyrk4EntityLocoElectricCD470Motor.class, new ModelCD470Loco(), "CD470_loco_", true, new float[] { -1.9F, 0.1F, 0.0F },   new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCD470Coach(Ctyrk4EntityPassengerCD470Coach.class, new ModelCD470Coach(), "CD470_passenger_", true, new float[] { -0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCD451Coach(Ctyrk4EntityPassengerCD451Coach.class, new ModelCD451Coach(), "CD451Coach", false, new float[] { -0.4F, 0.1F, 0.02F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCD014(Ctyrk4EntityPassengerCD014.class, new ModelCD014(), "cd014_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCD010(Ctyrk4EntityPassengerCD010.class, new ModelCD010(), "cd010_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD814(Ctyrk4EntityLocoDieselCD814.class, new ModelCD814(), "cd814_", true, new float[] { -0.8F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD914(Ctyrk4EntityLocoDieselCD914.class, new ModelCD914(), "cd_914_", true, new float[] { -0.8F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD810(Ctyrk4EntityLocoDieselCD810.class, new ModelCD810(), "cd810_", true, new float[] { -0.8F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD812(Ctyrk4EntityLocoDieselCD812.class, new ModelCD812(), "CD812", false, new float[] {0.2F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD854(Ctyrk4EntityLocoDieselCD854.class, new ModelCD854(), "CD854_", true, new float[] { -1.6F, 0.15F, -0.68F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD954(Ctyrk4EntityLocoDieselCD954.class, new ModelCD954(), "CD954_", true, new float[] { -1F, 0.15F, -0.68F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCDEMU460(Ctyrk4EntityLocoElectricCD460.class, new ModelCD460_Loco(), "CD_460_", true, new float[] { -1.9F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerCDEMU460(Ctyrk4EntityPassengerCD460Coach.class, new ModelCD460_Coach(), "CD_460_", true, new float[] { -0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCD843( Ctyrk4EntityLocoDieselCD843.class, new ModelCD843(), "CD843_", true, new float[] {-2.1F, -0.5F, 0F}, new float[] {0F, 180F, 180F }, new float[] {0.8F, 0.8F, 0.8F}, "smoke", 3,  new ArrayList<double[]>() {{}}, "", null, 0, false),
	CD383( Ctyrk4EntityLocoElectricCD383.class, new train.client.render.models.ModelNMBS_HLE_18(), "CD383_", true, new float[]{-1.5F,0.05F,0}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ZSSK383( Ctyrk4EntityLocoElectricZSSK383.class, new ModelZSSK383(), "ZSSK383_", true, new float[]{-1.5F,0.05F,0}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	tenderCSD387(Ctyrk4EntityTenderCSD387.class, new ModelCSD387Tender(), "CSD387_tender_", true,
			new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoSteamCSD387(Ctyrk4EntityLocoSteamCSD387.class, new ModelCSD387Locomotive(), "CSD387_engine_", true,
			new float[] { 0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 5.0D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 5.2D, -0.2D, 0.8D });
		}
	}, 2, false),
	tenderU57(Ctyrk4EntityTenderU57.class, new U57TenderModel(), "tenderU57", false, new float[] { 0.0F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.90F, 0.90F, 0.90F }, "", 0, null, "", null, 0, false),
	locoU57(Ctyrk4EntityLocoSteamU57.class, new ModelLocoU57(), "locoU57", false, new float[] {  0.0F, -0.5F, 0.0F }, new float[] { 180, 270, 180 },new float[] { 0.90F, 0.90F, 0.90F }, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.5D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.2, -0.5, 0.60D });
		}
	}, 2, true),
	CD704( Ctyrk4EntityLocoDieselCD704.class,  new ModelCD704(), "CD704_", true,new float[] {-0.5F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },null, "smoke", 2,  new ArrayList<double[]>() {
		{
			add(new double[]{0.55D, 1.0D, 0.0D});
		}
	}, "", null, 0, false),
	//CD708( Ctyrk4EntityLocoDieselCD708.class,  new ModelCD708(), "CD708_", true,new float[] {-0.5F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	/*CD714( Ctyrk4EntityLocoDieselCD714.class,  new ModelCD714(), "CD714_", true,new float[] {-0.90F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },new float[] {1.5F, 1.5F, 1F}, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.1D, 1.3D, 0.15D});
		}
	}, "", null, 0, false),*/
	locoCD111(Ctyrk4EntityLocoElectricCD111.class, new ModelCD111(), "CD_111_", true, new float[] { -1.3F, 0.1F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.70f}, "",0,null, "", null, 0, false),
	CDBDMTEEO(Ctyrk4EntityPassengerCDBBDGMEE236.class, new ModelCDBBDGMEE236(), "CD_Bbdgmee236_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	locoRE420(Ctyrk4EntityLocoElectricRE420.class, new ModelRE420(), "RE420_", true, new float[] { -1.7F, 0.05F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.9f}, "",0,null, "", null, 0, false),
	CDEAS11(Ctyrk4EntityFreightCDEAS11.class, new ModelCDEAS11(), "CDEAs11_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerCDAB349(Ctyrk4EntityPassengerCDAB349.class, new ModelCDAB349(), "CDAB349_", true, new float[] { 1.55F, 0.15F, -0.60F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerZSSK12(Ctyrk4EntityPassengerZSSK012.class, new ModelZSSK012(), "ZSSK012_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoZSSK812(Ctyrk4EntityLocoDieselZSSK812.class, new ModelZSSK812(), "ZSSK812_", true, new float[] { -0.8F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CD650Loco(Ctyrk4EntityLocoElectricCD650Loco.class, new ModelCD650(), "CD650_", true, new float[] {-3.5F, 0.3F, 0F}, new float[]{0F,180F,180F}, new float[] {1.2F, 1.1F, 1.1F}, "", 0, null, "", null, 0, false),
	CD651Loco(Ctyrk4EntityLocoElectricCD651Loco.class, new ModelCD651(), "CD651_", true, new float[] {-3.7F, 0.3F, 0F}, new float[]{0F,180F,180F}, new float[] {1.2F, 1.1F, 1.1F}, "", 0, null, "", null, 0, false),
	CD652(Ctyrk4EntityPassengerCD652.class, new ModelCD652(), "CD652_", true, new float[] {-1.3F, 0.3F, 0F}, new float[]{0F, 180F, 180F}, new float[] {1.2F, 1.1F, 1.1F}, "", 0, null, "", null, 0, false ),
	CDBFHPVEE295( Ctyrk4EntityElectricCDBFHPVEE295.class, new train.client.render.models.ModelClass321(),"CDBfhpvee295_", true, new float[] {-1.5F, -0.45F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	CDBDMTEE( Ctyrk4EntityPassengerCDBDMTEE.class, new train.client.render.models.ModelClass321Coach(),"Bdmtee_", true, new float[] {0.6F, -0.455F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	locoElectricM1(Ctyrk4EntityLocoElectricM1.class, new ModelM1end(), "M1_", true, new float[] { -1.9F, 0.15F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerM1Coach(Ctyrk4EntityPassengerM1Coach.class, new ModelM1middle(), "M1_", true, new float[] { -0.3F, 0.15F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	cabooseM1Tail(Ctyrk4EntityCabooseM1Tail.class, new ModelM1end(), "M1_", true, new float[] { 0.0F, 0.15F, 0.0F },   new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	loco8171M(Ctyrk4EntityLocoElectric8171MLoco.class, new Model8171MLoco(), "8171M_", true, new float[]{-1.9F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passenger8171Mid(Ctyrk4EntityPassenger8171MMid.class, new Model8171MCoach(), "8171M_", true, new float[] { -0.0F, 0.1F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passenger8171Tail(Ctyrk4EntityPassenger8171Tail.class, new Model8171MTail(), "8171M_", true, new float[] { 0.0F, 0.1F, 0.0F },   new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	locoElectricCD680(Ctyrk4EntityLocoElectricCD680.class, new train.client.render.models.ModelClass390Front(),"CD680_loco_", true, new float[] {-2.3F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	passengerCD680Coach(Ctyrk4EntityPassengerCD680Coach.class, new train.client.render.models.ModelClass390Coach(),"CD680_coach_", true, new float[] {0F, 0.F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	cabooseCD680Tail(Ctyrk4EntityPassengerCD680Tail.class, new train.client.render.models.ModelClass390Panto(),"CD680_tail_", true, new float[] {0F, 0.F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	locoCD715(Ctyrk4EntityLocoDieselCD715.class, new ModelCD715(), "CD715", false, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.75D, 1.7D, 0.0D });
		}
	}, "", null, 0, false),
	CDZAS30(Ctyrk4EntityCDZAS30.class, new ModelCDZAS30(), "CD_ZAS30_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	CDNP(Ctyrk4EntityCDNP.class, new ModelCDNP(), "CDNP_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	CDKNS(Ctyrk4EntityCDKNS.class, new ModelCDKNS(), "CDKNS_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	CDES11(Ctyrk4EntityCDES11.class, new ModelCDES11(), "CDES11_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	CSD464(Ctyrk4EntityCSD464.class, new ModelCSD464(), "CSD464_", true, new float[] {  -1.5F, 0.2F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 3.05D, 1.25D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.00D, 0.75D });
		}
	}, 3, true),
	T4(Ctyrk4EntityElectricT4.class, new ModelT4(), "T4_", true,new float[] {-1.25F, 0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ClassA16tender(Ctyrk4EntityTenderA16.class, new ModelA16Tender(), "A16_Tender_", true,
			new float[] { 0.0F, 0.1F, 0.0F }, new float[] { 180F, 0.0F, 0.0F }, null, "", 0, null, "", null, 0, false),
	ClassA16Loco(Ctyrk4EntityLocoSteamA16.class, new ModelA16Loco(), "A16_", true,
			new float[] { -4F, 0.1F, 0.0F }, new float[] { 180F, 180F, 0.0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 7.2D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 7.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	FLBox(Ctyrk4EntityFreightFLBox.class, new ModelFLBox(), "FLBox_", true, new float[] { 0.0F, 0.1F, 0.0F },  new float[] { 180F, 0.0F, 0.0F }, new float[] { 1.3F, 1.1F, 0.9F }, "", 0, null, "", null, 0, false),
	ClassTitantender(Ctyrk4EntityTenderTitan.class, new ModelClassTitanTender(), "Titan_Tender_", true,
			new float[] { 0.0F, 0F, 0.0F }, new float[] { 180F, 0.0F, 0.0F }, null, "", 0, null, "", null, 0, false),
	ClassTitanLoco(Ctyrk4EntityLocoSteamTitan.class, new ModelClassTitan(), "Titan_", true,
			new float[] { -3F, 0F, 0.0F }, new float[] { 180F, 180F, 0.0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 5.68D, 1.2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	SFTenderLarge(Ctyrk4EntityTenderSFLarge.class, new ModelSFTenderLarge(), "SFTenderLarge_", true,
			new float[] { 0.0F, 0F, 0.0F }, new float[] { 180F, 0.0F, 0.0F }, null, "", 0, null, "", null, 0, false),
	SF482(Ctyrk4EntityLocoSteamSF482.class, new ModelSF482(), "SF_4-8-2_", true,
			new float[] { -3F, 0F, 0.0F }, new float[] { 180F, 180F, 0.0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 5.35D, 1.2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	SDLow(Ctyrk4EntityLocoDieselSDLow.class, new ModelSDLow(), "SDLow_", true, new float[] { -1.65F, 0F, 0.0F }, new float[] { 180F, 180F, 0F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.1D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),
	SDHigh(Ctyrk4EntityLocoDieselSDHigh.class, new ModelSDHigh(), "SDHigh_", true, new float[] { -1.65F, 0F, 0.0F }, new float[] { 180F, 180F, 0F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.1D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),
	SDBUnit(Ctyrk4EntityLocoDieselSDBUnit.class, new ModelSDBUnit(), "SDBUnit_", true, new float[] { -1.65F, 0F, 0.0F }, new float[] { 180F, 180F, 0F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.1D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),
	SD(Ctyrk4EntityLocoDieselSD.class, new ModelSD(), "SD_", true, new float[] { -2.35F, 0F, 0.0F }, new float[] { 180F, 180F, 0F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.9D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),
	passengerCSDABA(Ctyrk4EntityPassengerCSDABA.class, new ModelCDB249(), "CSD_ABa_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCSDBA(Ctyrk4EntityPassengerCSDBA.class, new ModelCDB249(), "CSD_Ba_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCSDBDA(Ctyrk4EntityPassengerCSDBDA.class, new ModelCDB249(), "CSD_Bda_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCSDAA(Ctyrk4EntityPassengerCSDAA.class, new ModelCDB249(), "CSD_Aa_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCSDWR(Ctyrk4EntityPassengerCSDWR.class, new ModelCDB249(), "CSD_WR_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	LOCO_CD1216(Ctyrk4EntityLocoElectricCD1216.class, new train.client.render.models.BR185_EngineModel(), "CD1216_Loco_", true, new float[]{-2.0F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerCDBmpz(Ctyrk4EntityPassengerCDBmpz.class, new train.client.render.models.ModelBR_MK4_Coach(), "CD_Bmpz_", true, new float[]{0.2F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerCDARbmpz(Ctyrk4EntityPassengerCDARbmpz.class, new train.client.render.models.ModelBR_MK4_Buffet(), "CD_ARbmpz_", true, new float[]{0.22F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	LOCO_CDAfmpz(Ctyrk4EntityLocoElectricCDAfmpz.class, new train.client.render.models.ModelClass321(), "CD_Afmpz_", true, new float[]{-1.2F, -0.455F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerOBB(Ctyrk4EntityPassengerOBB.class, new ModelCDB249(), "OBB_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	locoCD163(Ctyrk4EntityLocoElectricCD163.class, new ModelLocoCD151(), "CD163_", true, new float[]{-2.125F,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoCD263(Ctyrk4EntityLocoElectricCD263.class, new ModelLocoCD151(), "CD263_", true, new float[]{-2.125F,0.18F,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	tankWagonErmewa(Ctyrk4EntityEntityWagonErmewa.class, new train.client.render.models.ModelTankWagonThreeDome(), "Tank_", true, new float[]{0.0F, 0.17F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerZSSKB(Ctyrk4EntityPassengerZSSKB.class, new ModelCDB249(), "ZSSK_B_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	locoSteamCSD477(Ctyrk4EntityLocoSteamCSD477.class, new ModelCSD477(), "CSD477_", true,
			new float[] { -6.7F, 1.25F, 0.63F }, new float[] { 0F, 180F, 180F }, new float[] { 1.20F, 1.125F, 0.92F }, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 6.5D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 6.0D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoT478a1(Ctyrk4EntityLocoDieselT478a1.class, new ModelT478a1(), "T478-1_", true, new float[] { -3.1F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.42D, 1.45D, 0.0D });
		}
	}, "", null, 0, false),
	locoCD850(Ctyrk4EntityLocoDieselCD850.class, new ModelCD850(), "CD850_", true, new float[] { -1.6F, 0.15F, -0.68F }, new float[] { 0F, 180F, 180F }, null, "", 0,null, "", null, 0, false),
	locoCD820(Ctyrk4EntityLocoDieselCD820.class, new ModelCD820(), "CD820_", true, new float[] { -1.4F, 0.15F, -0.68F }, new float[] { 0F, 180F, 180F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 4.6D, 1D, -0.45D });
		}
	}, "", null, 0, false),
	passengerCDBalm020(Ctyrk4EntityPassengerCDBalm020.class, new ModelBalm020(), "CDBalm020_", true, new float[] { 1.0F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDBtx763(Ctyrk4EntityPassengerCDBtx763.class, new ModelBtx763(), "CDBtx763_", true, new float[] { 1.0F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.9f}, "", 0, null, "", null, 0, false),
	LocoCD770(Ctyrk4EntityLocoDieselCD770.class, new ModelCD770(), "CD770_", true, new float[] { -2.4F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.9f}, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.42D, 1.45D, 0.0D });
		}
	}, "", null, 0, false),
	CSD534(Ctyrk4EntityLocoSteamCSD534.class, new ModelCSD534(), "CSD534_", true, new float[] { -3.5F, 1.05F, 0.69F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 10, new ArrayList<double[]>() {
		{
			add(new double[] { 3D, 1.5D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, -0.25D, 0.75D });
		}
	}, 3, true),
	tenderCSD555(Ctyrk4EntityTenderCSD555.class, new ModelTenderCSD555(), "CSDTender555_", true, new float[] { -6F, 1.05F, 0.69F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoCSD555(Ctyrk4EntityLocoSteamCSD555.class, new ModelCSD555(), "CSD555_", true, new float[] { -4.75F, 1.05F, 0.69F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 4.25D, 1.5D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4D, -0.2D, 0.75D });
		}
	}, 3, true),
	passengerCDBDMPZ(Ctyrk4EntityPassengerCDBDMPZ.class, new ModelComfortJet(), "CD_BDMPZ_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDAMPZ(Ctyrk4EntityPassengerCDAMPZ.class, new ModelComfortJet(), "CD_AMPZ_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDBMPZ(Ctyrk4EntityPassengerCDBMPZ2.class, new ModelComfortJet(), "CD_BMPZ_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerCDBBMPZ(Ctyrk4EntityPassengerCDBBMPZ.class, new ModelComfortJet(), "CD_BBMPZ_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerAPM1990(Ctyrk4EntityPassengerAPM1990.class, new ModelCDB249(), "APM1990_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerOrient(Ctyrk4EntityPassengerOrient.class, new ModelCDB249(), "ORIENT_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	locoDuewagGT6ZRLoco(Ctyrk4EntityLocoElectricDuewagGT6ZR.class, new ModelDuewagGT6ZRLoco(), "Duewag_GT6_", true, new float[]{-0.85F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	CD844( Ctyrk4EntityLocoElectricCD844.class, new ModelCD844(), "CD844_", true, new float[]{-1.5F,-0.10F,0.03F}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	//CD169( Ctyrk4EntityLocoElectricCD169.class, new ModelCD169(), "CD169_", true, new float[]{-1.5F,0.05F,0}, new float[] {0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),

	;
	private Class<? extends EntityRollingStock> entityClass;
	private ModelBase model;
	private String texture;
	private boolean multiTexture;
	private float[] trans;
	private float[] rotate;
	private float[] scale;
	private String smokeType;
	private ArrayList<double[]> smokeFX;
	private String explosionType;
	private ArrayList<double[]> explosionFX;
	private int smokeIterations;
	private int explosionFXIterations;
	private boolean hasSmokeOnSlopes;

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 */
	Ctyrk4RenderEnum(Class<? extends EntityRollingStock> entityClass, ModelBase model, String texture, boolean multiTexture, float[] trans, float[] rotate, float[] scale, String smokeType, int smokeIterations, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
		this.entityClass = entityClass;
		this.model = model;
		this.texture = texture;
		this.multiTexture = multiTexture;
		this.trans = trans;
		this.rotate = rotate;
		this.scale = scale;
		this.smokeType = smokeType;
		this.smokeFX = smokeFX;
		this.explosionType = explosionType;
		this.explosionFX = explosionFX;
		this.smokeIterations = smokeIterations;
		this.explosionFXIterations = explosionFXIterations;
		this.hasSmokeOnSlopes = hasSmokeOnSlopes;
	}

    @Override
	public Class<? extends EntityRollingStock> getEntityClass() {
		return entityClass;
	}

    @Override
	public ModelBase getModel() {
		return model;
	}

	public boolean getIsMultiTextured() {
		return multiTexture;
	}

    @Override
	public boolean hasSmoke() {
		return smokeType.length() > 0;
	}

    @Override
	public boolean hasSmokeOnSlopes() {
		return hasSmokeOnSlopes;
	}

    @Override
	public String getSmokeType() {
		return smokeType;
	}

    @Override
	public ArrayList<double[]> getSmokeFX() {
		return smokeFX;
	}

    @Override
	public String getExplosionType() {
		return explosionType;
	}

    @Override
	public boolean hasExplosion() {
		return explosionType.length() > 0;
	}

    @Override
	public ArrayList<double[]> getExplosionFX() {
		return explosionFX;
	}

    @Override
	public float[] getTrans() {
		return trans;
	}

    @Override
	public float[] getRotate() {
		return rotate;
	}

    @Override
	public float[] getScale() {
		return scale;
	}

    @Override
    public ResourceLocation getTextureFile(String colorString) {
		if (multiTexture) {
			return new ResourceLocation(Ctyrk4AddonInfo.resourceLocation, Ctyrk4AddonInfo.trainsPrefix + texture + colorString + ".png");
		} else {
			return new ResourceLocation(Ctyrk4AddonInfo.resourceLocation, Ctyrk4AddonInfo.trainsPrefix + texture + ".png");
		}
	}

    @Override
	public int getSmokeIterations() {
		return smokeIterations;
	}

    @Override
	public int getExplosionFXIterations() {
		return explosionFXIterations;
	}
}
