package CommandFactory;

import Storage.AutobaseStorage;
import Serialization.Serializer;
import java.io.*;
import java.util.ArrayList;

public class Factory {

	public Factory() {
	}
	public boolean HandleCommand(String command,AutobaseStorage autobase) {
		String listname="";
		Serializer serializer = new Serializer();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean iscontinued = true;
        switch (command) {
            case "add":{
            	System.out.print("Write listname:");
       		 try {
       				listname = reader.readLine();
       			} catch (IOException e) {
       				e.printStackTrace();
       			}
            	 autobase.add(listname);
            }                
                break;
            case "delete":{
            	System.out.print("Write listname:");
       		 try {
       				listname = reader.readLine();
       			} catch (IOException e) {
       				e.printStackTrace();
       			}
            	autobase.delete(listname);
            }                
                break;
            case "update":{
            	System.out.print("Write listname:");
       		 try {
       				listname = reader.readLine();
       			} catch (IOException e) {
       				e.printStackTrace();
       			}
            	autobase.update(listname);
            }                
                break;
            case "write":{
            	System.out.print("Write listname:");
       		 try {
       				listname = reader.readLine();
       			} catch (IOException e) {
       				e.printStackTrace();
       			}
            	autobase.write(listname);
            }
                break;
            
            case "end":{
            	iscontinued = false;
            }
            case "clear":{
            	try {
					serializer.Clear();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
            case "save":{
        		ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        		list.add(autobase.taxilist);
        		list.add(autobase.buslist);
        		list.add(autobase.minibuslist);
        		list.add(autobase.trucklist);
        		try {
					serializer.Serialize(list);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
            case "load":{
            	ArrayList<ArrayList> list = new ArrayList<ArrayList>();
            	try {
					list = (ArrayList<ArrayList>) serializer.Deserialize();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
            	autobase.taxilist = list.get(0);
            	autobase.buslist = list.get(1);
            	autobase.minibuslist = list.get(2);
            	autobase.trucklist = list.get(3);
            }
                break;               
            default:{
                throw new IllegalArgumentException("Wrong command:" + command);
            }
        }
        return iscontinued;
	}
}
