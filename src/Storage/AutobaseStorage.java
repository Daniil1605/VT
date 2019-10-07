package Storage;

import CarTypes.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AutobaseStorage {
	public ArrayList<Taxi> taxilist = new ArrayList<Taxi>();
	public ArrayList<Bus> buslist = new ArrayList<Bus>();
	public ArrayList<MiniBus> minibuslist = new ArrayList<MiniBus>();
	public ArrayList<Truck> trucklist = new ArrayList<Truck>();
	
	public AutobaseStorage() {
		taxilist = new ArrayList<Taxi>();
		buslist = new ArrayList<Bus>();
		minibuslist = new ArrayList<MiniBus>();
		trucklist = new ArrayList<Truck>();
    }
	
	public void add(String name) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String drivername="";
    	String autonumber="";
		switch (name) {
        case "taxi":{
        	int sitsamount=0;
        	System.out.print("Write drivername:");
            try {
				drivername = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write autonumber:");
        	try {
				autonumber = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write sitsamount:");
        	try {
				sitsamount = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	Taxi taxi = new Taxi(drivername,autonumber,sitsamount);
        	taxilist.add(taxi);
        }                
            break;
        case "bus":{
        	int ticketprice=0;
        	System.out.print("Write drivername:");
            try {
				drivername = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write autonumber:");
        	try {
				autonumber = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write ticketprice:");
        	try {
        		ticketprice = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	Bus bus = new Bus(drivername,autonumber,ticketprice);
        	buslist.add(bus);
        }                
            break;
        case "truck":{
        	int maxweight=0;
        	System.out.print("Write drivername:");
            try {
				drivername = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write autonumber:");
        	try {
				autonumber = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write maxweight:");
        	try {
        		maxweight = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	Truck truck = new Truck(drivername,autonumber,maxweight);
        	trucklist.add(truck);
        }                
            break;
        case "minibus":{
        	int rideprice=0;
        	System.out.print("Write drivername:");
            try {
				drivername = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write autonumber:");
        	try {
				autonumber = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write rideprice:");
        	try {
        		rideprice = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	MiniBus minibus = new MiniBus(drivername,autonumber,rideprice);
        	minibuslist.add(minibus);
        }  
            break;               
        default:{
            throw new IllegalArgumentException("Wrong name:" + name);
        }
    }
    }

	public void delete(String name) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		switch (name) {
        case "taxi":{
        	int index=0;
        	System.out.print("Write index:");
        	try {
        		index = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	taxilist.remove(index);
        }                
            break;
        case "bus":{
        	int index=0;
        	System.out.print("Write index:");
        	try {
        		index = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	buslist.remove(index);
        }                
            break;
        case "truck":{
        	int index=0;
        	System.out.print("Write index:");
        	try {
        		index = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	trucklist.remove(index);
        }                
            break;
        case "minibus":{
        	int index=0;
        	System.out.print("Write index:");
        	try {
        		index = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	trucklist.remove(index);
        }  
            break;               
        default:{
            throw new IllegalArgumentException("Wrong name:" + name);
        }
    }
    }
	
	public void update(String name) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String drivername = "";
    	String autonumber = "";
    	int index = 0;
    	System.out.print("Write index:");
    	try {
    		index = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch (name) {
        case "taxi":{
        	int sitsamount=0;
        	System.out.print("Write drivername:");
            try {
				drivername = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write autonumber:");
        	try {
				autonumber = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write sitsamount:");
        	try {
				sitsamount = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	Taxi taxi = new Taxi(drivername,autonumber,sitsamount);
        	taxilist.set(index,taxi);
        }                
            break;
        case "bus":{
        	int ticketprice=0;
        	System.out.print("Write drivername:");
            try {
				drivername = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write autonumber:");
        	try {
				autonumber = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write ticketprice:");
        	try {
        		ticketprice = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	Bus bus = new Bus(drivername,autonumber,ticketprice);
        	buslist.set(index,bus);
        }                
            break;
        case "truck":{
        	int maxweight=0;
        	System.out.print("Write drivername:");
            try {
				drivername = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write autonumber:");
        	try {
				autonumber = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write maxweight:");
        	try {
        		maxweight = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	Truck truck = new Truck(drivername,autonumber,maxweight);
        	trucklist.set(index,truck);
        }                
            break;
        case "minibus":{
        	int rideprice=0;
        	System.out.print("Write drivername:");
            try {
				drivername = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write autonumber:");
        	try {
				autonumber = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	System.out.print("Write rideprice:");
        	try {
        		rideprice = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	MiniBus minibus = new MiniBus(drivername,autonumber,rideprice);
        	minibuslist.set(index,minibus);
        }  
            break;               
        default:{
            throw new IllegalArgumentException("Wrong name:" + name);
        }
    }
    }

	public void write(String name) {
		switch (name) {
        case "taxi":{
        	int i = 0;
        	String drivername;
        	String autonumber;
        	int sitsamount;
        	for(Object taxi : taxilist){
        		drivername=((Taxi) taxi).getDrivername();
        		autonumber=((Taxi) taxi).getAutonumber();
        		sitsamount = ((Taxi) taxi).getSitsamount();
                System.out.println(i+":"+drivername+","+autonumber+","+sitsamount);
                i++;
            }
        }                
            break;
        case "bus":{
        	int i = 0;
        	String drivername;
        	String autonumber;
        	int ticketprice;
        	for(Object bus : buslist){
        		drivername=((Bus) bus).getDrivername();
        		autonumber=((Bus) bus).getAutonumber();
        		ticketprice = ((Bus) bus).getTicketPrice();
                System.out.println(i+":"+drivername+","+autonumber+","+ticketprice);
                i++;
            }
        }                
            break;
        case "truck":{
        	int i = 0;
        	String drivername;
        	String autonumber;
        	int maxweight;
        	for(Object truck : trucklist){
        		drivername=((Truck) truck).getDrivername();
        		autonumber=((Truck) truck).getAutonumber();
        		maxweight = ((Truck) truck).getMaxWeight();
                System.out.println(i+":"+drivername+","+autonumber+","+maxweight);
                i++;
            }
        }                
            break;
        case "minibus":{
        	int i = 0;
        	String drivername;
        	String autonumber;
        	int rideprice;
        	for(Object minibus : minibuslist){
        		drivername=((MiniBus) minibus).getDrivername();
        		autonumber=((MiniBus) minibus).getAutonumber();
        		rideprice = ((MiniBus) minibus).getRidePrice();
                System.out.println(i+":"+drivername+","+autonumber+","+rideprice);
                i++;
            }
        }  
            break;               
        default:{
            throw new IllegalArgumentException("Wrong name:" + name);
        }
    }
    }

}
