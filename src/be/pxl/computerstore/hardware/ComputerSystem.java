package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {

    private Processor processor;
    private ComputerCase computerCase;
    private Peripheral peripheral;

    public static final int MAX_PERIPHERALS = 3;

    private Peripheral[] peripherals;

    public ComputerSystem(){
    peripherals = new Peripheral[MAX_PERIPHERALS];
    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
        int amountOfNullsCounter = 3;
        for (int i = 0; i < MAX_PERIPHERALS; i++) {
            if(peripherals[i] != null ){
                amountOfNullsCounter--;
            }
        }
        if(amountOfNullsCounter == 0){
            throw new TooManyPeripheralsException();
        }
        int i = 0;
        while (peripherals[i] != null){
            i++;
        }
        peripherals[i] = peripheral;
    }

    public void removePeripheral(String articleNumber){
        for (int i = 0; i < MAX_PERIPHERALS ; i++) {
            if(peripherals[i].getArticleNumber() == articleNumber ){
                peripherals[i] = null;
            }
        }
    }

    public int getNumberOfPeripherals(){
        int peripheralCounter = 0;
        for (int i = 0; i < MAX_PERIPHERALS; i++) {
            if(peripherals[i] != null){
                peripheralCounter++;
            }
        }
        return peripheralCounter;
    }


    @Override
    public double totalPriceExcl() {
        double priceExcl = 0;
        for (int i = 0; i < getNumberOfPeripherals(); i++) {
            priceExcl += peripherals[i].price;
        }
        return priceExcl;
    }

    @Override
    public double totalPriceIncl() {
        double priceIncl = totalPriceExcl()* 1.21;
        return priceIncl;
    }


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(super.toString());
        for (int i = 0; i < getNumberOfPeripherals(); i++) {
            output.append(peripherals[i].toString() + ":" + "\n");
        }
        output.append("TOTAAL EXCL: " + totalPriceExcl() + "\n");
        output.append("TOTAAL INCL: " + totalPriceIncl() + "\n");
        String outputString = "" + output;
        return outputString;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Peripheral getPeripheral() {
        return peripheral;
    }

    public void setPeripheral(Peripheral peripheral) {
        this.peripheral = peripheral;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(Peripheral[] peripherals) {
        this.peripherals = peripherals;
    }
}
