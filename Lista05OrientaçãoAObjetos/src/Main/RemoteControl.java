package Main;

public class RemoteControl {

	public int soundVolume;
	public int channelNumber;

	public RemoteControl(int soundVolume, int channelNumber) {
		this.soundVolume = soundVolume;
		this.channelNumber = channelNumber;
	}

	public int turnUpSound() {
		
		return soundVolume++;
	}
	
	public int turnDownSound() {
		
		return soundVolume--;
	}
	
	public int increaseChannel() {
		
		return channelNumber++;
	}
	
	public int decreaseChannel() {
		
		return channelNumber--;
	}
	
	public int changeChannel(int channelNumber) {
		
		return this.channelNumber = channelNumber;
	}
	
	public int soundVolumeStatus() {
		
		return soundVolume;
	}
	
	public int channelNumberStatus() {
		
		return channelNumber;
	}
}
