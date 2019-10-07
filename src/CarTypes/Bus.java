package CarTypes;

import CarTypes.Car;
import java.io.Serializable;

public class Bus extends Car  implements Serializable, Cloneable {
	
	final int DEFAULT_TICKET_PRICE = 1;

    private int ticketprice;

    public Bus() {
    	ticketprice =DEFAULT_TICKET_PRICE;
    }
    
    public Bus(String drivername,String autonumber,int ticketprice) {
    	super(drivername,autonumber);
    	this.ticketprice = ticketprice;
    }

    public int getTicketPrice() {
        return this.ticketprice;
    }

    public void setTicketPrice(int ticketprice) {
            this.ticketprice = ticketprice;
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
        Bus bus  = (Bus)obj;
        if (ticketprice != bus.getTicketPrice()) {
            return false;
        }

        return true;
    }
}
