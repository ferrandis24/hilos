import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MemberMonitor {
    public static void main(String[] args) throws IOException, InterruptedException {
        String file = "CorreosList.txt";
        Fichero(file);
    }
    private static void Fichero(String nameFichero) throws IOException, InterruptedException {
        FileReader reader = new FileReader(nameFichero);
        BufferedReader bReader = new BufferedReader(reader);
        String line;
        while ((line = bReader.readLine()) != null) {
            try {
                System.out.println(line);
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
            Thread.sleep(6000);
        }
    }
}