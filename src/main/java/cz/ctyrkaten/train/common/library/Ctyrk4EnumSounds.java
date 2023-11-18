package cz.ctyrkaten.train.common.library;

import train.common.api.TrainSoundRecord;
import train.common.library.Info;
import cz.ctyrkaten.train.common.entity.rollingStock.Ctyrk4EntityLocoDieselCD742;
import cz.ctyrkaten.train.common.entity.rollingStock.Ctyrk4EntityLocoDieselCD810;
import cz.ctyrkaten.train.common.entity.rollingStock.Ctyrk4EntityLocoDieselCD814;
import cz.ctyrkaten.train.common.entity.rollingStock.Ctyrk4EntityLocoElectricCD111;
import cz.ctyrkaten.train.common.entity.rollingStock.Ctyrk4EntityLocoElectricCD151;


public enum Ctyrk4EnumSounds implements TrainSoundRecord {
	locoCD742(Ctyrk4EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40,
			false),
	locoCD151(Ctyrk4EntityLocoElectricCD151.class,"mg_horn", 1F, "cd151", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	DieselCD810(Ctyrk4EntityLocoDieselCD810.class, "tram_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	DieselCD814(Ctyrk4EntityLocoDieselCD814.class, "tram_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	LocoElectricCD111T(Ctyrk4EntityLocoElectricCD111.class, "tc_4ka_addon:fullhour", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),

	;

	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
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
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
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
	public int getRunSoundLenght() {
		return runSoundLenght;
	}

    @Override
	public int getIdleSoundLenght() {
		return idleSoundLenght;
	}

    @Override
	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
