// Write a program to copy data from one file to another file.
import java.io.File;
import java.io.FileInputStream;


public class Prg10{
    public static void main(String[] args){
    //    File fileOne = new File("textFileOne.txt");
       File fileTwo = new File("textFileTwo.txt");
       if(!fileTwo.exists()){
        try (FileInputStream fis = new FileInputStream("textFileOne.txt")) {
            int byte_value;
            while((byte_value = fis.read()) != -1){
                System.out.print((char)byte_value);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
    }
}