package be.pxl.computerstore.hardware;

import java.util.Random;

public class ComputerComponent {

    protected String vendor;
    protected String name;
    protected double price;
    protected String articleNumber;

    private Random rand = new Random();
    private StringBuilder sb = new StringBuilder();
    private int uniqueNumber;

    protected ComputerComponent(String vendor, String name, double price){
    this.vendor = vendor;
    this.name = name;
    this.price = price;

    articleNumber = generateArticleNumber();
    }

    private String generateArticleNumber(){

        if(this.vendor.length() < 3){
            sb.append(vendor);
            int counter = vendor.length();
            while(counter < 3){
                sb.append("X");
                counter++;
            }
        } else {
            sb.append(vendor.substring(0,2));
        }

        sb.append("-");

        uniqueNumber = rand.nextInt((99999 - 10000) + 1) + 10000;

        sb.append(uniqueNumber);
        sb.append("-");

        for (int i = 0; i < 3; i++) {
            int number = rand.nextInt((9 - 1) + 1) + 1;
            sb.append(number);
        }

        articleNumber = "" + sb;

        return articleNumber;

    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append("ArticleNumber = " + articleNumber + "\n");
        output.append("Vendor = " + vendor + "\n");
        output.append("Name = " + name + "\n");
        output.append("Price = " + price + "\n");

        String outputString = "" + output;

        return outputString;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

}
