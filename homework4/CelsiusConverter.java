import java.util.*;

/**
 * Created by blinky on 05.01.15.
 */

//Напрате клас който коквертира градуси от Целзии във Ференхайт.

public class FahrenheitConverter {
 
 private float celsiusDeg;

 public float getCelsiusDeg() {
  return celsiusDeg;
 }

 public void setCelsiusDeg(float celsiusDeg) {
  this.celsiusDeg = celsiusDeg;
 }

 public FahrenheitConverter () {

 }

 public FahrenheitConverter (float inDeg) {
  this.celsiusDeg = inDeg;
 }
 public float convertToFahrenheit(){

  return (this.celsiusDeg * 9) / 5 + 32;
 }

 public static void main(String[] args) {

  FahrenheitConverter  test=new FahrenheitConverter ();
  test.setCelsiusDeg(36);
  System.out.println("Temperatue in Celsius = " + test.convertToFahrenheit());
 }
}


