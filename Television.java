package Lab6;

/**
 * The purpose of this class is to model a television
 * @author Valerie Ralph-Opara 
 * 11/28/2023
 */
public class Television {
    
	final private String MANUFACTURER; 
	final private int SCREEN_SIZE; 
	private boolean powerOn; 
	private int channel; 
	private int volume; 
	
	
   
    public Television(String manufacturer, int screenSize) {
        MANUFACTURER = manufacturer;
        SCREEN_SIZE = screenSize;
        this.powerOn = false;
        this.channel = 2;
        this.volume = 20;
    }

    
    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public String getManufacturer() {
        return MANUFACTURER;
    }

    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    
    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void power() {
        powerOn = !powerOn;
    }

    public void increaseVolume() {
        if (powerOn && volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (powerOn && volume > 0) {
            volume--;
        }
    }
}
