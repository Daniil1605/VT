package CarTypes;

import CarTypes.Car;
import java.io.Serializable;

public class Taxi extends Car  implements Serializable, Cloneable {
	
	final int DEFAULT_SITS_AMOUNT = 5;

    private int sitsamount;

    public Taxi() {
    	sitsamount =DEFAULT_SITS_AMOUNT;
    }
    
    public Taxi(String drivername,String autonumber,int sitsamount) {
    	super(drivername,autonumber);
    	this.sitsamount = sitsamount;
    }

    public int getSitsamount() {
        return this.sitsamount;
    }

    public void setSitsamount(int sitsamount) {
            this.sitsamount = sitsamount;
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
        Taxi taxi  = (Taxi)obj;
        if (sitsamount != taxi.getSitsamount()) {
            return false;
        }

        return true;
    }
}
