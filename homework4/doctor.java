/**
 * Created by blinky on 14.12.14.
 */
public class Doctor {

    public class Doctor extends Employee {

        int dailyshifts;
        int nightshifts;
        public Doctor(){

            super();
            this.dailyshifts=0;
            this.nightshifts=0;

        }
        public Doctor(int hours,double salary,int dailyshifts,int nightshifts){
            super(hours,salary);
            setNightshifts(nightshifts);
            setDailyshifts(dailyshifts);
        }
        public void setDailyshifts(int dailyshifts){
            this.dailyshifts=dailyshifts;
        }
        public int getDailyshifts(){
            return dailyshifts;
        }
        public void setNightshifts(int nightshifts){
            this.nightshifts=nightshifts;
        }
        public int getNightshifts(){
            return nightshifts;
        }
        public String toString() {
            return "Doctor with  + getDailyshifts() + " & nightshifts: "
                    + getNightshifts() + super.toString() + "]";
        }
    }
}
