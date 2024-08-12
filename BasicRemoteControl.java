package remote;

class BasicRemoteControl implements RemoteControl {
    protected Device device;
    
    public BasicRemoteControl(Device device) {
        this.device = device;
    }
    
    public void turnOn() {
        device.turnOn();
    }
    
    public void turnOff() {
        device.turnOff();
    }
    
    public void setChannel(int channel) {
        device.setChannel(channel);
    }
}
