package Random;

/**
 * Created by blinky on 24.01.15.
 */

public class Laptop implements Sellable {

    private int usb;
    private int HHD;

    public Laptop(int usb) {
        this.usb = usb;
    }

    public Laptop(int hHD, int usb) {
        HHD = hHD;
        this.usb = usb;
    }

    public Laptop() {

    }

    public int getHHD() {
        return HHD;
    }

    public void setHHD(int hHD) {
        HHD = hHD;
    }

    public int getUSB() {
        return usb;
    }

    public void setUSB(int usb) {
        this.usb = usb;
    }
}
