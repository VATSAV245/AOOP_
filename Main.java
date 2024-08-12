package remote;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new BasicRemoteControl(tv);
        
        remote.turnOn();
        remote.setChannel(5);
        remote.turnOff();
        
        Device radio = new Radio();
        remote = new BasicRemoteControl(radio);
        
        remote.turnOn();
        remote.setChannel(101);
        remote.turnOff();
    }
}
