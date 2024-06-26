package File;

import java.io.*;

public class FileBufferExample {
    public static void main(String [] args) {
        File file = new File("C:\\Users\\Rajesh K S\\Desktop\\fileDemo.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            while (bis.available() > 0) {
                System.out.print((char) bis.read());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("The file not found: " + fnfe);
        } catch (IOException ioe) {
            System.out.println("IO exception: " + ioe);
        } finally {
            try {
                if (bis != null)
                    bis.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println("Error in closing the stream: " + e);
            }
        }
    }
}
