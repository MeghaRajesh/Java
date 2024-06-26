package File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
public class FileBytesOutput {
    public static void main(String [] args){
        FileOutputStream fos =null;
        File file;
        String mycontent="Hello Welcome";
        try{
            file =new File("C:\\Users\\Rajesh K S\\Desktop\\fileDemo.txt");
            fos = new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }
            byte[] myArray=mycontent.getBytes();
            fos.write(myArray);
            System.out.println("File written successfully!!!");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fos!=null){
                    fos.close();
                }
            }
            catch (IOException e1){
                System.out.println("Error in closing");
            }
        }

    }
}
