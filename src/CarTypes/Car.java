package CarTypes;

import java.io.Serializable;

public class Car implements Serializable, Cloneable {

    private String drivername;
    private String autonumber;

    public Car() {
    	drivername = "";
    	autonumber = "";
    }
    
    public Car(String drivername,String autonumber) {
    	this.drivername = drivername;
    	this.autonumber = autonumber;
    }

    public String getDrivername() {
        return this.drivername;
    }

    public void setDrivername(String drivername) {
            this.drivername = drivername;
    }

    public String getAutonumber() {
        return this.autonumber;
    }

    public void setAutonumber(String autonumber) {
            this.autonumber = autonumber;
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
        Car car = (Car)obj;
        if (drivername != car.getDrivername() || autonumber != car.getAutonumber()) {
            return false;
        }

        return true;
    }
}