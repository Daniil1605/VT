package CarTypes;

import CarTypes.Car;
import java.io.Serializable;

public class Truck extends Car  implements Serializable, Cloneable {
	
	final int DEFAULT_MAX_WEIGHT = 2;

    private int maxweight;

    public Truck() {
    	maxweight =DEFAULT_MAX_WEIGHT;
    }
    
    public Truck(String drivername,String autonumber,int maxweight) {
    	super(drivername,autonumber);
    	this.maxweight = maxweight;
    }

    public int getMaxWeight() {
        return this.maxweight;
    }

    public void setMaxWeight(int maxweight) {
            this.maxweight = maxweight;
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
        Truck truck  = (Truck)obj;
        if (maxweight != truck.getMaxWeight()) {
            return false;
        }

        return true;
    }
}

