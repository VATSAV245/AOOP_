package remote;

class TV implements Device {
    private int channel;
    
    public void turnOn() {
        System.out.println("TV is now ON");
    }
    
    public void turnOff() {
        System.out.println("TV is now OFF");
    }
    
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel is set to " + channel);
    }
}

class Radio implements Device {
    private int frequency;
    
    public void turnOn() {
        System.out.println("Radio is now ON");
    }
    
    public void turnOff() {
        System.out.println("Radio is now OFF");
    }
    
    public void setChannel(int frequency) {
        this.frequency = frequency;
        System.out.println("Radio frequency is set to " + frequency);
    }
}

