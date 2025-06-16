public class Main {
    public static void main(String[] args) {
        Command lightOn = new LightOnCommand(new Light());
        Command lightOff = new LightOffCommand(new Light());

        RemoteControl remote = new RemoteControl(lightOn);
        remote.pressButton();
        remote = new RemoteControl(lightOff);
        remote.pressButton();
    }
}