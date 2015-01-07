/**
 * Created by blinky on 05.01.15.
 */
public class Meat extends Stock {

    private String type;
    private String location;

            public Meat(){}
            public Meat(String type,String location,double price, boolean inStock){

                super.price = price;
                super.inStock = inStock;
                setType(type);
                setLocation(location);
            }
            public String getType(){
                return type;
            }
            public void setType(String type){
                this.type = type;
            }
            public String getLocation(){
                return locations;
            }
            public void setBestUntil(String location){
                this.location = locations;
            }
            @Override
            public void StockOut()
            {
                System.out.printf("\nType : %s \nFrom: %d \nPrice: %d \nIn Stock: %b ",this.type,this.location,super.price,super.inStock);
            }
        }
    }
