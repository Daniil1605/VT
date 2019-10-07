package CarTypes;

import CarTypes.Car;
import java.io.Serializable;

public class MiniBus extends Car  implements Serializable, Cloneable {
	
	final int DEFAULT_RIDE_PRICE = 5;

    private int rideprice;

    public MiniBus() {
    	rideprice =DEFAULT_RIDE_PRICE;
    }
    
    public MiniBus(String drivername,String autonumber,int rideprice) {
    	super(drivername,autonumber);
    	this.rideprice = rideprice;
    }

    public int getRidePrice() {
        return this.rideprice;
    }

    public void setRidePrice(int rideprice) {
            this.rideprice = rideprice;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MiniBus minibus  = (MiniBus)obj;
        if (rideprice != minibus.getRidePrice()) {
            return false;
        }

        return true;
    }
}

