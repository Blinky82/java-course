import java.util.Scanner;

/**
 * Created by blinky on 07.01.15.
 */

public class Results extends DaysToSeconds {

    private int sec;
    private int min;
    private final int days;
    private int hours;


    public Results(int days, int sec, int min, int hours){

        super(days);
        this.days = days;
        this.hours=hours;
        this.min=min;
        this.sec=sec;
    }
    public int getSec() {
        return sec;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void Days() {

        int result;

        result=days*hours*min*sec;

        System.out.print("Please enter the number of days: ");

        Scanner input = new Scanner(System.in);
        int days = input.nextInt();

        System.out.print(days + " days are " + result + " seconds");
    }
}