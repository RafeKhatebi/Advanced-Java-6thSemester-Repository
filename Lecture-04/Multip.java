import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Multip {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(" C:\\example\\ input.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter(" C:\\example\\ output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
