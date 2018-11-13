public class Person {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl("Remote Control device");
        Device digitalReceiver = new DigitalReceiver("Digital Receiver device", "M-812");
        Device tv = new TV("Tv device", "T-867");
        Device audioSystem = new AudioSystem("Audio System device", "");
        Device mp3player = new MP3Player("MP3Player device", "MP-8");
        Device dvdPlayer = new DVDPlayer("DVDPlayer device", "DV-09");
        
        remoteControl.showAllDevicesInSystem();
        System.out.println();

        AddDevice(remoteControl, digitalReceiver);
        AddDevice(remoteControl, tv);
        AddDevice(remoteControl, audioSystem);
        AddDevice(remoteControl, mp3player);
        AddDevice(remoteControl, dvdPlayer);

        remoteControl.turnOff();
        remoteControl.turnOn();
        System.out.println();

        MethodOperation(remoteControl, "Digital Receiver device");
        MethodOperation(remoteControl, "Audio System device");
        MethodOperation(remoteControl, "TV device");
        MethodOperation(remoteControl, "MP3Player device");
        MethodOperation(remoteControl, "DVDPlayer device");
    }
    private static void AddDevice(RemoteControl remoteControl, Device tv) {
        remoteControl.addInSystem(tv);
        remoteControl.showAllDevicesInSystem();
        System.out.println();
    }
    private static void MethodOperation(RemoteControl remoteControl, String s) {
        remoteControl.chooseDevice(s);
        remoteControl.turnOn();
        remoteControl.getActiveDevice().doSomething();
        remoteControl.turnOff();
        remoteControl.getActiveDevice().doSomething();
        System.out.println();
    }
}

