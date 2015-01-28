import java.util.*;

/**
 * Created by blinky on 05.01.15.
 */
public class Days {
  
 private int daysCnt;

 public int getDaysCnt() {
  return daysCnt;
 }

 public void setDaysCnt(int daysCnt) {
  this.daysCnt = daysCnt;
 }

 public Days() {

 }

 public Days(int daysCnt) {
  this.daysCnt = daysCnt;
 }

 public int convertDaysToSeconds() {
  return daysCnt  24  60 * 60;
 }

 public static void main(String[] args) {
  
  Days days = new Days();
  days.setDaysCnt(10);
  System.out.println(days.convertDaysToSeconds());
 }
}
