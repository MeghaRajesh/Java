package File;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileDEmo {
    public static final String INPUT_FILE="C:\\Users\\Rajesh K S\\Desktop\\react.txt";
    public static void main(String[] args){
        try(InputStream inputStream = new FileInputStream(INPUT_FILE)){
            System.out.println("Available bytes:"+inputStream.available());
            int b = inputStream.read();
            System.out.println("no of bytes :"+b);


        }
        catch (FileNotFoundException e1){
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }
}
