package Serialization;

import java.io.*;

public class Serializer<T> {
    public void Serialize(T serializingobject) throws Exception {
        FileOutputStream outputstream = new FileOutputStream("Storage.txt");
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(outputstream);
        objectoutputstream.writeObject(serializingobject);
        objectoutputstream.close();
    }

    public T Deserialize() throws Exception, ClassNotFoundException {
        FileInputStream fileinputstream = new FileInputStream("Storage.txt");
        ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
        T  deserializedObject = (T) objectinputstream.readObject();
        return deserializedObject;
    }
    
    public void Clear() throws Exception, ClassNotFoundException {
    	FileOutputStream outputStream = new FileOutputStream("Storage.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(null);
        objectOutputStream.close();
    }
}
