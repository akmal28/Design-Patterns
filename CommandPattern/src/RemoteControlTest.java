public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        System.out.println(remote);
        remote.setCommands(0, lightOn, lightOff);
        System.out.println(remote);
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
    }
}
