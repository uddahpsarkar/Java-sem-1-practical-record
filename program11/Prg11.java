import java.io.*;
public class Prg11 {
    public static void main(String[] args) {

        try {
            BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
            FileWriter fw = new FileWriter("U:\\Java-sem-1-practical-record\\program11\\output.txt");

            String line;

            // Read first file
            while ((line = br1.readLine()) != null) {
                fw.write(line + "\n");
            }

            // Read second file
            while ((line = br2.readLine()) != null) {
                fw.write(line + "\n");
            }

            br1.close();
            br2.close();
            fw.close();

            System.out.println("Two text files added successfully");

        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
