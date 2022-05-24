package com.stuffvish;
        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.ObjectInputStream;
        import java.io.ObjectOutputStream;
        import java.io.Serializable;

/**
 *
 * @author Vishal pandey
 */

class mobile implements Serializable{
    private 	String model;
    private 	String color;
    private 	String IEMI;
    // constructor, getter-setter methods
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getIEMI() {
        return IEMI;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setIEMI(String iEMI) {
        IEMI = iEMI;
    }

}
public class Demo1 {
    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        mobile m1 = new mobile();
        m1.setModel("Apple");
        m1.setColor("white");
        m1.setIEMI("Am1234fgh67k");

        //(OOS) object state to the byte stream (FOS) --> file
        // Serialization
        String filename = "abcd.txt";
        FileOutputStream fos = new FileOutputStream(filename);  // byte data
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(m1);
        oos.close();
        fos.close();

        // de-serialization
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        mobile mt = (mobile)  ois.readObject();
        System.out.println("Mobile Info::");
        System.out.println(mt.getModel());
        System.out.println(mt.getColor());
        System.out.println(mt.getIEMI());
        ois.close();
        fis.close();
    }
}
