package train.common.library;

import train.common.ctyrk4entity.Ctyrk4rollingStock.Ctyrk4EntityLocoDieselCD742;
import train.common.ctyrk4entity.Ctyrk4rollingStock.Ctyrk4EntityLocoDieselCD810;
import train.common.ctyrk4entity.Ctyrk4rollingStock.Ctyrk4EntityLocoDieselCD814;
import train.common.ctyrk4entity.Ctyrk4rollingStock.Ctyrk4EntityLocoElectricCD151;


public enum EnumSounds {
	locoCD742(Ctyrk4EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40,
			false),
	locoCD151(Ctyrk4EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false),
	DieselCD810(Ctyrk4EntityLocoDieselCD810.class, "tram_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),
	DieselCD814(Ctyrk4EntityLocoDieselCD814.class, "tram_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, true),

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
	 * Defines the sounds for the locomotives Many locomotives have the same sound for run and idle
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
	private EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
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

	public Class getEntityClass() {
		return entityClass;
	}

	public String getHornString() {
		return horn;
	}

	public String getRunString() {
		return run;
	}

	public String getIdleString() {
		return idle;
	}

	public Float getHornVolume() {
		return hornVolume;
	}

	public Float getRunVolume() {
		return runVolume;
	}

	public Float getIdleVolume() {
		return idleVolume;
	}

	public int getRunSoundLenght() {
		return runSoundLenght;
	}

	public int getIdleSoundLenght() {
		return idleSoundLenght;
	}

	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
