package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {

    private double clockspeed;

    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor, name, price);
        setClockspeed(clockspeed);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(super.toString());
        output.append("Clock speed = " + clockspeed + "GHz " + "\n");

        String outputString = "" + output;

        return outputString;
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        if(clockspeed < 0.7){
            this.clockspeed = 0.7;
        } else {
            this.clockspeed = clockspeed;
        }

    }
}
