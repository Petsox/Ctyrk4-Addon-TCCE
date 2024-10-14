package cz.ctyrkaten.train.common.library;

import cz.ctyrkaten.train.common.entity.rollingStock.*;
import train.common.api.TrainSoundRecord;
import train.common.library.Info;


public enum Ctyrk4EnumSounds implements TrainSoundRecord {

	//Horns--
	LOCO_CD854(Ctyrk4EntityLocoDieselCD854.class, "tc_4ka_addon:horn954_854", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD954(Ctyrk4EntityLocoDieselCD954.class, "tc_4ka_addon:horn954_854", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD751(Ctyrk4EntityLocoDieselCD751.class, "tc_4ka_addon:cdhorn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD720(Ctyrk4EntityLocoDieselCD720.class, "tc_4ka_addon:cdhorn", 10F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false),
	LOCO_CD242(Ctyrk4EntityLocoElectricCD242.class, "tc_4ka_addon:cdhorn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	LOCO_CD810(Ctyrk4EntityLocoDieselCD810.class, "tc_4ka_addon:cdhorn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD140(Ctyrk4EntityLocoElectricCD140.class, "tc_4ka_addon:cdhorn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),

	//Whistle--
	LOCO_CD754(Ctyrk4EntityLocoDieselCD754.class, "tc_4ka_addon:cdwhistle", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD363(Ctyrk4EntityLocoElectricCD363.class, "tc_4ka_addon:cdwhistle", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	LOCO_CD362(Ctyrk4EntityLocoElectricCD362.class, "tc_4ka_addon:cdwhistle", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	LOCO_CD263(Ctyrk4EntityLocoElectricCD263.class, "tc_4ka_addon:cdwhistle", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	LOCO_CD163(Ctyrk4EntityLocoElectricCD163.class, "tc_4ka_addon:cdwhistle", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	LOCO_CD742(Ctyrk4EntityLocoDieselCD742.class, "tc_4ka_addon:cdwhistle", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40, false),
	LOCO_CD741(Ctyrk4EntityLocoDieselCD714.class, "tc_4ka_addon:cdwhistle", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD151(Ctyrk4EntityLocoElectricCD151.class, "tc_4ka_addon:cdwhistle", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	LOCO_CD100(Ctyrk4EntityLocoElectricCD100.class, "tc_4ka_addon:cdwhistle", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	LOCO_CD111(Ctyrk4EntityLocoElectricCD111.class, "tc_4ka_addon:cdwhistle", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	LOCO_CD715(Ctyrk4EntityLocoDieselCD715.class, "tc_4ka_addon:cdwhistle", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD814(Ctyrk4EntityLocoDieselCD814.class, "tc_4ka_addon:cdwhistle", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD914(Ctyrk4EntityLocoDieselCD914.class, "tc_4ka_addon:cdwhistle", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LOCO_CD460(Ctyrk4EntityLocoElectricCD460.class, "tc_4ka_addon:cdwhistle", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	LOCO_CD470(Ctyrk4EntityLocoElectricCD470Motor.class, "tc_4ka_addon:cdwhistle", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	LOCO_CD812(Ctyrk4EntityLocoDieselCD812.class, "tc_4ka_addon:cdwhistle", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),

	//Other--
	LOCO_RE420(Ctyrk4EntityLocoElectricRE420.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	LOCO_8171M(Ctyrk4EntityLocoElectric8171MLoco.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	LOCO_CD471(Ctyrk4EntityLocoElectricCD471Motor.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	LOCO_CD471_TAIL(Ctyrk4EntityLocoElectricCD471Tail.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	LOCO_M1(Ctyrk4EntityLocoElectricM1.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	LOCO_843(Ctyrk4EntityLocoDieselCD843.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	LOCO_T4(Ctyrk4EntityElectricT4.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	LOCO_650(Ctyrk4EntityLocoElectricCD650Loco.class, "4300_horn", 1F, "vl10_idle", 0.65F, 10, "vl10_idle", 0.6F, 40, false),
	LOCO_845(Ctyrk4EntityLocoDieselARR845.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	LOCO_383(Ctyrk4EntityLocoElectricCD383.class, "tc_4ka_addon:cdhorn2", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	LOCO_362(Ctyrk4EntityLocoElectricCD362.class, "tc_4ka_addon:cdhorn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	LOCO_ZSSK383(Ctyrk4EntityLocoElectricZSSK383.class, "tc_4ka_addon:cdhorn2", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	LOCO_CD350(Ctyrk4EntityLocoElectricCD350.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	LOCO_CSD387(Ctyrk4EntityLocoSteamCSD387.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	LOCO_CD464(Ctyrk4EntityCSD464.class, "class62_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	LOCO_A16(Ctyrk4EntityLocoSteamA16.class, "class62_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	LOCO_TITAN(Ctyrk4EntityLocoSteamTitan.class, "class62_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	LOCO_SF482(Ctyrk4EntityLocoSteamSF482.class, "class62_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	LOCO_SDHIGH(Ctyrk4EntityLocoDieselSDHigh.class, "sd70_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	LOCO_SDLOW(Ctyrk4EntityLocoDieselSDLow.class, "sd70_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	LOCO_SDBUnit(Ctyrk4EntityLocoDieselSDBUnit.class, "sd70_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	LOCO_SD(Ctyrk4EntityLocoDieselSD.class, "sd70_horn", 1.0F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	LOCO_U57(Ctyrk4EntityLocoSteamU57.class, "hancock_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	;

	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLength;
	private int idleSoundLength;
	private boolean soundChangeWithSpeed;

	/**
	 * Defines the sounds for the locomotives.
	 * 
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	private Ctyrk4EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLength = runSoundLenght;
		this.idleSoundLength = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}

    @Override
	public Class getEntityClass() {
		return entityClass;
	}

    @Override
	public String getHornString() {
        if (horn == null || horn.isEmpty() || horn.startsWith(Ctyrk4AddonInfo.resourceLocation + ":")) return horn;
		return Info.resourceLocation + ":" + horn;
	}

    @Override
	public String getRunString() {
        if (run == null || run.isEmpty() || run.startsWith(Ctyrk4AddonInfo.resourceLocation + ":")) return run;
		return Info.resourceLocation + ":" + run;
	}

    @Override
	public String getIdleString() {
        if (idle == null || idle.isEmpty() || idle.startsWith(Ctyrk4AddonInfo.resourceLocation + ":")) return idle;
		return Info.resourceLocation + ":" + idle;
	}

    @Override
	public Float getHornVolume() {
		return hornVolume;
	}

    @Override
	public Float getRunVolume() {
		return runVolume;
	}

    @Override
	public Float getIdleVolume() {
		return idleVolume;
	}

	@Override
	public int getRunSoundLength() {
		return runSoundLength;
	}

	@Override
	public int getIdleSoundLength() {return idleSoundLength;}

    @Override
	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
