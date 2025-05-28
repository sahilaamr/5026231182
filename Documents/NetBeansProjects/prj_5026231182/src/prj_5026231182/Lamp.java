package prj_5026231182;

public class Lamp {

    String lamp;
    String on;
    String off;
    boolean isOn;

    public Lamp(String lamp, String on, String off, boolean isOn) {
        this.lamp = lamp;
        this.on = on;
        this.off = off;
        this.isOn = isOn;
    }

    public void displayDetails() {
        System.out.println("Lamp: " + (isOn ? "Yes" : "No"));)
    }
}
