package Random;

/**
 * Created by blinky on 24.01.15.
 */


    public class Mobile implements Sellable {

        private String ios;
        private String color;

        public Mobile() {
        }

    public Mobile(String ios, String color) {
            this.ios = ios;
            this.color = color;
        }

    public String getIos() {
            return ios;
        }

    public void setIos(String ios) {
            this.ios = ios;
        }


    public String getColor() {
            return color;
        }

    public void setColor(String color) {
            this.color = color;
        }
    }

