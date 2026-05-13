import java.io.*;
class GeeksDeSerialization implements Serializable{
    private name;
    // constructor 
    public GeeksDeSerialization(String name){
        this.name = name;
    }
    // overring toString() functions..
    // @Override
    public String toString(){
        return "name is "+name;
    }
}