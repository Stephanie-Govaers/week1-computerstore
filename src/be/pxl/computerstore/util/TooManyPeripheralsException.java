package be.pxl.computerstore.util;

public class TooManyPeripheralsException extends Exception {

    public TooManyPeripheralsException(){
        super("You can't add any more peripherals!");
    }
}
