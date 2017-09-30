package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {
    private Dimension dimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price) {
        super(vendor, name, price);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(super.toString());
        output.append("Width = " + dimension.getWidth() + "\n");
        output.append("Height = " + dimension.getHeight() + "\n");
        output.append("Depth = " + dimension.getDepth() + "\n");
        output.append("Weight = " + weight + "\n");

        String outputString = "" + output;
        return outputString;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
