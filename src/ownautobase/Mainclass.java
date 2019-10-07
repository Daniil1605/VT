package ownautobase;

import CommandFactory.Factory;
import Storage.AutobaseStorage;

import java.io.*;

public class Mainclass {
	public static void main(String[] args) {
		AutobaseStorage autobase = new AutobaseStorage();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String command = "";
		boolean endcommand = true;
		Factory commandfactory = new Factory();
		while(endcommand) {		
		System.out.print("Write command:");	
		try {
			command = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}		
        endcommand = commandfactory.HandleCommand(command,autobase);
		}
		System.out.print("termination ended");
	}

}
