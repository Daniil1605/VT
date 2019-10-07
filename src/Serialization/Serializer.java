package Serialization;

import java.io.*;
import java.util.ArrayList;

public class Serializer<T> {
    public void Serialize(T objectForSerializing) throws Exception {
        FileOutputStream outputStream = new FileOutputStream("Storage.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(objectForSerializing);
        objectOutputStream.close();
    }

    public T Deserialize() throws Exception, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("Storage.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        T  deserializedObject = (T) objectInputStream.readObject();
        return deserializedObject;
    }
    
    public void Clear() throws Exception, ClassNotFoundException {
    	PrintWriter writer = new PrintWriter("Storage.txt");
    	writer.print("");
    	writer.close();
    }
}
