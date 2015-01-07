public class SUV extends car {

    private boolean offroad;

    public SUV(int pricing, boolean offroad) {

        this.offroad = false;
        super.pricing = pricing;

    }

    public boolean getOffroad() {
        return offroad;
    }

    public void setOffroad(boolean offroad) {
        this.offroad = offroad;
    }

    public void SUVout(){
        if (offroad==true){
            System.out.println("The vehicle is Offroad : \n Pricing :%d",this.offroad,super.pricing);
        }
        else{
            System.out.println("The vehicle is not Offroad ! \n Pricing : %d",super.pricing);
        }
    }
}
