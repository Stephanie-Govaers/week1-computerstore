package be.pxl.computerstore.hardware;

public class HardDisk extends ComputerComponent {

    private int diskSize;

    public HardDisk(String vendor, String name, double price, int diskSize) {
        super(vendor, name, price);
        this.diskSize = diskSize;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

}